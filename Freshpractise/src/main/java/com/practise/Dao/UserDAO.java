package com.practise.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.model.USER;

@Repository
public class UserDAO implements UserINT {

	@Autowired
	SessionFactory sf;
	
	
	@Override
	public List<USER> getallusers() {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Query q=s.createQuery("From USER");
		s.beginTransaction();
		List<USER> lu= q.list();
		s.getTransaction().commit();
		s.close();
		return lu;
	}

	@Override
	public String adduser(USER user) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		user.setId(generateid());
	    s.save(user);
		s.getTransaction().commit();
		s.close();
		return user.getId();

	}

	private String generateid() {
		String g = "";
		Session s = sf.openSession();
		Query q = s.createQuery("from USER");
		List<USER > l = q.list();
		if (l.size() == 0) {
			g = "USR001";
		} else {
			q = s.createQuery("select max(id) from USER");
			String eg = (String) q.list().get(0);
			int id = Integer.parseInt(eg.substring(3));
			id++;
			if (id <= 9) {
				g = "USR00" + id;
			} else if (id <= 99) {
				g = "USR0" + id;
			}
		}
		s.close();

		return g;
	}

	@Override
	public USER getuseronid(String userid) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		USER user=s.get(USER.class, userid);
		s.getTransaction().commit();
		s.close();
		return user;
	}

	@Override
	public void deleteuseronid(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean logincheck(String id,String password) {
		// TODO Auto-generated method stub
		boolean found=true;
		USER user=getuseronid(id);
		if(user!=null && (user.getId()==id && user.getPassword()==password)) {
          return found=false;
		}
		return found ;
	}

}
