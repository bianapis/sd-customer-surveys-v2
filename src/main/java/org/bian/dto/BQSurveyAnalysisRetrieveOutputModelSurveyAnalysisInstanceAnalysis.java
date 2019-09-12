package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceAnalysis
 */
public class BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceAnalysis   {
  private Object surveyAnalysisInstanceAnalysisRecord = null;

  private String surveyAnalysisInstanceAnalysisReportType = null;

  private String surveyAnalysisInstanceAnalysisParameters = null;

  private Object surveyAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return surveyAnalysisInstanceAnalysisRecord
  **/

  public Object getSurveyAnalysisInstanceAnalysisRecord() {
    return surveyAnalysisInstanceAnalysisRecord;
  }

  public void setSurveyAnalysisInstanceAnalysisRecord(Object surveyAnalysisInstanceAnalysisRecord) {
    this.surveyAnalysisInstanceAnalysisRecord = surveyAnalysisInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return surveyAnalysisInstanceAnalysisReportType
  **/

  public String getSurveyAnalysisInstanceAnalysisReportType() {
    return surveyAnalysisInstanceAnalysisReportType;
  }

  public void setSurveyAnalysisInstanceAnalysisReportType(String surveyAnalysisInstanceAnalysisReportType) {
    this.surveyAnalysisInstanceAnalysisReportType = surveyAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return surveyAnalysisInstanceAnalysisParameters
  **/

  public String getSurveyAnalysisInstanceAnalysisParameters() {
    return surveyAnalysisInstanceAnalysisParameters;
  }

  public void setSurveyAnalysisInstanceAnalysisParameters(String surveyAnalysisInstanceAnalysisParameters) {
    this.surveyAnalysisInstanceAnalysisParameters = surveyAnalysisInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return surveyAnalysisInstanceAnalysisReport
  **/

  public Object getSurveyAnalysisInstanceAnalysisReport() {
    return surveyAnalysisInstanceAnalysisReport;
  }

  public void setSurveyAnalysisInstanceAnalysisReport(Object surveyAnalysisInstanceAnalysisReport) {
    this.surveyAnalysisInstanceAnalysisReport = surveyAnalysisInstanceAnalysisReport;
  }


}

