# Problem : MARS Exploration

A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.

<p> <img float="center" width="350" src="./NASA_Mars_Rover.png" alt="NASA_Mars_Rover" />  </p><br>

Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string,```S``` , determine how many letters of the SOS message have been changed by radiation.

#### Example

    s = 'SOSSOT'

The original message was ```SOSSOS```. Two of the message's characters were changed in transit.

#### Explanation

Sample 0 :

```S = SOSSPSSQSSOR```, and signal length ```|S| = 12```. Sami sent ```4``` SOS messages (i.e.: ```12/3 = 4```).

    Expected signal: SOSSOSSOSSOS
    Recieved signal: SOSSPSSQSSOR

We print the number of changed letters, which is ```3```.


Sample 1 :

```S = SOSSOT```, and signal length ```|S| = 6```. Sami sent ```2``` SOS messages (i.e.: ```6/3 = 2```).

    Expected Signal: SOSSOS
    Received Signal: SOSSOT

We print the number of changed letters, which is ```1```.