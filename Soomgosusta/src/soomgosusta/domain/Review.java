package soomgosusta.domain;

import java.io.Serializable;

public class Review implements Serializable{

	private static final long serialVersionUID = 1L;

	private String member_Id;
	private String review_Date;
	private String review_Contents;
	private int review_StarPoint;
	private String review_Expert_Id;
	
	public Review() {}

	public Review(String member_Id, String review_Date, String review_Contents, int review_StarPoint,
			String review_Expert_Id) {
		super();
		this.member_Id = member_Id;
		this.review_Date = review_Date;
		this.review_Contents = review_Contents;
		this.review_StarPoint = review_StarPoint;
		this.review_Expert_Id = review_Expert_Id;
	}

	public String getmember_Id() {
		return member_Id;
	}

	public void setmember_Id(String member_Id) {
		this.member_Id = member_Id;
	}

	public String getReview_Date() {
		return review_Date;
	}

	public void setReview_Date(String review_Date) {
		this.review_Date = review_Date;
	}

	public String getReview_Contents() {
		return review_Contents;
	}

	public void setReview_Contents(String review_Contents) {
		this.review_Contents = review_Contents;
	}

	public int getReview_StarPoint() {
		return review_StarPoint;
	}

	public void setReview_StarPoint(int review_StarPoint) {
		this.review_StarPoint = review_StarPoint;
	}

	public String getReview_Expert_Id() {
		return review_Expert_Id;
	}

	public void setReview_Expert_Id(String review_Expert_Id) {
		this.review_Expert_Id = review_Expert_Id;
	}

	@Override
	public String toString() {
		return "Review [member_Id=" + member_Id + ", review_Date=" + review_Date + ", review_Contents="
				+ review_Contents + ", review_StarPoint=" + review_StarPoint + ", review_Expert_Id=" + review_Expert_Id
				+ "]";
	}
	
}
