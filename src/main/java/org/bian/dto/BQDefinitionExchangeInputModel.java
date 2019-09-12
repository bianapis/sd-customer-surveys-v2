package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDefinitionExchangeInputModelDefinitionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQDefinitionExchangeInputModel
 */
public class BQDefinitionExchangeInputModel   {
  private String customerSurveyProcedureInstanceReference = null;

  private String definitionInstanceReference = null;

  private Object definitionExchangeActionTaskRecord = null;

  private BQDefinitionExchangeInputModelDefinitionExchangeActionRequest definitionExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return definitionExchangeActionTaskRecord
  **/

  public Object getDefinitionExchangeActionTaskRecord() {
    return definitionExchangeActionTaskRecord;
  }

  public void setDefinitionExchangeActionTaskRecord(Object definitionExchangeActionTaskRecord) {
    this.definitionExchangeActionTaskRecord = definitionExchangeActionTaskRecord;
  }


  /**
   * Get definitionExchangeActionRequest
   * @return definitionExchangeActionRequest
  **/

  public BQDefinitionExchangeInputModelDefinitionExchangeActionRequest getDefinitionExchangeActionRequest() {
    return definitionExchangeActionRequest;
  }

  public void setDefinitionExchangeActionRequest(BQDefinitionExchangeInputModelDefinitionExchangeActionRequest definitionExchangeActionRequest) {
    this.definitionExchangeActionRequest = definitionExchangeActionRequest;
  }


}

