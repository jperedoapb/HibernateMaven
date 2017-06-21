/**
 * 
 */
package org.apb.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apb.pojo.Tramite;
import org.apb.util.HibernateUtil;
import org.hibernate.Session;



/**
 * @author Alvaro Peredo
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		// Crear una instancia de Tramite
		Tramite tramite = new Tramite("Credito IV", new Timestamp(date.getTime()));
		
		//salvar el tramite
		session.save(tramite);
		
		session.getTransaction().commit();
		session.close();

	}

}
