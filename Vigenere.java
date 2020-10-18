/*
*  Compilation:  javac Vigenere.java
*  Execution:	java Vigenere mode text keyText
*
*  mode is either encode or decode
*  text can be either plaintext or ciphertext depending on mode
*  keyText stays the same regardless of mode
*
*  This programs converts plaintext to ciphertext or decodes
*  ciphertext using the Vigenere cipher
*
*  Made by Tanzir Hasan for Cyber Security 10/18/20
*/
public class Vigenere{
  public static String cipher(String text, String key, Boolean encode){
    text = text.toUpperCase();
    key = key.toUpperCase();
    char [] ntext= new char[text.length()];
    for (int i = 0; i < text.length(); i++){
      int x = 0;
      if (encode){
        x = (text.charAt(i) + key.charAt(i%key.length())) %26;
      }
      else{
        x = (text.charAt(i) - key.charAt(i%key.length()) +26) % 26;
      }
        x += 65;//65 is A in ASCII

        ntext[i]=(char)(x);
    }
    String ans = new String (ntext);
    return ans;
  }
  public static void main (String[] args){
    Boolean mode = false;
    if (args[0].equals("encode")){
      mode = true;
    }
    String text = args[1];
    String key = args[2];
    System.out.println(cipher(text, key, mode));
  }
}
