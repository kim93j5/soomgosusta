package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Estimate;



public interface EstimateMapper {

	int insertEstimate(Estimate estimate);

	List<Estimate> estimateList(String login_Session);

}
