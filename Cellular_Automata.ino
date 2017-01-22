// constants won't change. Used here to set a pin number :
int ledPin =  2;// the number of the LED pin

// Variables will change :
int ledState = LOW;             // ledState used to set the LED

// Generally, you should use "unsigned long" for variables that hold time
// The value will quickly become too large for an int to store
unsigned long previousMillis = 0;        // will store last time LED was updated

// constants won't change :
const long interval = 500;// interval at which to blink (milliseconds)

int pinState[10] = {LOW, LOW, HIGH, LOW, HIGH, LOW, LOW, LOW, HIGH, HIGH};
int pinUpdated[10] = {LOW, LOW, HIGH, LOW, HIGH, LOW, LOW, LOW, HIGH, HIGH};

void setup() {
  // set the digital pin as output:
}

void loop() {
  // here is where you'd put code that needs to be running all the time.

  // check to see if it's time to blink the LED; that is, if the
  // difference between the current time and last time you blinked
  // the LED is bigger than the interval at which you want to
  // blink the LED.
  unsigned long currentMillis = millis();
  
  if (currentMillis - previousMillis >= interval) {
    // save the last time you blinked the LED
    previousMillis = currentMillis;
    //Update Pins
    for (int x = 0; x < 10; x++){
      pinMode(x+2, OUTPUT);
      digitalWrite(x+2, pinState[x]);
    }
    for (int i = 0; i < 10; i++){
      //RULES
      if (i == 0){
        if (pinState[i + 1] == LOW){
          pinUpdated[i] = LOW;
        } else {
          pinUpdated[i] = HIGH;
        }
      } else if (i == 9){
        if (pinState[i - 1] == LOW){
          pinUpdated[i] = LOW;
        } else {
          pinUpdated[i] = HIGH;
        }
      } else if (pinState[i - 1] == LOW && pinState[i + 1] == LOW){
        pinUpdated[i] = LOW;
      } else if ((pinState[i - 1] == HIGH && pinState[i + 1] == LOW) || (pinState[i - 1] == LOW && pinState[i + 1] == HIGH)){
        pinUpdated[i] = HIGH;
      } else {
        pinUpdated[i] = LOW;
      }
    }
    for (int y = 0; y < 10; y++){
      pinState[y] = pinUpdated[y];
    }

    // set the LED with the ledState of the variable:
  }
}

