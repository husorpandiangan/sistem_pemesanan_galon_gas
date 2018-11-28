/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Helper.UserHelper;
import com.google.gson.Gson;
import java.util.List;
import pojos.User;

/**
 *
 * @author ASUS
 */
public class testbacauser {
  public static void main(String[] args) {
        UserHelper test=new UserHelper();
        List<User> list = test.bacaSemuaUser();
        Gson gson=new Gson();
        String json=gson.toJson(list);
        System.out.println(json);
        
    }   
}
