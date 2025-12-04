int x = 400; 
int y = 600; 
int velocity = 0;
int timer = 6;

void setup() {
    size(800, 800);
    
}

void draw() {
    background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    timer+=-1;
    if (timer==0){
      velocity+=2;
      y+=15;
      timer=15;
    }
    if (mousePressed){
      velocity+=-1;
      y+=velocity;
    }
}
