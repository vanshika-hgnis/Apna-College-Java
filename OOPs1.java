class Student {
String name;
int age;
// constructor
Student(){
    System.out.println("Constructor called");
}
// parameterized constructor
// Student(String name,int age){
//     this.name = name;
//     this.age = age;
// }
//  copy constructor 
Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
}

public void getInfo(String name){
    System.out.println("Name: "+this.name);
}
public void getInfo(int age){
    System.out.println("Age: "+age);
}
}

public class OOPs1 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Vanshika";
        s1.age = 20;
        // Student s1 = new Student("vansh",67);
        Student s2 = new Student(s1);
        // s2.getInfo();
        s2.getInfo("Vanshika");
        s2.getInfo(18);
    }
}
