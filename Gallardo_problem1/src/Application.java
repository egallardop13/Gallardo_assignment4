import java.io.*;

public class Application {

   public static void main(String[] args) throws IOException {
      
	   
	   DuplicateRemover app=new DuplicateRemover();
       
	   app.remove("problem1.txt");
       app.Write("unique_words.txt");
      

   }

}
