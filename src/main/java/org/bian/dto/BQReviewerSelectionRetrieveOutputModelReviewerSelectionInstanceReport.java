package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceReport
 */
public class BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceReport   {
  private Object reviewerSelectionInstanceReportRecord = null;

  private String reviewerSelectionInstanceReportType = null;

  private String reviewerSelectionInstanceReportParameters = null;

  private Object reviewerSelectionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return reviewerSelectionInstanceReportRecord
  **/

  public Object getReviewerSelectionInstanceReportRecord() {
    return reviewerSelectionInstanceReportRecord;
  }

  public void setReviewerSelectionInstanceReportRecord(Object reviewerSelectionInstanceReportRecord) {
    this.reviewerSelectionInstanceReportRecord = reviewerSelectionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return reviewerSelectionInstanceReportType
  **/

  public String getReviewerSelectionInstanceReportType() {
    return reviewerSelectionInstanceReportType;
  }

  public void setReviewerSelectionInstanceReportType(String reviewerSelectionInstanceReportType) {
    this.reviewerSelectionInstanceReportType = reviewerSelectionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return reviewerSelectionInstanceReportParameters
  **/

  public String getReviewerSelectionInstanceReportParameters() {
    return reviewerSelectionInstanceReportParameters;
  }

  public void setReviewerSelectionInstanceReportParameters(String reviewerSelectionInstanceReportParameters) {
    this.reviewerSelectionInstanceReportParameters = reviewerSelectionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return reviewerSelectionInstanceReport
  **/

  public Object getReviewerSelectionInstanceReport() {
    return reviewerSelectionInstanceReport;
  }

  public void setReviewerSelectionInstanceReport(Object reviewerSelectionInstanceReport) {
    this.reviewerSelectionInstanceReport = reviewerSelectionInstanceReport;
  }


}

