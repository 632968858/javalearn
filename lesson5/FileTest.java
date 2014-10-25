import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileTest {

	public static void main(String[] args)
	{
		try {
			Scanner sc =new Scanner(Paths.get("C:\\Users\\xiaoyu\\Desktop\\filetest.txt"));
			String name=sc.nextLine();
			System.out.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
