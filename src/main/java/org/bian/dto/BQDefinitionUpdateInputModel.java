package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDefinitionUpdateInputModelCustomerSurveyProcedureInstanceRecord;
import org.bian.dto.BQDefinitionUpdateInputModelDefinitionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDefinitionUpdateInputModel
 */
public class BQDefinitionUpdateInputModel   {
  private BQDefinitionUpdateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private String customerSurveyProcedureInstanceReference = null;

  private String definitionInstanceReference = null;

  private BQDefinitionUpdateInputModelDefinitionInstanceRecord definitionInstanceRecord = null;

  private Object definitionUpdateActionTaskRecord = null;

  private String definitionUpdateActionRequest = null;


  /**
   * Get customerSurveyProcedureInstanceRecord
   * @return customerSurveyProcedureInstanceRecord
  **/

  public BQDefinitionUpdateInputModelCustomerSurveyProcedureInstanceRecord getCustomerSurveyProcedureInstanceRecord() {
    return customerSurveyProcedureInstanceRecord;
  }

  public void setCustomerSurveyProcedureInstanceRecord(BQDefinitionUpdateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord) {
    this.customerSurveyProcedureInstanceRecord = customerSurveyProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Survey Procedure instance 
   * @return customerSurveyProcedureInstanceReference
  **/

  public String getCustomerSurveyProcedureInstanceReference() {
    return customerSurveyProcedureInstanceReference;
  }

  public void setCustomerSurveyProcedureInstanceReference(String customerSurveyProcedureInstanceReference) {
    this.customerSurveyProcedureInstanceReference = customerSurveyProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Definition instance 
   * @return definitionInstanceReference
  **/

  public String getDefinitionInstanceReference() {
    return definitionInstanceReference;
  }

  public void setDefinitionInstanceReference(String definitionInstanceReference) {
    this.definitionInstanceReference = definitionInstanceReference;
  }


  /**
   * Get definitionInstanceRecord
   * @return definitionInstanceRecord
  **/

  public BQDefinitionUpdateInputModelDefinitionInstanceRecord getDefinitionInstanceRecord() {
    return definitionInstanceRecord;
  }

  public void setDefinitionInstanceRecord(BQDefinitionUpdateInputModelDefinitionInstanceRecord definitionInstanceRecord) {
    this.definitionInstanceRecord = definitionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return definitionUpdateActionTaskRecord
  **/

  public Object getDefinitionUpdateActionTaskRecord() {
    return definitionUpdateActionTaskRecord;
  }

  public void setDefinitionUpdateActionTaskRecord(Object definitionUpdateActionTaskRecord) {
    this.definitionUpdateActionTaskRecord = definitionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return definitionUpdateActionRequest
  **/

  public String getDefinitionUpdateActionRequest() {
    return definitionUpdateActionRequest;
  }

  public void setDefinitionUpdateActionRequest(String definitionUpdateActionRequest) {
    this.definitionUpdateActionRequest = definitionUpdateActionRequest;
  }


}

