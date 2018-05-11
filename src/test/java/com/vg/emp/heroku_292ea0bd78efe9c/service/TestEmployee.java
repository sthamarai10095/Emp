/**
 * 
 */
package com.vg.emp.heroku_292ea0bd78efe9c.service;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.vg.emp.heroku_292ea0bd78efe9c.Employee;

/**
 * @author sthamarai
 *
 */
public class TestEmployee{

	/**
	 * @throws java.lang.Exception
	 */
	
	public int empId ;
	private EmployeeService empService;
	private Employee empObj;
	
	@Before
	public void setUp() throws Exception {
		empId = 1;
		empObj = new Employee();
		empObj.setEmpId(1);
		empObj.setEmpName("Amudhan");
		empService = new EmployeeServiceImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// nothing to do now
	}

	@Test
	public void testEmployeeName() {
		
		Employee emp = new EmployeeServiceImpl().setEmployeeDefaultValues(empObj);
		String empName = emp.getEmpName();
		assertEquals("Amudhan", empName);
		
	}

	private boolean checkName(String empName) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(empName.equals("Amudhan")){
			result = true;
		}	
		return result;
	}

	
}
