package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureUpdateInputModelCustomerSurveyProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureUpdateInputModel
 */
public class CRCustomerSurveyProcedureUpdateInputModel   {
  private String customerSurveysServicingSessionReference = null;

  private String customerSurveyProcedureInstanceReference = null;

  private CRCustomerSurveyProcedureUpdateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private Object customerSurveyProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get customerSurveyProcedureInstanceRecord
   * @return customerSurveyProcedureInstanceRecord
  **/

  public CRCustomerSurveyProcedureUpdateInputModelCustomerSurveyProcedureInstanceRecord getCustomerSurveyProcedureInstanceRecord() {
    return customerSurveyProcedureInstanceRecord;
  }

  public void setCustomerSurveyProcedureInstanceRecord(CRCustomerSurveyProcedureUpdateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord) {
    this.customerSurveyProcedureInstanceRecord = customerSurveyProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerSurveyProcedureUpdateActionTaskRecord
  **/

  public Object getCustomerSurveyProcedureUpdateActionTaskRecord() {
    return customerSurveyProcedureUpdateActionTaskRecord;
  }

  public void setCustomerSurveyProcedureUpdateActionTaskRecord(Object customerSurveyProcedureUpdateActionTaskRecord) {
    this.customerSurveyProcedureUpdateActionTaskRecord = customerSurveyProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

