package controllerPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import employeePack.*;

public class Controller {

	//collection of all employees
	private List<Employee> listEmployee = new ArrayList<>();

	//method to add new employees
	public void addToList(Employee employee) {
		listEmployee.add(employee);
	}

	
	public void showFirst5() {
		Collections.sort(listEmployee);
		for (int i = 0; i < 5; i++) {
			if (i < listEmployee.size())
				System.out.println(listEmployee.get(i));
		}
	}

	public void showLast3() {
		Collections.sort(listEmployee);
		Collections.reverse(listEmployee);
		for (int i = 0; i < 3; i++) {
			if (i < listEmployee.size())
				System.out.println(listEmployee.get(i).getId());
		}
	}

	//method to write collection into file
	public void writeIntoFile(String fileName) {
		try {
			File file = new File(fileName);
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(listEmployee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//method to read collection from file
	public void readFromFile(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			listEmployee = (List<Employee>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
