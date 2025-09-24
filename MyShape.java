import java.util.Scanner;
public class MyShape {
  public static void main(String[] args) {
    // declare variables for length, width, and area
    double length = 0.0;
    double width = 0.0;
    double area;

    // use a Scanner object to get length and width values
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a length");
    length = scan.nextDouble();
    System.out.println("Give me a width");
    width = scan.nextDouble();
    scan.close();
    // call your methods to test your program
    area = calculateArea(length, width);
    double peri = calculatePeri(length, width);
    System.out.println("The perimeter is " + peri);
    System.out.println("The area is " + area);
    
  }

  // write your perimeter method here
  public static double calculatePeri(double _len, double _wid) {
    return (_len * 2) + (_wid * 2);
  };


  // write your area method here
  public static double calculateArea(double _len, double _wid) {
    return _len * _wid;
  };
}
