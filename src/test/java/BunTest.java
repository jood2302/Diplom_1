import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunTest {

    private final String name;
    private final float price;
    private Bun bun;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
        bun = new Bun(name,price);
    }

    @Parameterized.Parameters()
    public static Object[][] getTestData() {
        return new Object[][]{
                {"black bun", 100},
                {"white bun", 200},
                {"red bun", 300},
                {null, 1},
                {"qwerty", 123f},
                {"",0}
        };
    }


    @Test
    public void getBunName() {
        Assert.assertEquals("invalid name", name, bun.getName());
    }
    @Test
    public void getBunPrice() {
        Assert.assertEquals("invalid price", price, bun.getPrice(), 0.0f);
    }
}
