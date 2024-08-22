import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Do you want extras with your tea (yes/no) ?");

        boolean teaExtras =  scanner.nextLine().trim().equalsIgnoreCase("yes");



        System.out.println("Do you want extras with your coffee (yes/no) ?");
        boolean coffeeExtras =  scanner.nextLine().trim().equalsIgnoreCase("yes");


        Beverage tea =  new Tea();
        tea.setWantsExtras(teaExtras);
        Beverage coffee =  new Coffee();
        coffee.setWantsExtras(coffeeExtras);
        System.out.println("Making tea...");
        tea.finalTemplateMethod();
        System.out.println("\n Making coffee...");
        coffee.finalTemplateMethod();
        scanner.close();
    }
}
