 Bacteria bob;
 Bacteria joe;
 Bacteria sue;
 void setup()   
 {     
	size(512, 512); 

	bob = new Bacteria();
	joe = new Bacteria();
	sue = new Bacteria();
 }


 void draw()   
 {   
 	background(0); 
 	bob.walk();
 	bob.show();
 	joe.walk();
 	joe.show();
 	sue.walk();
 	sue.show();
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
 		ellipse(myX, myY, 10, 10);
 	}


 }    