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
    public static void main(String[]args) throws ParseException{
        try{
            SimpleDateFormat format= new SimpleDateFormat("yyyyMMdd");
            Date date=format.parse("19741231");
            String idPemesanan="12654";
            String noKtp="07653456";
            String nama="Ahmat";
            String alamat="Yogyakarta";
            String jenisPemesanan="Gas";
            String jumlahBarang="4";
            PesananHelper helper =new PesananHelper();
            helper.addNewPesanan(idPemesanan, noKtp, nama, alamat, jenisPemesanan, jumlahBarang, date);
    }catch(ParseException ex){
        
    }}
    
}
