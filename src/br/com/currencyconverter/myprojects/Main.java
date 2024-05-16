package br.com.currencyconverter.myprojects;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Welcome welcome = new Welcome();
        ConverterOptions converter = new ConverterOptions();
        welcome.Welcome();
        converter.chooseOption();


    }
}