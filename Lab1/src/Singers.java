import java.util.Date;

//Create a class named Singers
class Singers {
    // 5 instance variables that would store the following singer data
    private int singerId;
    private String singerName;
    private String singerAddress;
    private Date dateOfBirth;
    private int numOfAlbumsPublished;

    // Constructor with NO argument
    public Singers() {
        // Setting default values
        this.singerId = 0;
        this.singerName = "Not Provided";
        this.singerAddress = "Not Provided";
        this.dateOfBirth = new Date(); // set to current date as not provided
        this.numOfAlbumsPublished = 0;
    }

    // Constructor with 1 argument
    public Singers(int singerId) {
        this(); // loop back the upper level constructor
        this.singerId = singerId; // overwrite with given argument
    }

    // Constructor with 2 arguments
    public Singers(int singerId, String singerName) {
        this(singerId); // loop back the upper level constructor
        this.singerName = singerName; // overwrite with given argument
    }

    // Constructor with 3 arguments
    public Singers(int singerId, String singerName, String singerAddress) {
        this(singerId, singerName); // loop back the upper level constructor
        this.singerAddress = singerAddress; // overwrite with given argument
    }

    // Constructor with 4 arguments
    public Singers(int singerId, String singerName, String singerAddress, Date dateOfBirth) {
        this(singerId, singerName, singerAddress); // loop back the upper level constructor
        this.dateOfBirth = dateOfBirth; // overwrite with given argument
    }

    // Constructor with 5 arguments
    public Singers(int singerId, String singerName, String singerAddress, Date dateOfBirth, int numOfAlbumsPublished) {
        this(singerId, singerName, singerAddress, dateOfBirth); // loop back the upper level constructor
        this.numOfAlbumsPublished = numOfAlbumsPublished; // overwrite with given argument
    }

    // Create Setters for all the instance variables of class Singer.
    // Make sure to have several setters that would allow you to set the values of individual instance variables of the singer object
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

    public void setNumOfAlbumsPublished(int numOfAlbumsPublished) {
        this.numOfAlbumsPublished = numOfAlbumsPublished;
    }

    // Also create one setter that would allow you to set all the values of the instance variables at once
    public void setAllSingerDetails(int singerId, String singerName, String singerAddress, Date dateOfBirth, int numberOfAlbumsPublished) {
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

    public int getNumOfAlbumsPublished() {
        return numOfAlbumsPublished;
    }


}