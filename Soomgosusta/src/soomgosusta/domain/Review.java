package soomgosusta.domain;

public class Review {
	private String memeber_Id;
	private String review_Date;
	private String review_Contents;
	private String review_StarPoint;
	
	public Review() {}

	public Review(String memeber_Id, String review_Date, String review_Contents, String review_StarPoint) {
		super();
		this.memeber_Id = memeber_Id;
		this.review_Date = review_Date;
		this.review_Contents = review_Contents;
		this.review_StarPoint = review_StarPoint;
	}

	public String getMemeber_Id() {
		return memeber_Id;
	}

	public void setMemeber_Id(String memeber_Id) {
		this.memeber_Id = memeber_Id;
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

	public String getReview_StarPoint() {
		return review_StarPoint;
	}

	public void setReview_StarPoint(String review_StarPoint) {
		this.review_StarPoint = review_StarPoint;
	}

	public String toString() {
		return "Review [memeber_Id=" + memeber_Id + ", review_Date=" + review_Date + ", review_Contents="
				+ review_Contents + ", review_StarPoint=" + review_StarPoint + "]";
	}
	
	
}
