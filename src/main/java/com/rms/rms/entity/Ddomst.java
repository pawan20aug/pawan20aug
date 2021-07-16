package com.rms.rms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema="DDO_MST")
public class Ddomst {
	
	private String ddocode;
	private String ddodesg;
	public String getDdocode() {
		return ddocode;
	}
	public void setDdocode(String ddocode) {
		this.ddocode = ddocode;
	}
	public String getDdodesg() {
		return ddodesg;
	}
	public void setDdodesg(String ddodesg) {
		this.ddodesg = ddodesg;
	}
	
	
	

}
