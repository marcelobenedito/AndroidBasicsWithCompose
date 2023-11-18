/*
2. Print messages
Can you write a main() function that prints these messages on four separate lines?

Use the val keyword when the value doesn't change.
Use the var keyword when the value can change.
When you define a function, you define the parameters that can be passed to it.
When you call a function, you pass arguments for the parameters.
*/
fun step2() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

step2()

/*
3. Fix compile error
This program prints a message that notifies the user that they received a chat message from a friend.
 */
fun step3() {
    println("New chat message from a friend")
}

step3()
/*
4. String templates
This program informs users about the upcoming promotional sale on a particular item. It has a string template, which relies on the discountPercentage variable for the percent discount and the item variable for the item on sale. However, there are compilation errors in the code.
 */
fun step4() {
    var discountPercentage = 20
    val item = "Google Chromecast"
    var offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

step4()

/*
5. String concatenation
This program displays the total party size. There are adults and kids at the party. The numberOfAdults variable holds the number of adults at the party and the numberOfKids variable holds the number of kids.
 */
fun step5() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

step5()

/*
6. Message formatting
This program displays the total salary that an employee receives this month. The total salary is divided in two parts: the baseSalary variable, which the employee receives every month, and the bonusAmount variable, which is an additional bonus awarded to the employee.
 */
fun step6() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

step6()

/*
7. Implement basic math operations
In this exercise, you write a program that performs basic math operations and prints the output.

Step 1
This main() function contains one compile error:
 */
fun step7() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")
}

step7()

/*
Step 2
The code works, but the logic for adding two numbers is located within the result variable, making your code less flexible to reuse. Instead, you can extract the addition operation into an add() function so that the code is reusable. To do this, update your code with the code listed below. Notice that the code now introduces a new val called thirdNumber and prints the result of this new variable with firstNumber.
 */
fun step8() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

step8()

/*
Step 3
Now you have a reusable function to add two numbers.

Can you implement the subtract() function the same way you implemented the add() function? Modify the main() function as well to use the subtract() function so you can verify that it works as expected.
 */
fun step9() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

step9()

/*
8. Default parameters
Gmail has a feature that sends a notification to the user whenever a login attempt is made on a new device.

In this exercise, you write a program that displays a message to users with this message template:


There's a new sign-in request on operatingSystem for your Google Account emailId.
You need to implement a function that accepts an operatingSystem parameter and an emailId parameter, constructs a message in the given format, and returns the message.

For example, if the function was called with "Chrome OS" for the operatingSystem and "sample@gmail.com" for the emailId, it should return this string:


There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.
Step 1
Can you implement the displayAlertMessage() function in this program so that it prints the output displayed?
 */
fun step10() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

step10()

/*
Step 2
Great job! You displayed the message. However, in some cases, you discover that you can't determine the user's operating system. In such cases, you need to specify the operating system name as Unknown OS. You can further optimize the code so that you don't need to pass the Unknown OS argument each time that the function is called.

Can you find a way to optimize the code with this information so that it prints this output?

There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There's a new sign-in request on Windows for your Google Account user_two@gmail.com.

There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com.
 */
fun displayAlertMessage2(operatingSystem: String = "Unknown", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun step11() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage2(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage2(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage2(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

step11()

/*
9. Pedometer
The pedometer is an electronic device that counts the number of steps taken. Nowadays, almost all mobile phones, smart watches, and fitness gear come with pedometers built into them. The health and fitness app uses built-in pedometers to calculate the number of steps taken. This function calculates the number of calories that the user burns based on the user's number of steps.

Can you rename the functions, function parameters, and variables in this program based on best practices?
 */
fun step12() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

step12()

/*
10. Compare two numbers
Modern mobile phones have a built-in feature that tracks screen time, or the time you spend on your phone each day.

In this exercise, you implement a function that compares the time in minutes that you spent on your phone today versus the time spent yesterday. The function accepts two integer parameters and returns a boolean value.

The first parameter holds the number of minutes that you spent today and the second parameter holds the number of minutes that you spent yesterday. The function returns a true value if you spent more time on the phone today compared to yesterday. Otherwise, it returns a false value.

For example, if you called the function with these named arguments:

timeSpentToday = 300 and timeSpentYesterday = 250, the function returns a true value.
timeSpentToday = 300 and timeSpentYesterday = 300, the function returns a false value.
timeSpentToday = 200 and timeSpentYesterday = 220, the function returns a false value.
 */

fun step13() {
    println(isSpentMoreTimeToday(timeSpentToday = 300, timeSpentYesterday = 250))
    println(isSpentMoreTimeToday(timeSpentToday = 300, timeSpentYesterday = 300))
    println(isSpentMoreTimeToday(timeSpentToday = 200, timeSpentYesterday = 220))
}

fun isSpentMoreTimeToday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

step13()

/*
11. Move duplicate code into a function
This program displays the weather for different cities. It includes the city name, the high and low temperature for the day, and the chance of rain.


fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()

    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()

    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}
There are many similarities in the code that prints the weather for each city. For example, there are phrases that are repeated multiple times, such as "City:" and "Low temperature:". Similar, repeated code creates the risk of errors in your program. For one of the cities, you may have a typo or you may forget one of the weather details.

Can you create a function that prints the weather details for a single city to reduce the repetition in the main() function and then do the same for the remaining cities?
 */

fun step14() {
    getWeather("Ankara", 27, 31, 82)
    getWeather("Tokyo", 32, 36, 10)
    getWeather("Cape Town", 59, 64, 2)
    getWeather("Guatemala City", 50, 55, 7)
}

fun getWeather(city: String = "Unknown", lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}

step14()