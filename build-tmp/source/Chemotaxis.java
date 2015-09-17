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
 int bNum = 400;

 public void setup()   
 {     
	size(512, 512); 

	colony = new Bacteria[bNum];
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
 	int eX, eY, bX, bY;
 	Bacteria(){
 		eX = (int)(Math.random()*512);
 		eY = (int)(Math.random()*512);
 		bX = (int)(Math.random()*512);
 		bY = (int)(Math.random()*512);

 	}

 	public void walk(){

 		//ellipse bacteria

 		if(mouseX<eX){
 			eX = eX + (int)(Math.random()*5)-3;
 		} else{
 			eX = eX + (int)(Math.random()*5)-1;
 		}
 		
 		if(mouseY<eY){
 			eY = eY + (int)(Math.random()*5)-3;
 		} else{
 			eY = eY + (int)(Math.random()*5)-1;
 		}

 		//blob bacteria

 		if(mouseX<bX){
 			bX = bX + (int)(Math.random()*4)-2;
 		} else{
 			bX = bX + (int)(Math.random()*4)-1;
 		}
 		
 		if(mouseY<bY){
 			bY = bY + (int)(Math.random()*4)-2;
 		} else{
 			bY = bY + (int)(Math.random()*4)-1;
 		}
 		
 	}

 	public void show(){
 		noStroke();
 		fill(0,153,153, 125);
 		ellipse(eX, eY, 10, 10);
 		fill((int)(Math.random()*255),153,(int)(Math.random()*255));
 		ellipse(eX, eY, 5, 5);
 		
 		stroke(102,204,0);
 		fill(76,153,0, 125);
 		ellipse(bX, bY, 5, 5);
 		fill((int)(Math.random()*255),153,(int)(Math.random()*255));
 		ellipse(bX, bY, 2, 2);
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
