import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import toJSON.TimeSheet;

import org.json.JSONException;

import toJSON.*;
public class foo {

	public static void main(String[] args) throws JSONException, IOException {
		Shift s = new Shift("1/4/2017", "04:00", "08:00", "bitch", 0);
		TimeSheet t = new TimeSheet("1/1/2017", "1/28/2017", 40);
		t.addShift(s);
		Employee e1 = new Employee("Son", "sontran@gmail.com", "425");
		Employee e2 = new Employee("Kevin", "kevinmach@gmail.com", "426");
		Employee e3 = new Employee("Phuc", "sontran@gmail.com", "425");
		Employee e4 = new Employee("Phong", "kevinmach@gmail.com", "426");
		e1.addTimeSheet(t);
		e2.addTimeSheet(t);
		e3.addTimeSheet(t);
		e4.addTimeSheet(t);
		Manager m = new Manager();
		m.addEmployee(e1);
		m.addEmployee(e2);
		m.addEmployee(e3);
		m.addEmployee(e4);
		JSonParser parse = new JSonParser(m);
		parse.writeToJSon();
		System.out.println("done");
	}
}
