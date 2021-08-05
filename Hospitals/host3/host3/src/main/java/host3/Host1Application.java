package host3;

import host3.data.BloodType;
import host3.data.EmergencyCall;
import host3.data.location;
import host3.services.ManagerImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Host1Application {

	public static void main(String[] args) {
		SpringApplication.run(Host1Application.class, args);
	}

	@Bean
	CommandLineRunner start(ManagerImpl manager){
		return args -> {
		/*	manager.AddbloodType(new BloodType(1,"A+",99));
			manager.AddbloodType(new BloodType(2,"A-",99));
			manager.AddbloodType(new BloodType(3,"AB+",99));
			manager.AddbloodType(new BloodType(4,"AB-",99));
			manager.AddbloodType(new BloodType(5,"B+",99));
			manager.AddbloodType(new BloodType(6,"B-",99));
			manager.AddbloodType(new BloodType(7,"O+",99));
			manager.AddbloodType(new BloodType(8,"O-",99));
			manager.saveAmbulance("3354242",true);
			manager.saveAmbulance("2444611",true);
			manager.saveAmbulance("986522",true);
			manager.saveAmbulance("0000212",true);
			manager.saveAmbulance("177772",true);
			manager.saveDriver("wail22","0766353521",true);
			manager.saveDriver("karim0","0510012266",true);
			manager.saveDriver("Omar4","0667126122",true);
			manager.saveDriver("malik22","0782420774",true);
			manager.saveDriver("hamza23","0792727293",true);

			EmergencyCall call = manager.saveCall(new location(33.1777876876,32.8888866544,"Hani22"));
			System.out.println(call.toString());
			System.out.println(manager.getCalls());



		 */
		};
	}
}
