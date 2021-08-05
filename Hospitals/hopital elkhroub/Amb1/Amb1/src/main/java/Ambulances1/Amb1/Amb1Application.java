package Ambulances1.Amb1;

import Ambulances1.Amb1.Data.Ambulance;
import Ambulances1.Amb1.Services.AmbulanceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Amb1Application {

	public static void main(String[] args) {
		SpringApplication.run(Amb1Application.class, args);
	}
	@Bean
	CommandLineRunner start(AmbulanceImp ambulanceImp) {
		return args -> {
			/*
			Ambulance a1 = new Ambulance(1, "0123456", true);
			Ambulance a2 = new Ambulance(2, "0234561", true);
			Ambulance a3 = new Ambulance(3, "0456123", true);
			Ambulance a4 = new Ambulance(4, "0561234", true);
			ambulanceImp.save(a1);
			ambulanceImp.save(a2);
			ambulanceImp.save(a3);
			ambulanceImp.save(a4);

			 */
		};
	}

}
