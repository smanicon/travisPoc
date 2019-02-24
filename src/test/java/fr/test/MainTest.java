package fr.test;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MainTest {
    @Test
    public void firstTest() {
        Assertions.assertThat(Main.getWorldWord()).isEqualTo("World");

    }
}
