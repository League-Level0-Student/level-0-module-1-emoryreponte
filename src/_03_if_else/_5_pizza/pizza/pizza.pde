PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
    size(400, 400);
    fill(255,200,0);
    ellipse(200, 200, 400, 400);
    pepperoni = loadImage("pepperoni.png");
    olive = loadImage("olive.png");
    mushroom = loadImage("mushroom.png");
    pepperoni.resize(40, 40);
}
void draw() {
    if (mousePressed && (mouseButton == RIGHT)) {
    image(pepperoni,mouseX, mouseY);
    }
}
