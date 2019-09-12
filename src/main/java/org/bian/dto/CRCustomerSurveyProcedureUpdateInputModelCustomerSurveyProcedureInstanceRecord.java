package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordCustomerSurveyConsumablesInventory;
import org.bian.dto.CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRCustomerSurveyProcedureUpdateInputModelCustomerSurveyProcedureInstanceRecord
 */
public class CRCustomerSurveyProcedureUpdateInputModelCustomerSurveyProcedureInstanceRecord   {
  private String customerSurveyType = null;

  private String customerSurveyDescription = null;

  private String employeeBusinessUnitReference = null;

  private String customerSurveyProcedureSetup = null;

  private String customerSurveyProcedureVersionNumber = null;

  private String customerSurveySchedule = null;

  private CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordCustomerSurveyConsumablesInventory customerSurveyConsumablesInventory = null;

  private CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordDateType dateType = null;

  private String customerSurveyProcedureResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of customer survey (e.g. questionnaire, in context solicitation, focus group) 
   * @return customerSurveyType
  **/

  public String getCustomerSurveyType() {
    return customerSurveyType;
  }

  public void setCustomerSurveyType(String customerSurveyType) {
    this.customerSurveyType = customerSurveyType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the customer survey that clarifies the sought customer insights, survey mechanism and target reviewers 
   * @return customerSurveyDescription
  **/

  public String getCustomerSurveyDescription() {
    return customerSurveyDescription;
  }

  public void setCustomerSurveyDescription(String customerSurveyDescription) {
    this.customerSurveyDescription = customerSurveyDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the survey execution 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the deployment set-up/configuration of the customer survey 
   * @return customerSurveyProcedureSetup
  **/

  public String getCustomerSurveyProcedureSetup() {
    return customerSurveyProcedureSetup;
  }

  public void setCustomerSurveyProcedureSetup(String customerSurveyProcedureSetup) {
    this.customerSurveyProcedureSetup = customerSurveyProcedureSetup;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customer survey version number used 
   * @return customerSurveyProcedureVersionNumber
  **/

  public String getCustomerSurveyProcedureVersionNumber() {
    return customerSurveyProcedureVersionNumber;
  }

  public void setCustomerSurveyProcedureVersionNumber(String customerSurveyProcedureVersionNumber) {
    this.customerSurveyProcedureVersionNumber = customerSurveyProcedureVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customer survey processing schedule, covering survey definition, reviewer selection, survey execution and subsequent analysis. Note for some integrated surveys this can be an on-going activity that attempts provides a constant stream of feedback relating to specific activities/services rather than a specific event 
   * @return customerSurveySchedule
  **/

  public String getCustomerSurveySchedule() {
    return customerSurveySchedule;
  }

  public void setCustomerSurveySchedule(String customerSurveySchedule) {
    this.customerSurveySchedule = customerSurveySchedule;
  }


  /**
   * Get customerSurveyConsumablesInventory
   * @return customerSurveyConsumablesInventory
  **/

  public CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordCustomerSurveyConsumablesInventory getCustomerSurveyConsumablesInventory() {
    return customerSurveyConsumablesInventory;
  }

  public void setCustomerSurveyConsumablesInventory(CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordCustomerSurveyConsumablesInventory customerSurveyConsumablesInventory) {
    this.customerSurveyConsumablesInventory = customerSurveyConsumablesInventory;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCustomerSurveyProcedureInitiateInputModelCustomerSurveyProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result/impact of the customer survey (will include summary of customer survey activity, survey response data and survey findings presentation analysis) 
   * @return customerSurveyProcedureResult
  **/

  public String getCustomerSurveyProcedureResult() {
    return customerSurveyProcedureResult;
  }

  public void setCustomerSurveyProcedureResult(String customerSurveyProcedureResult) {
    this.customerSurveyProcedureResult = customerSurveyProcedureResult;
  }


}

