package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceAnalysis;
import org.bian.dto.BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReviewerSelectionRetrieveOutputModel
 */
public class BQReviewerSelectionRetrieveOutputModel   {
  private String reviewerSelectionRetrieveActionTaskReference = null;

  private Object reviewerSelectionRetrieveActionTaskRecord = null;

  private String reviewerSelectionRetrieveActionResponse = null;

  private BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceReport reviewerSelectionInstanceReport = null;

  private BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceAnalysis reviewerSelectionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reviewer Selection instance retrieve service call 
   * @return reviewerSelectionRetrieveActionTaskReference
  **/

  public String getReviewerSelectionRetrieveActionTaskReference() {
    return reviewerSelectionRetrieveActionTaskReference;
  }

  public void setReviewerSelectionRetrieveActionTaskReference(String reviewerSelectionRetrieveActionTaskReference) {
    this.reviewerSelectionRetrieveActionTaskReference = reviewerSelectionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return reviewerSelectionRetrieveActionResponse
  **/

  public String getReviewerSelectionRetrieveActionResponse() {
    return reviewerSelectionRetrieveActionResponse;
  }

  public void setReviewerSelectionRetrieveActionResponse(String reviewerSelectionRetrieveActionResponse) {
    this.reviewerSelectionRetrieveActionResponse = reviewerSelectionRetrieveActionResponse;
  }


  /**
   * Get reviewerSelectionInstanceReport
   * @return reviewerSelectionInstanceReport
  **/

  public BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceReport getReviewerSelectionInstanceReport() {
    return reviewerSelectionInstanceReport;
  }

  public void setReviewerSelectionInstanceReport(BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceReport reviewerSelectionInstanceReport) {
    this.reviewerSelectionInstanceReport = reviewerSelectionInstanceReport;
  }


  /**
   * Get reviewerSelectionInstanceAnalysis
   * @return reviewerSelectionInstanceAnalysis
  **/

  public BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceAnalysis getReviewerSelectionInstanceAnalysis() {
    return reviewerSelectionInstanceAnalysis;
  }

  public void setReviewerSelectionInstanceAnalysis(BQReviewerSelectionRetrieveOutputModelReviewerSelectionInstanceAnalysis reviewerSelectionInstanceAnalysis) {
    this.reviewerSelectionInstanceAnalysis = reviewerSelectionInstanceAnalysis;
  }


}

