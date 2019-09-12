package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDefinitionRetrieveOutputModelDefinitionInstanceReport
 */
public class BQDefinitionRetrieveOutputModelDefinitionInstanceReport   {
  private Object definitionInstanceReportRecord = null;

  private String definitionInstanceReportType = null;

  private String definitionInstanceReportParameters = null;

  private Object definitionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return definitionInstanceReportRecord
  **/

  public Object getDefinitionInstanceReportRecord() {
    return definitionInstanceReportRecord;
  }

  public void setDefinitionInstanceReportRecord(Object definitionInstanceReportRecord) {
    this.definitionInstanceReportRecord = definitionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return definitionInstanceReportType
  **/

  public String getDefinitionInstanceReportType() {
    return definitionInstanceReportType;
  }

  public void setDefinitionInstanceReportType(String definitionInstanceReportType) {
    this.definitionInstanceReportType = definitionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return definitionInstanceReportParameters
  **/

  public String getDefinitionInstanceReportParameters() {
    return definitionInstanceReportParameters;
  }

  public void setDefinitionInstanceReportParameters(String definitionInstanceReportParameters) {
    this.definitionInstanceReportParameters = definitionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return definitionInstanceReport
  **/

  public Object getDefinitionInstanceReport() {
    return definitionInstanceReport;
  }

  public void setDefinitionInstanceReport(Object definitionInstanceReport) {
    this.definitionInstanceReport = definitionInstanceReport;
  }


}

