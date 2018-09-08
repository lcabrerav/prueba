package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeObject {
    public static void main(String[] args) {
        Employee emp1 = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("/Users/peoplentech/eclipse-workspace-July2018/project12/data/test.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            emp1 = (Employee)objectInputStream.readObject();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Object is Deserializing");
        System.out.println("Emp Name: " + emp1.getEmpName());
        System.out.println("Emp Address: " + emp1.getEmpAddress());
        System.out.println("Emp DOB: " + emp1.getEmpDOB());
        System.out.println("Emp ID: " + emp1.getEmpID());
    }
}
