import com.example.marketcodereader.models.Cart;
import com.example.marketcodereader.models.Client;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void getName() {
        Cart cart = new Cart();
        Client client = new Client("Alyson", "XXX.XXX.XXX-XX", cart);
        Assert.assertEquals("Alyson", client.getName());
    }

    @Test
    public void getCPF() {
        Cart cart = new Cart();
        Client client = new Client("Guilherme", "YYY.YYY.YYY-YY", cart);
        Assert.assertEquals("YYY.YYY.YYY-YY", client.getCPF());
    }
}