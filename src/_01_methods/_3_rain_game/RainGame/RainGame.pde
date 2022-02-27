/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
 
/** This program makes a game where the user has to catch rain drops in a bucket
 */


int score = 0;
int bucketWidth = 90;
int bucketHeight = 70;
PImage bucket;
int y = 10;
int x;

// The setup method is run once when the program starts
void setup() {

  //Set your canvas size
  size(1000,650);
  
  //If you are using an image for the bucket, load it and resize it here.
  // A bucket image -  bucket.png - has been provided if you want to use it.

}

// The draw method runs continuously (in a loop) until the program ends
void draw() {
  // Set a background color
  background(#FFFFFF);
  
  // Draw a raindrop (ellipse) at the top of the screen
  fill(#3C4BA5);
  ellipse(x, y, 50, 75);
  
  // Make the rain fall down the screen.
  // Hint: make a variable for the raindrop's Y position and change it after you
  // draw the raindrop
  y += 3;
  
  // When the rain falls off the bottom of the canvas, 
  // start a new rain drop falling from the top.
  // Each new drop should start at a random position (X position) at the top. 
  // Hint: This code will give you a random number between 0 and the width of your sketch.
  if (y > height-10){
    checkCatch(x);
    int randomNumber = (int) random(width);
    y = 0;
    x = randomNumber;
    
  }
  
  // Draw a bucket (rectangle or image) at the bottom of the screen. 
  // The bucket's width needs to be stored in the bucketWidth variable.
  rect(mouseX-22.5, 600, 90, 70); 
  
  // Make the bucket move side-to-side with the mouse. Hint: use mouseX
  
  
  // When the rain drop has fallen to the bucket, call the checkCatch method
  //  to see if the rain drop is in the bucket
  
 //This code will display the score on the screen. 
 // Change the color if it does not show up on your background.
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}


// DO NOT CHANGE THIS METHOD - CALL IT FROM THE DRAW METHOD 
    void checkCatch(int x){
         if (x > mouseX && x < mouseX+bucketWidth)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
