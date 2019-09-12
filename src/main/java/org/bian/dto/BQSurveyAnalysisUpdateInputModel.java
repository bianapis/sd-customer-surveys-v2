package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisUpdateInputModel
 */
public class BQSurveyAnalysisUpdateInputModel   {
  private String customerSurveyProcedureInstanceReference = null;

  private String surveyAnalysisInstanceReference = null;

  private BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord surveyAnalysisInstanceRecord = null;

  private Object surveyAnalysisUpdateActionTaskRecord = null;

  private String surveyAnalysisUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Survey Analysis instance 
   * @return surveyAnalysisInstanceReference
  **/

  public String getSurveyAnalysisInstanceReference() {
    return surveyAnalysisInstanceReference;
  }

  public void setSurveyAnalysisInstanceReference(String surveyAnalysisInstanceReference) {
    this.surveyAnalysisInstanceReference = surveyAnalysisInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return surveyAnalysisUpdateActionRequest
  **/

  public String getSurveyAnalysisUpdateActionRequest() {
    return surveyAnalysisUpdateActionRequest;
  }

  public void setSurveyAnalysisUpdateActionRequest(String surveyAnalysisUpdateActionRequest) {
    this.surveyAnalysisUpdateActionRequest = surveyAnalysisUpdateActionRequest;
  }


}

