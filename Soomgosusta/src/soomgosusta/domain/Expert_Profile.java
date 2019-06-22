package soomgosusta.domain;

import java.io.Serializable;

public class Expert_Profile implements Serializable {
	
	
	private static final long serialVersionUID = 1L;


	private String profile_Expert_Id;
	private String ep_LineLetter;
	private String ep_Identification;
	private String ep_DetailLetter;
	
	public Expert_Profile() {}
	
	public Expert_Profile(String profile_Expert_Id, String ep_LineLetter, String ep_Identification,
			String ep_DetailLetter) {
		super();
		this.profile_Expert_Id = profile_Expert_Id;
		this.ep_LineLetter = ep_LineLetter;
		this.ep_Identification = ep_Identification;
		this.ep_DetailLetter = ep_DetailLetter;
	}


	public String getProfile_Expert_Id() {
		return profile_Expert_Id;
	}


	public void setProfile_Expert_Id(String profile_Expert_Id) {
		this.profile_Expert_Id = profile_Expert_Id;
	}


	public String getEp_LineLetter() {
		return ep_LineLetter;
	}


	public void setEp_LineLetter(String ep_LineLetter) {
		this.ep_LineLetter = ep_LineLetter;
	}


	public String getEp_Identification() {
		return ep_Identification;
	}


	public void setEp_Identification(String ep_Identification) {
		this.ep_Identification = ep_Identification;
	}


	public String getEp_DetailLetter() {
		return ep_DetailLetter;
	}


	public void setEp_DetailLetter(String ep_DetailLetter) {
		this.ep_DetailLetter = ep_DetailLetter;
	}


	@Override
	public String toString() {
		return "Expert_Profile [profile_Expert_Id=" + profile_Expert_Id + ", ep_LineLetter=" + ep_LineLetter
				+ ", ep_Identification=" + ep_Identification + ", ep_DetailLetter=" + ep_DetailLetter + "]";
	}
	
}



