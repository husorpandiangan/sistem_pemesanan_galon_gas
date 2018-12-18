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
import pojos.Pesananfix;
import util.NewHibernateUtil;

/**
 *
 * @author ASUS
 */
public class PesananHelper {

    public PesananHelper() {
    }
    public List<Pesananfix> getAllLaporan() {
        List<Pesananfix> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Pesananfix p";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }

        public List<Pesananfix> getAllLaporan2() {
        List<Pesananfix> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Pesananfix p where status='terkirim'";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }
    public void addNewPesanan(
            String noKtp,
            String nama,
            String alamat,
            String namaBarang,
            String jumlahBarang,
            Date waktuAntar,
            String status,
            int totalHarga
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Pesananfix pesanan = new Pesananfix( 
                noKtp, 
                nama, 
                alamat, 
                namaBarang, 
                jumlahBarang, 
                waktuAntar, 
                status="belum terkirim", 
                totalHarga);
        session.saveOrUpdate(pesanan);
        tx.commit();
        session.close();
    }
    
    public void update(
            Integer idPemesanan,
            String status
    
    ) 
        {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Pesananfix pesanan=(Pesananfix) session.get(Pesananfix.class,idPemesanan);
        pesanan.setStatus(status);
        session.saveOrUpdate(pesanan);
        tx.commit();
        session.close();
    }
}
