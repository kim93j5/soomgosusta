package soomgosusta.domain;

import java.io.Serializable;

public class Expert_Profile_License implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String epl_Expert_Id;
	private String epl_Photo;
	
	public Expert_Profile_License() {}

	public Expert_Profile_License(String epl_Expert_Id, String epl_Photo) {
		super();
		this.epl_Expert_Id = epl_Expert_Id;
		this.epl_Photo = epl_Photo;
	}

	public String getEpl_Expert_Id() {
		return epl_Expert_Id;
	}

	public void setEpl_Expert_Id(String epl_Expert_Id) {
		this.epl_Expert_Id = epl_Expert_Id;
	}

	public String getEpl_Photo() {
		return epl_Photo;
	}

	public void setEpl_Photo(String epl_Photo) {
		this.epl_Photo = epl_Photo;
	}

	@Override
	public String toString() {
		return "Expert_Profile_License [epl_Expert_Id=" + epl_Expert_Id + ", epl_Photo=" + epl_Photo + "]";
	}
	
	
}
