package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDefinitionExchangeOutputModel
 */
public class BQDefinitionExchangeOutputModel   {
  private String definitionExchangeActionTaskReference = null;

  private Object definitionExchangeActionTaskRecord = null;

  private String definitionExchangeActionResponse = null;

  private String definitionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Definition instance exchange service call 
   * @return definitionExchangeActionTaskReference
  **/

  public String getDefinitionExchangeActionTaskReference() {
    return definitionExchangeActionTaskReference;
  }

  public void setDefinitionExchangeActionTaskReference(String definitionExchangeActionTaskReference) {
    this.definitionExchangeActionTaskReference = definitionExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return definitionExchangeActionResponse
  **/

  public String getDefinitionExchangeActionResponse() {
    return definitionExchangeActionResponse;
  }

  public void setDefinitionExchangeActionResponse(String definitionExchangeActionResponse) {
    this.definitionExchangeActionResponse = definitionExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Definition instance (e.g. accepted, rejected, verified) 
   * @return definitionInstanceStatus
  **/

  public String getDefinitionInstanceStatus() {
    return definitionInstanceStatus;
  }

  public void setDefinitionInstanceStatus(String definitionInstanceStatus) {
    this.definitionInstanceStatus = definitionInstanceStatus;
  }


}

