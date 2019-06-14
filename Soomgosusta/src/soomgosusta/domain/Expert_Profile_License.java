package soomgosusta.domain;

import java.io.File;

public class Expert_Profile_License {
	private String eprofile_LicenseCode;
	private File eprofile_LicenseRoute;
	
	public Expert_Profile_License() {}
	
	
	public Expert_Profile_License(String eprofile_LicenseCode, File eprofile_LicenseRoute) {
		super();
		this.eprofile_LicenseCode = eprofile_LicenseCode;
		this.eprofile_LicenseRoute = eprofile_LicenseRoute;
	}


	public String getEprofile_LicenseCode() {
		return eprofile_LicenseCode;
	}
	public void setEprofile_LicenseCode(String eprofile_LicenseCode) {
		this.eprofile_LicenseCode = eprofile_LicenseCode;
	}
	public File getEprofile_LicenseRoute() {
		return eprofile_LicenseRoute;
	}
	public void setEprofile_LicenseRoute(File eprofile_LicenseRoute) {
		this.eprofile_LicenseRoute = eprofile_LicenseRoute;
	}
	
	
}
