package com.practise.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.model.BUSTYPE;

@Repository
public class BustypeDAO implements Bustypeint {
@Autowired
SessionFactory sf;

	@Override
	public List<BUSTYPE> getallBustypes() {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		org.hibernate.Query q= s.createQuery("from BUSTYPE");
		List<BUSTYPE> lbs=q.list();
		s.getTransaction().commit();
		s.close();
		return lbs;
	}

	@Override
	public boolean addbustype(BUSTYPE b) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(b);
		s.getTransaction().commit();
		s.close();
			return false;
	}

	@Override
	public BUSTYPE getbustypeonID(String id) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		BUSTYPE bs=s.get(BUSTYPE.class, id);
		s.getTransaction().commit();
		s.close();
		
		return bs;
	}

	@Override
	public boolean deletbustype(String id) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		s.delete(id);
		s.getTransaction().commit();
		s.close();
		return false;
	}

}
