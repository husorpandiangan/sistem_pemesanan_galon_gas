/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Helper.PesananHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class testadd {

    public static void main(String[] args) throws ParseException {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = format.parse("12031998");
            String idPemesanan ="12345";
            String noKtp ="88888888";
            String nama = "Williamp";
            String alamat = "Labuanbajo1";
            String jenisPemesanan = "Gaas";
            String jumlahBarang = "1";
            String status = "Terkirim";
            int totalHarga = 6000;
            PesananHelper helper = new PesananHelper();
            helper.addNewPesanan(noKtp, nama, alamat, jenisPemesanan, jumlahBarang, date, status, totalHarga);
        } catch (ParseException ex) {

        }
    }

}
