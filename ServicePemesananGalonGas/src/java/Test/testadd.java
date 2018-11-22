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
            Date date=format.parse("1974345");
            String idPemesanan="12655";
            String noKtp="07653458";
            String nama="Ahmatt";
            String alamat="papua";
            String jenisPemesanan="Gas dan galon ";
            String jumlahBarang="4";
            String status="Terkirim";
            PesananHelper helper =new PesananHelper();
            helper.addNewPesanan(idPemesanan, noKtp, nama, alamat, jenisPemesanan, jumlahBarang, date,status);
    }catch(ParseException ex){
        
    }}
    
}
