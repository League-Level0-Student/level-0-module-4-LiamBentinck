import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

void setup() {
  PImage wald0 = loadImage("wald0.jpg"); // Change this to match your file name.
  size(500, 500);
  wald0.resize(width, height);
  image(wald0, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
       println("X: " + mouseX + " Y:360 " + mouseY); 
    if(mouseX > 210 && mouseX < 220 && mouseY > 355 && mouseY < 365 && mousePressed){
     System.out.println("Wald0 found");
    playWoohoo();
  }
   
      // If the mouse is on Waldo, print “Waldo found!”

      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
