package exercise2;

public class PartTimeGameTester extends GameTester {

    @Override
    protected void salary(int numOfHours) {
        System.out.printf("As a Part Time Game Tester, your salary is $%d", numOfHours * 20);
    }
}
