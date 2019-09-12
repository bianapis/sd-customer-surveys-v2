package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceAnalysis
 */
public class BQReviewerSelectionRetrieveInputModelReviewerSelectionInstanceAnalysis   {
  private String reviewerSelectionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return reviewerSelectionInstanceAnalysisReference
  **/

  public String getReviewerSelectionInstanceAnalysisReference() {
    return reviewerSelectionInstanceAnalysisReference;
  }

  public void setReviewerSelectionInstanceAnalysisReference(String reviewerSelectionInstanceAnalysisReference) {
    this.reviewerSelectionInstanceAnalysisReference = reviewerSelectionInstanceAnalysisReference;
  }


}

