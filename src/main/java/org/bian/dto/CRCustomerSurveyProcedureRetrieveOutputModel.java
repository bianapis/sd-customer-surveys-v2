package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceRecord;
import org.bian.dto.CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureRetrieveOutputModel
 */
public class CRCustomerSurveyProcedureRetrieveOutputModel   {
  private CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private String customerSurveyProcedureRetrieveActionTaskReference = null;

  private Object customerSurveyProcedureRetrieveActionTaskRecord = null;

  private String customerSurveyProcedureRetrieveActionResponse = null;

  private CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceReportRecord customerSurveyProcedureInstanceReportRecord = null;

  private CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceAnalysis customerSurveyProcedureInstanceAnalysis = null;


  /**
   * Get customerSurveyProcedureInstanceRecord
   * @return customerSurveyProcedureInstanceRecord
  **/

  public CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceRecord getCustomerSurveyProcedureInstanceRecord() {
    return customerSurveyProcedureInstanceRecord;
  }

  public void setCustomerSurveyProcedureInstanceRecord(CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord) {
    this.customerSurveyProcedureInstanceRecord = customerSurveyProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Survey Procedure instance retrieve service call 
   * @return customerSurveyProcedureRetrieveActionTaskReference
  **/

  public String getCustomerSurveyProcedureRetrieveActionTaskReference() {
    return customerSurveyProcedureRetrieveActionTaskReference;
  }

  public void setCustomerSurveyProcedureRetrieveActionTaskReference(String customerSurveyProcedureRetrieveActionTaskReference) {
    this.customerSurveyProcedureRetrieveActionTaskReference = customerSurveyProcedureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerSurveyProcedureRetrieveActionResponse
  **/

  public String getCustomerSurveyProcedureRetrieveActionResponse() {
    return customerSurveyProcedureRetrieveActionResponse;
  }

  public void setCustomerSurveyProcedureRetrieveActionResponse(String customerSurveyProcedureRetrieveActionResponse) {
    this.customerSurveyProcedureRetrieveActionResponse = customerSurveyProcedureRetrieveActionResponse;
  }


  /**
   * Get customerSurveyProcedureInstanceReportRecord
   * @return customerSurveyProcedureInstanceReportRecord
  **/

  public CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceReportRecord getCustomerSurveyProcedureInstanceReportRecord() {
    return customerSurveyProcedureInstanceReportRecord;
  }

  public void setCustomerSurveyProcedureInstanceReportRecord(CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceReportRecord customerSurveyProcedureInstanceReportRecord) {
    this.customerSurveyProcedureInstanceReportRecord = customerSurveyProcedureInstanceReportRecord;
  }


  /**
   * Get customerSurveyProcedureInstanceAnalysis
   * @return customerSurveyProcedureInstanceAnalysis
  **/

  public CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceAnalysis getCustomerSurveyProcedureInstanceAnalysis() {
    return customerSurveyProcedureInstanceAnalysis;
  }

  public void setCustomerSurveyProcedureInstanceAnalysis(CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceAnalysis customerSurveyProcedureInstanceAnalysis) {
    this.customerSurveyProcedureInstanceAnalysis = customerSurveyProcedureInstanceAnalysis;
  }


}

