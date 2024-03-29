package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import module.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		//System.out.println("==== 1st test = insert =====");
		//System.out.println("Type new dep id: ");
		//int id = sc.nextInt();
		//System.out.println("Type new dep name: ");
		//String name = sc.next();
		//Department dep = new Department(id, name);
		//departmentDao.insert(dep);
		//System.out.println("Done! ");
		
		System.out.println("==== 2nd test = find by Id ====");
		List<Department> departments = new ArrayList<>();
		departments.add(departmentDao.findById(2));
		for (Department deps : departments) {
			System.out.println(deps);
			
		}
		
		System.out.println("==== 3rd test = Delete by Id ====");
		departmentDao.deleteById(9);
		System.out.println("Done! ");
		
		System.out.println("==== 4th test = update ====");
		Department dep3 = new Department(10, "Computer Science");
		departmentDao.update(dep3);
		System.out.println("Done! ");
		
		System.out.println("==== 5th test = find all ====");
		departments = departmentDao.findAll();
		for (Department deps : departments) {
			System.out.println(deps);
			
		}

		
		
		
		
		sc.close();
		
	}
	
	

}
