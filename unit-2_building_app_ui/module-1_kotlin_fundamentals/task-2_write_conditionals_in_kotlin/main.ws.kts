// In the function body, add a println() function and then pass it the 1 == 1 expression as an argument:
fun step1() {
    println(1 == 1)
}

step1()

// In the argument, replace the == comparison operator with the < comparison operator:
fun step2() {
    println(1 < 1)
}

step2()

// Write an if statement for the red traffic-light condition:
// 1. Inside the main() function, create a trafficLightColor variable and assign it a "Red" value:
// 2. Add an if statement for the red traffic-light condition and then pass it a trafficLightColor == "Red" expression:
// 3. In the body of the if statement, add a println() function and then pass it a "Stop" argument:
// Add an else branch
// 1. After the closing curly brace of the if statement, add the else keyword followed by another pair of curly braces:
// 2. Inside the else keyword's curly braces, add a println() function and then pass it a "Go" argument:
// 4. Reassign the trafficLightColor variable to a "Green" value because you want drivers to go on green:
// Add an else if branch
// 1. After the closing curly brace of the if statement, add an else if (trafficLightColor == "Yellow") expression followed by curly braces:
// 2. Inside the curly braces of the else if branch, add a println() statement and then pass it a "Slow" string argument:
// 3. Reassign the trafficLightColor variable to a "Yellow" string value:
// Unfortunately, in the current program, if the traffic-light color is anything else other than red or yellow, the driver is still advised to go.
// 1. Reassign the trafficLightColor variable to a "Black" value to illustrate a traffic light that is turned off:
// Fix the else branch
// 1. After the current else if branch, add another else if (trafficLightColor == "Green") branch:
// 3. After the last else if branch, add an else branch with a println("Invalid traffic-light color") statement inside:
fun trafficLight(trafficLightColor: String) {
    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }
}

fun step3() {
    val trafficLightColor = "Black"
    trafficLight(trafficLightColor)
}

step3()

// 5. Assign the trafficLightColor variable another value besides "Red", "Yellow", or "Green" and then rerun the program.
trafficLight("Red")
trafficLight("Yellow")
trafficLight("Green")

// 3. Use a when statement for multiple branches
// Rewrite an if/else statement with a when statement
// Convert the program to use a when statement:
// In the main() function, remove the if/else statement:
// 2. Add a when statement and then pass it the trafficLightColor variable as an argument:
// 3. In the body of the when statement, add the"Red" condition followed by an arrow and a println("Stop") body:
// 4. On the next line, add the "Yellow" condition followed by an arrow and a println("Slow") body:
// 5. On the next line, add the "Green" condition followed by an arrow and then a println("Go") body:
// 6. On the next line, add the else keyword followed by an arrow and then a println("Invalid traffic-light color") body:
// 7. Reassign the trafficLightColor variable to a "Yellow" value:
fun step4() {
    val trafficLightColor = "Yellow"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}

step4()

// Write more complex conditions in a when statement
// Build a program that determines whether a number between 1 and 10 is a prime number:
// 2. Define an x variable and then assign it a 3 value:
// 3. Add a when statement that includes multiple branches for 2,3,5 and 7 conditions and follow each with a println("x is prime number between 1 and 10.") body:
// 4. Add an else branch with a println("x is not prime number between 1 and 10.") body:
// Use a comma (,) for multiple conditions
// 1. In the branch for the 2 condition, add 3, 5 and 7 separated by commas (,):
// 2. Remove the individual branches for the 3, 5 and 7 conditions:
// Add another branch with the in keyword:
// 1. After the first branch of the when statement, add a second branch with the in keyword followed by a 1..10 range and a println("x is a number between 1 and 10, but not a prime number.") body:
// 2. Change the x variable to a 4 value:
// Add another branch with the is keyword:
// 1. Modify x to be of type Any. This is to indicate that x can be of value other than Int type.
// 2. After the second branch of the when statement, add the is keyword and an Int data type with a println("x is an integer number, but not between 1 and 10.") body:
// 3. In the else branch, change the body to a println("x isn't an integer number.")body
// 4. Change the x variable to a 20 value:
fun step5() {
    val x: Any = 20

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }
}

step5()

// Add an additional condition to the traffic-light program:
// 3. In the second branch of the when statement, add a comma after the "Yellow" condition and then an "Amber" condition:
// 4. Change the trafficLightColor variable to an "Amber" value:
fun step6() {
    val trafficLightColor = "Amber"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}

step6()

// Convert an if statement to an expression
// 2. Define a message variable and then assign it an if/else statement:
// 3. Remove all println() statements and their curly braces, but leave the values inside them:
// 4. Add a println() statement to the end of the program and then pass it the message variable as an argument:
fun step7() {
    val trafficLightColor = "Black"

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)
}

step7()

// Convert the traffic-light program to use a when expression instead of a when statement:
// Can you convert the when statement to an expression so that you don't repeat the println() statements?
// 2. Create a message variable and assign it to the when expression:
// 3. Add a println()statement as the last line of the program and then pass it the message variable as an argument:
fun step8() {
    val trafficLightColor = "Amber"

    val message = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message)
}

step8()