package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionExecuteInputModelExecuteRecordType;
import org.bian.dto.BQExecutionExecuteInputModelExecutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExecutionExecuteInputModel
 */
public class BQExecutionExecuteInputModel   {
  private String customerSurveyProcedureInstanceReference = null;

  private String executionInstanceReference = null;

  private BQExecutionExecuteInputModelExecutionInstanceRecord executionInstanceRecord = null;

  private Object executionExecuteActionTaskRecord = null;

  private BQExecutionExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution instance 
   * @return executionInstanceReference
  **/

  public String getExecutionInstanceReference() {
    return executionInstanceReference;
  }

  public void setExecutionInstanceReference(String executionInstanceReference) {
    this.executionInstanceReference = executionInstanceReference;
  }


  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/

  public BQExecutionExecuteInputModelExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionExecuteInputModelExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return executionExecuteActionTaskRecord
  **/

  public Object getExecutionExecuteActionTaskRecord() {
    return executionExecuteActionTaskRecord;
  }

  public void setExecutionExecuteActionTaskRecord(Object executionExecuteActionTaskRecord) {
    this.executionExecuteActionTaskRecord = executionExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQExecutionExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQExecutionExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

