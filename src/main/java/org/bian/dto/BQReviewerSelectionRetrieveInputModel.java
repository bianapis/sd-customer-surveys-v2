package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceAnalysis;
import org.bian.dto.BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReviewerSelectionRetrieveInputModel
 */
public class BQReviewerSelectionRetrieveInputModel   {
  private Object reviewerSelectionRetrieveActionTaskRecord = null;

  private String reviewerSelectionRetrieveActionRequest = null;

  private BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceReport reviewerSelectionInstanceReport = null;

  private BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceAnalysis reviewerSelectionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return reviewerSelectionRetrieveActionTaskRecord
  **/

  public Object getReviewerSelectionRetrieveActionTaskRecord() {
    return reviewerSelectionRetrieveActionTaskRecord;
  }

  public void setReviewerSelectionRetrieveActionTaskRecord(Object reviewerSelectionRetrieveActionTaskRecord) {
    this.reviewerSelectionRetrieveActionTaskRecord = reviewerSelectionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return reviewerSelectionRetrieveActionRequest
  **/

  public String getReviewerSelectionRetrieveActionRequest() {
    return reviewerSelectionRetrieveActionRequest;
  }

  public void setReviewerSelectionRetrieveActionRequest(String reviewerSelectionRetrieveActionRequest) {
    this.reviewerSelectionRetrieveActionRequest = reviewerSelectionRetrieveActionRequest;
  }


  /**
   * Get reviewerSelectionInstanceReport
   * @return reviewerSelectionInstanceReport
  **/

  public BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceReport getReviewerSelectionInstanceReport() {
    return reviewerSelectionInstanceReport;
  }

  public void setReviewerSelectionInstanceReport(BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceReport reviewerSelectionInstanceReport) {
    this.reviewerSelectionInstanceReport = reviewerSelectionInstanceReport;
  }


  /**
   * Get reviewerSelectionInstanceAnalysis
   * @return reviewerSelectionInstanceAnalysis
  **/

  public BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceAnalysis getReviewerSelectionInstanceAnalysis() {
    return reviewerSelectionInstanceAnalysis;
  }

  public void setReviewerSelectionInstanceAnalysis(BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceAnalysis reviewerSelectionInstanceAnalysis) {
    this.reviewerSelectionInstanceAnalysis = reviewerSelectionInstanceAnalysis;
  }


}

