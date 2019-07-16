package telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String>  numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new ArrayList<>();
        this.urls = new ArrayList<>();

        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        if (!urls.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            for (String url : this.urls) {
                if (url.matches(".*\\d.*")) {
                    builder.append("Invalid URL!")
                    .append(System.lineSeparator());
                } else {
                    builder.append("Browsing: ")
                            .append(url)
                            .append("!")
                            .append(System.lineSeparator());
                }
            }
            return builder.toString().trim();
        }
        return null;
    }

    @Override
    public String call() {
        if (!this.numbers.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            for (String number : this.numbers) {
                if (!number.matches("^[\\d]+")) {
                    builder.append("Invalid number!")
                    .append(System.lineSeparator());
                } else {
                    builder.append("Calling... ")
                            .append(number)
                            .append(System.lineSeparator());
                }
            }
            return builder.toString().trim();
        }
        return null;
    }
}
