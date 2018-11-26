/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import Helper.UserHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class testuser {
    public static void main(String[] args) {   
           
            String username="Nico";
            String password="165314061";
            UserHelper user =new UserHelper();
            user.addNewUser(username, password);
        
    }}
    
    

