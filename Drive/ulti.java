// Multi Level Inheritance

class Animal
{
void eat()
{
System.out.print("Red Meat");
}
}

class Tiger extends Animal{
void roar()
{
System.out.println("Big Tiger oooroo");
}
}

class Small_tiger extends Tiger
{
void small_roar()
{
System.out.println("Small Tiger  oorooo");
}
}

public class ulti
{
public static void main(String[] args)
{
Small_tiger st=new Small_tiger();    // In these case we created the Object for the Grand child class (It is used to call All the Functions...)
st.small_roar();
st.roar();
st.eat();
}
}