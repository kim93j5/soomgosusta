package soomgosusta.domain;

import java.io.Serializable;

public class Expert_FindInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ef_Id;
	private String ef_LineLetter;
	private String ef_District;
	private String ef_Photo;
	private double ef_Avg_StarPoint;
	private int ef_Cnt_Review;
	
	public Expert_FindInfo(){}

	public Expert_FindInfo(String ef_Id, String ef_LineLetter, String ef_District, String ef_Photo,
			double ef_Avg_StarPoint, int ef_Cnt_Review) {
		super();
		this.ef_Id = ef_Id;
		this.ef_LineLetter = ef_LineLetter;
		this.ef_District = ef_District;
		this.ef_Photo = ef_Photo;
		this.ef_Avg_StarPoint = ef_Avg_StarPoint;
		this.ef_Cnt_Review = ef_Cnt_Review;
	}

	public String getEf_Id() {
		return ef_Id;
	}

	public void setEf_Id(String ef_Id) {
		this.ef_Id = ef_Id;
	}

	public String getEf_LineLetter() {
		return ef_LineLetter;
	}

	public void setEf_LineLetter(String ef_LineLetter) {
		this.ef_LineLetter = ef_LineLetter;
	}

	public String getEf_District() {
		return ef_District;
	}

	public void setEf_District(String ef_District) {
		this.ef_District = ef_District;
	}

	public String getEf_Photo() {
		return ef_Photo;
	}

	public void setEf_Photo(String ef_Photo) {
		this.ef_Photo = ef_Photo;
	}

	public double getEf_Avg_StarPoint() {
		return ef_Avg_StarPoint;
	}

	public void setEf_Avg_StarPoint(double ef_Avg_StarPoint) {
		this.ef_Avg_StarPoint = ef_Avg_StarPoint;
	}

	public int getEf_Cnt_Review() {
		return ef_Cnt_Review;
	}

	public void setEf_Cnt_Review(int ef_Cnt_Review) {
		this.ef_Cnt_Review = ef_Cnt_Review;
	}

	@Override
	public String toString() {
		return "Expert_FindInfo [ef_Id=" + ef_Id + ", ef_LineLetter=" + ef_LineLetter + ", ef_District=" + ef_District
				+ ", ef_Photo=" + ef_Photo + ", ef_Avg_StarPoint=" + ef_Avg_StarPoint + ", ef_Cnt_Review="
				+ ef_Cnt_Review + "]";
	}

	
}
