package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceAnalysis
 */
public class BQSurveyAnalysisRetrieveInputModelSurveyAnalysisInstanceAnalysis   {
  private String surveyAnalysisInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return surveyAnalysisInstanceAnalysisReference
  **/

  public String getSurveyAnalysisInstanceAnalysisReference() {
    return surveyAnalysisInstanceAnalysisReference;
  }

  public void setSurveyAnalysisInstanceAnalysisReference(String surveyAnalysisInstanceAnalysisReference) {
    this.surveyAnalysisInstanceAnalysisReference = surveyAnalysisInstanceAnalysisReference;
  }


}

