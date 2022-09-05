import java.util.Calendar;
import java.util.Date;

public class Person
{
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String idNum, String firstName, String lastName, String title, int YOB)
    {
        this.ID = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName()
    {
        return firstName + " " + lastName;
    }

    public String formalName()
    {
        return title + " " + fullName();
    }

    public int getAge()
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return (year - YOB);
    }

    public int getAge(int year)
    {
        return (year - YOB);
    }

    public String toCSVDataRecord() {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDNum='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }


}
