// Task 1
// Another software engineer already completed some high-level work for the app and you are tasked with implementing the details.
//
// You need to implement the Event class. This class is used to hold the details of the event entered by the user. (Hint: This class does not need to define any methods or perform any actions.)
//
// For this task you need to create a data class named Event.
//
// An instance of this class should be able to store the:
//
// Event title as a string.
// Event description as a string (can be null).
// Event daypart as a string. We only need to track if the event starts in the morning, afternoon, or evening.
// Event duration in minutes as an integer.
// Before continuing, try writing the code for yourself.
//
// Using your code, create an instance using the following information:
//
// Title: Study Kotlin
// Description: Commit to studying Kotlin at least 15 minutes per day.
// Daypart: Evening
// Duration: 15
// Try printing your object to verify that you get the following output:
// Event(title=Study Kotlin, description=Commit to studying Kotlin at least 15 minutes per day., daypart=Evening, durationInMinutes=15)
//
// Task 2
// To keep the project on track, your manager decides to use the code we provided for the data class.
//
// After your team members used the Event class for some time, the senior teammate realizes that using a string for the daypart is not ideal.
//
// Some developers stored the value of "Morning", some used "morning", and still others used "MORNING".
//
// This caused many problems.
//
// Your task is to fix this issue by doing some refactoring. Refactoring is the process of improving your code without changing its functionality. Some examples are simplifying the logic or moving repeated code into separate functions.
//
// What type of class can be used to model a limited set of distinct values to help correct this problem?
//
// Your team wants you to change the daypart code to use an enum class. By using an enum class, your teammates are forced to choose one of the provided daypart values, which prevents these types of issues.
//
// The enum class should be named Daypart. It should have three values:
//
// MORNING
// AFTERNOON
// EVENING
// How would you create this enum class?
//
// How would you refactor your Event class to use it?
//
// Task 3
// Your colleagues enjoy using the refactored Daypart, but they have other issues.
//
// The following code is how they currently create and store the user's events.
// val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
// val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
// val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
// val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
// val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
// val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
// They created a lot of events, and each event currently requires its own variable. As more events are created, it becomes more difficult to keep track of them all. Using this approach, how difficult would it be to determine how many events the user scheduled?
//
// Can you think of a better way to organize the storage of these events?
//
// What way can you store all the events in one variable? (Note: It has to be flexible, as more events may be added. It also needs to efficiently return the count of the number of the events stored in the variable.)
//
// Which class or data type would you use? What is one way to add more events?
//
// Task 4
// Your manager likes how the app is coming along, but decides the user should be able to see a summary of their short events, based on the event's duration. For example, "You have 5 short events."
//
// A "short" event is an event that is less than 60 minutes.
//
// Using the events variable code from the previous task's solution, how would you achieve this result?
//
// Task 5
// Your teammates like how the app is coming along, but they want users to be able to see a summary of all the events and their daypart.
//
// The output should be similar to:
//
//
// Morning: 3 events
// Afternoon: 4 events
// Evening: 2 events
// Using the events variable code from the previous step, how can you achieve this result?
//
// Task 6
// Currently, your colleague finds and prints the last item by using its index. The code used is: println("Last event of the day: ${events[events.size - 1].title}").
//
// Your manager suggests checking the Kotlin documentation for a function that could simplify this code.
//
// What function did you find?
//
// Try using it to confirm you get the same results to print.
//
// Task 7
// Your team likes the data class you designed, but finds it repetitive to write code each time they need an event's duration as a string:
// val durationOfEvent = if (events[0].durationInMinutes < 60) {
//        "short"
//    } else {
//        "long"
//    }
// println("Duration of first event of the day: $durationOfEvent")
// While you could fix this repetition by adding a method directly to the class, that is not ideal, as other teams started using your event class in their apps. If the class changes, they would need to retest all of their code to make sure nothing breaks because of your change.
//
// Without directly changing the data class, how can you write an extension property that returns the same values as the code above?
//
// When correctly implemented, you will be able to use the following code, and it will print the same message as the code shown at the start of this task.
// println("Duration of first event of the day: ${events[0].durationOfEvent}")
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val duration: Int
)

val Event.durationOfEvent: String
    get() = if (this.duration < 60) "short" else "long"

fun main() {
    // Task 1 and 2
    val event = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = Daypart.EVENING,
        duration = 15
    )

    println(event)

    // Task 3
    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, duration = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, duration = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, duration = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, duration = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, duration = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, duration = 45),
    )

    // Task 4
    val shortEvents = events.filter { it.duration <= 60 }
    println("Yout have ${shortEvents.size} short events.")

    // Task 5
    val eventSummary = events.groupBy { it.daypart }
    eventSummary.entries.forEach { (daypart, events) ->
        val daypartName = daypart.toString().lowercase().replaceFirstChar { it.titlecase() }
        println("$daypartName: ${events.size} events")
    }

    // Task 6
    println("Last event of the day: ${events.last().title}")

    // Task 7

    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}

main()