/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Helper.UserHelper;
import com.google.gson.Gson;
import pojos.User;

/**
 *
 * @author ASUS
 */
public class testlogin {

    public static void main(String[] args) {
//         User.UserHelper u = new UserHelper();
        Helper.UserHelper u = new UserHelper();
        System.out.println(new Gson().toJson(u.login("Nico", "165314061")));
    }
}
