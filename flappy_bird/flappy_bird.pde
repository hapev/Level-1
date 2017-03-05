float birdYVelocity = 0;
float gravity = 0.5;
float pipeX = 1280;
float pipeY = 300;
int gabe =0;
float pipeheight = 420;
void setup() {

  size(1280, 720);
}
float x = 250;
float y = 348;
float w = 70;
float h = 70;


void draw() {
  y = y+4;
  background (71, 148, 170);
  fill (223, 172, 64);
  ellipse(x, y, w, h);
  fill(0, 250, 0);
   pipeheight = 720-pipeY;
  rect (pipeX, pipeY, 100, pipeheight);
  rect (pipeX, 0, 100, pipeY-150);

  pipeX = pipeX -10;
  birdYVelocity = birdYVelocity +gravity;
  y += birdYVelocity;
  if (pipeX<0) {
    pipeX = 1280;
    pipeY = random(300, 500);
  }
  if (gabe == 1) {
    text("u lost", 500, 500);
    gravity = 10;
  }
  if (intersects(x, y, pipeX, pipeY) == true) {
    gabe = 1;
  }
  if (intersects(x, y, pipeX, 0) == true) {
    gabe = 1;
  }
  if (y > 720) {
    y = 700;
    gabe =1;
  }
  if (y < 0) {
    gabe =1;
  }
}



boolean intersects(float birdX, float birdY, float pipeX, float pipeY, float pipeHeight) {
  if (birdY > pipeY - 4 && birdX > pipeX && birdX < pipeX + 100) {
    return true;
  } else {
    return false;
  }
}
void mousePressed() {
  birdYVelocity = -20;
}