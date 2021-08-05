package BloodDonor.Blooddonor;

import BloodDonor.Blooddonor.Document.Donor;
import BloodDonor.Blooddonor.Service.BloodImplementation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import javax.annotation.security.DenyAll;
import java.util.Collection;
import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class BloodDonorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodDonorApplication.class, args);
	}


	@Bean
	CommandLineRunner start (BloodImplementation bloodImplementation ){
		return  args -> {
			/*Donor d1 = new Donor(1,"Laila","0667554222","Laila@gmail.com","A+","Constantin");
			Donor d2 = new Donor(2,"Houssem","066755622","houssem@gmail.com","A-","Constantin");
			Donor d3 = new Donor(3,"Karim","0667587652","karim@gmail.com","0+","Constantin");
			Donor d4 = new Donor(4,"Mosaab","0667598765","mosaab@gmail.com","A+","Constantin");

			bloodImplementation.saveBloodDonor(d1);bloodImplementation.saveBloodDonor(d2);
			bloodImplementation.saveBloodDonor(d3);bloodImplementation.saveBloodDonor(d4);

			Collection<Donor> dd = bloodImplementation.getListOfDonorByTpe("A+");
			dd.forEach(System.out::println);
			*/

			//bloodImplementation.CreatAccount("KaKa","069875047","kaka@gmail.com","A-","Alger");
			System.out.println(bloodImplementation.getDonorByName("houssem"));
		};
	}


}
