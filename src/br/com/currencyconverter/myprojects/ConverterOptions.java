package br.com.currencyconverter.myprojects;
import java.io.IOException;
import java.util.Scanner;
import br.com.currencyconverter.myprojects.MyConverter;


public class ConverterOptions  {
    private Scanner myScanner;
    private int myOptions;
    private String repeatChoice;
    private ConverterOptions myAPICaller;
    private String moneyToConvert;
    private String moneyConversor;
    private double myValue;


    public ConverterOptions() {


        myScanner = new Scanner(System.in);
    }

    public void getConversion() throws IOException, InterruptedException {
        //repeatChoice different than "N"
        if(this.moneyToConvert.isEmpty() && this.moneyConversor.isEmpty()){
            System.out.println("Por favor, faça sua escolha!");
        }else {
            System.out.println("Efetuando o processo.... \n \n");
            new MyConverter(this.moneyToConvert, this.moneyConversor, this.myValue);
        }
    }

    public void chooseOption() throws IOException, InterruptedException {


        System.out.println("Aqui você pode estar encontrando as opções de conversão disponíveis em minha aplicação: \n");
        System.out.println("1) Dólar =>> Peso Argentino \n");
        System.out.println("2) Peso argentino =>> Dólar \n");
        System.out.println("3) Dólar =>> Real brasileiro \n");
        System.out.println("4) Real Brasileiro =>> Dólar \n");
        System.out.println("5) Dólar =>> Peso colombiano \n");
        System.out.println("6) Peso colombiano =>> Dólar \n");
        System.out.println("7) Sair \n");

        System.out.println("Por favor, escolha a opção que deseja \n");
        myOptions = myScanner.nextInt();
        switch (myOptions) {
            case 1:
                // MyConverter function to convert things Pass two arguments containing the comparing and comparator.
                System.out.println("Por favor, qual seria o valor que você deseja comparar?");
                this.myValue = myScanner.nextInt();
                this.moneyToConvert = "USD";
                this.moneyConversor = "ARS";
                getConversion();
                break;
            case 2:
                System.out.println("Por favor, qual seria o valor que você deseja comparar?");
                this.myValue = myScanner.nextInt();
                this.moneyToConvert = "ARS";
                this.moneyConversor = "USD";
                getConversion();
                break;
            case 3:
                System.out.println("Por favor, qual seria o valor que você deseja comparar?");
                this.myValue = myScanner.nextInt();
                this.moneyToConvert = "USD";
                this.moneyConversor = "BRL";
                getConversion();
                break;
            case 4:
                System.out.println("Por favor, qual seria o valor que você deseja comparar?");
                this.myValue = myScanner.nextInt();
                this.moneyToConvert = "BRL";
                this.moneyConversor = "USD";
                getConversion();
                break;
            case 5:
                System.out.println("Por favor, qual seria o valor que você deseja comparar?");
                this.myValue = myScanner.nextInt();
                this.moneyToConvert = "USD";
                this.moneyConversor = "COP";
                getConversion();

                break;
            case 6:
                System.out.println("Por favor, qual seria o valor que você deseja comparar?");
                this.myValue = myScanner.nextInt();
                this.moneyToConvert = "COP";
                this.moneyConversor = "USD";
                getConversion();
                break;
            case 7:
                System.out.println("\nObrigado pela preferência. ");
                repeatChoice = "Exit";
                break;
            default:
                System.out.println("Ah, que pena o valor digitado não existe. Tente outro. Obrigado\n");
                break;

        }

    }

}
