package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQExecutionCaptureInputModelExecutionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQExecutionCaptureOutputModel
 */
public class BQExecutionCaptureOutputModel   {
  private BQExecutionCaptureInputModelExecutionInstanceRecord executionInstanceRecord = null;

  private String executionCaptureActionTaskReference = null;

  private Object executionCaptureActionTaskRecord = null;

  private String executionCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get executionInstanceRecord
   * @return executionInstanceRecord
  **/

  public BQExecutionCaptureInputModelExecutionInstanceRecord getExecutionInstanceRecord() {
    return executionInstanceRecord;
  }

  public void setExecutionInstanceRecord(BQExecutionCaptureInputModelExecutionInstanceRecord executionInstanceRecord) {
    this.executionInstanceRecord = executionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Execution instance capture service call 
   * @return executionCaptureActionTaskReference
  **/

  public String getExecutionCaptureActionTaskReference() {
    return executionCaptureActionTaskReference;
  }

  public void setExecutionCaptureActionTaskReference(String executionCaptureActionTaskReference) {
    this.executionCaptureActionTaskReference = executionCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return executionCaptureActionTaskRecord
  **/

  public Object getExecutionCaptureActionTaskRecord() {
    return executionCaptureActionTaskRecord;
  }

  public void setExecutionCaptureActionTaskRecord(Object executionCaptureActionTaskRecord) {
    this.executionCaptureActionTaskRecord = executionCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Execution structured input transaction/record 
   * @return executionCaptureRecordReference
  **/

  public String getExecutionCaptureRecordReference() {
    return executionCaptureRecordReference;
  }

  public void setExecutionCaptureRecordReference(String executionCaptureRecordReference) {
    this.executionCaptureRecordReference = executionCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

