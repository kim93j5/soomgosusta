package soomgosusta.domain;

import java.io.File;

public class Expert_Profile {
	private String expert_Id;
	private File eprofile_Photo;
	private String eprofile_LineLetter;
	private String eprofile_DetailLetter;
	private Boolean eprofile_Identification;
	private String identification_Status;
	
	public Expert_Profile() {}

	public Expert_Profile(File eprofile_Photo, String eprofile_LineLetter, String eprofile_DetailLetter,
			Boolean eprofile_Identification, String identification_Status) {
		super();
		this.eprofile_Photo = eprofile_Photo;
		this.eprofile_LineLetter = eprofile_LineLetter;
		this.eprofile_DetailLetter = eprofile_DetailLetter;
		this.eprofile_Identification = eprofile_Identification;
		this.identification_Status = identification_Status;
	}

	public File getEprofile_Photo() {
		return eprofile_Photo;
	}

	public void setEprofile_Photo(File eprofile_Photo) {
		this.eprofile_Photo = eprofile_Photo;
	}

	public String getEprofile_LineLetter() {
		return eprofile_LineLetter;
	}

	public void setEprofile_LineLetter(String eprofile_LineLetter) {
		this.eprofile_LineLetter = eprofile_LineLetter;
	}

	public String getEprofile_DetailLetter() {
		return eprofile_DetailLetter;
	}

	public void setEprofile_DetailLetter(String eprofile_DetailLetter) {
		this.eprofile_DetailLetter = eprofile_DetailLetter;
	}

	public Boolean getEprofile_Identification() {
		return eprofile_Identification;
	}

	public void setEprofile_Identification(Boolean eprofile_Identification) {
		this.eprofile_Identification = eprofile_Identification;
	}

	public String getIdentification_Status() {
		return identification_Status;
	}

	public void setIdentification_Status(String identification_Status) {
		this.identification_Status = identification_Status;
	}
	
	
	
}
