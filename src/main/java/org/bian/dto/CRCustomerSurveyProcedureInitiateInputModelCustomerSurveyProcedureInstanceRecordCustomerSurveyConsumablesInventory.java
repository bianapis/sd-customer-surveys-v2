package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordCustomerSurveyConsumablesInventory
 */
public class CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordCustomerSurveyConsumablesInventory   {
  private String customerSurveyConsumableType = null;

  private String customerSurveyConsumableHolding = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of consumable item associated with the customer survey (e.g. questionnaire, participation incentive gift) 
   * @return customerSurveyConsumableType
  **/

  public String getCustomerSurveyConsumableType() {
    return customerSurveyConsumableType;
  }

  public void setCustomerSurveyConsumableType(String customerSurveyConsumableType) {
    this.customerSurveyConsumableType = customerSurveyConsumableType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked inventory of the consumable item 
   * @return customerSurveyConsumableHolding
  **/

  public String getCustomerSurveyConsumableHolding() {
    return customerSurveyConsumableHolding;
  }

  public void setCustomerSurveyConsumableHolding(String customerSurveyConsumableHolding) {
    this.customerSurveyConsumableHolding = customerSurveyConsumableHolding;
  }


}

