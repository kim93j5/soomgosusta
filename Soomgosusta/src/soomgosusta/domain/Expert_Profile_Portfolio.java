package soomgosusta.domain;

import java.io.File;

public class Expert_Profile_Portfolio {
	private String eprofile_PortfolioCode;
	private File eprofile_PortfolioRoute;
	
	public Expert_Profile_Portfolio() {}

	public Expert_Profile_Portfolio(String eprofile_PortfolioCode, File eprofile_PortfolioRoute) {
		super();
		this.eprofile_PortfolioCode = eprofile_PortfolioCode;
		this.eprofile_PortfolioRoute = eprofile_PortfolioRoute;
	}

	public String getEprofile_PortfolioCode() {
		return eprofile_PortfolioCode;
	}

	public void setEprofile_PortfolioCode(String eprofile_PortfolioCode) {
		this.eprofile_PortfolioCode = eprofile_PortfolioCode;
	}

	public File getEprofile_PortfolioRoute() {
		return eprofile_PortfolioRoute;
	}

	public void setEprofile_PortfolioRoute(File eprofile_PortfolioRoute) {
		this.eprofile_PortfolioRoute = eprofile_PortfolioRoute;
	}
	
	
}
