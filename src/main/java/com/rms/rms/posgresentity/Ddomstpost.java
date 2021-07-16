package com.rms.rms.posgresentity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema="DDOMST")
public class Ddomstpost {

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
	private String ddocode;
	private String ddodesg;
	
	
	
}
