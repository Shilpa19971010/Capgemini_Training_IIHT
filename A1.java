import java.util.*;

class Calculator{
    //add
    int calculate(int a, int b){
      return a+b;
    }
    //circle
    int calculate(int a){
      return (int)3.14*a*a;
    }
    //rectangle
    int calculate(int a, int b, int dummy){
      return a*b;
    }
    //square
    int calculate(double a){
      return (int)(a*a);
    }
}
public class Main {
    public static void main(String[] args) {
      Calculator calc = new Calculator();
      System.out.println("Addition :" + calc.calculate(3,4));//7
      System.out.println("Area of Circle :" + calc.calculate(3));//27
      System.out.println("Area of Rectangle :" + calc.calculate(3,4,0));//12
      System.out.println("Area of Square :" + calc.calculate(3.0));//9
    }
}