/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CustomerSurveysApiController {

	@Autowired
	CustomerSurveysApiService service;
	
	@Process.Activate
	public BianResponse<SDCustomerSurveysActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerSurveysActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("execution")
	@Process.Capture
	public BianResponse<BQExecutionCaptureOutputModel> captureExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQExecutionCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureExecution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDCustomerSurveysConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerSurveysConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRCustomerSurveyProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerSurveyProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("definition")
	@Process.Exchange
	public BianResponse<BQDefinitionExchangeOutputModel> exchangeDefinition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDefinitionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeDefinition(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("execution")
	@Process.Execute
	public BianResponse<BQExecutionExecuteOutputModel> executeExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQExecutionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeExecution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDCustomerSurveysFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerSurveysFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRCustomerSurveyProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerSurveyProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("execution")
	@Process.Initiate
	public BianResponse<BQExecutionInitiateOutputModel> initiateExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQExecutionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateExecution(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("surveyanalysis")
	@Process.Initiate
	public BianResponse<BQSurveyAnalysisInitiateOutputModel> initiateSurveyanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSurveyAnalysisInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateSurveyanalysis(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("execution")
	@Process.Request
	public BianResponse<BQExecutionRequestOutputModel> requestExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQExecutionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestExecution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reviewerselection")
	@Process.Request
	public BianResponse<BQReviewerSelectionRequestOutputModel> requestReviewerselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReviewerSelectionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestReviewerselection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("surveyanalysis")
	@Process.Request
	public BianResponse<BQSurveyAnalysisRequestOutputModel> requestSurveyanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSurveyAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSurveyanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRCustomerSurveyProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerSurveyProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("definition")
	@Process.Retrieve
	public BianResponse<BQDefinitionRetrieveOutputModel> retrieveDefinition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDefinition(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("execution")
	@Process.Retrieve
	public BianResponse<BQExecutionRetrieveOutputModel> retrieveExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveExecution(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("reviewerselection")
	@Process.Retrieve
	public BianResponse<BQReviewerSelectionRetrieveOutputModel> retrieveReviewerselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReviewerselection(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("surveyanalysis")
	@Process.Retrieve
	public BianResponse<BQSurveyAnalysisRetrieveOutputModel> retrieveSurveyanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSurveyanalysis(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.Retrieve
	public BianResponse<CRCustomerSurveyProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDCustomerSurveysRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRCustomerSurveyProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerSurveyProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("definition")
	@Process.Update
	public BianResponse<BQDefinitionUpdateOutputModel> updateDefinition(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDefinitionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDefinition(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("execution")
	@Process.Update
	public BianResponse<BQExecutionUpdateOutputModel> updateExecution(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQExecutionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateExecution(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reviewerselection")
	@Process.Update
	public BianResponse<BQReviewerSelectionUpdateOutputModel> updateReviewerselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReviewerSelectionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateReviewerselection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("surveyanalysis")
	@Process.Update
	public BianResponse<BQSurveyAnalysisUpdateOutputModel> updateSurveyanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSurveyAnalysisUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSurveyanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
