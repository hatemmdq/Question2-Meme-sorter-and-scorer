import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class SortByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONParser parser = new JSONParser();
		 
		try {
	 
			Object obj = parser.parse(new FileReader("c:\\JavaPath\\memes.json"));
	 
			JSONObject jsonObject = (JSONObject) obj;
	 
			// loop array
			JSONArray names = (JSONArray) jsonObject.get("names");
			Collections.sort(names);
			
			Iterator<String> iterator = names.iterator();
			
			
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		

		
		
		
		
		
	}

}
