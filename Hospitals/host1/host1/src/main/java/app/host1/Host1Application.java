package app.host1;


import app.host1.services.ManagerImpl;
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
			/*manager.AddbloodType(new BloodType(1,"A+",99));
			manager.AddbloodType(new BloodType(2,"A-",99));
			manager.AddbloodType(new BloodType(3,"AB+",99));
			manager.AddbloodType(new BloodType(4,"AB-",99));
			manager.AddbloodType(new BloodType(5,"B+",99));
			manager.AddbloodType(new BloodType(6,"B-",99));
			manager.AddbloodType(new BloodType(7,"O+",99));
			manager.AddbloodType(new BloodType(8,"O-",99));
			manager.saveAmbulance("0087654",true);
			manager.saveAmbulance("0167554",true);
			manager.saveAmbulance("911122",true);
			manager.saveAmbulance("0988871",true);
			manager.saveAmbulance("3380012",true);
			manager.saveDriver("omar11","0766543290",true);
			manager.saveDriver("kamel00","0555556677",true);
			manager.saveDriver("Okba34","0656332211",true);
			manager.saveDriver("Ahmed22","0799898786",true);
			manager.saveDriver("Houussem","0756575859",true);

			EmergencyCall call = manager.saveCall(new location(33.1777876876,32.8888866544));
			System.out.println(call.toString());
			System.out.println(manager.getCalls());
			 */


		};
	}
}
