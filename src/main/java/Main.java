import ru.netology.services.CalculationService;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        CalculationService service = new CalculationService();
        System.out.println(service.calculate(10000, 3000, 20000));

    }
}
