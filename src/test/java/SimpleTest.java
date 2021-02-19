import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    void successTest() {
        assertEquals(true, true);
    }

    @Test
    void negativeTest() {
        assertEquals(true,false);
    }

    @Test
    @DisplayName("Some positive test with Hamcrest")
    void successWithHamcrestAndStepsTest() {
        assertThat(true, is(true));
    }

    @Test
    @DisplayName("Some negative test with Hamcrest")
    void negativeWithHamcrestAndStepsTest() {
        step("Assert that true is false", () ->
        assertThat(true, is(false)));

    }

}
