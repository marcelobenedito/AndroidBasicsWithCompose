// Use nullable variables
// 1. In Kotlin Playground, replace the content in the body of the main() function with a favoriteActor variable set to null:
// 2. Print the value of the favoriteActor variable with the println() function and then run this program:
// Understand non-nullable and nullable variables
// 1. Change the val keyword to a var keyword, and then specify that the favoriteActor variable is a String type and assign it to the name of your favorite actor:
// 2. Remove the println() function:
// 3. Reassign the favoriteActor variable to null and then run this program:
// 4. Change the favoriteActor variable type from a String data type to a String? data type:
// 5. Print the favoriteActor variable before and after the null reassignment, and then run this program:
fun step1() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}

step1()

// Write a nullable Int value
// 1. Remove all the code in the main() function:
// 2. Create a number variable of a nullable Int type and then assign it a 10 value:
// 3. Print the number variable and then run this program:
// 4. Reassign the number variable to null to confirm that the variable is nullable:
// 5. Add another println(number) statement as the final line of the program and then run it:
fun step2() {
    var number: Int? = 10
    println(number)

    number = null
    println(number)
}

step2()

// Handle nullable variables
// 1. Remove all the code in the main() function, and then declare a favoriteActor variable of String type and assign it to the name of your favorite actor:
// 2. Print the number of characters in the favoriteActor variable value with the length property and then run this program:
// Access a property of a nullable variable
// 1. Change the favoriteActor variable type to a nullable type and then run this program:
// Use the ?. safe-call operator
// 1. In the println() statement, replace the . operator with the ?. safe-call operator:
// 3. Reassign the favoriteActor variable to null and then run this program:
// Use the !! not-null assertion operator
// 1. Reassign the favoriteActor variable to your favorite actor's name and then replace the ?. safe-call operator with the !! not-null assertion operator in println() statement:
// 3. Reassign the favoriteActor variable to null and then run this program:
// Use the if/else conditionals
// 1. Assign the favoriteActor variable to the name of your favorite actor again and then remove the println() statement:
// 2. Add an if branch with a favoriteActor != null condition:
// 3. In the body of the if branch, add a println statement that accepts a "The number of characters in your favorite actor's name is ${favoriteActor.length}." string and then run this program:
// 4. Optional: Add an else branch to handle a situation in which the actor's name is null:
// 5. In the body of the else branch, add a println statement that takes a "You didn't input a name." string:
// 6. Assign the favoriteActor variable to null and then run this program:
// if/else expressions
// 1. Assign the favoriteActor variable to the name of your favorite actor:
// 2. Create a lengthOfName variable and then assign it to the if/else expression:
// 3. Remove both println() statements from the if and else branches:
// 4. In the body of the if branch, add a favoriteActor.length expression:
// 5. In the body of the else branch, add a 0 value:
// 6. At the end of the main() function, add a println statement that takes a "The number of characters in your favorite actor's name is $lengthOfName." string and then run this program:
// Use the ?: Elvis operator
// 1. Remove the if/else conditional and then set the lengthOfName variable to the nullable favoriteActor variable and use the ?. safe-call operator to call its length property:
// 2. After the length property, add the ?: Elvis operator followed by a 0 value and then run this program:
fun step3() {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

step3()