/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerSurveysApiService {

	SDCustomerSurveysActivateOutputModel activate(SDCustomerSurveysActivateInputModel request);
	
	BQExecutionCaptureOutputModel captureExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionCaptureInputModel request);
	
	SDCustomerSurveysConfigureOutputModel configure(String sdReferenceId, SDCustomerSurveysConfigureInputModel request);
	
	CRCustomerSurveyProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerSurveyProcedureControlInputModel request);
	
	BQDefinitionExchangeOutputModel exchangeDefinition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDefinitionExchangeInputModel request);
	
	BQExecutionExecuteOutputModel executeExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionExecuteInputModel request);
	
	SDCustomerSurveysFeedbackOutputModel feedback(String sdReferenceId, SDCustomerSurveysFeedbackInputModel request);
	
	CRCustomerSurveyProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerSurveyProcedureInitiateInputModel request);
	
	BQExecutionInitiateOutputModel initiateExecution(String sdReferenceId, String crReferenceId, BQExecutionInitiateInputModel request);
	
	BQSurveyAnalysisInitiateOutputModel initiateSurveyanalysis(String sdReferenceId, String crReferenceId, BQSurveyAnalysisInitiateInputModel request);
	
	BQExecutionRequestOutputModel requestExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionRequestInputModel request);
	
	BQReviewerSelectionRequestOutputModel requestReviewerselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReviewerSelectionRequestInputModel request);
	
	BQSurveyAnalysisRequestOutputModel requestSurveyanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSurveyAnalysisRequestInputModel request);
	
	CRCustomerSurveyProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerSurveyProcedureRequestInputModel request);
	
	BQDefinitionRetrieveOutputModel retrieveDefinition(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQExecutionRetrieveOutputModel retrieveExecution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReviewerSelectionRetrieveOutputModel retrieveReviewerselection(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSurveyAnalysisRetrieveOutputModel retrieveSurveyanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCustomerSurveyProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerSurveysRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerSurveyProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerSurveyProcedureUpdateInputModel request);
	
	BQDefinitionUpdateOutputModel updateDefinition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDefinitionUpdateInputModel request);
	
	BQExecutionUpdateOutputModel updateExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionUpdateInputModel request);
	
	BQReviewerSelectionUpdateOutputModel updateReviewerselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReviewerSelectionUpdateInputModel request);
	
	BQSurveyAnalysisUpdateOutputModel updateSurveyanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSurveyAnalysisUpdateInputModel request);
	
}
