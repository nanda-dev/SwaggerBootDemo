package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateOrderRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-05T12:35:53.697Z")

public class CreateOrderRequest   {
  @JsonProperty("customerId")
  private Long customerId = null;

  @JsonProperty("accountId")
  private Long accountId = null;

  /**
   * Order Type
   */
  public enum TypeEnum {
    PLAN("plan"),
    
    FEATURE("feature");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("reqDate")
  private DateTime reqDate = null;

  public CreateOrderRequest customerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public CreateOrderRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CreateOrderRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Order Type
   * @return type
  **/
  @ApiModelProperty(value = "Order Type")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CreateOrderRequest reqDate(DateTime reqDate) {
    this.reqDate = reqDate;
    return this;
  }

   /**
   * Get reqDate
   * @return reqDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getReqDate() {
    return reqDate;
  }

  public void setReqDate(DateTime reqDate) {
    this.reqDate = reqDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequest createOrderRequest = (CreateOrderRequest) o;
    return Objects.equals(this.customerId, createOrderRequest.customerId) &&
        Objects.equals(this.accountId, createOrderRequest.accountId) &&
        Objects.equals(this.type, createOrderRequest.type) &&
        Objects.equals(this.reqDate, createOrderRequest.reqDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, accountId, type, reqDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequest {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reqDate: ").append(toIndentedString(reqDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

