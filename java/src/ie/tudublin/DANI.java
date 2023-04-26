package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void loadFile()
	{
		//load a file called small.txt
		sonnet = loadStrings("small.txt");
	}

	/* public void printSonnet()
	{
		//print out the contents of the sonnet array
		for(String line: sonnet)
		{
			System.out.println(line);
		}
	}
	*/
	
}




