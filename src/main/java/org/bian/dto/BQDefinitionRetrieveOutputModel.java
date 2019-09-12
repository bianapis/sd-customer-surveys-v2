package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDefinitionRetrieveOutputModelCustomerSurveyProcedureInstanceRecord;
import org.bian.dto.BQDefinitionRetrieveOutputModelDefinitionInstanceAnalysis;
import org.bian.dto.BQDefinitionRetrieveOutputModelDefinitionInstanceReport;
import org.bian.dto.BQDefinitionUpdateInputModelDefinitionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDefinitionRetrieveOutputModel
 */
public class BQDefinitionRetrieveOutputModel   {
  private BQDefinitionRetrieveOutputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord = null;

  private BQDefinitionUpdateInputModelDefinitionInstanceRecord definitionInstanceRecord = null;

  private String definitionRetrieveActionTaskReference = null;

  private Object definitionRetrieveActionTaskRecord = null;

  private String definitionRetrieveActionResponse = null;

  private BQDefinitionRetrieveOutputModelDefinitionInstanceReport definitionInstanceReport = null;

  private BQDefinitionRetrieveOutputModelDefinitionInstanceAnalysis definitionInstanceAnalysis = null;


  /**
   * Get customerSurveyProcedureInstanceRecord
   * @return customerSurveyProcedureInstanceRecord
  **/

  public BQDefinitionRetrieveOutputModelCustomerSurveyProcedureInstanceRecord getCustomerSurveyProcedureInstanceRecord() {
    return customerSurveyProcedureInstanceRecord;
  }

  public void setCustomerSurveyProcedureInstanceRecord(BQDefinitionRetrieveOutputModelCustomerSurveyProcedureInstanceRecord customerSurveyProcedureInstanceRecord) {
    this.customerSurveyProcedureInstanceRecord = customerSurveyProcedureInstanceRecord;
  }


  /**
   * Get definitionInstanceRecord
   * @return definitionInstanceRecord
  **/

  public BQDefinitionUpdateInputModelDefinitionInstanceRecord getDefinitionInstanceRecord() {
    return definitionInstanceRecord;
  }

  public void setDefinitionInstanceRecord(BQDefinitionUpdateInputModelDefinitionInstanceRecord definitionInstanceRecord) {
    this.definitionInstanceRecord = definitionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Definition instance retrieve service call 
   * @return definitionRetrieveActionTaskReference
  **/

  public String getDefinitionRetrieveActionTaskReference() {
    return definitionRetrieveActionTaskReference;
  }

  public void setDefinitionRetrieveActionTaskReference(String definitionRetrieveActionTaskReference) {
    this.definitionRetrieveActionTaskReference = definitionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return definitionRetrieveActionTaskRecord
  **/

  public Object getDefinitionRetrieveActionTaskRecord() {
    return definitionRetrieveActionTaskRecord;
  }

  public void setDefinitionRetrieveActionTaskRecord(Object definitionRetrieveActionTaskRecord) {
    this.definitionRetrieveActionTaskRecord = definitionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return definitionRetrieveActionResponse
  **/

  public String getDefinitionRetrieveActionResponse() {
    return definitionRetrieveActionResponse;
  }

  public void setDefinitionRetrieveActionResponse(String definitionRetrieveActionResponse) {
    this.definitionRetrieveActionResponse = definitionRetrieveActionResponse;
  }


  /**
   * Get definitionInstanceReport
   * @return definitionInstanceReport
  **/

  public BQDefinitionRetrieveOutputModelDefinitionInstanceReport getDefinitionInstanceReport() {
    return definitionInstanceReport;
  }

  public void setDefinitionInstanceReport(BQDefinitionRetrieveOutputModelDefinitionInstanceReport definitionInstanceReport) {
    this.definitionInstanceReport = definitionInstanceReport;
  }


  /**
   * Get definitionInstanceAnalysis
   * @return definitionInstanceAnalysis
  **/

  public BQDefinitionRetrieveOutputModelDefinitionInstanceAnalysis getDefinitionInstanceAnalysis() {
    return definitionInstanceAnalysis;
  }

  public void setDefinitionInstanceAnalysis(BQDefinitionRetrieveOutputModelDefinitionInstanceAnalysis definitionInstanceAnalysis) {
    this.definitionInstanceAnalysis = definitionInstanceAnalysis;
  }


}

