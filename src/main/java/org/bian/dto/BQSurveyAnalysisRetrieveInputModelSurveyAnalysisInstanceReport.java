package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceReport
 */
public class BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceReport   {
  private String surveyAnalysisInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return surveyAnalysisInstanceReportReference
  **/

  public String getSurveyAnalysisInstanceReportReference() {
    return surveyAnalysisInstanceReportReference;
  }

  public void setSurveyAnalysisInstanceReportReference(String surveyAnalysisInstanceReportReference) {
    this.surveyAnalysisInstanceReportReference = surveyAnalysisInstanceReportReference;
  }


}

