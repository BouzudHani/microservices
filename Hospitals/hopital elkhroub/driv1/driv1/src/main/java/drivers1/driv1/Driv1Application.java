package drivers1.driv1;

import drivers1.driv1.Document.Driver;
import drivers1.driv1.Service.DriverImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Driv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Driv1Application.class, args);
	}
	@Bean
	CommandLineRunner start(DriverImp driverImplementation){
		return args -> {
			/*
			Driver d1= new Driver(1,"Boumaaza Houssem","0782543276",true);
			Driver d2= new Driver(2,"Aouich Ahmed","0787897576",true);
			Driver d3= new Driver(3,"Belala Yacine","075678276",true);
			Driver d4= new Driver(4,"Berkan Houcin","0745678998",true);
			Driver d5= new Driver(5,"Belala Charaf","07887596438",true);
			driverImplementation.Save(d1);driverImplementation.Save(d2);driverImplementation.Save(d3);
			driverImplementation.Save(d4);driverImplementation.Save(d5);


			 */


		};

	}

}
