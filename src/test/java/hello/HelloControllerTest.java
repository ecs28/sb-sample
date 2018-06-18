package hello;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;
//Spring utils
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;
	
	private final String INDEX_PATH = "/" ; 
	
	@Test
	public void testIndex() throws Exception {
		 mvc.perform
		 (MockMvcRequestBuilders.get(INDEX_PATH)
				 .accept(org.springframework.http.MediaType.APPLICATION_JSON) )
         .andExpect(status().isOk())
         .andExpect(content().string(equalTo( Greeter.MESSAGE )));
	}
	
	@Test
	public void testForFail() throws Exception {
		assertTrue(true);
	}

}
