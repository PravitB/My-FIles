/*internal led blinking*/
int ledpin=13,
void setup() {
  pinMode(ledpin,OUTPUT);


}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(ledpin,HIGH);
  delay(10000);
  digitalWrite(ledpin,LOW);
  delay(2000);
}
