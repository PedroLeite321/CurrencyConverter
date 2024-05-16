package br.com.currencyconverter.myprojects;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyConverter {
    //What i want to get: https://v6.exchangerate-api.com/v6/00560ad58c4a04a11d7f3b7f/pair/USD/BRL/1
    //conversor * myConversionRate = converter;
    private String targetCurrency; //Change this to target
    private String baseCurrency; //change this to base
    private String myApiKey = "00560ad58c4a04a11d7f3b7f";
    private double exchangeRate;
    private double amountMoney;
    private double multiplier = 100;
    private String myPath;


    public MyConverter(String toConvert, String myConversor, double myValue) throws IOException, InterruptedException {
        this.targetCurrency = toConvert.toUpperCase();
        this.baseCurrency = myConversor.toUpperCase();
        System.out.println(this.targetCurrency);
        System.out.println(this.baseCurrency);
        this.amountMoney = myValue;

        this.myPath = "https://v6.exchangerate-api.com/v6/" + myApiKey + "/pair/" + baseCurrency + "/" + targetCurrency + "/" + amountMoney;
        System.out.println("Este é o valor da conversão.");
        System.out.println(apiCall());

    }



    public double apiCall() throws IOException, InterruptedException {
        // website to call the api
        HttpClient myClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(myPath)).build();
        HttpResponse<String> response = myClient.send(request, HttpResponse.BodyHandlers.ofString());
        String myResponse = response.body();

        JsonObject jsonResponse = JsonParser.parseString(myResponse).getAsJsonObject();
        double myConversion = jsonResponse.get("conversion_rate").getAsDouble();


        return myConversion;
    }

    public double getConversionResult() throws IOException, InterruptedException {
        return apiCall();
    }

}
