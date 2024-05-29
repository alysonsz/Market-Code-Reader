import com.example.marketcodereader.models.Product;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void getCode() {
        Product product = new Product((long) 4, "carne", 37.99);
        Assert.assertEquals(4, (long) product.getCode());
    }

    @Test
    public void getName() {
        Product product = new Product((long) 4, "carne", 37.99);
        Assert.assertEquals("carne", product.getName());
    }

    @Test
    public void getPrice() {
        Product product = new Product((long) 4, "carne", 37.99);
        Assert.assertEquals(37.99, product.getPrice(), 0);
    }
}