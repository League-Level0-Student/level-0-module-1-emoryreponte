PImage face;

void setup() {
 face = loadImage("hq720.jpg");
 size(686, 386);
}
void draw() {
 face.resize(686, 386);
 image(face, 0, 0);
 
 fill(255, 255, 255);
 ellipse(385, 150, 45, 50);
 ellipse(435, 150, 50, 50);
 
 fill(0, 0, 0);
 ellipse(385, 150, 25, 30);
 ellipse(435, 150, 30, 30);
 
 if(mousePressed && (mouseButton == LEFT)){
   fill(255, 0, 0);
   ellipse(385, 150, 45, 50);
   ellipse(435, 150, 50, 50);
   fill(0, 0, 0);
   ellipse(385, 150, 25, 30);
   ellipse(435, 150, 30, 30);
  }
  if(mousePressed && (mouseButton == RIGHT)){
   fill(mouseY%256, mouseX%256, mouseX*mouseY%256);
   ellipse(385, 150, 45, 50);
   ellipse(435, 150, 50, 50);
   fill(0, 0, 0);
   ellipse(385, 150, 25, 30);
   ellipse(435, 150, 30, 30);
  }
}
