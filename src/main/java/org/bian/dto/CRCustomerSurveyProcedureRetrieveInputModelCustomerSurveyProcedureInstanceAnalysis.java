package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceAnalysis
 */
public class CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceAnalysis   {
  private String customerSurveyProcedureInstanceAnalysisReference = null;

  private String customerSurveyProcedureInstanceAnalysisReportType = null;

  private String customerSurveyProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerSurveyProcedureInstanceAnalysisReference
  **/

  public String getCustomerSurveyProcedureInstanceAnalysisReference() {
    return customerSurveyProcedureInstanceAnalysisReference;
  }

  public void setCustomerSurveyProcedureInstanceAnalysisReference(String customerSurveyProcedureInstanceAnalysisReference) {
    this.customerSurveyProcedureInstanceAnalysisReference = customerSurveyProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerSurveyProcedureInstanceAnalysisParameters
  **/

  public String getCustomerSurveyProcedureInstanceAnalysisParameters() {
    return customerSurveyProcedureInstanceAnalysisParameters;
  }

  public void setCustomerSurveyProcedureInstanceAnalysisParameters(String customerSurveyProcedureInstanceAnalysisParameters) {
    this.customerSurveyProcedureInstanceAnalysisParameters = customerSurveyProcedureInstanceAnalysisParameters;
  }


}

