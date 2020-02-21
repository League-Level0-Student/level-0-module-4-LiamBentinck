int x = 100;
int y =  0;
PImage creeper;
void setup() {
  size(800, 800);
PImage minecraft = loadImage("minecraft.png");     
minecraft.resize(width, height);               
creeper=loadImage("creeper.png");    
creeper.resize(50, 50);
background(minecraft);

}

void draw() {
   image(creeper, x, y);
if(mouseX > x && mouseX < x+50 && mouseY > y && mouseY < y+50 && mousePressed){
   fill(#FF0000);
  
}
 else{
  fill(#00FF97); 
 }
  ellipse(mouseX, mouseY, 20, 20);
  
}
