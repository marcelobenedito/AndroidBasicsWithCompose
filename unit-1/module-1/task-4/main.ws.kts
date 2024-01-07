fun step() {
    val count: Int = 2
    println(count)
}

// Run the program and the output should be:
step()

// Follow these steps so that the program outputs a more helpful message.
fun step2() {
    val count: Int = 2
    println("You have count unread messages.")
}

// Run the program and the output should display:
// You have count unread messages.
step2()

// Add a dollar sign $ before the count variable. In this case, the template expression $count evaluates to 2, and the 2 gets substituted into the string where the expression was located.
fun step3() {
    val count: Int = 2
    println("You have $count unread messages.")
}

step3()

// Now change the initial value of the count variable to a different integer literal. For example, you could choose the number 10. Leave the rest of the code in the program unchanged.
fun step4() {
    val count: Int = 10
    println("You have $count unread messages.")
}

step4()

// Create a new program where you define an integer variable for the number of unread emails in an inbox, and initialize it to a value such as 5. You can pick a different number if you'd like. Define a second integer variable for the number of read emails in an inbox. Initialize it to a value such as 100. You can pick a different number if you'd like. Then print out the total number of messages in the inbox by adding the two integer numbers together.
fun step5() {
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}

step5()

// To explore this topic further, create variables with different names and different initial values, and use template expressions to print messages to the output.
fun step6() {
    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
}

step6()

// Update the variable declaration for cartTotal on line 2 of the program to use var instead of val. This is how the code should look:
fun step7() {
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")
}

step7()

// To see how the variable value changes while the program is running, print the cartTotal variable to the output after the variable is initially declared. See the code changes below. Line 3 has a new println() statement. There's also a blank line added on line 4 of the code. Blank lines do not have any impact on how the compiler understands the code. Add a blank line where it would make it easier to read your code by separating out related blocks of code.
fun step8() {
    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")
}

step8()

// Replace the code in the Kotlin Playground with this program:
fun step9() {
    val count: Int = 10
    println("You have $count unread messages.")
}

step9()

// Replace the val keyword with the var keyword to make the count variable a mutable variable. There should be no change in the output when you run the program.
fun step10() {
    var count: Int = 10
    println("You have $count unread messages.")
}

step10()

// Add this line of code to your program at the bottom of the step() function. Your code should look like the following:
// count = count + 1

fun step11() {
    var count = 10
    println("You have $count unread messages.")
    count = count + 1
}

step11()

fun step12() {
    var count = 10
    println("You have $count unread messages.")
    count = count + 1
    println("You have $count unread messages.")
}

step12()

// Make this modification to your code and then run your program. There should be no spaces between the variable name and the increment operator.
fun step13() {
    var count = 10
    println("You have $count unread messages.")
    count++
    println("You have $count unread messages.")
}

step13()

// Now modify line 4 of your program to use the decrement operator (--) after the count variable name. The decrement operator is made up of two minus symbols. By placing the decrement operator after the variable name, you tell the compiler that you want to decrease the value of the variable by 1 and store the new value into the variable.
fun step14() {
    var count = 10
    println("You have $count unread messages.")
    count--
    println("You have $count unread messages.")
}

step14()

fun step15() {
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = 0.0
    println("$totalTripLength miles left to destination")
}

step15()

// Fix the code so that the totalTripLength variable is the sum of all three trip lengths.
fun step16() {
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}

step16()

// Fix your code to remove the unnecessary Double data type from the variable declarations because of type inference. The Kotlin compiler can infer that these variables are Double data types based on the decimal numbers provided as initial values.
fun step17() {
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}

step17()

// Copy and paste this program into the Kotlin Playground.
fun step18() {
    val nextMeeting = "Next meeting:"
    val date = "January 1"
    val reminder = nextMeeting + date
    println(reminder)
}

step18()

// Update your nextMeeting variable to have an extra space at the end of the string before the closing quotation mark. (Alternatively, you could have added an extra space to the beginning of the date variable). Your program should look like the following:
fun step19() {
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date
    println(reminder)
}

step19()

// Use the + symbol to add the string literal " at work" to the end of the reminder string.
fun step20() {
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)
}

step20()

// When reading code that contains strings, you may come across escape sequences. Escape sequences are characters that are preceded with a backslash symbol (\), which is also called an escaping backslash.
// An example is seeing \" within a string literal like in the below example. Copy and paste this code into the Kotlin Playground.
fun step21() {
    println("Say \"hello\"")
}

step21()

// Enter this code in the Kotlin Playground. In line 2 of this program, you declare a Boolean variable called notificationsEnabled and initialize it to true. Technically, you can omit : Boolean in the declaration, so you can remove it if you'd like. In line 3 of the program, you print out the value of the notificationsEnabled variable.
fun step22() {
    val notificationsEnabled: Boolean = true
    println(notificationsEnabled)
}

step22()

// Change the initial value of the Boolean to false on line 2 of the program.
fun step23() {
    val notificationsEnabled: Boolean = false
    println(notificationsEnabled)
}

step23()

// Other data types can be concatenated to Strings. For example, you can concatenate Booleans to Strings. Use the + symbol to concatenate (or append) the value of the notificationsEnabled boolean variable onto the end of the "Are notifications enabled? " string.
fun step24() {
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}

step24()

