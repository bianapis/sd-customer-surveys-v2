package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSurveyAnalysisInitiateInputModelCustomerSurveyProcedureInstanceRecord;
import org.bian.dto.BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisInitiateInputModel
 */
public class BQSurveyAnalysisInitiateInputModel   {
  private BQSurveyAnalysisInitiateInputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private String customerSurveyProcedureInstanceReference = null;

  private Object surveyAnalysisInitiateActionRecord = null;

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

