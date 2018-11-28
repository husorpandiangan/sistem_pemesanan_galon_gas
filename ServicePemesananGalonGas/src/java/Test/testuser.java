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

        String username = "Husor";
        String password = "165314083";
        UserHelper user = new UserHelper();
        user.addNewUser(username, password);

    }
}
//<div class="container">
//            <center><table onsubmit="return make_json(this);" method="POST">
//                    <tr>
//                        <td>Nama</td>
//                        <td>:</td>
//                        <td><input type="text" name="nama" value=""></td>
//                    </tr>
//                    <tr>
//                        <td>Id</td>
//                        <td>:</td>
//                        <td><input type="text" name="Id" value=""></td>
//                    </tr>
//                    <tr>
//                        <td>No. KTP</td>
//                        <td>:</td>
//                        <td><input type="text" name="noKTP" value=""></td>
//                    </tr>
//                    <tr>
//                        <td>No. Telp</td>
//                        <td>:</td>
//                        <td><input type="text" name="noTelp" value=""></td>
//                    </tr>
//                    <tr>
//                        <td>Alamat</td>
//                        <td>:</td>
//                        <td><input type="text" name="alamat" value=""></td>
//                    </tr>
//                    <tr>
//                        <td>Jenis Pesanan</td>
//                        <td>:</td>
//                        <td><select name="JenisPesanan">
//                                <option value="gas">Gas</option>
//                                <option value="galon">Galon</option>
//                                <option value="gas dan galon">Gas dan Galon</option>
//                            </select></td>
//                    </tr>
//                    <tr>
//                        <td>Jumlah Pesanan</td>
//                        <td>:</td>
//                        <td><input type="text" name="jumpesanan" value=""></td>
//                    </tr>
//                    <tr>
//                        <td>Waktu Antar</td>
//                        <td>:</td>
//                        <td><input type="text" name="waktuantar" value=""></td>
//                    </tr>
//                    <tr>
//                        <td>Status</td>
//                        <td>:</td>
//                        <td><input type="text" name="status" value=""></td>
//
//                    </tr>
//                </table></center>
//    
//      <center><input name="submit" type="submit" value="Pesan"></center>

