import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {

    @Test
    public void checkingredientType() {
        IngredientType sauce = IngredientType.SAUCE;
        IngredientType filling = IngredientType.FILLING;
        Assert.assertEquals(IngredientType.valueOf("SAUCE"), sauce);
        Assert.assertEquals(IngredientType.valueOf("FILLING"), filling);
    }
}
