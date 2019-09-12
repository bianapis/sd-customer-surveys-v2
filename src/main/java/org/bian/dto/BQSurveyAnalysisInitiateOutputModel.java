package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSurveyAnalysisInitiateInputModelCustomerSurveyProcedureInstanceRecord;
import org.bian.dto.BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisInitiateOutputModel
 */
public class BQSurveyAnalysisInitiateOutputModel   {
  private BQSurveyAnalysisInitiateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private String surveyAnalysisInstanceReference = null;

  private String surveyAnalysisInitiateActionReference = null;

  private Object surveyAnalysisInitiateActionRecord = null;

  private String surveyAnalysisInstanceStatus = null;

  private BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord surveyAnalysisInstanceRecord = null;


  /**
   * Get customerSurveyProcedureInstanceRecord
   * @return customerSurveyProcedureInstanceRecord
  **/

  public BQSurveyAnalysisInitiateInputModelCustomerSurveyProcedureInstanceRecord getCustomerSurveyProcedureInstanceRecord() {
    return customerSurveyProcedureInstanceRecord;
  }

  public void setCustomerSurveyProcedureInstanceRecord(BQSurveyAnalysisInitiateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord) {
    this.customerSurveyProcedureInstanceRecord = customerSurveyProcedureInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return surveyAnalysisInitiateActionReference
  **/

  public String getSurveyAnalysisInitiateActionReference() {
    return surveyAnalysisInitiateActionReference;
  }

  public void setSurveyAnalysisInitiateActionReference(String surveyAnalysisInitiateActionReference) {
    this.surveyAnalysisInitiateActionReference = surveyAnalysisInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return surveyAnalysisInitiateActionRecord
  **/

  public Object getSurveyAnalysisInitiateActionRecord() {
    return surveyAnalysisInitiateActionRecord;
  }

  public void setSurveyAnalysisInitiateActionRecord(Object surveyAnalysisInitiateActionRecord) {
    this.surveyAnalysisInitiateActionRecord = surveyAnalysisInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Survey Analysis instance (e.g. initialised, pending, active) 
   * @return surveyAnalysisInstanceStatus
  **/

  public String getSurveyAnalysisInstanceStatus() {
    return surveyAnalysisInstanceStatus;
  }

  public void setSurveyAnalysisInstanceStatus(String surveyAnalysisInstanceStatus) {
    this.surveyAnalysisInstanceStatus = surveyAnalysisInstanceStatus;
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


}

