package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExecutionInitiateInputModelExecutionInstanceRecord
 */
public class BQExecutionInitiateInputModelExecutionInstanceRecord   {
  private String customerSurveyExecutionWorkTaskType = null;

  private String customerSurveyExecutionWorkTaskDescription = null;

  private String customerSurveyExecutionWorkTaskWorkProducts = null;

  private String customerSurveyExecutionWorkTaskDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. host focus group session, issue questionnaire) 
   * @return customerSurveyExecutionWorkTaskType
  **/

  public String getCustomerSurveyExecutionWorkTaskType() {
    return customerSurveyExecutionWorkTaskType;
  }

  public void setCustomerSurveyExecutionWorkTaskType(String customerSurveyExecutionWorkTaskType) {
    this.customerSurveyExecutionWorkTaskType = customerSurveyExecutionWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the task performed, includes summary of activities as necessary 
   * @return customerSurveyExecutionWorkTaskDescription
  **/

  public String getCustomerSurveyExecutionWorkTaskDescription() {
    return customerSurveyExecutionWorkTaskDescription;
  }

  public void setCustomerSurveyExecutionWorkTaskDescription(String customerSurveyExecutionWorkTaskDescription) {
    this.customerSurveyExecutionWorkTaskDescription = customerSurveyExecutionWorkTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the work task 
   * @return customerSurveyExecutionWorkTaskWorkProducts
  **/

  public String getCustomerSurveyExecutionWorkTaskWorkProducts() {
    return customerSurveyExecutionWorkTaskWorkProducts;
  }

  public void setCustomerSurveyExecutionWorkTaskWorkProducts(String customerSurveyExecutionWorkTaskWorkProducts) {
    this.customerSurveyExecutionWorkTaskWorkProducts = customerSurveyExecutionWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the customer survey execution 
   * @return customerSurveyExecutionWorkTaskDateTime
  **/

  public String getCustomerSurveyExecutionWorkTaskDateTime() {
    return customerSurveyExecutionWorkTaskDateTime;
  }

  public void setCustomerSurveyExecutionWorkTaskDateTime(String customerSurveyExecutionWorkTaskDateTime) {
    this.customerSurveyExecutionWorkTaskDateTime = customerSurveyExecutionWorkTaskDateTime;
  }


}

