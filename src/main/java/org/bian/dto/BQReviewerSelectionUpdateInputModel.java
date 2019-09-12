package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewerSelectionUpdateInputModel
 */
public class BQReviewerSelectionUpdateInputModel   {
  private String customerSurveyProcedureInstanceReference = null;

  private String reviewerSelectionInstanceReference = null;

  private Object reviewerSelectionUpdateActionTaskRecord = null;

  private String reviewerSelectionUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Survey Procedure instance 
   * @return customerSurveyProcedureInstanceReference
  **/

  public String getCustomerSurveyProcedureInstanceReference() {
    return customerSurveyProcedureInstanceReference;
  }

  public void setCustomerSurveyProcedureInstanceReference(String customerSurveyProcedureInstanceReference) {
    this.customerSurveyProcedureInstanceReference = customerSurveyProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reviewer Selection instance 
   * @return reviewerSelectionInstanceReference
  **/

  public String getReviewerSelectionInstanceReference() {
    return reviewerSelectionInstanceReference;
  }

  public void setReviewerSelectionInstanceReference(String reviewerSelectionInstanceReference) {
    this.reviewerSelectionInstanceReference = reviewerSelectionInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return reviewerSelectionUpdateActionRequest
  **/

  public String getReviewerSelectionUpdateActionRequest() {
    return reviewerSelectionUpdateActionRequest;
  }

  public void setReviewerSelectionUpdateActionRequest(String reviewerSelectionUpdateActionRequest) {
    this.reviewerSelectionUpdateActionRequest = reviewerSelectionUpdateActionRequest;
  }


}

