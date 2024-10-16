import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = null;

        Insurance[] insurances = new Insurance[3];
        Insurance insurance = null;
        double cost=0;
        String type;

        for(int i=0;i<insurances.length;i++){
            scanner = new Scanner(System.in);
            System.out.println("Input insurance type: (Health or Life");
            type = scanner.nextLine();
            System.out.println("Input insurance cost:");
            cost = scanner.nextDouble();
            if(type.equals("Health")){
                insurance = new Health(type,cost);
            }else if (type.equals("Life")) {
                insurance = new Life(type,cost);
            }else{
                System.out.println("Invalid insurance type, try again");
                i--;
                continue;
            }
            insurance.setInsuranceCost(cost);
            insurances[i] = insurance;
            System.out.printf("Insurance %d inserted successfully.", i);

        }



    }
}