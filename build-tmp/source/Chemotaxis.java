import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 Bacteria [] colony;
 public void setup()   
 {     
	size(512, 512); 

	colony = new Bacteria[10];
	for(int i = 0; i < colony.length; i++){
		colony[i] = new Bacteria();
	}
 }


 public void draw()   
 {   
 	background(0); 
 	for(int i = 0; i<colony.length; i++){
		colony[i].walk();
		colony[i].show();
	}
 }  
 class Bacteria    
 {     
 	int myX, myY;
 	Bacteria(){
 		myX = 250;
 		myY = 250;
 	}

 	public void walk(){
 		myX = myX + (int)(Math.random()*3)-1;
 		myY = myY + (int)(Math.random()*3)-1;
 	}

 	public void show(){
 		fill(255,0,0);
 		ellipse(myX, myY, (int)(Math.random()*10+3), (int)(Math.random()*10+3));
 	}


 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
