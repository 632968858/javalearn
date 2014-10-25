import java.io.*;
import java.util.Properties;
public class WriteReaderTest {
	public static void main(String [] args)
	{
//		InputStreamReader isr =new InputStreamReader(System.in);
//		BufferedReader bfr =new BufferedReader(isr);
//		
//		try {
//			String str;
//			while((str=bfr.readLine())!=null)
//			System.out.println(str);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			bfr.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
		Properties pps = System.getProperties();
		pps.list(System.out);
		pps.put("file.encoding","ISO-8859-1");
		int data;
		byte [] buf =new byte [100];
		int i = 0;
		try {
			while((data=System.in.read())!='q')
			{
				buf[i]=(byte)data;
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str =new String(buf,0,i);
		System.out.println(str);
		
		try {
			String strGBK = new String(str.getBytes("ISO-8859-1"),"GBK");
			System.out.println(strGBK);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
}
