package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisUpdateOutputModel
 */
public class BQSurveyAnalysisUpdateOutputModel   {
  private BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord surveyAnalysisInstanceRecord = null;

  private String surveyAnalysisUpdateActionTaskReference = null;

  private Object surveyAnalysisUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get surveyAnalysisInstanceRecord
   * @return surveyAnalysisInstanceRecord
  **/

  public BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord getSurveyAnalysisInstanceRecord() {
    return surveyAnalysisInstanceRecord;
  }

  public void setSurveyAnalysisInstanceRecord(BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord surveyAnalysisInstanceRecord) {
    this.surveyAnalysisInstanceRecord = surveyAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return surveyAnalysisUpdateActionTaskReference
  **/

  public String getSurveyAnalysisUpdateActionTaskReference() {
    return surveyAnalysisUpdateActionTaskReference;
  }

  public void setSurveyAnalysisUpdateActionTaskReference(String surveyAnalysisUpdateActionTaskReference) {
    this.surveyAnalysisUpdateActionTaskReference = surveyAnalysisUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return surveyAnalysisUpdateActionTaskRecord
  **/

  public Object getSurveyAnalysisUpdateActionTaskRecord() {
    return surveyAnalysisUpdateActionTaskRecord;
  }

  public void setSurveyAnalysisUpdateActionTaskRecord(Object surveyAnalysisUpdateActionTaskRecord) {
    this.surveyAnalysisUpdateActionTaskRecord = surveyAnalysisUpdateActionTaskRecord;
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

