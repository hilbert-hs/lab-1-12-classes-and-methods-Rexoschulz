import java.util.Scanner;
public class StringProgram {
  public static void main(String[] args) {
    // Complete a method to take in a String object from Scanner, remove all * symbols,  
    // and concatenate the four strings in reverse order. Print your new String.

    String newString = "";

    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a string that contains 4 words seperated by *");
    String str = scan.nextLine();
    String tempStr = str;
    scan.close();

    int firstStarPos = tempStr.indexOf("*");
    newString = tempStr.substring(0, firstStarPos) + " " + newString;
    tempStr = tempStr.substring(firstStarPos + 1);
    
    int secondStarPos = tempStr.indexOf("*");
    newString = tempStr.substring(0, secondStarPos) + " " + newString;
    tempStr = tempStr.substring(secondStarPos + 1);

    newString = tempStr.substring(0, tempStr.indexOf("*")) + " " + newString;
    tempStr = tempStr.substring(tempStr.indexOf("*") + 1);
    
    newString = tempStr + " " + newString;
    
    System.out.println(str + " / " + newString);
  }
}
