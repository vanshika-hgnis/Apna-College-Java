interface  Animal {
    int eyes = 2;
    void walk();
}
interface Herbivore {
    int eyes = 2;
    void walk();
}
class Horse implements Animal,Herbivore {
    public void walk(){
        System.out.println("Walks on 4 legs"); 
    }
}
class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school = "newSchool";
    }
}
public class Interfase {
    public static void main(String args[]){
    Horse horse = new Horse();
    horse.walk();
    Student.school = "ABC";
    Student student1 = new Student();
    student1.name = "pepper";

}
}
