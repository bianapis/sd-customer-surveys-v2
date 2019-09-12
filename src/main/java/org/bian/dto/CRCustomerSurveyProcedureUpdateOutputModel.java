package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureUpdateInputModelCustomerSurveyProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureUpdateOutputModel
 */
public class CRCustomerSurveyProcedureUpdateOutputModel   {
  private CRCustomerSurveyProcedureUpdateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private String customerSurveyProcedureUpdateActionTaskReference = null;

  private Object customerSurveyProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerSurveyProcedureUpdateActionTaskReference
  **/

  public String getCustomerSurveyProcedureUpdateActionTaskReference() {
    return customerSurveyProcedureUpdateActionTaskReference;
  }

  public void setCustomerSurveyProcedureUpdateActionTaskReference(String customerSurveyProcedureUpdateActionTaskReference) {
    this.customerSurveyProcedureUpdateActionTaskReference = customerSurveyProcedureUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

