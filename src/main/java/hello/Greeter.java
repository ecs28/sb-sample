package hello;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

	protected static String MESSAGE = "Hello World! " + LocalDateTime.now();
	
	public String sayHello() {
		return MESSAGE;
	}
}
