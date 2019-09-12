package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord
 */
public class BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord   {
  private String customerSurveyProcedureSurveyAnalysisResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result customer survey which combines response details/statistics and associated analysis, commentary and derived insights 
   * @return customerSurveyProcedureSurveyAnalysisResult
  **/

  public String getCustomerSurveyProcedureSurveyAnalysisResult() {
    return customerSurveyProcedureSurveyAnalysisResult;
  }

  public void setCustomerSurveyProcedureSurveyAnalysisResult(String customerSurveyProcedureSurveyAnalysisResult) {
    this.customerSurveyProcedureSurveyAnalysisResult = customerSurveyProcedureSurveyAnalysisResult;
  }


}

