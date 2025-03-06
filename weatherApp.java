import java.io.*;
import java.util.Random;

public class weatherApp {
    public static void main(String[] args) {
        try {
            String[] weatherConditions = {"☀️ Sunny", "☁️ Cloudy", "🌧️ Rainy", "⛈️ Stormy", "❄️ Snowy"};
            Random rand = new Random();
            
            String weatherDesc = weatherConditions[rand.nextInt(weatherConditions.length)];
            double temp = rand.nextInt(35) + 5; // Generates a temperature between 5°C to 40°C
            
            System.out.println("Weather: " + weatherDesc + " | " + temp + "°C");
            
            FileWriter fileWriter = new FileWriter("weather_data.txt");
            fileWriter.write(weatherDesc + " | " + temp + "°C\n");
            fileWriter.close();
            
            System.out.println("Weather data saved to weather_data.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}