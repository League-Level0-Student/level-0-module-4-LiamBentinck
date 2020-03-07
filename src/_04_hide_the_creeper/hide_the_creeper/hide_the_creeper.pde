int x5 = 360;
int y5 = 560;
int x4 = 210;
int y4 = 750;
int x3 = 300;
int y3 = 300;
int x2 = 45;
int y2 = 150;
int x = 100;
int y =  0;
PImage creeper;
PImage creeper2; 
PImage creeper3;
PImage creeper4;
PImage creeper5; 
PImage minecraft;
void setup() {
  size(800, 800);
 minecraft = loadImage("minecraft.png");     
minecraft.resize(width, height);               
creeper=loadImage("creeper.png");    
creeper.resize(10, 10);    
creeper2=loadImage("creeper2.png"); 
creeper2.resize(10, 10);
creeper3=loadImage("creeper3.jpg");
creeper3.resize(10, 10);   
creeper4=loadImage("creeper4.jpg");     
creeper4.resize(10, 10);    
creeper5=loadImage("creeper5.jpg");     
creeper5.resize(10, 10);
background(minecraft);

}

void draw() {
  background(minecraft);
  image(creeper5, 360, 560);
  image(creeper4, 210, 750);
  image(creeper3, 300, 300);
  image(creeper2, 45, 150);
  image(creeper, 100, 0);
if(mouseX > x5 && mouseX < x5+10 && mouseY > y5 && mouseY < y5+10 && mousePressed){
  fill(#FF0000);
  println("You found creeper number 5!");
}
if(mouseX > x4 && mouseX < x4+10 && mouseY > y4 && mouseY < y4+10 && mousePressed){
  fill(#FF0000);
  println("You found creeper number 4!");
}
if(mouseX > x3 && mouseX < x3+10 && mouseY > y3 && mouseY < y3+10 && mousePressed){
  fill(#FF0000);
  println("You found creeper number 3!");
}
if(mouseX > x2 && mouseX < x2+10 && mouseY > y2 && mouseY < y2+10 && mousePressed){
  fill(#FF0000);
  println("You found creeper number 2!");
}
if(mouseX > x && mouseX < x+10 && mouseY > y && mouseY < y+10 && mousePressed){
   fill(#FF0000);
  println( "You found the creeper!");
}

  ellipse(mouseX, mouseY, 8, 8);
  boolean answer = isNear(mouseX, mouseY);
 if(answer == true){
   fill(#92FC00);
   
 } else{
   fill(#FFFFFF);
 }
}
boolean isNear(int a, int b) {
if (abs(a - b) < 790)
     return true;
else
     return false;
}
