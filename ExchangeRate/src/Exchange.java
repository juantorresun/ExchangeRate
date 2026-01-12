import com.google.gson.*;
import java.net.*;
import java.io.*;

public class Exchange {

    public double getExchangeRate(String fromCurrency, String toCurrency) {
        try {
            String baseUrl = "https://v6.exchangerate-api.com/v6/82952ce06653cf3120492d71/latest/";
            String requestUrl = baseUrl + fromCurrency;

            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStreamReader reader =
                    new InputStreamReader((InputStream) connection.getContent());

            JsonElement root = JsonParser.parseReader(reader);
            JsonObject jsonObject = root.getAsJsonObject();

            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            return conversionRates.get(toCurrency).getAsDouble();

        } catch (Exception e) {
            System.out.println("Error getting exchange rate: " + e.getMessage());
            return -1;
        }
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);

        if (exchangeRate < 0) {
            throw new RuntimeException("Exchange rate not available");
        }

        return amount * exchangeRate;
    }
}
