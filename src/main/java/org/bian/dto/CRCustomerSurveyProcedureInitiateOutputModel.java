package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureInitiateOutputModelCustomerSurveyProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureInitiateOutputModel
 */
public class CRCustomerSurveyProcedureInitiateOutputModel   {
  private String customerSurveyProcedureInstanceReference = null;

  private String customerSurveyProcedureInitiateActionReference = null;

  private Object customerSurveyProcedureInitiateActionRecord = null;

  private String customerSurveyProcedureInstanceStatus = null;

  private CRCustomerSurveyProcedureInitiateOutputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerSurveyProcedureInitiateActionReference
  **/

  public String getCustomerSurveyProcedureInitiateActionReference() {
    return customerSurveyProcedureInitiateActionReference;
  }

  public void setCustomerSurveyProcedureInitiateActionReference(String customerSurveyProcedureInitiateActionReference) {
    this.customerSurveyProcedureInitiateActionReference = customerSurveyProcedureInitiateActionReference;
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

  public CRCustomerSurveyProcedureInitiateOutputModelCustomerSurveyProcedureInstanceRecord getCustomerSurveyProcedureInstanceRecord() {
    return customerSurveyProcedureInstanceRecord;
  }

  public void setCustomerSurveyProcedureInstanceRecord(CRCustomerSurveyProcedureInitiateOutputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord) {
    this.customerSurveyProcedureInstanceRecord = customerSurveyProcedureInstanceRecord;
  }


}

