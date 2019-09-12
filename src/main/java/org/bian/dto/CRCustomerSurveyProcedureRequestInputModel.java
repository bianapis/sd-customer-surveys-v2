package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureRequestInputModelCustomerSurveyProcedureInstanceRecord;
import org.bian.dto.CRCustomerSurveyProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureRequestInputModel
 */
public class CRCustomerSurveyProcedureRequestInputModel   {
  private String customerSurveysServicingSessionReference = null;

  private String customerSurveyProcedureInstanceReference = null;

  private CRCustomerSurveyProcedureRequestInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private Object customerSurveyProcedureRequestActionTaskRecord = null;

  private CRCustomerSurveyProcedureRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerSurveyProcedureRequestInputModelCustomerSurveyProcedureInstanceRecord getCustomerSurveyProcedureInstanceRecord() {
    return customerSurveyProcedureInstanceRecord;
  }

  public void setCustomerSurveyProcedureInstanceRecord(CRCustomerSurveyProcedureRequestInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord) {
    this.customerSurveyProcedureInstanceRecord = customerSurveyProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerSurveyProcedureRequestActionTaskRecord
  **/

  public Object getCustomerSurveyProcedureRequestActionTaskRecord() {
    return customerSurveyProcedureRequestActionTaskRecord;
  }

  public void setCustomerSurveyProcedureRequestActionTaskRecord(Object customerSurveyProcedureRequestActionTaskRecord) {
    this.customerSurveyProcedureRequestActionTaskRecord = customerSurveyProcedureRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerSurveyProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerSurveyProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

