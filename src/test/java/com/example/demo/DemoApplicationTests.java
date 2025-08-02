package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue; // ✅ IMPORTANT IMPORT


@SpringBootTest
class DemoApplicationTests {

	@Test
    void testSomething() {
        assertTrue(true);
    }

}
