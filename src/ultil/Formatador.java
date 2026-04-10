package ultil;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Formatador {
    public static final DateTimeFormatter DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DecimalFormat VALOR = new DecimalFormat("#,##0.00");
}
