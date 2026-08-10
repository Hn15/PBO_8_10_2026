import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan suhu celcius: ");
        double suhuCelcius = input.nextDouble();

        Data suhu = new Data(suhuCelcius);
        double fahrenhait = suhu.HitungKonversi();

        System.out.println("Suhu Celcius: " + suhuCelcius + " Celcius");
        System.out.println("Suhu dalam Fahrenheit: " + fahrenhait + " Fahrenhait");

        input.close();
    }
}

class Data {
    private double celcius;

    public Data(double celcius) {
        this.celcius = celcius;
    }

    public double HitungKonversi() {
        return (celcius * 9 / 5) + 32;
    }
}
