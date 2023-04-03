package edu.colorado.simulations;
public class ThinkingCap{
	private String  greenWords;
	private String redWords;
	
	public void slots(String newGreen, String newRed){
		greenWords = newGreen;
		redWords = newRed;
	}
	
	public void pushGreen(){
		System.out.println(greenWords);
	}
	
	public void pushRed(){
		System.out.println(redWords);
	}
}