package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * balance
 **/

@ApiModel(description = "balance")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-12-07T06:46:57.628-05:00")
public class Balance   {
  
  private String currency = null;
  private Float amount = null;

  
  /**
   * currency
   **/
  
  @ApiModelProperty(value = "currency")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * amount
   **/
  
  @ApiModelProperty(value = "amount")
  @JsonProperty("amount")
  public Float getAmount() {
    return amount;
  }
  public void setAmount(Float amount) {
    this.amount = amount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(currency, balance.currency) &&
        Objects.equals(amount, balance.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

