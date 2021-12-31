/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greatlearning.departments;

/**
 *
 * @author asus
 */
public class AdminDept extends SuperDept {
    
    public String departmentName() {
		return "Admin department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
    
}
