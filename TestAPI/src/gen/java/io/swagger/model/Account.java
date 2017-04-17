package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Balance;
import io.swagger.model.Owners;
import java.util.*;



/**
 * Account Details
 **/

@ApiModel(description = "Account Details")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-17T10:18:50.215-04:00")
public class Account   {
  
  private String IBAN = null;
  private Long accNumber = null;
  private Balance balance = null;
  private String bankId = null;
  private String id = null;
  private String label = null;
  private List<Owners> owners = new ArrayList<Owners>();
  private String swiftBic = null;
  private String type = null;

  
  /**
   * IBAN
   **/
  
  @ApiModelProperty(value = "IBAN")
  @JsonProperty("IBAN")
  public String getIBAN() {
    return IBAN;
  }
  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  
  /**
   * Account number
   **/
  
  @ApiModelProperty(value = "Account number")
  @JsonProperty("acc_number")
  public Long getAccNumber() {
    return accNumber;
  }
  public void setAccNumber(Long accNumber) {
    this.accNumber = accNumber;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("balance")
  public Balance getBalance() {
    return balance;
  }
  public void setBalance(Balance balance) {
    this.balance = balance;
  }

  
  /**
   * bank_id
   **/
  
  @ApiModelProperty(value = "bank_id")
  @JsonProperty("bank_id")
  public String getBankId() {
    return bankId;
  }
  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  
  /**
   * ID
   **/
  
  @ApiModelProperty(value = "ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * label
   **/
  
  @ApiModelProperty(value = "label")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * owners
   **/
  
  @ApiModelProperty(value = "owners")
  @JsonProperty("owners")
  public List<Owners> getOwners() {
    return owners;
  }
  public void setOwners(List<Owners> owners) {
    this.owners = owners;
  }

  
  /**
   * swift_bic
   **/
  
  @ApiModelProperty(value = "swift_bic")
  @JsonProperty("swift_bic")
  public String getSwiftBic() {
    return swiftBic;
  }
  public void setSwiftBic(String swiftBic) {
    this.swiftBic = swiftBic;
  }

  
  /**
   * type
   **/
  
  @ApiModelProperty(value = "type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(IBAN, account.IBAN) &&
        Objects.equals(accNumber, account.accNumber) &&
        Objects.equals(balance, account.balance) &&
        Objects.equals(bankId, account.bankId) &&
        Objects.equals(id, account.id) &&
        Objects.equals(label, account.label) &&
        Objects.equals(owners, account.owners) &&
        Objects.equals(swiftBic, account.swiftBic) &&
        Objects.equals(type, account.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IBAN, accNumber, balance, bankId, id, label, owners, swiftBic, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    accNumber: ").append(toIndentedString(accNumber)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    swiftBic: ").append(toIndentedString(swiftBic)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

