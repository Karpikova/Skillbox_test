import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void lesson2() throws Exception {
        double amount = 150.0;
        Cat cat = new Cat();
        cat.feed(150.0);
        cat.pee();
        cat.pee();
        Assert.assertEquals(amount, cat.getEaten(), 0);
    }
}