package com.practise.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.model.TICKETHISTORY;

@Repository
public class TicketbookDAO implements TicketbookINT {
@Autowired
SessionFactory sf;
	@SuppressWarnings("unchecked")
	@Override
	public List<TICKETHISTORY > getfullhistoryofbookings() {
Session s =sf.openSession();
Query q=s.createQuery("From TICKETHISTORY");
s.beginTransaction();
List<TICKETHISTORY > lth=q.list();
s.getTransaction().commit();
s.close();		
		return lth;
	}

	@Override
	public TICKETHISTORY  getbookedticketonid(String id) {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		s.beginTransaction();
		TICKETHISTORY  th=s.get(TICKETHISTORY .class, id);
		s.getTransaction().commit();
		s.close();
		return th;
	}

	@Override
	public void addticketbooking(String id,String vwbusty) {
Session s=sf.openSession();
s.beginTransaction();
TICKETHISTORY  th=new TICKETHISTORY ();
th.setCustomerid(id);
th.setBookid(generatebookid());
s.save(th);
s.getTransaction().commit();
s.close();
	}

	private String generatebookid() {

		String g = "";
		Session s = sf.openSession();
		Query q = s.createQuery("from tickethistory");
		List<TICKETHISTORY > l = q.list();
		if (l.size() == 0) {
			g = "BOK001";
		} else {
			q = s.createQuery("select max(bookid) from tickethistory");
			String eg = (String) q.list().get(0);
			int id = Integer.parseInt(eg.substring(3));
			id++;
			if (id <= 9) {
				g = "BOK00" + id;
			} else if (id <= 99) {
				g = "BOK0" + id;
			}
		}
		s.close();

		return g;
	}

	}


