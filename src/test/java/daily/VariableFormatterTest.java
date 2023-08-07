package daily;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VariableFormatterTest {

    VariableFormatter variableFormatter = new VariableFormatter();

    @Test
    void format() {
        var msg = variableFormatter.format("1.%s 2.%s", Arrays.asList("SR", "SB"));
        System.out.println(msg);
        assertEquals("1.SR 2.SB", variableFormatter.format("1.%s 2.%s", Arrays.asList("SR", "SB")));
    }
}