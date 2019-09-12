package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord;
import org.bian.dto.CRCustomerSurveyProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQSurveyAnalysisRequestInputModel
 */
public class BQSurveyAnalysisRequestInputModel   {
  private String customerSurveyProcedureInstanceReference = null;

  private String surveyAnalysisInstanceReference = null;

  private BQSurveyAnalysisInitiateInputModelSurveyAnalysisInstanceRecord surveyAnalysisInstanceRecord = null;

  private Object surveyAnalysisRequestActionTaskRecord = null;

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

