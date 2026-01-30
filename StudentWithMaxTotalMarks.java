import java.util.ArrayList;
import java.util.Scanner;

public class StudentWithMaxTotalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        
        // Read input until no more lines
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.isEmpty()) break;
            students.add(line);
        }
        
        String topStudent = "";
        int maxTotal = -1;
        
        for(String s : students) {
            String[] parts = s.split("#");
            String name = parts[0];
            int total = Integer.parseInt(parts[1]) 
                      + Integer.parseInt(parts[2]) 
                      + Integer.parseInt(parts[3]);
            
            if(total > maxTotal) {
                maxTotal = total;
                topStudent = name;
            }
        }
        
        System.out.println(topStudent);
        sc.close();
    }
    
}
