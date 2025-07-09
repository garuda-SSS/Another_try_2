import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    @BeforeAll
    public static void begin(){
        System.out.println("Начало тестового прогона");
    }
    @AfterAll
    public static void end(){
        System.out.println("Конец тестового прогона");
    }
    @BeforeEach
    void beginTest(TestInfo testInfo) {
        String testName = testInfo.getDisplayName();
        System.out.println("Начало теста: " + testName);
    }
    @AfterEach
    void endTest(TestInfo testInfo) {
        String testName = testInfo.getDisplayName();
        System.out.println("Конец теста: " + testName);
    }
    @Test
    public void justSmth(){
        assertEquals(5, 5);
        System.out.println(Thread.currentThread().getName() + " — " + "justSmth");
    }
}
