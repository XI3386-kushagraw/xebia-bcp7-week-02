import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {  
            br.readLine();  
       } finally {  
            System.out.println("All Resources Closed.");  
       }  
		
	}

}
