package drivers2.driv2;

import drivers2.driv2.Document.Driver;
import drivers2.driv2.Serviec.DriverImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Driv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Driv2Application.class, args);
	}

	@Bean
	CommandLineRunner start(DriverImp driverImplementation){
		return args -> {
		/*	Driver d1= new Driver(1,"Beziz wail","0782543276",true);
			Driver d2= new Driver(2,"Ferfach Ihab","0787897576",true);
			Driver d3= new Driver(3,"Benmaiza Hocine","075678276",true);
			Driver d4= new Driver(4,"Dahdouh ahmed","0745678998",true);
			Driver d5= new Driver(5,"Bedri Amine","07887596438",true);
			driverImplementation.Save(d1);driverImplementation.Save(d2);driverImplementation.Save(d3);
			driverImplementation.Save(d4);driverImplementation.Save(d5);


		 */


		};

	}
}
