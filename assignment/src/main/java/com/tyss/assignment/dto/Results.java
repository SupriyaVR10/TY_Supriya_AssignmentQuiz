package com.tyss.assignment.dto;

import java.io.Serializable; 
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Results implements Serializable {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;
	@Column
	private int id;
	@Id
	@Column
	private Date time_Date;
	@Column
	private int marks;
	@Column
	private int percentage;
	public int getId() {
	    return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	public Date getTime_Date() {
	    return time_Date;
	}
	public void setTime_Date(Date time_Date) {
	    this.time_Date = time_Date;
	}
	public int getMarks() {
	    return marks;
	}
	public void setMarks(int marks) {
	    this.marks = marks;
	}
	public int getPercentage() {
	    return percentage;
	}
	public void setPercentage(int percentage) {
	    this.percentage = percentage;
	}
	@Override
	public String toString() {
	    return "Results [id=" + id + ", time_Date=" + time_Date + ", marks=" + marks + ", percentage=" + percentage
		    + "]";
	}

	//private String username;
	

}
