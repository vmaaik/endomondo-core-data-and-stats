package uk.no.idea.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CoreDataAndStatsApplicationTests {

    @Test
    void pipelineCheck() {
        assertEquals("test", "test");
    }

    @Test
    void pipelineCheck2() {
        assertEquals("test", "test");
    }
}
