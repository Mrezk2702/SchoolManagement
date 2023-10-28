import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentDataHandler {

    private List<Student> studentList = new ArrayList<Student>();


    private String header;

    public StudentDataHandler(String filePath) throws IOException {

        FileReader file = new FileReader(filePath);
        BufferedReader CSV = new BufferedReader(file);
        //reading header line
        header = CSV.readLine();
        String line;
        String[] separated;
        System.out.println("Start processing ...");
        while ((line = CSV.readLine()) != null) {
            separated = line.split(",");
            //Initializing student to add it to the student list
            studentList.add(new Student(separated[0], separated[1], Integer.parseInt(separated[2]),
                    Integer.parseInt(separated[3]), Integer.parseInt(separated[4]),
                    Integer.parseInt(separated[2]), Integer.parseInt(separated[5])));
        }
        System.out.println("END processing");
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void getHeader() {

        String[] Header = header.split(",");
        System.out.println(Header[0] + "\t"
                + Header[1] + "\t" + Header[2] + "\t" + Header[3] +
                "\t" + Header[4] + "\t" + Header[5] + "\t" + Header[6] + "\t"+"Total %");
    }



}
