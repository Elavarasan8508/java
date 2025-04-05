// Hierarchical Inheritance...

class Animal {

    void eat()
    {
        System.out.println("Eating Meat");
    }
}

class Dog extends Animal
{
    void dog()
    {
        System.out.println("Barking");
    }
}
class Cat extends Animal
{
    void cat()
    {
        System.out.println("Meoww");
    }

}
class Goat extends Animal
{
    void goat()
    {
        System.out.println("Meeey");
    }
}
public class ain{
public static void main(String[] args) {
    
    Goat g=new Goat();
    g.eat();
    g.goat();

    Cat c=new Cat();
    c.eat();
    c.cat();
    
    Dog d=new Dog();
    d.eat();
    d.dog();

}
}
    

