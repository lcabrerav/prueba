package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeObject {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpName("John David");
        emp1.setEmpAddress("31-10 37 ave");
        emp1.setEmpDOB("10-09-1990");
        emp1.setEmpID(500);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/peoplentech/eclipse-workspace-July2018" +
                    "/project12/data/test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(emp1);
            System.out.println("Employee Object is Serialized");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
