package com.greatlearnig.drive;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearnig.entity.Employee;
import com.greatlearnig.entity.Project;


public class InsertEmployeeAndProjects {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
                .configure("Hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Project.class)
                .buildSessionFactory();
		Session session =factory.getCurrentSession();
		try {
			session.beginTransaction();
			Employee tempEmployee1= new Employee("Sravan","kiran","Kiran@mail.com","sike");
			Employee tempEmployee2=new Employee("Sravan1","kiran","Kiran@mail.com","sike");
			
			Project project1= new Project("businessSyatem");
			Project project2= new Project("businessSys");
			
			session.save(project1);
			session.save(project2);
			
			Set <Project> projectList1 = new HashSet();
			projectList1.add(project1);
			projectList1.add(project2);
			
			tempEmployee1.setProjects(projectList1);
			session.save(tempEmployee1);
			
			Set <Project> projectList2 = new HashSet();
			projectList2.add(project1);
			projectList2.add(project2);
			
			tempEmployee2.setProjects(projectList2);
			session.save(tempEmployee2);
			session.getTransaction().commit();
			System.out.println("Completed the Transations");
		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		finally {
			session.close();
			factory.close();
		}
	}
}
