package hw3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckNumberInIntervalTest {
    CheckNumberInInterval checkNumber;
    @BeforeEach
    void setUp() {
        checkNumber=new CheckNumberInInterval();
    }
    @BeforeAll
    public static void initAll() {
        System.out.printf("Start testing...");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.printf("The End!");    }
    @Test
    @DisplayName("Проверка числа из интервала")
    void checkEven() {
        assertEquals(true, checkNumber.checkIsInInterval(30));
    }
    @Test
    @DisplayName("Проверка числа не из интервала")
    void checkOdd() {
        assertEquals(false, checkNumber.checkIsInInterval(11));
    }
//
}
