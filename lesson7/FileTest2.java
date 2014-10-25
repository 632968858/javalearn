import java.io.*;
public class FileTest2 {
	public static void main(String[] args) throws Exception
	{
		/*File f=new File("1.txt");
		f.createNewFile();*/
		/*File f1=new File(File.separator);
		String f2="2.txt";
		File f3 =new File(f1,f2);
		f3.createNewFile();
		f3.deleteOnExit();
		Thread.sleep(3000);
		*/
		File f1=new File(File.separator);
		String f2="Users"+File.separator+"xiaoyu"+File.separator+"Desktop"+File.separator+"javacode";
		File f3=new File(f1,f2);
		//f3.createNewFile();
		//f3.deleteOnExit();
		String [] s=f3.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{
				return name.indexOf(".java")!=-1;
			}
		}
		);
		for(int i =0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
