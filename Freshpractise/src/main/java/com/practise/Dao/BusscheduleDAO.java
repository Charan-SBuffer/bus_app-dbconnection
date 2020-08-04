package com.practise.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.model.BUSSCHEDULE;


@Repository
public class BusscheduleDAO implements BusscheduleINT {

	@Autowired
	SessionFactory sf;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BUSSCHEDULE > getallbusschedule() {

		Session s=sf.openSession();
		s.beginTransaction();
		org.hibernate.Query q= s.createQuery("from BUSSCHEDULE");
		List<BUSSCHEDULE > lbs=q.list();
		s.getTransaction().commit();
		s.close();
		return lbs;
	}

	@Override
	public BUSSCHEDULE  getscheduleonID(String id) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		BUSSCHEDULE  bs=s.get(BUSSCHEDULE .class, id);
		s.getTransaction().commit();
		s.close();
		return bs;
	}

	@Override
	public boolean addbusschedule(BUSSCHEDULE  bus) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(bus);
		s.getTransaction().commit();
		s.close();
		return false;
	}

	@Override
	public boolean deletbusschedule(String id) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		s.delete(id);
		s.getTransaction().commit();
		s.close();
		return false;
	}

}
