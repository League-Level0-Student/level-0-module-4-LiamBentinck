

PImage face;
void setup() {
face = loadImage("face.png");
size(500, 500);
  face.resize(500, 500);


}

void draw() {
  background(face);
  if(mouseX < 65){
  mouseX = 65;
  }
  if(mouseX > 215){
    mouseX = 215;
  }
  if(mouseY > 325){
    mouseY = 325;
  }
  if(mouseY < 175){
    mouseY = 175;
  }
  
  
  
  
  
  
  
  
  fill(#F28B8B);
  ellipse(360, 250, 150, 150);
  ellipse(140, 250, 150, 150);
  fill(#000000);
  ellipse(mouseX + 220, mouseY, 10, 10);
  ellipse(mouseX, mouseY, 10, 10);
  
  
}
