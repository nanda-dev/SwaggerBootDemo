package io.swagger.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



@RunWith(SpringRunner.class)
//@SpringApplicationConfiguration(Swagger2SpringBoot.class)
@WebMvcTest(value = OrderApiController.class, secure = false)
public class OrderApiControllerTest {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void createOrderTest() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/api/order")
				.accept(MediaType.APPLICATION_JSON)
				.content("{\"customerId\": 1001,\"accountId\": 10001,\"type\": \"plan\",\"reqDate\": \"2018-03-05T20:30:00Z\"}")
				.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		logger.info("Create Order API Response: {}", result.getResponse().getContentAsString());
		//String expectedResp = "{status: SUCCESS, message: null}";
		//JSONAssert.assertEquals(expectedResp, result.getResponse().getContentAsString(), false);
		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}

}
