package soomgosusta.domain;

import java.io.Serializable;

public class RequestForm implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String category;
	private String request_Time;
	private Long expire_Time;
	private String end_Time;
	private int seq;
	
	public RequestForm(){}

	public RequestForm(String category, String request_Time, Long expire_Time, String end_Time, int seq) {
		super();
		this.category = category;
		this.request_Time = request_Time;
		this.expire_Time = expire_Time;
		this.end_Time = end_Time;
		this.seq = seq;
	}



	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRequest_Time() {
		return request_Time;
	}

	public void setRequest_Time(String request_Time) {
		this.request_Time = request_Time;
	}

	public Long getExpire_Time() {
		return expire_Time;
	}

	public void setExpire_Time(Long expire_Time) {
		this.expire_Time = expire_Time;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getEnd_Time() {
		return end_Time;
	}

	public void setEnd_Time(String end_Time) {
		this.end_Time = end_Time;
	}
	
}
