package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDefinitionRetrieveOutputModelDefinitionInstanceAnalysis
 */
public class BQDefinitionRetrieveOutputModelDefinitionInstanceAnalysis   {
  private Object definitionInstanceAnalysisRecord = null;

  private String definitionInstanceAnalysisReportType = null;

  private String definitionInstanceAnalysisParameters = null;

  private Object definitionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return definitionInstanceAnalysisRecord
  **/

  public Object getDefinitionInstanceAnalysisRecord() {
    return definitionInstanceAnalysisRecord;
  }

  public void setDefinitionInstanceAnalysisRecord(Object definitionInstanceAnalysisRecord) {
    this.definitionInstanceAnalysisRecord = definitionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return definitionInstanceAnalysisReportType
  **/

  public String getDefinitionInstanceAnalysisReportType() {
    return definitionInstanceAnalysisReportType;
  }

  public void setDefinitionInstanceAnalysisReportType(String definitionInstanceAnalysisReportType) {
    this.definitionInstanceAnalysisReportType = definitionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return definitionInstanceAnalysisParameters
  **/

  public String getDefinitionInstanceAnalysisParameters() {
    return definitionInstanceAnalysisParameters;
  }

  public void setDefinitionInstanceAnalysisParameters(String definitionInstanceAnalysisParameters) {
    this.definitionInstanceAnalysisParameters = definitionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return definitionInstanceAnalysisReport
  **/

  public Object getDefinitionInstanceAnalysisReport() {
    return definitionInstanceAnalysisReport;
  }

  public void setDefinitionInstanceAnalysisReport(Object definitionInstanceAnalysisReport) {
    this.definitionInstanceAnalysisReport = definitionInstanceAnalysisReport;
  }


}

