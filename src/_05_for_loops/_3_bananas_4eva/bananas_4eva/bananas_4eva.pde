void setup() {
 size(1500, 1000);
 
}
void draw() {
 int looped = 0;
 int looped2 = 0;
 int x = 0;
 int y = 10;
    
 for (looped=1; looped <= 37; looped +=1){ 
   for (looped2=1; looped2 <= 27; looped2 +=1){ 
    text("bannana", x, y);
    x+=55; 
   }
   x=0;
   y+=10;
 }
}
