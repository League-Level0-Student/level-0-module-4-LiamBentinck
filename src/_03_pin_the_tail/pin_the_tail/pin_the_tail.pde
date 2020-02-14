int x;
int y;


PImage donkey;
PImage tail;
void setup() {
   size(800, 800);
  donkey = loadImage("donkey.jpg");    
tail = loadImage("tail.png");      
  
  donkey.resize(width, height);     
}

void draw() {
  if(dist(0, 0, mouseX, mouseY) < 30){
    background (donkey);
 }
 else{
  fill(#FC0000); 
 }
  rect(0, 0, 30, 30);
  rect(700, 200, 40, 40);
  
 
image(tail, mouseX-10, mouseY-10);
  tail.resize(200, 200);
 println(mouseX +"    "+ mouseY);
if(mouseX > 700 && mouseX < 740 && mouseY > 200 && mouseY < 235 && mousePressed){
int x = mouseX;
int y = mouseY;


}
}
