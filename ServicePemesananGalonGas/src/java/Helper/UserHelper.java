/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.util.Date;
import java.util.List;
import static org.apache.tomcat.jni.User.username;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.User;
import util.NewHibernateUtil;

/**
 *
 * @author ASUS
 */
public class UserHelper {
 public UserHelper() {

    }
  public void addNewUser(
            String username,
            String password
            ){
          
         Session session = NewHibernateUtil.getSessionFactory().openSession();
           Transaction tx = session.beginTransaction();
           User user=new User(username,password);
           session.saveOrUpdate(user);
           tx.commit();
           session.close();
    }



   
    public User login(String username,String password){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String q = "From User a where a.username=:username AND a.password =:password";
        
        Query query = session.createQuery(q);
        query.setParameter("username", username);
        query.setParameter("password", password);
        
        return (User) query.uniqueResult();
    }
    
    
    public List<User> bacaSemuaUser() {
        List<User> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from User U");
        list = q.list();
        tx.commit();
        session.close();
        return list;

    }
}

     

