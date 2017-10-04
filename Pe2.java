import java.util.Scanner;

public class Pe2 {
    public static void main(String[] args) {
        Pe2 pe2 = new Pe2();
        Outer outer = pe2.getOuter();
        outer.display();
        
    }
    
    Outer getOuter() {
        System.out.println("getting outer");
        return new Outer();
    }
class Outer{
        
        class Inner{
            public void display() {
                System.out.println("This is an inner class");
            }
            
        }
public void display(){
            System.out.println("Inside outer display method");
            Inner inner = new Inner();
            inner.display();
        }
    }
}
