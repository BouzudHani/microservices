package BloodBank.BloodBank;

import BloodBank.BloodBank.BankRepo.BloodTypeRepo;
import BloodBank.BloodBank.Document.BloodType;
import BloodBank.BloodBank.Service.BankImplementation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.Collection;


@SpringBootApplication
public class BloodBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodBankApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BankImplementation bankImplementation){

		return args -> {
			/*
			int i=1;

			String t[]={"A+","A-","B+","B-","AB+","AB-","O+","O-"};
			for (String tx: t
				 ) {
				bankImplementation.Save(new BloodType(i,tx,90));
				i++;
			}
			;


			bankImplementation.Save(bankImplementation.addBlood(15,"AB-"));

			Collection<BloodType> ColBlood =bankImplementation.BloodLessAlert();
				ColBlood.forEach(System.out::println);
*/
			};

	}
}
