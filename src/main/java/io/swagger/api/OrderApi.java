/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.CreateOrderRequest;
import io.swagger.model.CreateOrderResponse;
import io.swagger.model.OrderDetails;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-05T12:35:53.697Z")

@Api(value = "order", description = "the order API")
public interface OrderApi {

	@ApiOperation(value = "", notes = "Create Order", response = CreateOrderResponse.class, tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "order creation successful", response = CreateOrderResponse.class) })

	@RequestMapping(value = "/order", produces = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<CreateOrderResponse> createOrder(
			@ApiParam(value = "Created Order object", required = true) @Valid @RequestBody CreateOrderRequest orderRequest);

	@ApiOperation(value = "", notes = "Get Order", response = OrderDetails.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "", response = OrderDetails.class) })

	@RequestMapping(value = "/order/{orderId}", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<OrderDetails> getOrderDetails(
			@ApiParam(value = "", required = true) @PathVariable("orderId") Long orderId);

}
