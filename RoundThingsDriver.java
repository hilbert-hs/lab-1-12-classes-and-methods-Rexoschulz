import java.util.Scanner;
public class RoundThingsDriver {
  public static void main(String[] args) {
    // declare variable for radius, area, circumference, surfaceArea, and volume here
    double radius;
    double area;
    double circumference;
    double surfaceArea;
    double volume;
    // use a Scanner object to get radius value
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a radius");
    radius = scan.nextDouble;

    scan.close();
    // call your methods to test your program

    
  }
  // write your outPut() method here
  public static String outPut(){
    return null;
  }
}

  // write your RoundThings class here
class RoundThings{
    public static double calcCircumCircle(double _rad){
      double circum = 2 * _rad * Math.PI;
      return circum;
    } ;
    public static double calcAreaCircle(double _rad){
      double area = (_rad * _rad) * Math.PI;
      return area;
    } ;
    public static double calcAreaSpear(double _rad){
      double areaSpear = 4 * Math.PI * Math.pow(_rad, 2);
      return areaSpear;
    } ;
    public static double calcVolumeCircle(double _rad){
      double volume = (4 / 3) * Math.PI * Math.pow( _rad, 3);
      return volume;
    } ;
}

  
