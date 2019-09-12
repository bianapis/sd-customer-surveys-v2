package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDefinitionUpdateInputModelDefinitionInstanceRecord
 */
public class BQDefinitionUpdateInputModelDefinitionInstanceRecord   {
  private String customerSurveyDesignWorkTaskType = null;

  private String customerSurveyDesignWorkTaskDescription = null;

  private String customerSurveyDesignWorkTaskWorkProducts = null;

  private String customerSurveyDesignWorkTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. research survey context, refine/trial questionnaire, develop supporting materials) 
   * @return customerSurveyDesignWorkTaskType
  **/

  public String getCustomerSurveyDesignWorkTaskType() {
    return customerSurveyDesignWorkTaskType;
  }

  public void setCustomerSurveyDesignWorkTaskType(String customerSurveyDesignWorkTaskType) {
    this.customerSurveyDesignWorkTaskType = customerSurveyDesignWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the survey development task performed 
   * @return customerSurveyDesignWorkTaskDescription
  **/

  public String getCustomerSurveyDesignWorkTaskDescription() {
    return customerSurveyDesignWorkTaskDescription;
  }

  public void setCustomerSurveyDesignWorkTaskDescription(String customerSurveyDesignWorkTaskDescription) {
    this.customerSurveyDesignWorkTaskDescription = customerSurveyDesignWorkTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the work task 
   * @return customerSurveyDesignWorkTaskWorkProducts
  **/

  public String getCustomerSurveyDesignWorkTaskWorkProducts() {
    return customerSurveyDesignWorkTaskWorkProducts;
  }

  public void setCustomerSurveyDesignWorkTaskWorkProducts(String customerSurveyDesignWorkTaskWorkProducts) {
    this.customerSurveyDesignWorkTaskWorkProducts = customerSurveyDesignWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task - specifically developed materials to be used in survey execution 
   * @return customerSurveyDesignWorkTaskResult
  **/

  public String getCustomerSurveyDesignWorkTaskResult() {
    return customerSurveyDesignWorkTaskResult;
  }

  public void setCustomerSurveyDesignWorkTaskResult(String customerSurveyDesignWorkTaskResult) {
    this.customerSurveyDesignWorkTaskResult = customerSurveyDesignWorkTaskResult;
  }


}

