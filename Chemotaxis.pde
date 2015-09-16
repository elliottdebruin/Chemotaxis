 Bacteria [] colony;
 int bNum = 400;

 void setup()   
 {     
	size(512, 512); 

	colony = new Bacteria[bNum];
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
 	int eX, eY, bX, bY;
 	Bacteria(){
 		eX = (int)(Math.random()*512);
 		eY = (int)(Math.random()*512);
 		bX = (int)(Math.random()*512);
 		bY = (int)(Math.random()*512);

 	}

 	void walk(){

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

 	void show(){
 		noStroke();
 		fill(0,153,153);
 		ellipse(eX, eY, (int)(Math.random()*10+3), (int)(Math.random()*10+3));
 		stroke(102,204,0);
 		fill(76,153,0);
 		ellipse(bX, bY, 10, 5);
 		ellipse(bX, bY+3, 5, 5);
 	}


 }    