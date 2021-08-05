package test_security.sec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import test_security.sec.Entity.AppRole;
import test_security.sec.Service.AccountImplementation;


@SpringBootApplication
public class SecApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecApplication.class, args);
	}

	@Bean
	CommandLineRunner start (AccountImplementation accoountService) {
		return args -> {
				//accoountService.save(new AppRole(3,"BOOT_CALL"));
				//accoountService.saveUser("Boot_call","12345","12345");
			/*accoountService.save(new AppRole(1, "USER"));
			accoountService.save(new AppRole(2, "ADMIN"));
			Stream.of("user1", "user2", "user3").forEach(un -> {
				accoountService.saveUser(un, "1234", "1234");
			});


			accoountService.delete("ahlem");
			accoountService.delete("amina");
			accoountService.delete("darin");
			accoountService.delete("Elkhroub Hospital");
			accoountService.delete("Alimendjli Hospital");
			accoountService.delete("Constantine Hospital");
			accoountService.saveUser("host1","1234","1234");
			accoountService.saveUser("host2","1234","1234");
			accoountService.saveUser("host3","1234","1234");

			 */
			//accoountService.delete("mohkk");
		};
	}



	@Bean
	BCryptPasswordEncoder getBCPE(){
		return new BCryptPasswordEncoder();
	}

}
