package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewerSelectionUpdateOutputModel
 */
public class BQReviewerSelectionUpdateOutputModel   {
  private String reviewerSelectionUpdateActionTaskReference = null;

  private Object reviewerSelectionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return reviewerSelectionUpdateActionTaskReference
  **/

  public String getReviewerSelectionUpdateActionTaskReference() {
    return reviewerSelectionUpdateActionTaskReference;
  }

  public void setReviewerSelectionUpdateActionTaskReference(String reviewerSelectionUpdateActionTaskReference) {
    this.reviewerSelectionUpdateActionTaskReference = reviewerSelectionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return reviewerSelectionUpdateActionTaskRecord
  **/

  public Object getReviewerSelectionUpdateActionTaskRecord() {
    return reviewerSelectionUpdateActionTaskRecord;
  }

  public void setReviewerSelectionUpdateActionTaskRecord(Object reviewerSelectionUpdateActionTaskRecord) {
    this.reviewerSelectionUpdateActionTaskRecord = reviewerSelectionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

