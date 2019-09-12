package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord;
import org.bian.dto.BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceAnalysis;
import org.bian.dto.BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisRetrieveOutputModel
 */
public class BQSurveyAnalysisRetrieveOutputModel   {
  private BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord surveyAnalysisInstanceRecord = null;

  private String surveyAnalysisRetrieveActionTaskReference = null;

  private Object surveyAnalysisRetrieveActionTaskRecord = null;

  private String surveyAnalysisRetrieveActionResponse = null;

  private BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceReport surveyAnalysisInstanceReport = null;

  private BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceAnalysis surveyAnalysisInstanceAnalysis = null;


  /**
   * Get surveyAnalysisInstanceRecord
   * @return surveyAnalysisInstanceRecord
  **/

  public BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord getSurveyAnalysisInstanceRecord() {
    return surveyAnalysisInstanceRecord;
  }

  public void setSurveyAnalysisInstanceRecord(BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord surveyAnalysisInstanceRecord) {
    this.surveyAnalysisInstanceRecord = surveyAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Survey Analysis instance retrieve service call 
   * @return surveyAnalysisRetrieveActionTaskReference
  **/

  public String getSurveyAnalysisRetrieveActionTaskReference() {
    return surveyAnalysisRetrieveActionTaskReference;
  }

  public void setSurveyAnalysisRetrieveActionTaskReference(String surveyAnalysisRetrieveActionTaskReference) {
    this.surveyAnalysisRetrieveActionTaskReference = surveyAnalysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return surveyAnalysisRetrieveActionResponse
  **/

  public String getSurveyAnalysisRetrieveActionResponse() {
    return surveyAnalysisRetrieveActionResponse;
  }

  public void setSurveyAnalysisRetrieveActionResponse(String surveyAnalysisRetrieveActionResponse) {
    this.surveyAnalysisRetrieveActionResponse = surveyAnalysisRetrieveActionResponse;
  }


  /**
   * Get surveyAnalysisInstanceReport
   * @return surveyAnalysisInstanceReport
  **/

  public BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceReport getSurveyAnalysisInstanceReport() {
    return surveyAnalysisInstanceReport;
  }

  public void setSurveyAnalysisInstanceReport(BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceReport surveyAnalysisInstanceReport) {
    this.surveyAnalysisInstanceReport = surveyAnalysisInstanceReport;
  }


  /**
   * Get surveyAnalysisInstanceAnalysis
   * @return surveyAnalysisInstanceAnalysis
  **/

  public BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceAnalysis getSurveyAnalysisInstanceAnalysis() {
    return surveyAnalysisInstanceAnalysis;
  }

  public void setSurveyAnalysisInstanceAnalysis(BQSurveyAnalysisRetrieveOutputModelSurveyAnalysisInstanceAnalysis surveyAnalysisInstanceAnalysis) {
    this.surveyAnalysisInstanceAnalysis = surveyAnalysisInstanceAnalysis;
  }


}

