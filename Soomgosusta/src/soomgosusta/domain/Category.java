package soomgosusta.domain;

import java.io.Serializable;

public class Category implements Serializable{
	private String category_Code;
	private String category_Group;
	
	public Category() {}

	public Category(String category_Code, String category_Group) {
		super();
		this.category_Code = category_Code;
		this.category_Group = category_Group;
	}

	public String getCategory_Code() {
		return category_Code;
	}

	public void setCategory_Code(String category_Code) {
		this.category_Code = category_Code;
	}

	public String getCategory_Group() {
		return category_Group;
	}

	public void setCategory_Group(String category_Group) {
		this.category_Group = category_Group;
	}
	
	
}
