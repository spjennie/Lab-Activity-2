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
            line = br.readLine();
            line = br.readLine();
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(csvSplitBy);

                System.out.println("Track name: " + country[1] + ", Artist: " + country[2]);

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
