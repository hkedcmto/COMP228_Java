package exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

//main class that create an array of 3 mortgages
public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mortgage[] mortgages = new Mortgage[3];//
        double primeRate;
        int mortgageType;
        String customerName;
        int amountOfMortgage;
        int term;

        //Prompt the user for the current interest rate
        while(true) {
            System.out.print("Enter prime rate: ");
            try {
                primeRate = scanner.nextDouble();
                if(primeRate <= 0) {
                    System.out.println("Prime rate must larger than 0.");
                    scanner.next();
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid prime rate");
                scanner.next();
            }
        }

        //a loop prompts the user for a mortgage type and all relevant information for that mortgage
        for(int i=0; i<3; i++){
            //prompt user for mortgage type
            while(true){
                try{
                    System.out.print("Enter mortgage#"+i+" type (0 for Business, 1 for Personal: ");
                    mortgageType = scanner.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Mortgage#"+i+" type invalid");
                    scanner.next();
                }
            }

            //Customer Name
            System.out.print("Mortgage#"+i+" - Enter your name: ");
            customerName = scanner.next();

            //Amount
            while(true){
                try {
                    System.out.print("Mortgage#" + i + " - Enter your amount: ");
                    amountOfMortgage = scanner.nextInt();
                    if(amountOfMortgage <= 0) {
                        System.out.println("Amount must larger than 0.");
                        scanner.next();
                        continue;
                    }
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Mortgage#"+i+" amount incorrect");
                    scanner.next();
                }
            }

            //term
            while(true){
                try {
                    System.out.print("Mortgage#" + i + " - Enter your term: ");
                    term = scanner.nextInt();
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Mortgage#"+i+" term must be integer");
                    scanner.next();
                }
            }

            //Store the created Mortgage object
            if (mortgageType == 0){
                mortgages[i] = new BusinessMortgage(customerName,amountOfMortgage,term,primeRate);
            }else{
                mortgages[i] = new PersonalMortgage(customerName,amountOfMortgage,term,primeRate);
            }
        }

        System.out.println("\nMortgages details as below:");
        //When data entry is complete, display all mortgages.
        for(Mortgage mortgage: mortgages){
            mortgage.getMortgageInfo();
        }

    }
}
