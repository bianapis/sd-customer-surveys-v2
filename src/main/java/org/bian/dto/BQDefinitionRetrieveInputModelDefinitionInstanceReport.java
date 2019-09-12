package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDefinitionRetrieveInputModelDefinitionInstanceReport
 */
public class BQDefinitionRetrieveInputModelDefinitionInstanceReport   {
  private String definitionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return definitionInstanceReportReference
  **/

  public String getDefinitionInstanceReportReference() {
    return definitionInstanceReportReference;
  }

  public void setDefinitionInstanceReportReference(String definitionInstanceReportReference) {
    this.definitionInstanceReportReference = definitionInstanceReportReference;
  }


}

