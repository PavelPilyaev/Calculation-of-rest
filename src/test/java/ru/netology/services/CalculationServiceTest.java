package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculationServiceTest {

    @ParameterizedTest
    //@CsvFileSource(files = "src/test/resources/rest.csv")
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void calculationRest(int count, int income, int expenses, int threshold) {
        CalculationService service = new CalculationService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(count, actual);


    }

}
