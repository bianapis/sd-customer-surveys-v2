/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerSurveysApiServiceImpl implements CustomerSurveysApiService {

	public SDCustomerSurveysActivateOutputModel activate(SDCustomerSurveysActivateInputModel request){
		return JsonReader.read("activate-SDCustomerSurveysActivateOutputModel.json",new TypeReference<SDCustomerSurveysActivateOutputModel>(){});
	}
	
	public BQExecutionCaptureOutputModel captureExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionCaptureInputModel request){
		return JsonReader.read("capture-BQExecutionCaptureOutputModel.json",new TypeReference<BQExecutionCaptureOutputModel>(){});
	}
	
	public SDCustomerSurveysConfigureOutputModel configure(String sdReferenceId, SDCustomerSurveysConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerSurveysConfigureOutputModel.json",new TypeReference<SDCustomerSurveysConfigureOutputModel>(){});
	}
	
	public CRCustomerSurveyProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerSurveyProcedureControlInputModel request){
		return JsonReader.read("control-CRCustomerSurveyProcedureControlOutputModel.json",new TypeReference<CRCustomerSurveyProcedureControlOutputModel>(){});
	}
	
	public BQDefinitionExchangeOutputModel exchangeDefinition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDefinitionExchangeInputModel request){
		return JsonReader.read("exchange-BQDefinitionExchangeOutputModel.json",new TypeReference<BQDefinitionExchangeOutputModel>(){});
	}
	
	public BQExecutionExecuteOutputModel executeExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionExecuteInputModel request){
		return JsonReader.read("execute-BQExecutionExecuteOutputModel.json",new TypeReference<BQExecutionExecuteOutputModel>(){});
	}
	
	public SDCustomerSurveysFeedbackOutputModel feedback(String sdReferenceId, SDCustomerSurveysFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerSurveysFeedbackOutputModel.json",new TypeReference<SDCustomerSurveysFeedbackOutputModel>(){});
	}
	
	public CRCustomerSurveyProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerSurveyProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerSurveyProcedureInitiateOutputModel.json",new TypeReference<CRCustomerSurveyProcedureInitiateOutputModel>(){});
	}
	
	public BQExecutionInitiateOutputModel initiateExecution(String sdReferenceId, String crReferenceId, BQExecutionInitiateInputModel request){
		return JsonReader.read("initiate-BQExecutionInitiateOutputModel.json",new TypeReference<BQExecutionInitiateOutputModel>(){});
	}
	
	public BQSurveyAnalysisInitiateOutputModel initiateSurveyanalysis(String sdReferenceId, String crReferenceId, BQSurveyAnalysisInitiateInputModel request){
		return JsonReader.read("initiate-BQSurveyAnalysisInitiateOutputModel.json",new TypeReference<BQSurveyAnalysisInitiateOutputModel>(){});
	}
	
	public BQExecutionRequestOutputModel requestExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionRequestInputModel request){
		return JsonReader.read("request-BQExecutionRequestOutputModel.json",new TypeReference<BQExecutionRequestOutputModel>(){});
	}
	
	public BQReviewerSelectionRequestOutputModel requestReviewerselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReviewerSelectionRequestInputModel request){
		return JsonReader.read("request-BQReviewerSelectionRequestOutputModel.json",new TypeReference<BQReviewerSelectionRequestOutputModel>(){});
	}
	
	public BQSurveyAnalysisRequestOutputModel requestSurveyanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSurveyAnalysisRequestInputModel request){
		return JsonReader.read("request-BQSurveyAnalysisRequestOutputModel.json",new TypeReference<BQSurveyAnalysisRequestOutputModel>(){});
	}
	
	public CRCustomerSurveyProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerSurveyProcedureRequestInputModel request){
		return JsonReader.read("request-CRCustomerSurveyProcedureRequestOutputModel.json",new TypeReference<CRCustomerSurveyProcedureRequestOutputModel>(){});
	}
	
	public BQDefinitionRetrieveOutputModel retrieveDefinition(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDefinitionRetrieveOutputModel.json",new TypeReference<BQDefinitionRetrieveOutputModel>(){});
	}
	
	public BQExecutionRetrieveOutputModel retrieveExecution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQExecutionRetrieveOutputModel.json",new TypeReference<BQExecutionRetrieveOutputModel>(){});
	}
	
	public BQReviewerSelectionRetrieveOutputModel retrieveReviewerselection(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReviewerSelectionRetrieveOutputModel.json",new TypeReference<BQReviewerSelectionRetrieveOutputModel>(){});
	}
	
	public BQSurveyAnalysisRetrieveOutputModel retrieveSurveyanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSurveyAnalysisRetrieveOutputModel.json",new TypeReference<BQSurveyAnalysisRetrieveOutputModel>(){});
	}
	
	public CRCustomerSurveyProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerSurveyProcedureRetrieveOutputModel.json",new TypeReference<CRCustomerSurveyProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerSurveysRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerSurveysRetrieveOutputModel.json",new TypeReference<SDCustomerSurveysRetrieveOutputModel>(){});
	}
	
	public CRCustomerSurveyProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerSurveyProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCustomerSurveyProcedureUpdateOutputModel.json",new TypeReference<CRCustomerSurveyProcedureUpdateOutputModel>(){});
	}
	
	public BQDefinitionUpdateOutputModel updateDefinition(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDefinitionUpdateInputModel request){
		return JsonReader.read("update-BQDefinitionUpdateOutputModel.json",new TypeReference<BQDefinitionUpdateOutputModel>(){});
	}
	
	public BQExecutionUpdateOutputModel updateExecution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQExecutionUpdateInputModel request){
		return JsonReader.read("update-BQExecutionUpdateOutputModel.json",new TypeReference<BQExecutionUpdateOutputModel>(){});
	}
	
	public BQReviewerSelectionUpdateOutputModel updateReviewerselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReviewerSelectionUpdateInputModel request){
		return JsonReader.read("update-BQReviewerSelectionUpdateOutputModel.json",new TypeReference<BQReviewerSelectionUpdateOutputModel>(){});
	}
	
	public BQSurveyAnalysisUpdateOutputModel updateSurveyanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSurveyAnalysisUpdateInputModel request){
		return JsonReader.read("update-BQSurveyAnalysisUpdateOutputModel.json",new TypeReference<BQSurveyAnalysisUpdateOutputModel>(){});
	}
	
}
