package com.patient;

import com.patient.data.Patient;
import com.patient.service.ImplementationPatient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class PatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
	}


	@Bean
	CommandLineRunner start(ImplementationPatient implementationPatient){
		return args -> {
			/*Patient p1 = new Patient(1,"hani11","0766577900","hani11@gmail.com","Constantine");
			Patient p2 = new Patient(2,"ala12","0787584736","ala12@gmail.com","ELkhroun");
			Patient p3 = new Patient(3,"hamza99","0787856538","hamza99@gmail.com","Tbessa");
			Patient p4 = new Patient(4,"Kamal90","0556666787","kamal90@gmail.com","Oran");
			Patient p5 = new Patient(5,"selma22","0677789000","selma22@gmail.com","Tebessa");
			implementationPatient.savePatient(p1);implementationPatient.savePatient(p2);
			implementationPatient.savePatient(p3);implementationPatient.savePatient(p3);
			implementationPatient.savePatient(p5);
			System.out.println(implementationPatient.getListOfPatient());

			 */
		};
	}

}
