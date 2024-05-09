package _11_Classes_and_Objects.src;
import java.util.*;
class cake{
    String name;
    String color;
    String flavour;
    int pound;
    int price;
}
public class Test {
    public static void main(String[] args) {
        cake cake1 = new cake();
        cake1.name = "Raspberry Ripple Cake";
        cake1.color = "Queen Pink";
        cake1.flavour = "Raspberry";
        cake1.pound = 5;
        cake1.price = 4250;

        System.out.println("Name: "+cake1.name);
        System.out.println("Name: "+cake1.color);
        System.out.println("Name: "+cake1.flavour);
        System.out.println("Name: "+cake1.pound);
        System.out.println("Name: "+cake1.price);

    }
}
