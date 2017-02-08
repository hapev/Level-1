int frogX = 200;
int frogY = 384;
int speed = 30;
Car car1 = new Car(random(400), random(350), random(20, 50), random(15, 25), random(1, 10));
Car car2 = new Car(random(400), random(350), random(20, 50), random(15, 25), random(1, 10));
Car car3 = new Car(random(400), random(350), random(20, 50), random(15, 25), random(1, 10));
Car car4 = new Car(random(400), random(350), random(20, 50), random(15, 25), random(1, 10));
Car car5 = new Car(random(400), random(350), random(20, 50), random(15, 25), random(1, 10));
Car car6 = new Car(random(400), random(350), random(20, 50), random(15, 25), random(1, 10));
Car car7 = new Car(random(400), random(350), random(20, 50), random(15, 25), random(1, 10));
Car car8 = new Car(random(400), random(350), random(20, 50), random(15, 25), random(1, 10));


void setup() {
  size(400, 400);
}


void draw() {
  background(10, 156, 241);
  fill (0, 255, 0);
  ellipse(frogX, frogY, 30, 30);
  car1.display();
  car2.display();
  car3.display();
  car4.display();
  car5.display();
  car6.display();
  car7.display();
  car8.display();
  car1.left();
  car2.left();
  car3.left();
  car4.left();
  car5.left();
  car6.left();
  car7.left();
  car8.left();

  if (  intersects(car1)) {
    frogY = 384;
  }
    if (  intersects(car2)) {
    frogY = 384;
  }
    if (  intersects(car3)) {
    frogY = 384;
  }
    if (  intersects(car4)) {
    frogY = 384;
  }
    if (  intersects(car5)) {
    frogY = 384;
  }
    if (  intersects(car6)) {
    frogY = 384;
  }
    if (  intersects(car7)) {
    frogY = 384;
  }
    if (  intersects(car8)) {
    frogY = 384;
  }
  if (frogY == 0){
  text ("w", 100,200);
textSize(200); 
  text ("in", 225,200);
  textSize(100);
}
}


void keyReleased()
{
  if (key==CODED) {
    if (keyCode == UP) {
      frogY = frogY -speed;
    } else if (keyCode == DOWN) {
      frogY = frogY +speed;
    } else if (keyCode == RIGHT) {
      frogX = frogX +speed;
    } else if (keyCode == LEFT) {
      frogX = frogX -speed;
    }
  }
  if (frogX > 400) {
    frogX = 400;
  }
  if (frogX < 0) {
    frogX = 0;
  }
  if (frogY < 0) {
    frogY = 0;
  }
  if (frogY > 400) {
    frogY = 400;
  }
}

class Car {
  float CarX;
  float CarY;
  float CarWidth;
  float CarSpeed;
  float CarHeight;
  Car(float CarX, float CarY, float CarWidth, float CarHeight, float CarSpeed) {
    this.CarX = CarX;
    this.CarY = CarY;
    this.CarWidth = CarWidth;
    this.CarHeight = CarHeight;
    this.CarSpeed = CarSpeed;
  }
  void display() 
  {
    fill(0, 255, 0);
    rect(CarX, CarY, CarWidth, CarHeight, 50);
  }
  void left() {
    CarX = CarX - CarSpeed;
    if (CarX < 0) {
      CarX = 0;
      CarSpeed = -CarSpeed;
    }
    if (CarX > 400) {
      CarX = 400;
      CarSpeed = -CarSpeed;
    }
  }
  float getX() {
    return CarX;
  }
  float getY() {
    return CarY;
  }
  float getWidth(){
    return CarWidth;
  }
}
boolean intersects(Car car) {
  if ((frogY > car.getY() && frogY < car.getY()+50) && (frogX > car.getX() && frogX < car.getX()+car.getWidth()))
    return true;
  else 
    return false;
}

