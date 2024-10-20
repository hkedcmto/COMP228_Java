package exercise1;
/*
Name: Cheuk Man Edmond To
Student No.: 301378748
Course: COMP228-006
Description: Write a Java application that implements different types of insurance policies for employees of an organization.
 */

import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        Scanner scanner = null;
        Insurance[] insurances = new Insurance[3];
        Insurance insurance = null;
        double cost=0;
        String type;

        //This application should ask the user to enter the type of insurance and its monthly fee
        for(int i=0;i<insurances.length;i++){
            scanner = new Scanner(System.in);
            System.out.printf("Input insurance#%d type: (Health or Life): ",i);
            type = scanner.nextLine().toLowerCase();
            //Then, will create the appropriate object (Life or Health)
            if(type.equals("health")){
                insurance = new Health(type,cost);
            }else if (type.equals("life")) {
                insurance = new Life(type,cost);
            }else{
                System.out.println("Invalid insurance type, try again");
                i--;
                continue;
            }
            System.out.printf("Input insurance#%d cost: ",i);
            try{
                cost = scanner.nextDouble();
                insurance.setInsuranceCost(cost);
                insurances[i] = insurance;
                System.out.printf("Insurance #%d inserted successfully.\n", i);
            }catch (Exception e){
                System.out.println("Invalid insurance cost, try again");
                i--;
            }

        }

        //After all objects created, display the insurance information.
        for(int i=0;i<insurances.length;i++){
            System.out.printf("== Insurance #%d ==\n",i);
            insurances[i].displayInfo();
        }
    }
}
