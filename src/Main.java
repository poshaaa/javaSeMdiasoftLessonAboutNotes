package src;

import java.util.Scanner;

public class Main {

 public static void main(String[] args){
//     src.Note note1 = new src.Note("name1", "text2");
//     note1.setText("text6");

//    Scanner s = new Scanner(System.in);
//
//    var str = s.nextLine();
     int code = Authentication.authenticate();
     if (code == 0){
         System.out.println("Login success");
     }
     else{
         System.out.println("Login failed");
     }
 }
}
