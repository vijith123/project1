package org.auburn.CSSE.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the adminactions database table.
 * 
 */
@Embeddable
public class AdminactionPK implements Serializable {
  //default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String subjectName;
	private String lessonName;
	private int pageNo;

	public AdminactionPK(String subjectName, String lessonName, int pageNo) {
		super();
		this.subjectName = subjectName.trim();
		this.lessonName = lessonName.trim();
		this.pageNo = pageNo;
	}

	public AdminactionPK() {
	}

	public String getSubjectName() {
		return this.subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getLessonName() {
		return this.lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public int getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdminactionPK)) {
			return false;
		}
		AdminactionPK castOther = (AdminactionPK)other;
		return 
			this.subjectName.equals(castOther.subjectName)
			&& this.lessonName.equals(castOther.lessonName)
			&& (this.pageNo == castOther.pageNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.subjectName.hashCode();
		hash = hash * prime + this.lessonName.hashCode();
		hash = hash * prime + this.pageNo;
		
		return hash;
	}
}
