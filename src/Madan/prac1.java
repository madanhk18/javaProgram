package Madan;
class cars{
	String name;
	int price;
	int milage;
}

public class prac1 {

	public static void main(String[] args) {
		cars c=new cars();
		c.name="BMW";
		c.price=120;
		c.milage=12;
		System.out.println("Car name is "+c.name +"\n Car price "+c.price
		+" \n car milage "+c.milage);
	}

}
