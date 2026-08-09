import java.util.*;

class Shape{
  double side = 0;
  int length, breadth = 0;
  int radius = 0;
  //default
  Shape(){

  }
  //square
  Shape(double a){
    side = a; 
  }
  //rectangle
  Shape(int a, int b){
    length = a;
    breadth = b;
  }
  //circle
  Shape(int a){
    radius = a;
  }
  void areaSquare(){ System.out.println("Area of Square :" + (int)(side*side)); }
  void areaRectangle(){ System.out.println("Area of Rectangle :" + length*breadth);}
  void areaCircle(){System.out.println("Area of Circle :" + (int)(3.14*radius*radius));}

  void calculateArea(int a, int b){//rhombus
    System.out.println("Area of Rhombus :" + (int)(0.5*a*b));
  }
  void calculateArea(int a, int b, boolean c){//triangle
    System.out.println("Area of Triangle :" + (int)(0.5*a*b));
  }
}
public class Main {
    public static void main(String[] args) {
      Shape s1 = new Shape();//default constructor
      Shape s2 = new Shape(3.0);//square
      Shape s3 = new Shape(2,3);//rectangle
      Shape s4 = new Shape(4);//circle

      s2.areaSquare();
      s3.areaRectangle();
      s4.areaCircle();
      s1.calculateArea(2,2);//rhombus//2
      s1.calculateArea(2,5,true);//triangle//5
    }
}