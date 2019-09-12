package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceAnalysis;
import org.bian.dto.BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisRetrieveInputModel
 */
public class BQSurveyAnalysisRetrieveInputModel   {
  private Object surveyAnalysisRetrieveActionTaskRecord = null;

  private String surveyAnalysisRetrieveActionRequest = null;

  private BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceReport surveyAnalysisInstanceReport = null;

  private BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceAnalysis surveyAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return surveyAnalysisRetrieveActionTaskRecord
  **/

  public Object getSurveyAnalysisRetrieveActionTaskRecord() {
    return surveyAnalysisRetrieveActionTaskRecord;
  }

  public void setSurveyAnalysisRetrieveActionTaskRecord(Object surveyAnalysisRetrieveActionTaskRecord) {
    this.surveyAnalysisRetrieveActionTaskRecord = surveyAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return surveyAnalysisRetrieveActionRequest
  **/

  public String getSurveyAnalysisRetrieveActionRequest() {
    return surveyAnalysisRetrieveActionRequest;
  }

  public void setSurveyAnalysisRetrieveActionRequest(String surveyAnalysisRetrieveActionRequest) {
    this.surveyAnalysisRetrieveActionRequest = surveyAnalysisRetrieveActionRequest;
  }


  /**
   * Get surveyAnalysisInstanceReport
   * @return surveyAnalysisInstanceReport
  **/

  public BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceReport getSurveyAnalysisInstanceReport() {
    return surveyAnalysisInstanceReport;
  }

  public void setSurveyAnalysisInstanceReport(BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceReport surveyAnalysisInstanceReport) {
    this.surveyAnalysisInstanceReport = surveyAnalysisInstanceReport;
  }


  /**
   * Get surveyAnalysisInstanceAnalysis
   * @return surveyAnalysisInstanceAnalysis
  **/

  public BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceAnalysis getSurveyAnalysisInstanceAnalysis() {
    return surveyAnalysisInstanceAnalysis;
  }

  public void setSurveyAnalysisInstanceAnalysis(BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceAnalysis surveyAnalysisInstanceAnalysis) {
    this.surveyAnalysisInstanceAnalysis = surveyAnalysisInstanceAnalysis;
  }


}

