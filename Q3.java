import java.util.*;
import java.util.Collections;
 
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      ArrayList<String> alist = new ArrayList<>();
      alist.add("apple");
      alist.add("banana");
      alist.add("grapes");
      alist.add("pears");
      alist.add("prunes");
      alist.add("pineapple");
      alist.add("mumbai");
      alist.add("pune");
      alist.add("singing");
      alist.add("reading");
 
      System.out.println("ArrayList" + alist);
 
      // for( String item:alist){
      //   System.out.println(item);
      // }
 
      alist.remove(1);
      System.out.println("ArrayList" + alist);
      System.out.println(alist.contains("cricket"));
      alist.remove(5);
      System.out.println(alist);
      alist.remove("prunes");
      System.out.println(alist);
      System.out.println(alist.get(3) + " " + alist.get(5));
      // alist.replace("singing", "dancing");
      if(alist.remove("singing")){
        alist.add("dancing");
      }
      System.out.println(alist);
 
      for(int i=alist.size()-1;i>=0;i--){
        System.out.println(alist.get(i));
      }
      Collections.reverse(alist);
      System.out.println(alist);
 
      ArrayList<String> citiList = new ArrayList<>(List.of("surat","kolkata","hyderabad","banglore","gurgaon"));
      System.out.println(citiList);
 
      ArrayList<String> mergedList = new ArrayList<>(alist);
      mergedList.addAll(citiList);
      System.out.println(mergedList);
 
      ArrayList<String> sub = new ArrayList<>(alist.subList(3,7));
      System.out.println(sub);
 
      alist.clear();
      System.out.println(alist);
 
      // alist.add(2, "Kerala");
      // alist.add(1, "Mango");
      // System.out.println(alist);
 
 
    }
}