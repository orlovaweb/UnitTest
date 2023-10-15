package hw3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CheckNumberTest {
    CheckNumber checkNumber;
    @BeforeEach
    void setUp() {
        checkNumber=new CheckNumber();
    }
    @BeforeAll
    public static void initAll() {
        System.out.printf("Start testing...");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.printf("The End!");    }
    @Test
    @DisplayName("Проверка четности")
    void checkEven() {
        assertEquals(true, checkNumber.evenOddNumber(2));
    }
    @Test
    @DisplayName("Проверка нечетности")
    void checkOdd() {
        assertEquals(false, checkNumber.evenOddNumber(11));
    }

}
