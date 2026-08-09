  import java.util.*;

  class Student{
      String name;
      int age;
      char section;
      char gender;
      int s1Marks;
      int s2Marks;
      int s3Marks;
      double totalMarks;
      double totalPercentage;
      Student(String name, int age, char section, char gender, int m1, int m2, int m3){
        this.name = name;
        this.age = age;
        this.section = section;
        this.gender = gender;
        this.s1Marks = m1;
        this.s2Marks = m2;
        this.s3Marks = m3;
        this.totalMarks = m1+m2+m3;
        this.totalPercentage= totalMarks/300*100;
      }
      void display(){
        System.out.println(this.name + "\t" + this.age + "\t" + this.section + "\t" + this.gender + "\t" + this.s1Marks + "," + this.s2Marks + "," + this.s3Marks + "\t" + this.totalMarks + "\t" + this.totalPercentage + "%");
      }

  }
  public class Main {

      public static void main(String[] args) {
        Student s1 = new Student("A", 22, 'B', 'F', 60,70,80);
        Student s2 = new Student("B", 23, 'B', 'F', 0,50,50);
        Student s3 = new Student("C", 24, 'B', 'M', 0,60,60);
        Student s4 = new Student("D", 25, 'B', 'M', 75,80,92);
        System.out.println("Student1 Details");
        s1.display();
        System.out.println("Student2 Details");
        s2.display();
        System.out.println("Student3 Details");
        s3.display();
      }
  }