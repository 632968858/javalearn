class Dmeng implements VideoCard
{
	String videoname;
	public void display()
	{
		System.out.println("Dmeng is videodisplay");
	}
	public  Dmeng()  //注意构造函数是没有类型的
	{
		videoname="Dmeng";
	}
	public  void setname(String videoname)
	{
		this.videoname=videoname;
	}
	public String getname()
	{
		//System.out.println(videoname);
		return videoname;
		
	}
	
}