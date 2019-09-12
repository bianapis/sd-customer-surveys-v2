package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDefinitionRetrieveInputModelDefinitionInstanceAnalysis
 */
public class BQDefinitionRetrieveInputModelDefinitionInstanceAnalysis   {
  private String definitionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return definitionInstanceAnalysisReference
  **/

  public String getDefinitionInstanceAnalysisReference() {
    return definitionInstanceAnalysisReference;
  }

  public void setDefinitionInstanceAnalysisReference(String definitionInstanceAnalysisReference) {
    this.definitionInstanceAnalysisReference = definitionInstanceAnalysisReference;
  }


}

