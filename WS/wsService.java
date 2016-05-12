package WS;

import javax.jws.WebService;  
import javax.jws.WebMethod;
import java.util.Random;

@WebService public class wsService {
    
    // Receives an string and capitalizes the first character of every word in it
    @WebMethod// optional but helpful annotation 
    public String capitalize (String a) {
        
        // Generate an array of strings containing all the words the original string contains
        String[] split = a.split(" ");
    
        StringBuffer sb = new StringBuffer();
        
        // Capitalize every first character of the strings in the split array and add them to the sb Stringbuffer
        for (String word : split) {
            sb.append(word.substring(0, 1).toUpperCase() + word.substring(1));
            sb.append(" ");
        }
        // Return the capitalized string
        return sb.toString();
    }
}