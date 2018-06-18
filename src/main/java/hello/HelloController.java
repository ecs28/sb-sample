package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//mapping as API
@RestController
public class HelloController {
	
	//inject dependencies
	@Autowired
	private Greeter greeter;
	
	//mapping root method	
	@RequestMapping("/")
	public String index() {
		return greeter.sayHello();
	}

}
