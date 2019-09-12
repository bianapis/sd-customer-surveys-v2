package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewerSelectionRequestOutputModel
 */
public class BQReviewerSelectionRequestOutputModel   {
  private String reviewerSelectionRequestActionTaskReference = null;

  private Object reviewerSelectionRequestActionTaskRecord = null;

  private String reviewerSelectionRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reviewer Selection instance request service call 
   * @return reviewerSelectionRequestActionTaskReference
  **/

  public String getReviewerSelectionRequestActionTaskReference() {
    return reviewerSelectionRequestActionTaskReference;
  }

  public void setReviewerSelectionRequestActionTaskReference(String reviewerSelectionRequestActionTaskReference) {
    this.reviewerSelectionRequestActionTaskReference = reviewerSelectionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return reviewerSelectionRequestActionTaskRecord
  **/

  public Object getReviewerSelectionRequestActionTaskRecord() {
    return reviewerSelectionRequestActionTaskRecord;
  }

  public void setReviewerSelectionRequestActionTaskRecord(Object reviewerSelectionRequestActionTaskRecord) {
    this.reviewerSelectionRequestActionTaskRecord = reviewerSelectionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reviewer Selection service request record 
   * @return reviewerSelectionRequestRecordReference
  **/

  public String getReviewerSelectionRequestRecordReference() {
    return reviewerSelectionRequestRecordReference;
  }

  public void setReviewerSelectionRequestRecordReference(String reviewerSelectionRequestRecordReference) {
    this.reviewerSelectionRequestRecordReference = reviewerSelectionRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

