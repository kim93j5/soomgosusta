package soomgosusta.domain;

import java.io.Serializable;

public class Expert_Information implements Serializable {
	private String infor_Expert_Id;
	private String ei_Day;
	private String ei_Time;
	private String ei_District;
	private String ei_Start;
	private String c_Code;
	
	public Expert_Information(){}

	public Expert_Information(String infor_Expert_Id, String ei_Day, String ei_Time, String ei_District, String ei_Start,
			String c_Code) {
		super();
		this.infor_Expert_Id = infor_Expert_Id;
		this.ei_Day = ei_Day;
		this.ei_Time = ei_Time;
		this.ei_District = ei_District;
		this.ei_Start = ei_Start;
		this.c_Code = c_Code;
	}

	public String getInfor_Expert_Id() {
		return infor_Expert_Id;
	}

	public void setInfor_Expert_Id(String infor_Expert_Id) {
		this.infor_Expert_Id = infor_Expert_Id;
	}

	public String getEi_Day() {
		return ei_Day;
	}

	public void setEi_Day(String ei_Day) {
		this.ei_Day = ei_Day;
	}

	public String getEi_Time() {
		return ei_Time;
	}

	public void setEi_Time(String ei_Time) {
		this.ei_Time = ei_Time;
	}

	public String getEi_District() {
		return ei_District;
	}

	public void setEi_District(String ei_District) {
		this.ei_District = ei_District;
	}

	public String getEi_Start() {
		return ei_Start;
	}

	public void setEi_Start(String ei_Start) {
		this.ei_Start = ei_Start;
	}

	public String getC_Code() {
		return c_Code;
	}

	public void setC_Code(String c_Code) {
		this.c_Code = c_Code;
	}

	@Override
	public String toString() {
		return "Expert_Information [infor_Expert_Id=" + infor_Expert_Id + ", ei_Day=" + ei_Day + ", ei_Time=" + ei_Time
				+ ", ei_District=" + ei_District + ", ei_Start=" + ei_Start + ", c_Code=" + c_Code + "]";
	};
	
	
	
}
