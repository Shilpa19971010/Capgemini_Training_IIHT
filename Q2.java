import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      TreeSet<String> ts = new TreeSet<>();
      ts.add("Java");
      ts.add("JavaScript");
      ts.add("Python");
      ts.add("C");
      ts.add("C++");
      ts.add("Typescript");
      System.out.println("TreeSet" + ts);
 
      ts.remove("Typescript");
      ts.remove("C++");
      System.out.println("TreeSet" + ts);
     
      ts.add("Ruby on Rails");
      ts.add("Angular");
      ts.add("React");
      System.out.println("TreeSet" + ts);
 
      System.out.println(ts.contains("Java"));
 
      for (String language : ts ) {
        System.out.println(language);
      }
      ts.clear();
      System.out.println(ts);
 
    }
}