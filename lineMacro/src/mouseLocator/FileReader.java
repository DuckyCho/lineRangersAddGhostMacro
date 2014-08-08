package mouseLocator;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileReader {
	
	private static String fileName = "id";
	private static InputStream stream1;
	private static InputStreamReader isr;
	private static BufferedReader br;
	private static FileReader f1 = new FileReader();
	private static int idCount= 0;
	
	
	
	private FileReader(){
		
			stream1 = getClass().getResourceAsStream(fileName);
			isr = new InputStreamReader(stream1);
			br = new BufferedReader(isr);
	}
	
	public static FileReader getInstance(){
		return f1;
	}
	
	public int howManyId (){
		return idCount;
	}
	
	public ArrayList<String> getLine(int lineNum){
		ArrayList<String> idList = new ArrayList<String>();
		String line;
		
		if(lineNum < 0){
					
				try {
					while( (line = br.readLine()) != null ){
							idList.add(line);
						}
				} catch (IOException e) {
					e.printStackTrace();
				}
				return idList;
		}
		
		
		else{
			for(int i = 0 ; i < lineNum;i++){
				try {
					line = br.readLine();
					idList.add(line);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		return idList;		
		}
			
	}

}
