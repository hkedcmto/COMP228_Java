public class SingerDriver {
    public static void main(String[] args) {
        //	Create the driver class that would create 1 Singer (singer1) object with the help of the no argument constructor
        Singers singer1 = new Singers();

        // Display the default values of the instance variables of this object singer1
        System.out.println("** Singer with default value **");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums: " + singer1.getNumOfAlbumsPublished());

        System.out.println();
        // •	Set the values of each instance variables with the help of setters
        singer1.setSingerId(29);
        singer1.setSingerName("Edmond");
        singer1.setSingerAddress("941 Progress Ave");
        singer1.setDateOfBirth(new Date(2024, 3, 4)); // Set a sample date
        singer1.setNumberOfAlbumsPublished(3);

        // Display the values
        System.out.println("** Singer with setters **");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums: " + singer1.getNumOfAlbumsPublished());
    }
}
