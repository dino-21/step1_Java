package part2.ch08.ex8_2;

public class DrinkTest {
    public static void main(String[] args) {
        // Drink d1 = new Drink();
        Drink d2 = new Drink("박카스", 800);
       //System.out.println(d2.toString());
    }
}

class Drink {
    String name;
    int price;

    Drink(String n, int p) {
        name = n;
        price = p;
    }

   //object에 있는 toString() 메소드 오버라이딩
   //public String toString() {
   //		return  name + price;
   //	}
 
}