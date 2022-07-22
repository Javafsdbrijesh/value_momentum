package net.vineeth.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.vineeth.hibernate.entity.Customer;
import net.vineeth.hibernate.entity.Student;
import net.vineeth.hibernate.util.HibernateUtil;

public class App {

	public static void main(String[] args) {

		Student student = new Student("Abhiram", "Masina", "abhiram@javafsd.com");
		Student student1 = new Student("Gopinadh", "Kandepu", "gopinadh@javafsd.com");

		Customer customer1 = new Customer("Sumith", "Masina", "sumith@javafsd.com");
		Customer customer = new Customer("Harshil", "Kandepu", "harshil@javafsd.com");

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start transaction
			transaction = session.beginTransaction();

			// save the student objects
			session.save(student);
			session.save(student1);
			session.save(customer);
			session.save(customer1);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

}