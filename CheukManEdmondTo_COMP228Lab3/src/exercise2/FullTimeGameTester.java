package exercise2;

public class FullTimeGameTester extends GameTester {

    @Override
    protected void salary(int numOfHours) {
        System.out.printf("As a Full Time Game Tester, your salary is $%d", 3000);
    }
}
