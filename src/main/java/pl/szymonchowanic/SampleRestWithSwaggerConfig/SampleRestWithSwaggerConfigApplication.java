package pl.szymonchowanic.SampleRestWithSwaggerConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.szymonchowanic.SampleRestWithSwaggerConfig.entity.User;
import pl.szymonchowanic.SampleRestWithSwaggerConfig.repository.UserRepository;

@SpringBootApplication
public class SampleRestWithSwaggerConfigApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SampleRestWithSwaggerConfigApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		userRepository.save(new User("Wojciech", "Bodziuch"));
		userRepository.save(new User("Paulina", "Kocańda"));
		userRepository.save(new User("Konrad", "Janik"));
	}
}
