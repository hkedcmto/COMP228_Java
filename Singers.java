/*
    COMP 228: Java Programming
    LAB #1 – Java Class
    Name:   Cheuk Man Edmond To
    S/N:    301378748
    Date:   Sep 15, 2024
*/
import java.util.Date;

public class Singers {
    //5 instance variables that would store the following singer data
    private int singerId;
    private String singerName;
    private String singerAddress;
    private Date dateOfBirth;
    private int numOfAlbumsPublished;

    //Constructor with no argument
    public Singers() {
        this.singerId = 0;
        this.singerName = "Not provided";
        this.singerAddress = "Not provided";
        this.dateOfBirth = new Date();//set to current date
        this.numOfAlbumsPublished = 0;
    }

    //Constructor with 1 argument
    public Singers(int singerId) {
        this(); //loop the upper level constructor
        this.singerId = singerId; //replace the singerId set in upper level constructor
    }

    //Constructor with 2 argument
    public Singers(int singerId, String singerName) {
        this(singerId); //loop the upper level constructor
        this.singerName = singerName;
    }

    //Constructor with 3 argument
    public Singers(int singerId, String singerName, String singerAddress) {
        this(singerId, singerName); //loop the upper level constructor
        this.singerAddress = singerAddress;
    }

    //Constructor with 4 argument
    public Singers(int singerId, String singerName, String singerAddress, Date dateOfBirth) {
        this(singerId, singerName, singerAddress); //loop the upper level constructor
        this.dateOfBirth = dateOfBirth;
    }

    //Constructor with 5 argument
    public Singers(int singerId, String singerName, String singerAddress, Date dateOfBirth, int numOfAlbumsPublished) {
        this(singerId, singerName, singerAddress, dateOfBirth); //loop the upper level constructor
        this.numOfAlbumsPublished = numOfAlbumsPublished;
    }

    // Create Setters for all the instance variables of class Singer
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumberOfAlbumsPublished(int numberOfAlbumsPublished) {
        this.numOfAlbumsPublished = numberOfAlbumsPublished;
    }

    //Also create one setter that would allow you to set all the values of the instance variables at once
    public void setAllValues(int singerId, String singerName, String singerAddress, Date dateOfBirth, int numOfAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numOfAlbumsPublished = numOfAlbumsPublished;
    }

    // Create getters for all the instance variables of class Singer
    public int getSingerId() {
        return singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfAlbumsPublished() {
        return numOfAlbumsPublished;
    }

}

