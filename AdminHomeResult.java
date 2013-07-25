package org.auburn.CSSE.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.auburn.CSSE.services.AdminHomeResultSession;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@SuppressWarnings("serial")
public class AdminHomeResultAction extends ActionSupport implements Preparable {
  private String subject;
	private String AddView;
	private String Page;
	private String adminCondition;
	
	private AdminHomeResultSession adminHomeResultSession;

	private List<String> Subjects;
	private List<String> Lessons;
	
	public void prepare() throws Exception {
		setAdminCondition("TRUE");
		
		AdminHomeResultSession adminHomeResultSession = new AdminHomeResultSession();
		ArrayList<String> temp = new ArrayList<String>();
		Map<String, ArrayList<String>> mapHolder = new HashMap<String,ArrayList<String>>();
		mapHolder.putAll(adminHomeResultSession.SubjectsAndLessons());
	
		temp.add("Choose");
		temp.addAll(mapHolder.get("Subjects"));
		
		setSubjects(temp);
		
	
	}

	public String execute() {
		setAdminCondition("TRUE");
		setPage("1");
		if (getAddView().equals("AddLesson")) { 
			return "addSubject";
		} else
			return "viewLesson";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAddView() {
		return AddView;
	}

	public void setAddView(String addView) {
		AddView = addView;
	}

	public String getPage() {
		return Page;
	}

	public void setPage(String page) {
		Page = page;
	}

	public List<String> getSubjects() {
		return Subjects;
	}

	public void setSubjects(ArrayList<String> subjects) {
		Subjects = subjects;
	}

	public List<String> getLessons() {
		return Lessons;
	}

	public void setLessons(ArrayList<String> lessons) {
		Lessons = lessons;
	}

	public String getAdminCondition() {
		return adminCondition;
	}

	public void setAdminCondition(String adminCondition) {
		this.adminCondition = adminCondition;
	}



}
