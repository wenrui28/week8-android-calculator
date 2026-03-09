# Week 8 Video Script (3-5 minutes)

## English script
Hello everyone. In this video, I will present my Week 8 Android application. This is a simple calculator app made in Android Studio with Java. The app has two input boxes, four buttons for plus, minus, multiply, and divide, and one text area to show the result.

First, I will show the project structure. The most important files are `activity_main.xml` and `MainActivity.java`. In the XML file, I created two input fields named `inputFirstNumber` and `inputSecondNumber`. Then I created four buttons named `buttonPlus`, `buttonMinus`, `buttonMultiply`, and `buttonDivide`. At the bottom, I added `textResult` to print the answer on the screen.

Now I will show `MainActivity.java`. In `onCreate`, I connect all views by using `findViewById`. After that, I add click listeners to the four buttons. Each button calls the same `calculate` method, but with a different operator. This keeps the code simple and easy to read.

Inside the `calculate` method, I first read the text from the two input boxes. If one box is empty, the app shows the message "Please enter both numbers." Then I convert the text to numbers. I use `try-catch` so the app can handle wrong input safely. In the `switch` part, the program does addition, subtraction, multiplication, or division. For division, I also check division by zero, and if the second number is zero, the app shows "Cannot divide by zero." Finally, I show the result in `textResult`.

Now I will run the app. I enter 14 and 17. When I press plus, the result is 31. When I press minus, the result is -3. When I press multiply, the result is 238. When I press divide, the result is 0.8235294117647058. This proves that the four operations work correctly.

To finish, this app meets the task requirements because it is an Android app built in Android Studio, it uses Java, it has two number inputs, four operation buttons, clear button ids, and it prints the result on the screen. Thank you for watching.

## What to show on screen
1. Open the GitHub repository / project folder.
2. Show `activity_main.xml`.
3. Show `MainActivity.java`.
4. Run the emulator.
5. Type `14` and `17`.
6. Click `+`, `-`, `x`, `/` one by one.
7. End on the working app screen.
