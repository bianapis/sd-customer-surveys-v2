package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceReport
 */
public class BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceReport   {
  private Object surveyAnalysisInstanceReportRecord = null;

  private String surveyAnalysisInstanceReportType = null;

  private String surveyAnalysisInstanceReportParameters = null;

  private Object surveyAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return surveyAnalysisInstanceReportRecord
  **/

  public Object getSurveyAnalysisInstanceReportRecord() {
    return surveyAnalysisInstanceReportRecord;
  }

  public void setSurveyAnalysisInstanceReportRecord(Object surveyAnalysisInstanceReportRecord) {
    this.surveyAnalysisInstanceReportRecord = surveyAnalysisInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return surveyAnalysisInstanceReportType
  **/

  public String getSurveyAnalysisInstanceReportType() {
    return surveyAnalysisInstanceReportType;
  }

  public void setSurveyAnalysisInstanceReportType(String surveyAnalysisInstanceReportType) {
    this.surveyAnalysisInstanceReportType = surveyAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return surveyAnalysisInstanceReportParameters
  **/

  public String getSurveyAnalysisInstanceReportParameters() {
    return surveyAnalysisInstanceReportParameters;
  }

  public void setSurveyAnalysisInstanceReportParameters(String surveyAnalysisInstanceReportParameters) {
    this.surveyAnalysisInstanceReportParameters = surveyAnalysisInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return surveyAnalysisInstanceReport
  **/

  public Object getSurveyAnalysisInstanceReport() {
    return surveyAnalysisInstanceReport;
  }

  public void setSurveyAnalysisInstanceReport(Object surveyAnalysisInstanceReport) {
    this.surveyAnalysisInstanceReport = surveyAnalysisInstanceReport;
  }


}

