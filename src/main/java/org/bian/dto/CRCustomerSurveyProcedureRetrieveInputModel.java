package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureRetrieveInputModel
 */
public class CRCustomerSurveyProcedureRetrieveInputModel   {
  private Object customerSurveyProcedureRetrieveActionTaskRecord = null;

  private String customerSurveyProcedureRetrieveActionRequest = null;

  private CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceReportRecord customerSurveyProcedureInstanceReportRecord = null;

  private CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceAnalysis customerSurveyProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerSurveyProcedureRetrieveActionTaskRecord
  **/

  public Object getCustomerSurveyProcedureRetrieveActionTaskRecord() {
    return customerSurveyProcedureRetrieveActionTaskRecord;
  }

  public void setCustomerSurveyProcedureRetrieveActionTaskRecord(Object customerSurveyProcedureRetrieveActionTaskRecord) {
    this.customerSurveyProcedureRetrieveActionTaskRecord = customerSurveyProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerSurveyProcedureRetrieveActionRequest
  **/

  public String getCustomerSurveyProcedureRetrieveActionRequest() {
    return customerSurveyProcedureRetrieveActionRequest;
  }

  public void setCustomerSurveyProcedureRetrieveActionRequest(String customerSurveyProcedureRetrieveActionRequest) {
    this.customerSurveyProcedureRetrieveActionRequest = customerSurveyProcedureRetrieveActionRequest;
  }


  /**
   * Get customerSurveyProcedureInstanceReportRecord
   * @return customerSurveyProcedureInstanceReportRecord
  **/

  public CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceReportRecord getCustomerSurveyProcedureInstanceReportRecord() {
    return customerSurveyProcedureInstanceReportRecord;
  }

  public void setCustomerSurveyProcedureInstanceReportRecord(CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceReportRecord customerSurveyProcedureInstanceReportRecord) {
    this.customerSurveyProcedureInstanceReportRecord = customerSurveyProcedureInstanceReportRecord;
  }


  /**
   * Get customerSurveyProcedureInstanceAnalysis
   * @return customerSurveyProcedureInstanceAnalysis
  **/

  public CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceAnalysis getCustomerSurveyProcedureInstanceAnalysis() {
    return customerSurveyProcedureInstanceAnalysis;
  }

  public void setCustomerSurveyProcedureInstanceAnalysis(CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceAnalysis customerSurveyProcedureInstanceAnalysis) {
    this.customerSurveyProcedureInstanceAnalysis = customerSurveyProcedureInstanceAnalysis;
  }


}

