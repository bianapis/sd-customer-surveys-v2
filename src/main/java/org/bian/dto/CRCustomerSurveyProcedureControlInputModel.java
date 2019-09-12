package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureControlInputModelCustomerSurveyProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureControlInputModel
 */
public class CRCustomerSurveyProcedureControlInputModel   {
  private String customerSurveysServicingSessionReference = null;

  private String customerSurveyProcedureInstanceReference = null;

  private Object customerSurveyProcedureControlActionTaskRecord = null;

  private CRCustomerSurveyProcedureControlInputModelCustomerSurveyProcedureControlActionRequest customerSurveyProcedureControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerSurveysServicingSessionReference
  **/

  public String getCustomerSurveysServicingSessionReference() {
    return customerSurveysServicingSessionReference;
  }

  public void setCustomerSurveysServicingSessionReference(String customerSurveysServicingSessionReference) {
    this.customerSurveysServicingSessionReference = customerSurveysServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Survey Procedure instance 
   * @return customerSurveyProcedureInstanceReference
  **/

  public String getCustomerSurveyProcedureInstanceReference() {
    return customerSurveyProcedureInstanceReference;
  }

  public void setCustomerSurveyProcedureInstanceReference(String customerSurveyProcedureInstanceReference) {
    this.customerSurveyProcedureInstanceReference = customerSurveyProcedureInstanceReference;
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
   * Get customerSurveyProcedureControlActionRequest
   * @return customerSurveyProcedureControlActionRequest
  **/

  public CRCustomerSurveyProcedureControlInputModelCustomerSurveyProcedureControlActionRequest getCustomerSurveyProcedureControlActionRequest() {
    return customerSurveyProcedureControlActionRequest;
  }

  public void setCustomerSurveyProcedureControlActionRequest(CRCustomerSurveyProcedureControlInputModelCustomerSurveyProcedureControlActionRequest customerSurveyProcedureControlActionRequest) {
    this.customerSurveyProcedureControlActionRequest = customerSurveyProcedureControlActionRequest;
  }


}

