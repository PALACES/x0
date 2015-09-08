/// Wild circles #2.
String title=  "Click for another circle.";
String subtitle=  "Press any key to erase.";
String author=  "Bruce Alan Martin";
 
// GLOBAL VARIABLES //
float x, y;
int h, w;
 
color color_bg, color_text;
 
ArrayList<PVector> circles = new ArrayList();
 
// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);
  w=  80;          // width of ellipse.
  h=  80;          // height of ellipse
  circles.add(new PVector(width/2, height/2, 0));
  color_bg = color( random(255), random(255), random(255) );
  color_text = color( random(255), random(255), random(255) );
  noStroke();
}
 
 
// Next frame. //
void draw() {
  background(color_bg);
  //
  ellipse(250, 250, 100, 100); // Defined parameters to make ellipse stationary. 
  //
  fill(0);
  text( "BOOMER", 225, 255); // 
  fill(color_text);
  text( title, 10, 10 );
  text( subtitle, width/2, 10 );
  text( author, 10, height-10 );
  text( w+"x"+h, width/2, height-10 );
  // 
 
}
  

 
//  Handle mouse clicks //
void mousePressed() {
  circles.add(new PVector(mouseX, mouseY, 0));
}
 
 
//  Handle keyboard //
void keyPressed() {
  // Erase everything, change size & color. //
  color_bg = color( random(255), random(255), random(255) );
  color_text = color( random(255), random(255), random(255) );
  w=  int( random(50, 150) );
  h=  int( random(50, 150) );
  circles.clear();
}
