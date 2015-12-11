package net.mv.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import net.mv.pojo.LibraryBook;
import net.mv.util.HibernateUtil;

public class LibraryDao {
	
	
	public LibraryBook getbookbyid(int id){
		
		Session session=HibernateUtil.getSession();
		Query query=session.createQuery("from LibraryBook where id = :gid");
		query.setParameter("gid", id);
		
		List<LibraryBook> books=query.list();
		
		LibraryBook book=null;
		session.close();
		if(books.size()==0){
			return book;
		}
		else
		{
			return books.get(0);
		}
	}
	
	public List<LibraryBook> getallbooks(){
		
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("from LibraryBook");
		List<LibraryBook> books=query.list();
		session.close();
		return books;
		
	}
	
	public void Create(LibraryBook book){
		Session session = HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(book);
		tx.commit();
		session.close();
	}
	
	public void update(LibraryBook book){
		Session session = HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.update(book);
		tx.commit();
		session.close();
	}
	
	public void deletebook(LibraryBook book){
		Session session = HibernateUtil.getSession();
		Transaction Tx = session.beginTransaction();
		session.delete(book);
		Tx.commit();
		session.close();
		
		
	}

}
