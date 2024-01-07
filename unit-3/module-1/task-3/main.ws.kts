// 2. In main(), create a rockPlanets variable. Call arrayOf(), passing in the type String, along with four strings—one for each of the rock planets in the solar system.
// 3. Because Kotlin uses type inference, you can omit the type name when calling arrayOf(). Below the rockPlanets variable, add another variable gasPlanets, without passing a type into the angle brackets.
// 4. You can do some cool things with arrays. For example, just like the numeric types Int or Double, you can add two arrays together. Create a new variable called solarSystem, and set it equal to the result of rockPlanets and gasPlanets, using the plus (+) operator. The result is a new array containing all the elements of the rockPlanets array and the elements of the gasPlanets array.
// Access an element in an array
// 1. In main(), access and print each element of the solarSystem array. Note how the first index is 0 and the last index is 7.
// Let's practice modifying values on the solarSystem array.
// 1. Let's give Mars a new name for its future human settlers. Access the element at index 3 and set it equal to "Little Earth".
// 2. Print the element at index 3.
// 4. Now let's say scientists made a discovery that there's a ninth planet beyond Neptune called Pluto. Earlier, we mentioned that you can't resize an array. What would happen if you tried? Let's try adding Pluto to the solarSystem array. Add Pluto at index 8 as this is the 9th element in the array.
// 6. Remove the addition of Pluto to the array.
// 7. If you want to make an array larger than it already is, you need to create a new array. Define a new variable called newSolarSystem as shown. This array can store nine elements, instead of eight.
// 8. Now try to print the element at index 8.
// The listOf() function
// 1. Remove the existing code from main().
// 2. In main(), create a List of planets called solarSystem by calling listOf().
// 3. List has a size property to get the number of elements in the list. Print the size of the solarSystem list.
// Access elements from a list
// 1. Print the planet at index 2 using subscript syntax.
// 2. Print the element at index 3 by calling get() on the solarSystem list.
// In addition to getting an element by its index, you can also search for the index of a specific element using the indexOf() method. The indexOf() method searches the list for a given element (passed in as an argument), and returns the index of the first occurrence of that element. If the element doesn't occur in the list, it returns -1.
// 1. Print the result of calling indexOf() on the solarSystem list, passing in "Earth".
// 2. Call indexOf(), passing in "Pluto", and print the result.
// Iterate over list elements using a for loop
// 1. In main(), below the most recent call to println(), add a for loop. Within the parentheses, name the variable planet, and loop through the solarSystem list.
// 2. Within the curly braces, print the value of planet using println().
// Add elements to a list
// 1. Change the initialization of solarSystem to call mutableListOf() instead of listOf(). You can now call methods defined in MutableList.
// 2. Again, we might want to classify Pluto as a planet. Call the add() method on solarSystem, passing in "Pluto" as the single argument.
// 3. Some scientists theorize a planet called Theia used to exist before colliding with Earth and forming the Moon. Insert "Theia" at index 3, between "Earth" and "Mars".
// Update elements at a specific index
// 1. Update the value at index 3 to "Future Moon".
// 2. Print the value at indexes 3 and 9 using subscript syntax.
// Remove elements from a list
// 1. Call removeAt() on solarSystem, passing in 9 for the index. This should remove "Pluto" from the list.
// 2. Call remove() on solarSystem, passing in "Future Moon" as the element to remove. This should search the list, and if a matching element is found, it will be removed.
// 3. List provides the contains() method that returns a Boolean if an element exists in a list. Print the result of calling contains() for "Pluto".
// 4. An even more concise syntax is to use the in operator. You can check if an element is in a list using the element, the in operator, and the collection. Use the in operator to check if solarSystem contains "Future Moon".
// Use a MutableSet in Kotlin
// 1. Remove the existing code from main().
// 2. Create a Set of planets called solarSystem using mutableSetOf(). This returns a MutableSet, the default implementation of which is LinkedHashSet().
// 3. Print the size of the set using the size property.
// 4. Like MutableList, MutableSet has an add() method. Add "Pluto" to the solarSystem set using the add() method. It only takes a single parameter for the element being added. Elements in sets don't necessarily have an order, so there's no index!
// 5. Print the size of the set after adding the element.
// 6. The contains() function takes a single parameter and checks if the specified element is contained in the set. If so, it returns true. Otherwise, it returns false. Call contains() to check if "Pluto" is in solarSystem.
// 8. As mentioned before, sets can't contain duplicates. Try adding "Pluto" again.
// 9. Print the size of the set again.
// The remove() function takes a single parameter and removes the specified element from the set.
// 1. Use the remove() function to remove "Pluto".
// 2. Print the size of the collection and call contains() again to check if "Pluto" is still in the set.
// Map collection
// 1. Remove the existing code from main().
// 2. Create a map called solarSystem using mutableMapOf() with initial values as shown.
// 3. Like lists and sets, Map provides a size property, containing the number of key-value pairs. Print the size of the solarSystem map.
// 4. You can use subscript syntax to set additional key-value pairs. Set the key "Pluto" to a value of 5.
// 5. Print the size again, after inserting the element.
// 6. You can use subscript syntax to get a value. Print the number of moons for the key "Pluto".
// 7. You can also access values with the get() method. Whether you use subscript syntax or call get(), it's possible that the key you pass in isn't in the map. If there isn't a key-value pair, it will return null. Print the number of moons for "Theia".
// The remove() method removes the key-value pair with the specified key. It also returns the removed value, or null, if the specified key isn't in the map.
// 1. Print the result from calling remove() and passing in "Pluto".
// 2. To verify that the item was removed, print the size again.
// 3. Run your code. The size of the map is 8 after removing the entry.
// 4. Subscript syntax, or the put() method, can also modify a value for a key that already exists. Use subscript syntax to update Jupiter's moons to 78 and print the new value.
fun main() {
//    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
//    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
//    val solarSystem = rockPlanets + gasPlanets
//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])
//    solarSystem[3] = "Little Earth"
//    println(solarSystem[3])
//    // solarSystem[8] = "Pluto" // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
//    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
//    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    println(solarSystem.size)
//    println(solarSystem[2])
//    println(solarSystem.get(3))
//    println(solarSystem.indexOf("Earth"))
//    println(solarSystem.indexOf("Pluto"))
//    for (planet in solarSystem) {
//        println(planet)
//    }
//    solarSystem.add("Pluto")
//    solarSystem.add(3, "Theia")
//    solarSystem[3] = "Future Moon"
//    println(solarSystem[3])
//    println(solarSystem[9])
//    solarSystem.removeAt(9)
//    solarSystem.remove("Future Moon")
//    println(solarSystem.contains("Pluto"))
//    println("Future Moon" in solarSystem)
//    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    println(solarSystem.size)
//    solarSystem.add("Pluto")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluto"))
//    solarSystem.add("Pluto")
//    println(solarSystem.size)
//    solarSystem.remove("Pluto")
//    println(solarSystem.size)
//    println(solarSystem.contains("Pluto"))
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystem.size)
    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia"))
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}

main()