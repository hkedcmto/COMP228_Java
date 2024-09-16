import java.util.Date;

// Create the driver class
public class SingerDriver {

    public static void main(String[] args) {
        //create 1 Singer (singer1) object
        Singers singer1 = new Singers();

        // Display the default values of the instance variables of this object singer1.
        System.out.println("** Default values **");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumberOfAlbumsPublished());

        //	Set the values of each instance variables with the help of setters.
        singer1.setSingerId(1);
        singer1.setSingerName("Cheuk");
        singer1.setSingerAddress("941 Progress Ave");
        singer1.setDateOfBirth(new Date(2000, 4, 1));
        singer1.setNumberOfAlbumsPublished(70);

        //Display the values.
        System.out.println("\n** Set values with setters **");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumberOfAlbumsPublished());
    }

}
