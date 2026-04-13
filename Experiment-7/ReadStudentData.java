import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadStudentData {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(
                    new FileInputStream("student.dat"));

            String name = dis.readUTF();
            int age = dis.readInt();
            float weight = dis.readFloat();
            float height = dis.readFloat();
            String city = dis.readUTF();
            String phone = dis.readUTF();

            dis.close();

            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight);
            System.out.println("Height: " + height);
            System.out.println("City: " + city);
            System.out.println("Phone: " + phone);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}