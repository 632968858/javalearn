class Mainboard
{
	VideoCard vc;
	String strCpu;
	public void setVideoCard(VideoCard vc)
	{
		this.vc=vc;	
		//vc.setname(mainboard);
	}
	public void setCpu(String strCpu)
	{
		this.strCpu=strCpu;	
		
	}
	public void run()
	{
		System.out.println(strCpu);
		System.out.println(vc.getname());	
		//vc.getname();
		vc.display();
		System.out.println("Mainboard is running");
	}	
	
}