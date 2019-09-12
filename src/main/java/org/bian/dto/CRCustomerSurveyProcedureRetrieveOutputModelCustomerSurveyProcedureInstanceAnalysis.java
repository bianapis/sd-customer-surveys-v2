package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceAnalysis
 */
public class CRCustomerSurveyProcedureRetrieveOutputModelCustomerSurveyProcedureInstanceAnalysis   {
  private String customerSurveyProcedureInstanceAnalysisData = null;

  private String customerSurveyProcedureInstanceAnalysisReportType = null;

  private Object customerSurveyProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerSurveyProcedureInstanceAnalysisData
  **/

  public String getCustomerSurveyProcedureInstanceAnalysisData() {
    return customerSurveyProcedureInstanceAnalysisData;
  }

  public void setCustomerSurveyProcedureInstanceAnalysisData(String customerSurveyProcedureInstanceAnalysisData) {
    this.customerSurveyProcedureInstanceAnalysisData = customerSurveyProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerSurveyProcedureInstanceAnalysisReportType
  **/

  public String getCustomerSurveyProcedureInstanceAnalysisReportType() {
    return customerSurveyProcedureInstanceAnalysisReportType;
  }

  public void setCustomerSurveyProcedureInstanceAnalysisReportType(String customerSurveyProcedureInstanceAnalysisReportType) {
    this.customerSurveyProcedureInstanceAnalysisReportType = customerSurveyProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerSurveyProcedureInstanceAnalysisReport
  **/

  public Object getCustomerSurveyProcedureInstanceAnalysisReport() {
    return customerSurveyProcedureInstanceAnalysisReport;
  }

  public void setCustomerSurveyProcedureInstanceAnalysisReport(Object customerSurveyProcedureInstanceAnalysisReport) {
    this.customerSurveyProcedureInstanceAnalysisReport = customerSurveyProcedureInstanceAnalysisReport;
  }


}

