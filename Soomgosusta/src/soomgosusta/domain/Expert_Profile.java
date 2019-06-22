package soomgosusta.domain;

import java.io.Serializable;

public class Expert_Profile implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private String profile_Expert_Id;
	private String ep_LineLetter;
	private String ep_DetailLetter;
	private Boolean eprofile_Identification;
	
	public Expert_Profile() {}

	public Expert_Profile(String profile_Expert_Id, String ep_LineLetter, String ep_DetailLetter,
			Boolean eprofile_Identification) {
		super();
		this.profile_Expert_Id = profile_Expert_Id;
		this.ep_LineLetter = ep_LineLetter;
		this.ep_DetailLetter = ep_DetailLetter;
		this.eprofile_Identification = eprofile_Identification;
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

	public String getEp_DetailLetter() {
		return ep_DetailLetter;
	}

	public void setEp_DetailLetter(String ep_DetailLetter) {
		this.ep_DetailLetter = ep_DetailLetter;
	}

	public Boolean getEprofile_Identification() {
		return eprofile_Identification;
	}

	public void setEprofile_Identification(Boolean eprofile_Identification) {
		this.eprofile_Identification = eprofile_Identification;
	}

	@Override
	public String toString() {
		return "Expert_Profile [profile_Expert_Id=" + profile_Expert_Id + ", ep_LineLetter=" + ep_LineLetter
				+ ", ep_DetailLetter=" + ep_DetailLetter + ", eprofile_Identification=" + eprofile_Identification + "]";
	}

	
	
	
	
}
