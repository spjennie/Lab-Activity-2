package spotify;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Spotify {
	
	public static void main(String[] args)
	{
		String csvFile = "spotify.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine(); //reads next two lines
            line = br.readLine();
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] spotify = line.split(csvSplitBy);

                System.out.println("Track name: " + spotify[1] + ", Artist: " + spotify[2]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}

}
