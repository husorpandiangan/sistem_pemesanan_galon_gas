/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Pesanan;
import util.NewHibernateUtil;

/**
 *
 * @author ASUS
 */
public class PesananHelper {
    
     
    public PesananHelper() {
    }
    public List<Pesanan> getAllLaporan(){
        List<Pesanan> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Pesanan p";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    } 
    

    
    public void addNewPesanan(
            String idPemesanan,
            String noKtp,
            String nama,
            String alamat,
            String jenisPemesanan,
            String jumlahBarang,
            Date waktuAntar,
            String status
            ){
          
         Session session = NewHibernateUtil.getSessionFactory().openSession();
           Transaction tx = session.beginTransaction();
           Pesanan Pesanan=new Pesanan(idPemesanan,noKtp,nama,alamat,jenisPemesanan,jumlahBarang,waktuAntar,status);
           session.saveOrUpdate(Pesanan);
           tx.commit();
           session.close();
    }
}
