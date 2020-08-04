package com.practise.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.model.BUSROUTES;

@Repository
public class BusroutesDAO implements Busroutesint {

	@Autowired
	SessionFactory sf;
	



	@Override
	public List<BUSROUTES> getallbusses() {
		org.hibernate.Session s=sf.openSession();
		 s.beginTransaction();
		 Query q=s.createQuery("from BUSROUTES");
		 List<BUSROUTES> br=q.list();
		 s.getTransaction().commit();
		 s.close();
		return br;
	}

	@Override
	public boolean addbusroute(BUSROUTES route) {
Session s=sf.openSession();
s.beginTransaction();
s.save(route);
s.getTransaction().commit();
s.close();

		return false;
	}

	@Override
	public boolean deletbusroute(String routeid) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		s.delete(routeid);
       s.getTransaction().commit();
s.close();
		return false;
	}

	@Override
	public BUSROUTES getbusrouteonID(String id) {
Session s=sf.openSession();
s.beginTransaction();
BUSROUTES r=s.get(BUSROUTES.class, id);
s.getTransaction().commit();
s.close();

return r;
	}

}
