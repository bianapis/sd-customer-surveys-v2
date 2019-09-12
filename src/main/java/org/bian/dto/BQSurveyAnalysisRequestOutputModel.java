package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisRequestOutputModel
 */
public class BQSurveyAnalysisRequestOutputModel   {
  private BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord surveyAnalysisInstanceRecord = null;

  private String surveyAnalysisRequestActionTaskReference = null;

  private Object surveyAnalysisRequestActionTaskRecord = null;

  private String surveyAnalysisRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Survey Analysis instance request service call 
   * @return surveyAnalysisRequestActionTaskReference
  **/

  public String getSurveyAnalysisRequestActionTaskReference() {
    return surveyAnalysisRequestActionTaskReference;
  }

  public void setSurveyAnalysisRequestActionTaskReference(String surveyAnalysisRequestActionTaskReference) {
    this.surveyAnalysisRequestActionTaskReference = surveyAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return surveyAnalysisRequestActionTaskRecord
  **/

  public Object getSurveyAnalysisRequestActionTaskRecord() {
    return surveyAnalysisRequestActionTaskRecord;
  }

  public void setSurveyAnalysisRequestActionTaskRecord(Object surveyAnalysisRequestActionTaskRecord) {
    this.surveyAnalysisRequestActionTaskRecord = surveyAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Survey Analysis service request record 
   * @return surveyAnalysisRequestRecordReference
  **/

  public String getSurveyAnalysisRequestRecordReference() {
    return surveyAnalysisRequestRecordReference;
  }

  public void setSurveyAnalysisRequestRecordReference(String surveyAnalysisRequestRecordReference) {
    this.surveyAnalysisRequestRecordReference = surveyAnalysisRequestRecordReference;
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

