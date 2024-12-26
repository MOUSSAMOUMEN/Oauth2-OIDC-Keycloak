package ma.enset.customersfrontappthymeleaf;

import ma.enset.customersfrontappthymeleaf.entites.Customer;
import ma.enset.customersfrontappthymeleaf.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomersFrontAppThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersFrontAppThymeleafApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			List<Customer> customers = List.of(
				Customer.builder()
						.name("moussa moumen")
						.email("moussa@gmail.com")
						.build(),
				Customer.builder()
						.name("ayoub elbdelauoi")
						.email("you@gmail.com")
						.build(),

				Customer.builder()
				        .name("soufiane baha")
						.email("ouh@gmail.com")
						.build()
			);
			customerRepository.saveAll(customers);
		};
	}
}
