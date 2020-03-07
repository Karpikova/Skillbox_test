import org.junit.Assert;

public class Loader {
    private static final double CONSTANT = 1;
    private static final double BIG_CONSTANT = 10000;

    public static void main(String[] args) {
        lesson1();
    }

    private static Cat getKitten() {
        return new Cat(1100.0);
    }

    private static void lesson1() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        System.out.println(cat3.getWeight());
        System.out.println(cat4.getWeight());
        System.out.println(cat5.getWeight());

        cat1.feed(CONSTANT);
        cat2.feed(CONSTANT);

        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());

        Assert.assertNotEquals(cat1.getWeight(), cat1.getOriginWeight(), 0);
        Assert.assertNotEquals(cat2.getWeight(), cat2.getOriginWeight(), 0);

        cat1.feed(BIG_CONSTANT);

        while (!cat1.getStatus().equals("Dead")) {
            cat1.meow();
        }

        Assert.assertEquals(cat1.getStatus(), "Dead");
    }
}