package Ambulances3.Amb3;

import Ambulances3.Amb3.Data.Ambulance;
import Ambulances3.Amb3.Service.AmbulanceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Amb3Application {

	public static void main(String[] args) {
		SpringApplication.run(Amb3Application.class, args);
	}

	@Bean
	CommandLineRunner start(AmbulanceImp ambulanceImp) {
		return args -> {
			/*
			Ambulance a1 = new Ambulance(1, "0136900", true);
			Ambulance a2 = new Ambulance(2, "0369100", true);
			Ambulance a3 = new Ambulance(3, "0691300", true);
			Ambulance a4 = new Ambulance(4, "0900136", true);
			ambulanceImp.save(a1);
			ambulanceImp.save(a2);
			ambulanceImp.save(a3);
			ambulanceImp.save(a4);

			 */
		};
	}
}
