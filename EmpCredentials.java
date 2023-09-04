package com.glchaitesh.service;

import com.glchaitesh.model.Employee;

		public interface EmpCredentials 
		{
	
			String generateEmailId(String fname,String lname,String dept);
			String generatePassword();
			void showDetails(Employee e);
		}
