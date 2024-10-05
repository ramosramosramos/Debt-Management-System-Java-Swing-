/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Validator {
      public static boolean isValidUsername(String username) {
     
        String regex = "^(?=.*[0-9]).+$"; 
        
     
        Pattern pattern = Pattern.compile(regex);
        
   
        Matcher matcher = pattern.matcher(username);

        return matcher.matches();
    }
}
