/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expensetrack.pro;


import java.util.Date;
import org.hibernate.Session;
/**
 *
 * @author User
 */
public class Test {
    	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		User user = new User();

		user.setUserId(002);
		user.setUsername("Tester");
		//user.setCreatedBy("Admin");
		//user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();

	}
}
