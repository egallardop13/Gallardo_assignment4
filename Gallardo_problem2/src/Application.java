import java.io.IOException;


	public class Application {

		public static void main(String[] args) throws IOException
		{
			
			DuplicateCounter app=new DuplicateCounter();
			
			app.count("problem2.txt");
			app.write("unique_word_counts.txt");
}
  
}