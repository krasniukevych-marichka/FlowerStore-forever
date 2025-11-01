package ua.edu.ucu.lab_8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab_8.model.BasketDecorator;
import ua.edu.ucu.lab_8.model.Flower;
import ua.edu.ucu.lab_8.model.PaperDecorator;
import ua.edu.ucu.lab_8.model.RibbonDecorator;
import ua.edu.ucu.lab_8.model.Item;

public class DecoratorTest {

    @Test
    void testPaperDecoratorAddsPrice() {
        Item flower = new Flower(1, "Romashka", "White", 10, true);
        Item decorated = new PaperDecorator(flower);

        assertEquals(23, decorated.price());
        assertTrue(decorated.getDescription().contains("paper"));
    }

    @Test
    void testBasketDecoratorAddsPrice() {
        Item flower = new Flower(2, "Rose", "Red", 15, true);
        Item decorated = new BasketDecorator(flower);

        assertEquals(19, decorated.price(), 0.001);
        assertTrue(decorated.getDescription().contains("basket"));
    }

    @Test
    void testRibbonDecoratorAddsPrice() {
        Item flower = new Flower(3, "Tulip", "Yellow", 20, true);
        Item decorated = new RibbonDecorator(flower);

        assertEquals(60, decorated.price(), 0.001);
        assertTrue(decorated.getDescription().contains("ribbon"));
    }
}
