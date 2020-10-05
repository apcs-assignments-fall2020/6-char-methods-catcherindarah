import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (65 <= ch && ch <= 90){
            ch = (char)((ch)+32);
        }
        else {
            ch = (ch);
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String a = "";
        for (int i = 0; i<str.length(); i++){
            char b = str.charAt(i);
            if(65 <= b && b <=90){
                b = (char)((b)+32);
            }
            a = a + b;
        }
        return(a);
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (97 <= ch && ch <= 122){
            ch = (char)((ch)-32);
            return (ch);
        }
        else {
            ch = (ch);
            return (ch);
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String c = "";
        for (int i = 0; i < str.length(); i++){
            char d = str.charAt(i);
            if (97 <= d && d <= 122){
                d = (char)((d)-32);
            }
            c = c + d;
        }
        return (c);
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        
    }
}
