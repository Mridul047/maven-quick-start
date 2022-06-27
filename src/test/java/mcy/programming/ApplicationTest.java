package mcy.programming;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicationTest {

    private Application app;

    @BeforeAll
    void init() {
        app = new Application();
    }

    @Test
    void coverMain(){
        String[] input = {"test"};
        Application.main(input);
    }

    @Test
    void shouldGiveStringLen() {
        String input = "mridul";
        int actual = app.getStringLen(input);
        assertEquals(input.length(), actual);
    }

    @Test
    void shouldGiveDefaultLen() {
        String input = "";
        int actual = app.getStringLen(input);
        assertEquals(0, actual);
    }
}
