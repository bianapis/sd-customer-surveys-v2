package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQReviewerSelectionRequestInputModel
 */
public class BQReviewerSelectionRequestInputModel   {
  private String customerSurveyProcedureInstanceReference = null;

  private String reviewerSelectionInstanceReference = null;

  private Object reviewerSelectionRequestActionTaskRecord = null;

  private CRCustomerSurveyProcedureRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerSurveyProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerSurveyProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

