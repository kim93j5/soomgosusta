package soomgosusta.domain;

import java.io.Serializable;

public class Chat implements Serializable{

	private String chat_Seq;
	private String chat_Member_Id;
	private String chat_Expert_Id;
	private String chat_Contents;
	private String chat_Daterecord;
	
	
	
	
	public String getChat_Seq() {
		return chat_Seq;
	}
	public void setChat_Seq(String chat_Seq) {
		this.chat_Seq = chat_Seq;
	}
	public String getChat_Member_Id() {
		return chat_Member_Id;
	}
	public void setChat_Member_Id(String chat_Member_Id) {
		this.chat_Member_Id = chat_Member_Id;
	}
	public String getChat_Expert_Id() {
		return chat_Expert_Id;
	}
	public void setChat_Expert_Id(String chat_Expert_Id) {
		this.chat_Expert_Id = chat_Expert_Id;
	}
	public String getChat_Contents() {
		return chat_Contents;
	}
	public void setChat_Contents(String chat_Contents) {
		this.chat_Contents = chat_Contents;
	}
	public String getChat_Daterecord() {
		return chat_Daterecord;
	}
	public void setChat_Daterecord(String chat_Daterecord) {
		this.chat_Daterecord = chat_Daterecord;
	}
	@Override
	public String toString() {
		return chat_Contents + chat_Daterecord + chat_Expert_Id 
				+ chat_Member_Id + chat_Seq;
	}
	
	
}
