package test_security.sec.secure;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class JwtAuthorization extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String jwt = request.getHeader(Constante.header);
        if(jwt==null || !jwt.startsWith(Constante.headerPrefix)){
            filterChain.doFilter(request,response);
            return;
        }
        JWTVerifier verifier= JWT.require(Algorithm.HMAC256(Constante.key)).build();
        DecodedJWT decodejwt = verifier.verify(jwt.substring(Constante.headerPrefix.length()));
        String username= decodejwt.getSubject();
        List<String> roles = decodejwt.getClaims().get("roles").asList(String.class);
        System.out.println("");
        System.out.println(username);
        System.out.println(roles);
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        roles.forEach(r->{
            authorities.add(new SimpleGrantedAuthority(r));
        });
        UsernamePasswordAuthenticationToken user = new UsernamePasswordAuthenticationToken(username,null,authorities);
        SecurityContextHolder.getContext().setAuthentication(user);
        filterChain.doFilter(request,response);

    }
}
