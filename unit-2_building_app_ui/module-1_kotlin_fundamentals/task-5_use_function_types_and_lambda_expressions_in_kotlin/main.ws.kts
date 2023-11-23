// 2. After the main() function, define a trick() function with no parameters and no return value that prints "No treats!". The syntax is the same as that of other functions that you saw in previous codelabs.
// 3. In the body of the main() function, create a variable called trickFunction and set it equal to trick. You don't include the parentheses after trick because you want to store the function in a variable, not call the function.
// 4. Run your code. It produces an error because the Kotlin compiler recognizes trick as the name of the trick() function, but expects you to call the function, rather than assign it to a variable.
// 5. To refer to the function as a value, reassign trickFunction to ::trick.
// 6. Rewrite the trick() function with a lambda expression. The name trick now refers to the name of a variable. The function body in the curly braces is now a lambda expression.
// 7. In the main() function, remove the function reference operator (::) because trick now refers to a variable, rather than a function name.
// 8. In the main() function, call the trick() function, but this time include the parentheses like you'd do when you call any other function.
// 9. In the main() function, call the trickFunction variable as if it were a function.
// 10. After the trick variable, declare a variable called treat equal to a lambda expression with a body that prints "Have a treat!".
// 11. Specify the treat variable's data type as () -> Unit.
// 12. Delete the code from the main() function.
// 13. After the main() function, define a trickOrTreat() function that accepts an isTrick parameter of type Boolean.
// 14. In the body of the trickOrTreat() function, add an if statement that returns the trick() function if isTrick is true and returns the treat() function if isTrick is false.
// 15. In the main() function, create a variable called treatFunction and assign it to the result of calling trickOrTreat(), passing in false for the isTrick parameter. Then, create a second variable, called trickFunction, and assign it to the result of calling trickOrTreat(), this time passing in true for the isTrick parameter.
// 16. Call the treatFunction() and then call the trickFunction() on the next line.
// 17. After the isTrick parameter, add an extraTreat parameter of type (Int) -> String.
// 18. n the else block, before the return statement, call println(), passing in a call to the extraTreat() function. Pass 5 into the call to extraTreat().
// 19. Now when you call the trickOrTreat() function, you need to define a function with a lambda expression and pass it in for the extraTreat parameter. In the main()function before the calls to the trickOrTreat() function, add a coins() function. The coins() function gives the Int parameter the name quantity and returns a String. You may notice the absence of the return keyword, which can't be used in lambda expressions. Instead, the result of the last expression in the function becomes the return value.
// 20. After the coins() function, add a cupcake() function as shown. Name the Int parameter quantity and separate it from the function body using the -> operator. Now you can pass either the coins() or cupcake() function into the trickOrTreat() function.
// 21. In the cupcake() function, remove the quantity parameter and the -> symbol. They're not used, so you can omit them.
// 22. Update the calls to the trickOrTreat() function. For the first call, when isTrick is false, pass in the coins() function. For the second call, when isTrick is true, pass in the cupcake() function.
// 23. Change the extraTreat parameter's type to (() -> String)?.
// 24. Modify the call to the extraTreat() function to use an if statement to only call the function if it's non-null. The trickOrTreat() function should now look like this code snippet:
// 25. Remove the cupcake() function and then replace the cupcake argument with null in the second call to the trickOrTreat() function.
// 26. In the coins() function, remove the quantity parameter name and -> symbol.
// 27. Change the "$quantity quarters" string template to refer to the single parameter using $it.
// 28. Move the lambda expression so that it's passed directly into the call to the trickOrTreat() function. You can also condense the lambda expression to a single line.
// 29. Remove the coins variable because it's no longer being used.
// 30. In the treatFunction variable, move the lambda expression {"$it quarters"} after the closing parenthesis in the call to trickOrTreat().
// 31. In the main() function, call the repeat() function in-between the calls to treatFunction() and trickFunction(). Pass in 4 for the times parameter and use trailing lambda syntax for the action function. You don't need to provide a name for the lambda expression's Int parameter.
// 32. Move the call to the treatFunction() function into the repeat() function's lambda expression.
fun main() {
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    repeat(4) {
        treatFunction()
    }
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}

main()