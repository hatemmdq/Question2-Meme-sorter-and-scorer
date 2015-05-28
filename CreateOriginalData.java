import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class CreateOrignalData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject obj = new JSONObject();

	
		JSONArray listNames = new JSONArray();
		listNames.add("Napoleon Hill");
		listNames.add("Albert Einstein");
		listNames.add("Robert Frost");
		listNames.add("Florence Nightingale");
		listNames.add("Wayne Gretzky");
		listNames.add("Amelia Earhart");
		listNames.add("Babe Ruth");
		listNames.add("W. Clement Stone");
		listNames.add("Kevin Kruse");
		listNames.add("John Lennon");
		
		//Collections.sort(listNames);
	
	 
		JSONArray listMemes = new JSONArray();
		
		listMemes.add("Whatever the mind of man can conceive and believe it can achieve.");
		listMemes.add("Strive not to be a success but rather to be of value.");
		listMemes.add("Two roads diverged in a wood and I—I took the one less traveled by, And that has made all the difference.");
		listMemes.add("I attribute my success to this I never gave or took any excuse.");
		listMemes.add("You miss 100% of the shots you dont take.");
		listMemes.add("The most difficult thing is the decision to act the rest is merely tenacity.");
		listMemes.add("Every strike brings me closer to the next home run");
		listMemes.add("Definiteness of purpose is the starting point of all achievement");
		listMemes.add("Life isnt about getting and having, it's about giving and being.");
		listMemes.add("Life is what happens to you while you're busy making other plans.");
		

		//JSONArray listScores = new JSONArray();
		

		
		
		obj.put("names", listNames);
		obj.put("memes", listMemes);
		
		
		
	 
		try {
	 
			FileWriter file = new FileWriter("c:\\JavaPath\\memes.json");
			file.write(obj.toJSONString());
		    file.flush();
			file.close();
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
		System.out.print(obj);
		
		
	}

}
