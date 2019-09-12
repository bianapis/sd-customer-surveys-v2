package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureRequestInputModelCustomerSurveyProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureRequestOutputModel
 */
public class CRCustomerSurveyProcedureRequestOutputModel   {
  private CRCustomerSurveyProcedureRequestInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private String customerSurveyProcedureRequestActionTaskReference = null;

  private Object customerSurveyProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Survey Procedure instance request service call 
   * @return customerSurveyProcedureRequestActionTaskReference
  **/

  public String getCustomerSurveyProcedureRequestActionTaskReference() {
    return customerSurveyProcedureRequestActionTaskReference;
  }

  public void setCustomerSurveyProcedureRequestActionTaskReference(String customerSurveyProcedureRequestActionTaskReference) {
    this.customerSurveyProcedureRequestActionTaskReference = customerSurveyProcedureRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

