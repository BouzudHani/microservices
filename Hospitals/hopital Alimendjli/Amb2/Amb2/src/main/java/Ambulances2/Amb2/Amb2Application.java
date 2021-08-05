package Ambulances2.Amb2;

import Ambulances2.Amb2.Data.Ambulance;
import Ambulances2.Amb2.Service.AmbulanceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Amb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Amb2Application.class, args);
	}

	@Bean
	CommandLineRunner start(AmbulanceImp ambulanceImp) {
		return args -> {
			/*Ambulance a1 = new Ambulance(1, "0654321", true);
			Ambulance a2 = new Ambulance(2, "0543216", true);
			Ambulance a3 = new Ambulance(3, "0432165", true);
			Ambulance a4 = new Ambulance(4, "0321654", true);
			ambulanceImp.save(a1);
			ambulanceImp.save(a2);
			ambulanceImp.save(a3);
			ambulanceImp.save(a4);

			 */
		};
	}
}
