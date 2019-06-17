package soomgosusta.domain;

import java.io.Serializable;

public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	private String category_Code;
	private String category_Group;
	private String category_Image;
	
	public Category() {}

	public Category(String category_Code, String category_Group, String category_Image) {
		super();
		this.category_Code = category_Code;
		this.category_Group = category_Group;
		this.category_Image = category_Image;
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

	public String getCategory_Image() {
		return category_Image;
	}

	public void setCategory_Image(String category_Image) {
		this.category_Image = category_Image;
	}

	@Override
	public String toString() {
		return "Category [category_Code=" + category_Code + ", category_Group=" + category_Group + ", category_Image="
				+ category_Image + "]";
	}

	
}
