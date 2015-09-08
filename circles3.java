/// Wild circles #2.
String title=  "This is my monster.";
String subtitle=  "Press any key!";
String author=  "Bruce Alan Martin (edited by Alex Reid)";
 
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
  rect(265, 270, 30, 75 );
  rect(208, 270, 30, 75 );
  rect(265, 270, 75, 10 ); //R Finger.
  rect(270, 250, 75, 10 ); //R Finger1.
  rect(265, 230, 75, 10 ); //R Finger2.
  rect(160, 270, 75, 10 ); //L Finger.
  rect(155, 250, 75, 10 ); //L Finger1.
  rect(160, 230, 75, 10 ); //L Finger2.
  ellipse(250, 250, 100, 100); // Body.
  ellipse(248, 170, 70, 70); //Head!
  fill(0);
  ellipse (230, 170, 20, 8); //Eye 1.
  ellipse (265, 169, 30, 18); //Eye 2.
  triangle(50, 50, 50, 50, 80, 150);
  fill(0);
  text( "BOOMER", 225, 255); // Name of the monster.
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
