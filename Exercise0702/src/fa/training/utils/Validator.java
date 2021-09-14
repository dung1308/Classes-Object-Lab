/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.training.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
public class Validator {
    private static final String VALID_EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]"
			+ "+\\.[a-zA-Z]{2,6}$";
		/**
12.	 	* Check email address is valid.
13.	 	* @param emailAddress
14.	 	* @return true, if valid, otherwise return false.
15.	 	*/
    public static boolean isEmail(String emailAddress) {
	Pattern pattern = Pattern.compile(VALID_EMAIL_REGEX);
	Matcher matcher = pattern.matcher(emailAddress);
	return matcher.matches();
    }
	
		/**
23.		 * Check gender value is valid.
24.		 * @param gender
25.		 * @return true, if valid, otherwise return false.
26.		 */
    public static boolean isGender(byte gender) {
	if ((gender == 1) || (gender == 0)) {
		return true;
	}
		return false;
    }
}
