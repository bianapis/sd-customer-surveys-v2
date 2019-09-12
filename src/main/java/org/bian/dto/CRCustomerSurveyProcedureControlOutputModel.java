package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureControlOutputModel
 */
public class CRCustomerSurveyProcedureControlOutputModel   {
  private String customerSurveyProcedureControlActionTaskReference = null;

  private Object customerSurveyProcedureControlActionTaskRecord = null;

  private String customerSurveyProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Survey Procedure instance control processing service call 
   * @return customerSurveyProcedureControlActionTaskReference
  **/

  public String getCustomerSurveyProcedureControlActionTaskReference() {
    return customerSurveyProcedureControlActionTaskReference;
  }

  public void setCustomerSurveyProcedureControlActionTaskReference(String customerSurveyProcedureControlActionTaskReference) {
    this.customerSurveyProcedureControlActionTaskReference = customerSurveyProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerSurveyProcedureControlActionTaskRecord
  **/

  public Object getCustomerSurveyProcedureControlActionTaskRecord() {
    return customerSurveyProcedureControlActionTaskRecord;
  }

  public void setCustomerSurveyProcedureControlActionTaskRecord(Object customerSurveyProcedureControlActionTaskRecord) {
    this.customerSurveyProcedureControlActionTaskRecord = customerSurveyProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerSurveyProcedureControlActionResponse
  **/

  public String getCustomerSurveyProcedureControlActionResponse() {
    return customerSurveyProcedureControlActionResponse;
  }

  public void setCustomerSurveyProcedureControlActionResponse(String customerSurveyProcedureControlActionResponse) {
    this.customerSurveyProcedureControlActionResponse = customerSurveyProcedureControlActionResponse;
  }


}

