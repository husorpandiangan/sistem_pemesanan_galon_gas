 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Pesanan;
import pojos.Stockbarang;
import util.NewHibernateUtil;

/**
 *
 * @author ASUS
 */
public class StockbarangHelper {
     public StockbarangHelper() {
    }
    public List<Stockbarang> getAllLaporan(){
        List<Stockbarang> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Stockbarang s";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    } 
    
}
