package exercise2;

//Create an abstract class called GameTester.
public abstract class GameTester {
    String testerName;// a name for the game tester and
    boolean isFullTime;// a boolean value representing the status (full-time is True, part-time is False).

    //Include an abstract method to determine the salary
    protected abstract void salary(int numOfHours);
}
