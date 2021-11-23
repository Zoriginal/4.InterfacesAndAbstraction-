package A4InterfacesAndAbstraction.A2Exercises.A5Тelephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private final List<String> numbers;
    private final List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String url : urls) {
            if (url.matches("^[^0-9]+$")) {
                stringBuilder.append(String.format("Browsing: %s!", url)).append(System.lineSeparator());
            } else {
                stringBuilder.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String number : numbers) {
            if (number.matches("^[0-9]+$")) {
                stringBuilder.append(String.format("Calling... %s", number)).append(System.lineSeparator());

            } else {
                stringBuilder.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return stringBuilder.toString().trim();
    }
}
