import java.io.*;

public class FlushExample{
	public static void main(String[] args){
		File file = new File("output.txt");
		
		try{
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			
			bufferedWriter.write("This is a sample text.");
			bufferedWriter.flush();
			bufferedWriter.write("This is another sample text.");
			bufferedWriter.close();
			
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line = bufferedReader.readLine();
			System.out.println(line);
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}