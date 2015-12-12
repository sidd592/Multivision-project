package net.mv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.mv.item.Items;
import net.mv.util.HibernateUtil;

public class ItemDao {
	
	public Items getItemByName(String item){
		Session session=HibernateUtil.getSession();
		Query query=session.createQuery("from Items where item = :item");
		query.setParameter("item", item);
		
		@SuppressWarnings("unchecked")
		List<Items> items=query.list();
		session.close();
		if(items.size()==0){
			return null;
		}
		else
		{
			return items.get(0);
		}
	}

public List<Items> getallItems(){
		
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("from Items");
		@SuppressWarnings("unchecked")
		List<Items> items=query.list();
		session.close();
		return items;
		
	}
	public void editItem(Items item){
		Session session = HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.update(item);
		tx.commit();
		session.close();
		
	}
	
	public void addNewItem(Items item){
		Session session = HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(item);
		tx.commit();
		session.close();
			
	}
	
	public void removeItemCompletely(Items item){
		Session session = HibernateUtil.getSession();
		Transaction Tx = session.beginTransaction();
		session.delete(item);
		Tx.commit();
		session.close();
		
	}
	
}
