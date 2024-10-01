package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Department dep = new Department();
		
		System.out.println("\n=== TEST 1: Department insert =======");
		Department newDep = new Department(null, "Manager");
		depDao.insert(newDep);
		System.out.print("Inserted! " + newDep.getId()); 
		
		 System.out.println("\n=== TEST 2: Department Update =======");
		dep = depDao.findById(6);
		dep.setName("Maintenance");
		depDao.update(dep);
		System.out.println("Update completed!");  
		
		System.out.println("\n=== TEST 3: Department findById =======");
		dep = depDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 4: Department findById =======");
		System.out.println("Enter id for delete test: ");
		int op = sc.nextInt();
		depDao.deleteById(op);
		System.out.println("Deleted!");
		
		System.out.println("\n=== TEST 5: Department findAll =======");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}

}
