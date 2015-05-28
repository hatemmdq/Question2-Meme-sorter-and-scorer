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




public class AssociateScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONParser parser = new JSONParser();
		 
		JSONArray listScores = new JSONArray();
		listScores.add("10");
		listScores.add("8");
		listScores.add("6");
		listScores.add("4");
		listScores.add("2");
		listScores.add("3");
		listScores.add("9");
		listScores.add("7");
		listScores.add("1");
		listScores.add("5");
		
		
		try {
	 
			Object obj = parser.parse(new FileReader("c:\\JavaPath\\memes.json"));
			
			JSONObject obj1 = new JSONObject();
	 
			JSONObject jsonObject = (JSONObject) obj;
	 
			// loop array
			JSONArray names = (JSONArray) jsonObject.get("names");
			JSONArray memes = (JSONArray) jsonObject.get("memes");
			JSONArray scores = (JSONArray) jsonObject.get(listScores);
			
			Iterator<String> iterator = names.iterator();
			Iterator<String> iterator1 = memes.iterator();
			Iterator<String> iterator2 = listScores.iterator();
			
			
			
			while (iterator.hasNext()) 
			{
				System.out.println(iterator.next());
				System.out.println(iterator1.next());
				System.out.println(iterator2.next());
				FileWriter file = new FileWriter("c:\\JavaPath\\memes.json");
				obj1.put("names", names);
				obj1.put("memes", memes);
				obj1.put("scores", listScores);
				file.write(obj1.toJSONString());
			    file.flush();
				file.close();
				
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
