package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionExecuteInputModelExecutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExecutionExecuteOutputModel
 */
public class BQExecutionExecuteOutputModel   {
  private BQExecutionExecuteInputModelExecutionInstanceRecord executionInstanceRecord = null;

  private String executionExecuteActionTaskReference = null;

  private Object executionExecuteActionTaskRecord = null;

  private String executionExecuteRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution instance execute service call 
   * @return executionExecuteActionTaskReference
  **/

  public String getExecutionExecuteActionTaskReference() {
    return executionExecuteActionTaskReference;
  }

  public void setExecutionExecuteActionTaskReference(String executionExecuteActionTaskReference) {
    this.executionExecuteActionTaskReference = executionExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution execute transaction/record 
   * @return executionExecuteRecordReference
  **/

  public String getExecutionExecuteRecordReference() {
    return executionExecuteRecordReference;
  }

  public void setExecutionExecuteRecordReference(String executionExecuteRecordReference) {
    this.executionExecuteRecordReference = executionExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

