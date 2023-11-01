Simple Calculator Android Application

**Features**
The application provides basic calculation functionality – addition, subtraction, multiplication, division, modulus, power, and square root in addition to
providing buttons for numbers, decimal point, ‘Clear’, and backspace. The base layout used in Constraintlayout with components like LinearLayout, TextViews,
Buttons, and ImageButton. There are two layouts – one for portrait mode and one for landscape mode. A separate java class is used for the calculation implementation. 
SavedInstanceState is used to make sure that the data doesn’t clear if the screen is rotated. 
    - Making sure that there is only one decimal point in a number
    -The length of the number of characters does not exceed by 10
    -The root button works even if there is no first number provided
     -Possible division errors
