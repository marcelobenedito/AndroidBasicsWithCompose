// 2. Above the main() function, define a class for fill-in-the-blank questions named FillInTheBlankQuestion, consisting of a String property for the questionText, a String property for the answer, and a String property for the difficulty.
// 3. Below the FillInTheBlankQuestion class, define another class named TrueOrFalseQuestion for true or false questions, consisting of a String property for the questionText, a Boolean property for the answer, and a String property for the difficulty.
// 4. Finally, below the other two classes, define a NumericQuestion class, consisting of a String property for the questionText, an Int property for the answer, and a String property for the difficulty.
// Refactor your code to use generics
// 1. Remove the class definitions for FillInTheBlankQuestion, TrueOrFalseQuestion, and NumericQuestion.
// 2. Create a new class named Question.
// 3. After the class name, but before the parentheses, add a generic type parameter using left- and right-facing angle brackets. Call the generic type T.
// 4. Add the questionText, answer, and difficulty properties. The questionText should be of type String. The answer should be of type T because its data type is specified when instantiating the Question class. The difficulty property should be of type String.
// 5. To see how this works with multiple question types—fill-in-the-blank, true or false, etc.— create three instances of the Question class in main(), as shown below.
// Use an enum class
// 1. Below the Question class, define an enum class called Difficulty.
// 2. In the Question class, change the data type of the difficulty property from String to Difficulty.
// Convert Question to a data class
// 1. In main(), print the result of calling toString() on question1.
// 3. Make Question into a data class using the data keyword.
// Use a singleton object
// 1. Create an object named StudentProgress.
// 2. For this example, we'll assume there are ten total questions, and that three of them are answered so far. Add two Int properties: total with a value of 10, and answered with a value of 3.
// Access a singleton object
// 1. In main(), add a call to println() that outputs the answered and total questions from the StudentProgress object.
// Declare objects as companion objects
// 1. Below the Difficulty enum, define a new class named Quiz.
// 2. Move question1, question2, and question3 from main() into the Quiz class. You also need to remove println(question1.toString()) if you haven't already.
// 3. Move the StudentProgress object into the Quiz class.
// 4. Mark the StudentProgress object with the companion keyword.
// 5. Update the call to println() to reference the properties with Quiz.answered and Quiz.total. Even though these properties are declared in the StudentProgress object, they can be accessed with dot notation using only the name of the Quiz class.
// Add an extension property
// 1. Below the Quiz class, define an extension property of Quiz.StudentProgress named progressText of type String.
// 2. Define a getter for the extension property that returns the same string used before in main().
// 3. Replace the code in the main() function with code that prints progressText. Because this is an extension property of the companion object, you can access it with dot notation using the name of the class, Quiz.
// Add an extension function
// 1. Add an extension function to the StudentProgress object called printProgressBar(). The function should take no parameters and have no return value.
// 2. Print out the ▓ character, answered number of times, using repeat(). This dark-shaded portion of the progress bar represents the number of questions answered. Use print() because you don't want a new line after each character.
// 3. Print out the ▒ character, the number of times equal to the difference between total and answered, using repeat(). This light-shaded portion represents the remaining questions in the process bar.
// 4. Print a new line using println() with no arguments, and then print progressText.
// 5. Update the code in main() to call printProgressBar().
// Rewrite extension functions using interfaces
// 1. Above the Quiz class, define an interface named ProgressPrintable. We've chosen the name ProgressPrintable because it makes any class that extends it able to print a progress bar.
// 2. In the ProgressPrintable interface, define a property named progressText.
// 3. Modify the declaration of the Quiz class to extend the ProgressPrintable interface.
// 4. In the Quiz class, add a property named progressText of type String, as specified in the ProgressPrintable interface. Because the property comes from ProgressPrintable, precede val with the override keyword.
// 5. Copy the property getter from the old progressText extension property.
// 6. Remove the old progressText extension property.
// 7. In the ProgressPrintable interface, add a method named printProgressBar that takes no parameters and has no return value.
// 8. In the Quiz class, add the printProgressBar() method using the override keyword.
// 9. Move the code from the old printProgressBar() extension function into the new printProgressBar() from the interface. Modify the last line to refer to the new progressText variable from the interface by removing the reference to Quiz.
// 10. Remove the extension function printProgressBar(). This functionality now belongs to the Quiz class that extends ProgressPrintable.
// 11. Update the code in main(). As the printProgressBar() function is now a method of the Quiz class, you need to first instantiate a Quiz object and then call printProgressBar().
// Use scope functions to access class properties and methods
// 1. Add a function to the Quiz class named printQuiz().
// 2. Add the following code that prints the question's questionText, answer, and difficulty. While multiple properties are accessed for question1, question2, and question3, the entire variable name is used each time. If the variable's name changed, you'd need to update every usage.
// 3. Surround the code accessing the questionText, answer, and difficulty properties with a call to the let() function on question1, question2, and question3. Replace the variable name in each lambda expression with it.
// 4. Update the code in main() to create an instance of the Quiz class named quiz.
// 5. Call printQuiz().
// Call an object's methods without a variable using apply()
// 1. Call apply() after the closing parenthesis when creating an instance of the Quiz class. You can omit the parentheses when calling apply(), and use trailing lambda syntax.
// 2. Move the call to printQuiz() inside the lambda expression. You no longer need to reference the quiz variable or use dot notation.
// 3. The apply() function returns the instance of the Quiz class, but since you're no longer using it anywhere, remove the quiz variable. With the apply() function, you don't even need a variable to call methods on the instance of Quiz.
enum class Difficulty {
    EASY, MEDIUM, HARD
}

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

//class FillInTheBlankQuestion(
//    val questionText: String,
//    val answer: String,
//    val difficulty: String
//)
//
//class TrueOrFalseQuestion(
//    val questionText: String,
//    val answer: Boolean,
//    val difficulty: String
//)
//
//class NumericQuestion(
//    val questionText: String,
//    val answer: Int,
//    val difficulty: String
//)

fun main() {
    Quiz().apply {
        printQuiz()
    }
}

main()