package com.practise.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.model.CART;
import com.practise.model.Message;
import com.practise.model.TICKETHISTORY;

@Repository
public class CartDAO implements CartINT {
 
	@Autowired
	SessionFactory sf;
	@Override
	public List<CART> getallcarts() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Query q = session.createQuery("From CART");
		session.beginTransaction();
		List<CART> lc = q.list();
	session.getTransaction().commit();
	session.close();
		
		return lc;
	}

	@Override
	public CART getcartonid(String id) {
		// TODO Auto-generated method stub
		Session session= sf.openSession();
		session.beginTransaction();
	CART cart=	session.get(CART.class,id);
	session.getTransaction().commit();
	session.close();
		return cart;
	}

	@Override
	public Message addtocart(CART cart) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		session.beginTransaction();
		cart.setCartid(generatecartid());
		session.save(cart);
		session.getTransaction().commit();
		session.close();
		return new Message("s","Added sucessfully");
	}

	
	private String generatecartid() {

		String g = "";
		Session s = sf.openSession();
		Query q = s.createQuery("from CART");
		List<CART> l = q.list();
		if (l.size() == 0) {
			g = "CRT001";
		} else {
			q = s.createQuery("select max(cartid) from CART");
			String eg = (String) q.list().get(0);
			int id = Integer.parseInt(eg.substring(3));
			id++;
			if (id <= 9) {
				g = "CRT00" + id;
			} else if (id <= 99) {
				g = "CRT0" + id;
			}
		}
		s.close();

		return g;
	}

}
