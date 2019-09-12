package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceReportRecord
 */
public class CRCustomerSurveyProcedureRetrieveInputModelCustomerSurveyProcedureInstanceReportRecord   {
  private String customerSurveyProcedureInstanceReportReference = null;

  private String customerSurveyProcedureInstanceReportType = null;

  private String customerSurveyProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerSurveyProcedureInstanceReportReference
  **/

  public String getCustomerSurveyProcedureInstanceReportReference() {
    return customerSurveyProcedureInstanceReportReference;
  }

  public void setCustomerSurveyProcedureInstanceReportReference(String customerSurveyProcedureInstanceReportReference) {
    this.customerSurveyProcedureInstanceReportReference = customerSurveyProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerSurveyProcedureInstanceReportParameters
  **/

  public String getCustomerSurveyProcedureInstanceReportParameters() {
    return customerSurveyProcedureInstanceReportParameters;
  }

  public void setCustomerSurveyProcedureInstanceReportParameters(String customerSurveyProcedureInstanceReportParameters) {
    this.customerSurveyProcedureInstanceReportParameters = customerSurveyProcedureInstanceReportParameters;
  }


}

