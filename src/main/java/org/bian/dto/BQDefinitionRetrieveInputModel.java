package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDefinitionRetrieveInputModelDefinitionInstanceAnalysis;
import org.bian.dto.BQDefinitionRetrieveInputModelDefinitionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDefinitionRetrieveInputModel
 */
public class BQDefinitionRetrieveInputModel   {
  private Object definitionRetrieveActionTaskRecord = null;

  private String definitionRetrieveActionRequest = null;

  private BQDefinitionRetrieveInputModelDefinitionInstanceReport definitionInstanceReport = null;

  private BQDefinitionRetrieveInputModelDefinitionInstanceAnalysis definitionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return definitionRetrieveActionTaskRecord
  **/

  public Object getDefinitionRetrieveActionTaskRecord() {
    return definitionRetrieveActionTaskRecord;
  }

  public void setDefinitionRetrieveActionTaskRecord(Object definitionRetrieveActionTaskRecord) {
    this.definitionRetrieveActionTaskRecord = definitionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return definitionRetrieveActionRequest
  **/

  public String getDefinitionRetrieveActionRequest() {
    return definitionRetrieveActionRequest;
  }

  public void setDefinitionRetrieveActionRequest(String definitionRetrieveActionRequest) {
    this.definitionRetrieveActionRequest = definitionRetrieveActionRequest;
  }


  /**
   * Get definitionInstanceReport
   * @return definitionInstanceReport
  **/

  public BQDefinitionRetrieveInputModelDefinitionInstanceReport getDefinitionInstanceReport() {
    return definitionInstanceReport;
  }

  public void setDefinitionInstanceReport(BQDefinitionRetrieveInputModelDefinitionInstanceReport definitionInstanceReport) {
    this.definitionInstanceReport = definitionInstanceReport;
  }


  /**
   * Get definitionInstanceAnalysis
   * @return definitionInstanceAnalysis
  **/

  public BQDefinitionRetrieveInputModelDefinitionInstanceAnalysis getDefinitionInstanceAnalysis() {
    return definitionInstanceAnalysis;
  }

  public void setDefinitionInstanceAnalysis(BQDefinitionRetrieveInputModelDefinitionInstanceAnalysis definitionInstanceAnalysis) {
    this.definitionInstanceAnalysis = definitionInstanceAnalysis;
  }


}

