package com.practise.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.model.VW_BUS_COMPLETE_DATA;

@Repository
public class Vw_bus_complete_dataDao implements Vw_bus_complete_dataint {

	@Autowired
	private SessionFactory sf;
	
	@SuppressWarnings("unchecked")
	public List<VW_BUS_COMPLETE_DATA> getlistoffulldata() {

		Session s=sf.openSession();
		Query q=s.createQuery("FROM VW_BUS_COMPLETE_DATA");
		s.beginTransaction();
		List< VW_BUS_COMPLETE_DATA> lv=q.list();
		s.getTransaction().commit();
		s.close();

		return lv;
	}

	@Override
	public  VW_BUS_COMPLETE_DATA getonID(String id) {
Session s=sf.openSession();
s.beginTransaction();
VW_BUS_COMPLETE_DATA vw=s.get( VW_BUS_COMPLETE_DATA.class, id);
s.getTransaction().commit();
s.close();

return vw;
	}

	@Override
	public List<VW_BUS_COMPLETE_DATA> getlistofbusestype(String bustype) {
		// TODO Auto-generated method stub
		String query="From VW_BUS_COMPLETE_DATA where bustype="+bustype;
		Session s= sf.openSession();
		Query q=s.createQuery(query);
		s.beginTransaction();
		List<VW_BUS_COMPLETE_DATA> lview=q.list();
		s.getTransaction().commit();
		s.close();
		return lview;
	}

	@Override
	public void deletvwbus(String id) {
 
 Session s= sf.openSession();
 s.beginTransaction();
  s.delete(id);
 s.getTransaction().commit();
 s.close();
	}

	
}
