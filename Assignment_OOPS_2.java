import java.util.*;

abstract class MNC {
  abstract void leaves();
  abstract void holidays();
  MNC(){
    System.out.println("MNC Default constructor");
  }
  void displayMNC(){
      System.out.println("MNC normal method");
  }
}
abstract class Infosys extends MNC{
  abstract void leaves();
  @Override
  void holidays(){
    System.out.println("Infosys Holidays");
  }
}
class Hello extends Infosys{
  @Override
  void holidays(){
    System.out.println("Hello Holidays");
  }
  @Override
  void leaves(){
    System.out.println("Hello Leaves");
  }
  void displayHello(){
      System.out.println("Hello normal method");
  }
}
public class Main {
    public static void main(String[] args) {
      // Hello h1 = new Hello();
      // h1.holidays();
      // h1.leaves();
      // h1.displayHello();
      // MNC h2 = new Hello();
      // h2.holidays();
      // h2.leaves();
      // h2.displayMNC();
      Infosys h2 = new Hello();
      h2.holidays();
      h2.leaves();
      h2.displayMNC();
    }
}