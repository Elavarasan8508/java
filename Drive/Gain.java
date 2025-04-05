// Single Inheritance

 class Bike {
    void walk()
    {
        System.out.println("Walking");
    }
}
    

 class Cycle extends Bike
{
    void cycle()
    {
        System.out.println("Cycling");
    }

}

 public class Gain{
public static void main(String[] args) {
    
    Cycle b=new Cycle();
    b.walk();
    b.cycle();
}
}