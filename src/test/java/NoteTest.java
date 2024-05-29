import com.example.marketcodereader.models.Cart;
import com.example.marketcodereader.models.Client;
import com.example.marketcodereader.models.Note;
import com.example.marketcodereader.models.Product;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoteTest {

    @Test
    public void print() {
        Cart cart = new Cart();
        Product product1 = new Product((long) 4, "carne", 37.99);
        cart.addProduct(product1);
        Client client = new Client("Alyson", "XXX.XXX.XXX-XX", cart);

        Note note = new Note(client);

        Assert.assertEquals(
                """
                        Nome: Alyson
                        CPF/CNPJ: XXX.XXX.XXX-XX
                        Produtos:\s
                        carne R$ 37,99
                        Volte Sempre!""",
                note.toString());
    }
}