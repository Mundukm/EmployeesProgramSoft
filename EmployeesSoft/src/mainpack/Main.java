package mainpack;

import java.io.IOException;

import controllerPack.*;
import employeePack.*;

public class Main {

	//some test cases
	
	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
		controller.addToList(new EmployeeHour("kolja" , 22 , 4.0));
		controller.addToList(new EmployeeFixed("anna" , 22 , 300));
		controller.addToList(new EmployeeFixed("ira" , 22 , 5300));
		controller.addToList(new EmployeeFixed("igor" , 22 , 3060));
		controller.addToList(new EmployeeFixed("yura" , 22 , 30440));
		controller.addToList(new EmployeeFixed("zen" , 22 , 3400));
		controller.addToList(new EmployeeFixed("griha" , 22 , 500));
		
		controller.showFirst5();
		
		System.out.println();
		
		controller.showLast3();
		
		controller.writeIntoFile("test1.txt");
		
		controller.readFromFile("test1.txt");
		
		controller.showFirst5();
		
		}
	
	
}
