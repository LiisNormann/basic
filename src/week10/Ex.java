package week10;

public class Ex {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White","Sausage" , 3.56);
        hamburger.addition1("Tomato", 0.27);
        hamburger.addition2("Lettuce", 0.75);
        hamburger.addition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.makeHamburger());
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addition1("Egg", 5.43);
        healthyBurger.addition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.makeHamburger());
        System.out.println();

        DeluxeBurger db = new DeluxeBurger();
        db.addition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.makeHamburger());
    }
}
