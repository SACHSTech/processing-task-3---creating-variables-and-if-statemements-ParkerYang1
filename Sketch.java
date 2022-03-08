import processing.core.PApplet;

public class Sketch extends PApplet {
	float houseX = random(0, width);
  float houseY = random(0, height);
    int red = 71;
    int green = 218;
    int blue = 255;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  public void setup() {
  }
  
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() { 
    // if statements
    if(houseY < 50 && houseX < 325){
      red = 0;
      green = 128;
      blue = 0; 
    }
    background(red, green, blue);

    if(houseY > 45 || houseX > 320){
      red = 50;
      green = 54;
      blue = 168;
    }
    background(red, green, blue);
   
    // grass
    fill(0, 128, 0);
    strokeWeight(0);
    rect(0, 200, 400, 200);
    strokeWeight(1);
    
    // house
    fill(200, 155, 125);
    rect(houseX, houseY, 150, 150); 

    fill(125, 65, 45);
    rect(houseX + 10, houseY - 60, 25, 60);
    
    fill(125, 65, 45);
    triangle(houseX, houseY, houseX + 150, houseY, houseX + 75, houseY - 70);

    fill(255, 197, 143);
    rect(houseX + 75, houseY + 60, 60, 90);

    fill(255, 255, 255);
    rect(houseX + 10, houseY + 60, 50, 50);

    fill(0, 0, 0);
    line(houseX + 35, houseY + 60, houseX + 35, houseY + 110);

    fill(0, 0, 0);
    line(houseX + 10, houseY + 85, houseX + 60, houseY + 85);

    fill(0, 0, 0);
    ellipse(houseX + 120, houseY + 110, 15, 15);

    //time 
    textSize(25);
    fill(0, 0, 0);
    text(hour() + ":" + minute() + ":" + second(), 10, 310);
  }
}