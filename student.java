import java.lang.*;

class studentDetails {
    public int rollNo;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;

    }

    public double average() {
        return (float) total() / 3;
    }

    public String details() {
        return "Roll no" + rollNo + "\nName" + name + "\nCourse" + course;
    }

}

public class student {
    public static void main(String[] args) {
        studentDetails s = new studentDetails();
        s.name = "mukesh";
        s.rollNo = 229661;
        s.course = "BSc it";
        s.m1 = 87;
        s.m2 = 85;
        s.m3 = 74;
        System.out.println("Total Marks:" + s.total());
        System.out.println("Average:" + s.average());
        System.out.println("Details;" + s.details());

    }

}