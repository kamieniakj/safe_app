package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Client;

public class Test {

	public static void main(String [] args){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
				
		session.beginTransaction();
		
		createClient(session);
		
		queryClient(session);
		
	}//end main
	
	public static void createClient(Session session){
		
		Client client = new Client();
		
		client.setName("Bob the Snob");
		
		session.save(client);
		
	}//end createClient
	
	public static void queryClient(Session session){
		
		Query query = session.createQuery("from Client");
		
		List <Client>list = query.list();
		
		Iterator<Client> iter = list.iterator();
		
		while(iter.hasNext()) {
			Client client = iter.next();
			System.out.println("*** Name: " + client.getName());
		}
		
		session.getTransaction().commit();		
		
	}//end queryClient
	
}//END class
