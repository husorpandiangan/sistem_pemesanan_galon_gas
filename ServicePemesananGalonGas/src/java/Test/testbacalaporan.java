/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Helper.PesananHelper;
import com.google.gson.Gson;
import java.util.List;
import pojos.Pesanan;

/**
 *
 * @author ASUS
 */
public class testbacalaporan {
    public static void main(String[] args) {
        PesananHelper test=new PesananHelper();
        List<Pesanan> list = test.getAllLaporan();
        Gson gson=new Gson();
        String json=gson.toJson(list);
        System.out.println(json);
        
    }
}
