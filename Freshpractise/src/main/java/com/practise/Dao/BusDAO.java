package com.practise.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.model.BUS;




@Repository
public class BusDAO implements Busint {

	@Autowired
	SessionFactory sf;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BUS> getallbuses() {
          Session s=sf.openSession();
          Query q=(Query) s.createQuery(" from BUS");
          s.beginTransaction();
          List<BUS> allbuses=q.list();
          s.getTransaction().commit();
          s.close();
		return allbuses;
	}

	@Override
	public boolean addbus(BUS b) {
Session s=sf.openSession();
s.beginTransaction();
s.save(b);
s.getTransaction().commit();
s.close();
		return false;
	}

	@Override
	public boolean deletbud(String id) {
Session s=sf.openSession();
s.beginTransaction();
s.delete(id);
s.getTransaction().commit();
s.close();
return false;
	}

	@Override
	public BUS getbusonID(String id) {
    Session s=sf.openSession();
    Query q=s.createQuery("from Bus where busid="+id);
    s.beginTransaction();
     BUS b= s.get(BUS.class, id);
    s.getTransaction().commit();
    s.close();
		return b;
	}

}
