package com.practise.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.model.BUSSERVICE;

@Repository
public class BusserviceDAO implements BusserviceINT {

	@Autowired
	SessionFactory sf;
	@Override
	public List<BUSSERVICE > getallbuses() {

		Session s=sf.openSession();
		s.beginTransaction();
		org.hibernate.Query q= s.createQuery("from BUSSERVICE");
		List<BUSSERVICE > ls=q.list();
		s.getTransaction().commit();
		s.close();
		return ls;
	}

	@Override
	public BUSSERVICE  getserviceID(String id) {
		Session s=sf.openSession();
		s.beginTransaction();
		BUSSERVICE  bs=s.get(BUSSERVICE .class, id);
		s.getTransaction().commit();
		s.close();
		return bs;
	}

	@Override
	public boolean addbusservice(BUSSERVICE  bs) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(bs);
		s.getTransaction().commit();
		s.close();
		return false;
	}

	@Override
	public boolean deletbusservice(String id) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		s.delete(id);
		s.getTransaction().commit();
		s.close();
		return false;
	}

}
