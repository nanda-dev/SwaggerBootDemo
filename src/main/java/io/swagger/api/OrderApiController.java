package io.swagger.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import io.swagger.model.CreateOrderRequest;
import io.swagger.model.CreateOrderResponse;
import io.swagger.model.CreateOrderResponse.StatusEnum;
import io.swagger.model.OrderDetails;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-05T12:35:53.697Z")

@RestController
@RequestMapping("/api")
public class OrderApiController implements OrderApi {
	Logger logger = LoggerFactory.getLogger(getClass());

	//@RequestMapping(value = "/order", produces = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<CreateOrderResponse> createOrder(
			@ApiParam(value = "Created Order object", required = true) @Valid @RequestBody CreateOrderRequest orderRequest) {
		logger.info("Create Order for Customer: {}", orderRequest.getCustomerId());
		//Return Mock response
		CreateOrderResponse resp = new CreateOrderResponse();
		resp.setOrderId(1001L);
		resp.setStatus(StatusEnum.PLACED);
		resp.setMessage("Order placed successfully.");
		return new ResponseEntity<CreateOrderResponse>(resp, HttpStatus.OK);
	}

	public ResponseEntity<OrderDetails> getOrderDetails(
			@ApiParam(value = "Order Details Fetched", required = true) @PathVariable("orderId") Long orderId) {
		logger.info("Get Order Details for order: {}", orderId);
		//Return Mock response
		OrderDetails order = new OrderDetails();
		order.setOrderId(orderId);
		order.setStatus(OrderDetails.StatusEnum.COMPLETE);
		order.setMessage("Order details fetched successfully");
		return new ResponseEntity<OrderDetails>(order, HttpStatus.OK);
	}

}
