public class javaClassAttributes {
    String fname = "John";
    String lname = "Doe";
    int age = 24;
  
    public static void main(String[] args) {
      javaClassAttributes myObj = new javaClassAttributes();
      System.out.println("Name: " + myObj.fname + " " + myObj.lname);
      System.out.println("Age: " + myObj.age);
    }
  }