import java.io.*;
public class StreamTest {

	public static void main(String [] args) throws Exception
	{
		/*int data;
		while((data=System.in.read())!=-1)
		{
			System.out.write(data);
		}*/
		FileOutputStream fos =new FileOutputStream("1.txt");
		//fos.write("ni mei de java".getBytes());
		BufferedOutputStream bos=new BufferedOutputStream(fos);
//		bos.write("holle buffered".getBytes());
//		bos.flush();
//		bos.close();
		DataOutputStream dos = new DataOutputStream(bos);
		int i=5;
		boolean b=true;
		char c= 'c';
		float f= (float) 1.2;
		dos.writeBoolean(b);
		dos.writeInt(i);
		dos.writeChar(c);
		dos.writeFloat(f);
		dos.close();
		
		FileInputStream fis=new FileInputStream("1.txt");
		/*byte [] b =new byte[100];
		int length =fis.read(b);
		System.out.println(new String(b,0,length));*/
		BufferedInputStream bis= new BufferedInputStream(fis);
		DataInputStream dis= new DataInputStream (bis);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		dis.close();
		
	}
}
