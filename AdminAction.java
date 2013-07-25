package org.auburn.CSSE.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the adminactions database table.
 * 
 */
@Entity
@Table(name = "adminactions")
public class Adminaction implements Serializable {
  public Adminaction(AdminactionPK id, String title, String subTitle,
			String imageLocation, String description) {
		super();
		this.id = id;
		this.description = description;
		this.imageLocation = imageLocation;
		this.subTitle = subTitle;
		this.title = title;
	}

	private static final long serialVersionUID = 1L;
	private AdminactionPK id;
	private String description;
	private String imageLocation;
	private String subTitle;
	private String title;

	public Adminaction() {
	}

	@EmbeddedId
	public AdminactionPK getId() {
		return this.id;
	}

	public void setId(AdminactionPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageLocation() {
		return this.imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public String getSubTitle() {
		return this.subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
