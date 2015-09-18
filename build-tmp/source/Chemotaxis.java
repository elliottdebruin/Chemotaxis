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

 Predator [] colony;
 Prey [] cluster;

 int bNum = 50;
 int cNum = 1000;

 int p = 10;

 public void setup()   
 {     
	size(512, 512); 
// Predator array
	colony = new Predator[bNum];
	for(int i = 0; i < colony.length; i++){
		colony[i] = new Predator();
	}

// Prey array
	cluster = new Prey[cNum];
	for(int j = 0; j < cluster.length; j++){
		cluster[j] = new Prey();
	}
	
 }

 public void mousePressed() {
 	if(p<990){
		p = p + 10;
	}
 }


 public void draw()   
 {   
 	background(0); 


for(int j = 0; j < p; j++ ){
	cluster[j].run();
	cluster[j].show();
}


 	for(int i = 0; i<colony.length; i++){
		colony[i].walk();
		colony[i].show();
}

	

 }  


 class Prey {     
 	int bX, bY;
 	Prey(){

 		bX = 350;
 		bY = 200;

 	}

 	public void run(){


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

 		


 		fill((int)(Math.random()*255),153,(int)(Math.random()*255));
 		ellipse(bX, bY, 2, 2);

 		if(get(bX + 3, bY + 3) != color(0,0,0) || get(bX + 3, bY - 3) != color(0,0,0) || get(bX - 3, bY + 3) != color(0,0,0) || get(bX - 3, bY - 3) != color(0,0,0)){
	bX = 1000000;
	bY = 1000000;
}
 	}


 }    

 class Predator {     
 	int eX, eY;
 	Predator(){
 		eX = 100;
 		eY = 100;


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


 		
 	}

 	public void show(){
 		noStroke();

 		fill((int)(Math.random()*255),153,(int)(Math.random()*255));
 		ellipse(eX, eY, 5, 5);

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
