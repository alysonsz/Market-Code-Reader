import com.example.marketcodereader.models.Cart;
import com.example.marketcodereader.models.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CartTest {

    @Test
    public void getTotalItemsValue() {
        Product product1 = new Product((long) 4, "carne", 37.99);
        Product product2 = new Product((long) 5, "frango", 17.99);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        Assert.assertEquals(String.format("Total: R$ %.2f", 55.98), cart.getTotalItemsValue());
    }

    @Test
    public void getProductList() {
        Product product1 = new Product((long) 4, "carne", 37.99);
        Product product2 = new Product((long) 5, "frango", 17.99);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);

        Assert.assertEquals(productList, cart.getProductList());
    }
}