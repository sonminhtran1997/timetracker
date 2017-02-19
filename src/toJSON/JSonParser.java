package toJSON;

import java.lang.*;
import java.util.ArrayList;

import org.json.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSonParser {
	Manager m;
	
	
	public JSonParser(Manager m) {
		this.m = m;

		
	}

	public void writeToJSon() throws JSONException, IOException {
		File file = new File("out.json");
		FileWriter fw = new FileWriter(file);
		JSONObject managerObj = new JSONObject();
		JSONArray employees = new JSONArray();
		
		for (int i = 0; i < m.getEmployeeList().size(); i++) {
			
			JSONObject employeeObj = new JSONObject();
			Employee e = m.getEmployeeList().get(i);
			employeeObj.put("Employee ID", e.getEmployeeID());
			employeeObj.put("Employee Name", e.getEmployeeName());
			employeeObj.put("Email", e.getEmail());
			employeeObj.put("Phone Number", e.getPhoneNumber());
			JSONArray timeSheets = new JSONArray();
			
			for(int j = 0; j < e.getTimeSheetList().size(); i++) {
				
				JSONObject timeSheetObj = new JSONObject();
				TimeSheet t = e.getTimeSheetList().get(j);
				timeSheetObj.put("TimeSheet Start Date", t.getStartDate().toString());
				timeSheetObj.put("TimeSheet End Date", t.getEndDate().toString());
				timeSheetObj.put("Max Hours", String.valueOf(t.getMaxHours()));
				timeSheetObj.put("Current Hours", String.valueOf(t.getCurrentHours()));
				JSONArray employeeShifts = new JSONArray();
				
				for(int k = 0; k < t.getEmployeeShifts().size(); k++) {
					
					JSONObject shiftObj = new JSONObject();
					Shift s = t.getEmployeeShifts().get(k);
					shiftObj.put("Shift Start Date", s.getStartDate());
					shiftObj.put("Shift Start Time", s.getStartTime());
					shiftObj.put("Shift End Time", s.getEndTime());
					shiftObj.put("Note", s.getNote());
					shiftObj.put("Break Time", s.getBreakTime());
					shiftObj.put("Shift ID", s.getID());
					employeeShifts.put(shiftObj);
					
				}
				
				timeSheetObj.put("Employee Shifts", employeeShifts);
				timeSheets.put(timeSheetObj);
				
			}
			
			employeeObj.put("Employee Time Sheets", timeSheets);
			employees.put(employeeObj);
		}
		managerObj.put("Employees", employees);
		
		
//		String[] values = {"Employees", "Employee ID", "Employee Name", "Email"
//				, "Phone Number", "Employee Time Sheets", "TimeSheet Start Date", 
//				"TimeSheet End Date", "Max Hours", "Current Hours", "Employee Shifts", 
//				"Shift Start Date", "Shift Start Time", "Shift End Time", "Note", 
//				"Break Time", "Shift ID"};
		
		fw.write(managerObj.toString());
		
		fw.close();

	}
	
//	public void recursiveWrite(JSONObject obj, FileWriter fw, 
//			String[] values, int depth) {
//		if(depth == 0) {
//			JSONArray js;
//			try {
//				js = (JSONArray) obj.get(values[0]);
//			} catch (JSONException e) {
//				e.printStackTrace();
//			}
//			fw.write(obj.toString());
//			for(int i = 0; i < js.length(); i++) {
//				
//			}
//			obj.get(values[0]);
//		}
//	}
}
