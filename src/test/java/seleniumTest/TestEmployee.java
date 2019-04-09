package seleniumTest;

import java.io.IOException;
import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		ArrayList<String> data=emp.getData("E1005");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
}
