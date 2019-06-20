package soomgosusta.domain;

import java.io.Serializable;


public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	private String c_Code;
	private String c_Word;
	private String c_Image;
	
	public Category(){}
	
	public Category(String c_Code, String c_Word, String c_Image) {
		super();
		this.c_Code = c_Code;
		this.c_Word = c_Word;
		this.c_Image = c_Image;
	}

	public String getC_Code() {
		return c_Code;
	}

	public void setC_Code(String c_Code) {
		this.c_Code = c_Code;
	}

	public String getC_Word() {
		return c_Word;
	}

	public void setC_Word(String c_Word) {
		this.c_Word = c_Word;
	}

	public String getC_Image() {
		return c_Image;
	}

	public void setC_Image(String c_Image) {
		this.c_Image = c_Image;
	}

	@Override
	public String toString() {
		return "Category [c_Code=" + c_Code + ", c_Word=" + c_Word + ", c_Image=" + c_Image + "]";
	}
		
}
