package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceAnalysis
 */
public class BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceAnalysis   {
  private Object reviewerSelectionInstanceAnalysisRecord = null;

  private String reviewerSelectionInstanceAnalysisReportType = null;

  private String reviewerSelectionInstanceAnalysisParameters = null;

  private Object reviewerSelectionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return reviewerSelectionInstanceAnalysisRecord
  **/

  public Object getReviewerSelectionInstanceAnalysisRecord() {
    return reviewerSelectionInstanceAnalysisRecord;
  }

  public void setReviewerSelectionInstanceAnalysisRecord(Object reviewerSelectionInstanceAnalysisRecord) {
    this.reviewerSelectionInstanceAnalysisRecord = reviewerSelectionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return reviewerSelectionInstanceAnalysisReportType
  **/

  public String getReviewerSelectionInstanceAnalysisReportType() {
    return reviewerSelectionInstanceAnalysisReportType;
  }

  public void setReviewerSelectionInstanceAnalysisReportType(String reviewerSelectionInstanceAnalysisReportType) {
    this.reviewerSelectionInstanceAnalysisReportType = reviewerSelectionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return reviewerSelectionInstanceAnalysisParameters
  **/

  public String getReviewerSelectionInstanceAnalysisParameters() {
    return reviewerSelectionInstanceAnalysisParameters;
  }

  public void setReviewerSelectionInstanceAnalysisParameters(String reviewerSelectionInstanceAnalysisParameters) {
    this.reviewerSelectionInstanceAnalysisParameters = reviewerSelectionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return reviewerSelectionInstanceAnalysisReport
  **/

  public Object getReviewerSelectionInstanceAnalysisReport() {
    return reviewerSelectionInstanceAnalysisReport;
  }

  public void setReviewerSelectionInstanceAnalysisReport(Object reviewerSelectionInstanceAnalysisReport) {
    this.reviewerSelectionInstanceAnalysisReport = reviewerSelectionInstanceAnalysisReport;
  }


}

