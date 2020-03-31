import java.io.*;
import java.util.*;


	public class DuplicateCounter {

		private Map<String,Integer> wordCounter;

		
		public void count(String dataFile) throws FileNotFoundException{
			String words;
			wordCounter = new HashMap<String,Integer>();

			Scanner sc=new Scanner(new File(dataFile));

			while(sc.hasNext())
			{
				words=sc.next();
				
				if (wordCounter.containsKey(words)) {
					wordCounter.put(words, wordCounter.get(words) + 1);
				}
				else {
					wordCounter.put(words, 1);
				}
			}
			
			sc.close();
		}

		
		public void write(String outputFile) throws IOException
		{
			File f1;
			FileWriter fw = null;
			f1 = new File(outputFile);
			if(!f1.exists()) {
				f1.createNewFile();
			}
			fw=new FileWriter(f1);
			for (Map.Entry entry : wordCounter.entrySet()) {
				fw.write(entry.getKey() + " " + entry.getValue()+"\n");
			}

			fw.close();
			
			System.out.println("Completed");
		
		
		}

	
	}
	
	
	
	
	