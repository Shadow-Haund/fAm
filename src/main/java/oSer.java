import java.io.*;
import java.util.ArrayList;

public class oSer {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        File file = new File("src/main/resources/s.txt");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Nigga", 3.5));
        students.add(new Student("NoNigga",3.7));
        // Ввод данных в файл
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(fos);
        for (Student s : students){
            output.writeObject(s);
        }
        output.close();
        fos.close();
        // Вывод данных из файла
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(fis);
        ArrayList<Student> students2 = new ArrayList<Student>();
        try{
            while (true){
                Student s = (Student)input.readObject();
                students2.add(s);
            }
        }
        catch (EOFException ignored){
        }
        for (Student s : students2){
            System.out.println(s);
        }

    }
}
