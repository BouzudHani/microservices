package EmergencyController.Emergency_Controller;

import EmergencyController.Emergency_Controller.Doc.Hospital;
import EmergencyController.Emergency_Controller.Doc.Location;
import EmergencyController.Emergency_Controller.Service.EmergencyConttrollerImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmergencyControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmergencyControllerApplication.class, args);
	}

	@Bean
	CommandLineRunner start (EmergencyConttrollerImp emergencyConttrollerImp){
		return args -> {
			//Hospital h1 = new Hospital(1,"Khroub Hospital","031567899","elkhroubhosp@gmail.com","host1","Constantine",8086,new Location(36.261084,6.709286,"host1"));
			//Hospital h2 = new Hospital(2,"Constantine Hospital","031453537","hospitalcons@gmail.com","host2","Constantine",8082,new Location(36.372016,6.618323,"host2"));
			//Hospital h3 = new Hospital(3,"ALI Mendjli Hospital","031379660","mendlihosp@gmail.com","host3","Constantine",8084,new Location(36.259446,6.580705,"host3"));
			//emergencyConttrollerImp.saveHospital(h1);
			//emergencyConttrollerImp.saveHospital(h2);
			//emergencyConttrollerImp.saveHospital(h3);

			//System.out.println(emergencyConttrollerImp.getClosestHospital(new Location(36.277010, 6.693634,"hani11")));

		};
	}
}
