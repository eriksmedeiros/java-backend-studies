import java.util.Scanner;

public class UserInterface {
    int choice;

    void menu() {
        System.out.println("Menu de Unidades:\n" +
                "1. Celsius\n" +
                "2. Fahrenheit\n" +
                "3. Kelvin\n" +
                "0. Sair\n");
    }

    void chooseMenu() {
        double value;
        Scanner input = new Scanner(System.in);

        do {
            menu();
            System.out.println("Escolha: ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Sainda do programa...");
                break;
            }

            System.out.println("Digite o valor que desejar converter: ");
            value = input.nextDouble();

            Temperature temp = new Temperature(choice, value);

            switch (choice) {
                case 1:
                    temp.celsiusToFahrenheit();
                    temp.celsiusToKelvin();
                    break;
                case 2:
                    temp.fahrenheitToCelsius();
                    temp.fahrenheitToKelvin();
                    break;
                case 3:
                    temp.kelvinToCelsius();
                    temp.kelvinToFahrenheit();
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        } while (choice != 0);
    }
}