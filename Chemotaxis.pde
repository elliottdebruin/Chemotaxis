 Bacteria [] colony;
 void setup()   
 {     
	size(512, 512); 

	colony = new Bacteria[10];
	for(int i = 0; i < colony.length; i++){
		colony[i] = new Bacteria();
	}
 }


 void draw()   
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

 	void walk(){
 		myX = myX + (int)(Math.random()*3)-1;
 		myY = myY + (int)(Math.random()*3)-1;
 	}

 	void show(){
 		fill(255,0,0);
 		ellipse(myX, myY, (int)(Math.random()*10+3), (int)(Math.random()*10+3));
 	}


 }    