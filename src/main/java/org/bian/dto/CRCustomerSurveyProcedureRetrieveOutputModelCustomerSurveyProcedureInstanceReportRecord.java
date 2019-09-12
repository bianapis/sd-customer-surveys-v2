package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceReportRecord
 */
public class CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceReportRecord   {
  private String customerSurveyProcedureInstanceReportData = null;

  private String customerSurveyProcedureInstanceReportType = null;

  private Object customerSurveyProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerSurveyProcedureInstanceReportData
  **/

  public String getCustomerSurveyProcedureInstanceReportData() {
    return customerSurveyProcedureInstanceReportData;
  }

  public void setCustomerSurveyProcedureInstanceReportData(String customerSurveyProcedureInstanceReportData) {
    this.customerSurveyProcedureInstanceReportData = customerSurveyProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerSurveyProcedureInstanceReportType
  **/

  public String getCustomerSurveyProcedureInstanceReportType() {
    return customerSurveyProcedureInstanceReportType;
  }

  public void setCustomerSurveyProcedureInstanceReportType(String customerSurveyProcedureInstanceReportType) {
    this.customerSurveyProcedureInstanceReportType = customerSurveyProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerSurveyProcedureInstanceReport
  **/

  public Object getCustomerSurveyProcedureInstanceReport() {
    return customerSurveyProcedureInstanceReport;
  }

  public void setCustomerSurveyProcedureInstanceReport(Object customerSurveyProcedureInstanceReport) {
    this.customerSurveyProcedureInstanceReport = customerSurveyProcedureInstanceReport;
  }


}

