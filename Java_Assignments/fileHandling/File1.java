package FileHandling;
import java.io.File;
import java.io.IOException;
import java .io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;


public class File1 {
	
	
	//Only create File object representing data.txt	
	public static void main7(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("data.txt");
		System.out.println(file.exists());
	}
	
	
	
	//Creating a File
	public static void main1(String[] args) throws IOException {
		File file=new File("data.txt");
		if(file.createNewFile()) {
			System.out.println(file.exists());
		}else {
			System.out.println("File already exists");
		}
	}
	
	//Writing into a file
    public static void main2(String[] args) throws IOException {
    	FileWriter fw = new FileWriter("data.txt");
        fw.write("Hello Poonam");
        fw.close();
    }
    
    //Reading from file
    public static void main3(String[] args) throws IOException {
        FileReader fr = new FileReader("data.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
   
    // Read line by line
    public static void main4(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("data.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
    
    //Append data to a file
    public static void main5(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data.txt", true);
        fw.write("\nPoonam");
        fw.close();
    }
    
    //Delete a file
    public static void main6(String[] args) {
        File file = new File("dataa.txt");
        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not found");
        }
    }
    
    
    
    
}
