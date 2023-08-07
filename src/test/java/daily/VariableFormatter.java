package daily;

import java.util.List;

public class VariableFormatter {

    public String format(String template, List<String> arguments) {
        return String.format(template, arguments.toArray(new Object[0]));
    }
}
