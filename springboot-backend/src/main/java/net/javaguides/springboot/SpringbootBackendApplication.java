package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User("Breno", "Xavier", "brenbi@gmail.com"));
		this.userRepository.save(new User("Ronaldo", "Silva", "ronaldi@gmail.com"));
		this.userRepository.save(new User("Jessica", "da Silva", "jessica@gmail.com"));
		this.userRepository.save(new User("Jefefre", "Xavier", "asdas@gmail.com"));
		
	}

}
