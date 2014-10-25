class Computer
{
	
	public static void main(String[] args)
	{
		Dmeng dm = new Dmeng();
		Mainboard mb= new Mainboard();
		mb.setCpu("interl");
		mb.setVideoCard(dm);
		mb.run();
	}	
	
}