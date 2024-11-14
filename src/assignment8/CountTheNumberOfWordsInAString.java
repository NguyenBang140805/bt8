
package assignment8;
import java.lang.String;
import java.util.*;

public class CountTheNumberOfWordsInAString {
     public static void main(String[] args) {
    int count = 0;
        String str = "Java is fun";
        String[] words = str.split(" "); 
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) { 
                count++;
            }
        }
        System.out.println("So lan tu trong chuoi la: " + count);
    } 
    
}
