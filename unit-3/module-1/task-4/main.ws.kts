// forEach() and string templates with lambdas
// 2. Above the main() function, add the Cookie class. Each instance of Cookie represents an item on the menu, with a name, price, and other information about the cookie.
// 3. Below the Cookie class, outside of main(), create a list of cookies as shown. The type is inferred to be List<Cookie>.
// Loop over a list with forEach()
// 1. In main(), call forEach() on the cookies list, using trailing lambda syntax. Because the trailing lambda is the only argument, you can omit the parentheses when calling the function.
// 2. In the lambda body, add a println() statement that prints it.
// Embed expressions in strings
// 1. In the call to forEach(), modify the lambda's body to insert $it.name into the string.
// Let's modify the code so that the name is inserted into the string.
// 1. Surround it.name in curly braces to make it a lambda expression.
// map()
// 1. Remove all the previous code from main(). Create a new variable called fullMenu, and set it equal to the result of calling map() on the cookies list.
// 2. In the lambda's body, add a string formatted to include the name and price of it.
// 3. Print the contents of fullMenu. You can do this using forEach(). The fullMenu collection returned from map() has type List<String> rather than List<Cookie>. Each Cookie in cookies corresponds to a String in fullMenu.
// filter()
// 1. In main(), create a new variable called softBakedMenu, and set it to the result of calling filter() on the cookies list.
// 2. In the lambda's body, add a boolean expression to check if the cookie's softBaked property is equal to true. Because softBaked is a Boolean itself, the lambda body only needs to contain it.softBaked.
// 3. Print the contents of softBakedMenu using forEach().
// groupBy()
// 1. Remove the call to filter() from the previous step.
// 2. Call groupBy() on the cookies list, storing the result in a variable called groupedMenu.
// 3. Pass in a lambda expression that returns it.softBaked. The return type will be Map<Boolean, List<Cookie>>.
// 4. Create a softBakedMenu variable containing the value of groupedMenu[true], and a crunchyMenu variable containing the value of groupedMenu[false]. Because the result of subscripting a Map is nullable, you can use the Elvis operator (?:) to return an empty list.
// 5. Add code to print the menu for soft cookies, followed by the menu for crunchy cookies.
// fold()
// 1. In main(), create a new variable called totalPrice and set it equal to the result of calling fold() on the cookies list. Pass in 0.0 for the initial value. Its type is inferred to be Double.
// 2. You'll need to specify both parameters for the lambda expression. Use total for the accumulator, and cookie for the collection element. Use the arrow (->) after the parameter list.
// 3. In the lambda's body, calculate the sum of total and cookie.price. This is inferred to be the return value and is passed in for total the next time the lambda is called.
// 4. Print the value of totalPrice, formatted as a string for readability.
// sortedBy()
// 1. In main(), after the existing code, add a new variable called alphabeticalMenu and set it equal to calling sortedBy() on the cookies list.
// 2. In the lambda expression, return it.name. The resulting list will still be of type List<Cookie>, but sorted based on the name.
// 3. Print the names of the cookies in alphabeticalMenu. You can use forEach() to print each name on a new line.
class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
//    cookies.forEach {
//        println("Menu item: ${it.name}")
//    }

//    val fullMenu = cookies.map {
//        "${it.name} - $${it.price}"
//    }
//
//    println("Full menu:")
//    fullMenu.forEach {
//        println(it)
//    }
//
//    val softBakedMenu = cookies.filter {
//        it.softBaked
//    }
//
//    println("Soft cookies:")
//    softBakedMenu.forEach {
//        println("${it.name} - $${it.price}")
//    }
//    val groupedMenu = cookies.groupBy { it.softBaked }
//    val softBakedMenu = groupedMenu[true] ?: listOf()
//    val crunchyMenu = groupedMenu[false] ?: listOf()
//    println("Soft cookies:")
//    softBakedMenu.forEach {
//        println("${it.name} - $${it.price}")
//    }
//    println("Crunchy cookies:")
//    crunchyMenu.forEach {
//        println("${it.name} - $${it.price}")
//    }
//
//    val totalPrice = cookies.fold(0.0) {total, cookie ->
//        total + cookie.price
//    }
//
//    println("Total price: $${totalPrice}")
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }

    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}

main()