import javax.swing.*;

int x;
int y;
boolean clicked = false;


PImage donkey;
PImage tail;
void setup() {
   size(800, 800);
  donkey = loadImage("donkey.jpg");    
tail = loadImage("tail.png");      
  tail.resize(200, 200);
  donkey.resize(width, height);     
}

void draw() {
  if(dist(0, 0, mouseX, mouseY) < 30){
    background (donkey);
    rect(700, 200, 40, 40);
 }
 else{
  background(#FC0000); 
 }
  rect(0, 0, 30, 30);
 
  if(clicked == true){
    
     background (donkey);
     image(tail, x-10, y-10);
     rect(700, 200, 40, 40);
  }
 else{
   
   image(tail, mouseX-10, mouseY-10);
 }
if(mousePressed){
 x = mouseX;
 y = mouseY;
clicked = true;

}
  
 println(mouseX +"    "+ mouseY);
if(mouseX > 700 && mouseX < 740 && mouseY > 200 && mouseY < 235 && mousePressed){
 JOptionPane.showMessageDialog(null, "YOU DID IT! :^]");
}
}
