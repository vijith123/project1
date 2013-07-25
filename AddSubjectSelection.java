package org.auburn.CSSE.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AddSubjectSelection extends ActionSupport {
  private String subject;
	private String Page;

	
	public String execute() {
		setPage("1");
		return "success";
	}

	


	public String getPage() {
		return Page;
	}

	public void setPage(String page) {
		Page = page;
	}




	public String getSubject() {
		return subject;
	}




	public void setSubject(String subject) {
		this.subject = subject;
	}
	

}

