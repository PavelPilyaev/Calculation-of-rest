package ru.netology.services;

public class CalculationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int score = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (score >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                score = (score - expenses) / 3;
            } else {
                score = score + income - expenses;
            }
        }
        return count;
    }

}
