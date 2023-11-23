// 2. Mobile notifications
// Complete the printNotificationSummary() function so that the program prints these lines:
// You have 51 notifications.
// Your phone is blowing up! You have 99+ notifications.
fun step1() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    val message = if (numberOfMessages < 100) {
        "You have $numberOfMessages notifications."
    } else {
        "Your phone is blowing up! You have 99+ notifications."
    }

    println(message)
}

step1()

// 3. Movie-ticket price
// In the initial code provided in the following code snippet, write a program that calculates these age-based ticket prices:
//
// A children's ticket price of $15 for people 12 years old or younger.
// A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
// A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
// A -1 value to indicate that the price is invalid when a user inputs an age outside of the age specifications.
// Complete the ticketPrice() function so that the program prints these lines:
// The movie ticket price for a person aged 5 is $15.
// The movie ticket price for a person aged 28 is $25.
// The movie ticket price for a person aged 87 is $20.
fun step2() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when(age) {
        // A children's ticket price of $15 for people 12 years old or younger.
        in 1..12 -> 15
        // A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
        in 13..60 -> if (isMonday) 25 else 30
        // A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
        in 61..100 -> 20
        // A -1 value to indicate that the price is invalid when a user inputs an age outside of the age specifications.
        else -> -1
    }
}

step2()

// 4. Temperature converter
// In the initial code provided in the following code snippet, write a program that converts a temperature from one scale to another with these formulas:
//
// Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
// Kelvin to Celsius: ° C = K - 273.15
// Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15
// Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.
// Complete the main() function so that it calls the printFinalTemperature() function and prints the following lines. You need to pass arguments for the temperature and conversion formula. Hint: you may want to use Double values to avoid Integer truncation during division operations.
// 27.0 degrees Celsius is 80.60 degrees Fahrenheit.
// 350.0 degrees Kelvin is 76.85 degrees Celsius.
// 10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
fun step3() {
    val CELSIUS = "Celsius"
    val FAHRENHEIT = "Fahrenheit"
    val KELVIN = "Kelvin"
    // conversions
    val celsiusToFahrenheit: (Double) -> Double = { celsius -> (9.0 / 5.0) * celsius + 32.0 }
    val kelvinToCelsius: (Double) -> Double = { kelvin -> kelvin - 273.15 }
    val fahrenheitToKelvin: (Double) -> Double = { fahrenheit -> (5.0 / 9.0) * (fahrenheit - 32.0) + 273.15 }
    // 27.0 degrees Celsius is 80.60 degrees Fahrenheit.
    printFinalTemperature(27.0, CELSIUS, FAHRENHEIT, celsiusToFahrenheit)
    // 350.0 degrees Kelvin is 76.85 degrees Celsius.
    printFinalTemperature(350.0, KELVIN, CELSIUS, kelvinToCelsius)
    // 10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
    printFinalTemperature(10.0, FAHRENHEIT, KELVIN, fahrenheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

step3()

// 5. Song catalog
// Imagine that you need to create a music-player app.
//
// Create a class that can represent the structure of a song. The Song class must include these code elements:
//
// Properties for the title, artist, year published, and play count
// A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
// A method that prints a song description in this format:
// "[Title], performed by [artist], was released in [year published]."
fun step4() {
    val song = Song("Whiskey in the Jar", "Metallica", 1998, 300_000_000)
    song.printSongDescription()
    song.printIsPopular()
}

class Song(
    private val title: String,
    private val artist: String,
    private val yearPublished: Int,
    private val playCount: Int
) {
    var isPopular = false
        get() { return playCount >= 1000 }
        private set

    fun printSongDescription() {
        println("[$title], performed by [$artist], was released in [$yearPublished].")
    }

    fun printIsPopular() {
        println("Is popular song: $isPopular")
    }
}

step4()

// 6. Internet profile
// Oftentimes, you're required to complete profiles for online websites that contain mandatory and non-mandatory fields. For example, you can add your personal information and link to other people who referred you to sign up for the profile.
//
// In the initial code provided in the following code snippet, write a program which prints out a person's profile details.
// Complete the showProfile() function so that the program prints these lines:
// Name: Amanda
// Age: 33
// Likes to play tennis. Doesn't have a referrer.
//
// Name: Atiqah
// Age: 28
// Likes to climb. Has a referrer named Amanda, who likes to play tennis.
fun step5() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val referrerMessage = if (referrer == null) {
            "Doesn't have a referrer"
        } else {
            "Has a referrer named ${referrer.name}, who likes to ${referrer.hobby ?: ""}."
        }

        println("Name: $name\nAge: $age\n${if (hobby == null) "" else "Likes to $hobby. "}$referrerMessage")
        println()
    }
}

step5()

// 7. Foldable phones
// Typically, a phone screen turns on and off when the power button is pressed. In contrast, if a foldable phone is folded, the main inner screen on a foldable phone doesn't turn on when the power button is pressed.
//
// In the initial code provided in the following code snippet, write a FoldablePhone class that inherits from the Phone class. It should contain the following:
//
// A property that indicates whether the phone is folded.
// A different switchOn() function behavior than the Phone class so that it only turns the screen on when the phone isn't folded.
// Methods to change the folding state.
fun step6() {
    val foldablePhone = FoldablePhone()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.fold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.unfold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(): Phone() {

    var isFolded = false
        private set

    override fun switchOn() {
        if (!isFolded) {
            super.switchOn()
        }
    }

    fun fold() {
        if (!isFolded) {
            isFolded = true
        }
    }

    fun unfold() {
        if (isFolded) {
            isFolded = false
        }
    }
}

step6()

// 8. Special auction
// Typically in an auction, the highest bidder determines the price of an item. In this special auction, if there's no bidder for an item, the item is automatically sold to the auction house at the minimum price.
//
// In the initial code provided in the following code snippet, you're given an auctionPrice() function that accepts a nullable Bid? type as an argument:
// Complete the auctionPrice() function so that the program prints these lines:
//
// Item A is sold at 5000.
// Item B is sold at 3000.
fun step7() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}

step7()