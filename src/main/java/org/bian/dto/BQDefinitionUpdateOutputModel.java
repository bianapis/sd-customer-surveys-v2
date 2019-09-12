package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDefinitionUpdateInputModelCustomerSurveyProcedureInstanceRecord;
import org.bian.dto.BQDefinitionUpdateInputModelDefinitionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDefinitionUpdateOutputModel
 */
public class BQDefinitionUpdateOutputModel   {
  private BQDefinitionUpdateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private BQDefinitionUpdateInputModelDefinitionInstanceRecord definitionInstanceRecord = null;

  private String definitionUpdateActionTaskReference = null;

  private Object definitionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return definitionUpdateActionTaskReference
  **/

  public String getDefinitionUpdateActionTaskReference() {
    return definitionUpdateActionTaskReference;
  }

  public void setDefinitionUpdateActionTaskReference(String definitionUpdateActionTaskReference) {
    this.definitionUpdateActionTaskReference = definitionUpdateActionTaskReference;
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

