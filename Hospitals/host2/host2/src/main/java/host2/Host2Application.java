package host2;


import host2.data.BloodType;
import host2.data.EmergencyCall;
import host2.data.location;
import host2.services.ManagerImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Host2Application {

	public static void main(String[] args) {
		SpringApplication.run(Host2Application.class, args);
	}

	@Bean
	CommandLineRunner start(ManagerImpl manager){
		return args -> {
			/*
			manager.AddbloodType(new BloodType(1,"A+",99));
			manager.AddbloodType(new BloodType(2,"A-",99));
			manager.AddbloodType(new BloodType(3,"AB+",99));
			manager.AddbloodType(new BloodType(4,"AB-",99));
			manager.AddbloodType(new BloodType(5,"B+",99));
			manager.AddbloodType(new BloodType(6,"B-",99));
			manager.AddbloodType(new BloodType(7,"O+",99));
			manager.AddbloodType(new BloodType(8,"O-",99));
			manager.saveAmbulance("1113337",true);
			manager.saveAmbulance("2411119",true);
			manager.saveAmbulance("1876875",true);
			manager.saveAmbulance("6781576",true);
			manager.saveAmbulance("1565242",true);
			manager.saveDriver("hamid5","0766543290",true);
			manager.saveDriver("mourad1","0555556677",true);
			manager.saveDriver("djalel2","0656332211",true);
			manager.saveDriver("reda99","0799898786",true);
			manager.saveDriver("hocine3","0756575859",true);

			EmergencyCall call = manager.saveCall(new location(33.1777876876,32.8888866544,"badboy"));
			System.out.println(call.toString());
			System.out.println(manager.getCalls());


			 */

		};
	}
}
