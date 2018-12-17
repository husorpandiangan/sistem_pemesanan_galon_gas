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
    public List<Pesanan> getAllLaporan() {
        List<Pesanan> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Pesanan p";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }

        public List<Pesanan> getAllLaporan2() {
        List<Pesanan> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Pesanan p where status='terkirim'";
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
            String namaBarang,
            String jumlahBarang,
            Date waktuAntar,
            String status,
            int totalHarga
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Pesanan pesanan = new Pesanan(idPemesanan, 
                noKtp, 
                nama, 
                alamat, 
                namaBarang, 
                jumlahBarang, 
                waktuAntar, 
                status, 
                totalHarga);
        session.saveOrUpdate(pesanan);
        tx.commit();
        session.close();
    }
}
