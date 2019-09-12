package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureInitiateInputModel
 */
public class CRCustomerSurveyProcedureInitiateInputModel   {
  private String customerSurveysServicingSessionReference = null;

  private Object customerSurveyProcedureInitiateActionRecord = null;

  private String customerSurveyProcedureInstanceStatus = null;

  private CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerSurveyProcedureInitiateActionRecord
  **/

  public Object getCustomerSurveyProcedureInitiateActionRecord() {
    return customerSurveyProcedureInitiateActionRecord;
  }

  public void setCustomerSurveyProcedureInitiateActionRecord(Object customerSurveyProcedureInitiateActionRecord) {
    this.customerSurveyProcedureInitiateActionRecord = customerSurveyProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Survey Procedure instance (e.g. initialised, pending, active) 
   * @return customerSurveyProcedureInstanceStatus
  **/

  public String getCustomerSurveyProcedureInstanceStatus() {
    return customerSurveyProcedureInstanceStatus;
  }

  public void setCustomerSurveyProcedureInstanceStatus(String customerSurveyProcedureInstanceStatus) {
    this.customerSurveyProcedureInstanceStatus = customerSurveyProcedureInstanceStatus;
  }


  /**
   * Get customerSurveyProcedureInstanceRecord
   * @return customerSurveyProcedureInstanceRecord
  **/

  public CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecord getCustomerSurveyProcedureInstanceRecord() {
    return customerSurveyProcedureInstanceRecord;
  }

  public void setCustomerSurveyProcedureInstanceRecord(CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord) {
    this.customerSurveyProcedureInstanceRecord = customerSurveyProcedureInstanceRecord;
  }


}

