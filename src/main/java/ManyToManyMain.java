import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ManyToManyMain {

    public static void main(String[] args) {

//        Configuration configuration =new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        SessionFactory factory = configuration.buildSessionFactory();
//
//        Employee employee1 = new Employee();
//        employee1.setEmpId(121);
//        employee1.setName("Akash");
//
//        Employee employee2 = new Employee();
//        employee2.setEmpId(122);
//        employee2.setName("Anuj");
//
//        Projects project1 = new Projects();
//        Projects project2 = new Projects();
//
//        project1.setProjectId(11);
//        project1.setProjectName("Library Management System");
//
//        project2.setProjectId(22);
//        project2.setProjectName("Chatbot");
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(employee1);
//        employees.add(employee2);
//
//        List<Projects> projects = new ArrayList<>();
//        projects.add(project1);
//        projects.add(project2);
//
//        employee1.setProjects(projects);
//
//        project2.setEmployees(employees);
//
//        //save
//
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//
//        session.save(employee1);
//        session.save(employee2);
//        session.save(project1);
//        session.save(project2);
//
//        tx.commit();
//        session.close();
//        factory.close();

    }

}
