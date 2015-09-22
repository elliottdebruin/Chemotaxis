 Predator [] colony;
 Prey [] cluster;
int sum = 0;
 int bNum = 20;
 int cNum = 10000;
	
 int p = 10;

 void setup()   
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

 void mousePressed() {
 	if(p<9990){
		p = p + 10;
	}
 }


 void draw()   
 {   
 	background(0); 

 	for(int i = 0; i<colony.length; i++){
		colony[i].walk();
		colony[i].show();
	}
for(int j = 0; j < p; j++ ){
	cluster[j].run();
	cluster[j].show();
}



	

 }  


 class Prey {     
 	int bX, bY;
	boolean alive;
 	Prey(){

 		bX = (int)(Math.random()*200+150);
 		bY = (int)(Math.random()*200+150);
 		alive = true;
 	}

 	void run(){


 		//blob bacteria

 			bX = bX + (int)(Math.random()*5)-2;
 		
 		
 		
 			bY = bY + (int)(Math.random()*5)-2;
 		
 		
 	}

 	void show(){
 		noStroke();

 		

 		if(alive == true){
 		fill((int)(Math.random()*255),153,(int)(Math.random()*255));
 		ellipse(bX, bY, 4, 4);
}
 		if(get(bX+2, bY+2) == color(0,204,104)){
alive = false;
}
 	}


 }    

 class Predator {     
 	int eX, eY;

 	Predator(){
 		eX = 100;
 		eY = 100;


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


 		
 	}

 	void show(){
 		noStroke();

 		fill(0,204,104);
 		ellipse(eX, eY, 8, 8);

 	}


 }    