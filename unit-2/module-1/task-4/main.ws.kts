import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// 1. In Kotlin Playground, replace the content with an empty main() function:
// 2. On the line before the main() function, define a SmartDevice class with a body that includes an // empty body comment:
// 3. In the body of the SmartDevice class, define a turnOn() method with an empty body:
// 4. In the body of the turnOn() method, add a println() statement and then pass it a "Smart device is turned on." string:
// 5. After the turnOn() method, add a turnOff() method that prints a "Smart device is turned off." string:
// 6. In the main() function on the line after the smartTvDevice variable, call the turnOn() method:
// 7. On the line after the turnOn() method, call the turnOff() method:
// 8. On the line before the turnOn()method, define the name property and assign it to an "Android TV" string:
// 9. On the line after the name property, define the category property and assign it to an "Entertainment" string, and then define a deviceStatus property and assign it to an "online" string:
// 10. On the line after the smartTvDevice variable, call the println() function and then pass it a "Device name is: ${smartTvDevice.name}" string:
// 11. In the SmartDevice class, move the name and category properties to the constructor without assigning default values:
// 12. In the SmartDevice superclass, add an open keyword before the class keyword to make it extendable:
// 13. Create a SmartTvDevice subclass that extends the SmartDevice superclass:
// 14. In the SmartTvDevice subclass body, add the speakerVolume property that you created when you learned about the getter and setter functions:
// 15. Define a channelNumber property assigned to a 1 value with a setter function that specifies a 0..200 range:
// 16. Define an increaseSpeakerVolume() method that increases the volume and prints a "Speaker volume increased to $speakerVolume." string:
// 17. Add a nextChannel() method that increases the channel number and prints a "Channel number increased to $channelNumber." string:
// 18. On the line after the SmartTvDevice subclass, define a SmartLightDevice subclass that extends the SmartDevice superclass:
// 19. In the SmartLightDevice subclass body, define a brightnessLevel property assigned to a 0 value with a setter function that specifies a 0..100 range:
// 20. Define an increaseBrightness() method that increases the brightness of the light and prints a "Brightness increased to $brightnessLevel." string:
// 21. In between the SmartLightDevice class and main() function, define a SmartHome class:
// 22. In the SmartHome class constructor, use the val keyword to create a smartTvDevice property of SmartTvDevice type:
// 23. In the body of the SmartHome class, define a turnOnTv()method that calls the turnOn() method on the smartTvDevice property:
// 24. On the line after the turnOnTv() method, define a turnOffTv() method that calls the turnOff() method on the smartTvDevice property:
// 25. On the line after the turnOffTv() method, define an increaseTvVolume() method that calls the increaseSpeakerVolume() method on the smartTvDevice property and then define a changeTvChannelToNext() method that calls the nextChannel() method on the smartTvDevice property:
// 26. In the SmartHome class constructor, move the smartTvDevice property parameter to its own line followed by a comma:
// 27. On the line after the smartTvDevice property, use the val keyword to define a smartLightDevice property of SmartLightDevice type:
// 28. In the SmartHome body, define a turnOnLight() method that calls the turnOn() method on the smartLightDevice object and a turnOffLight() method that calls the turnOff() method on the smartLightDevice object:
// 29. On the line after the turnOffLight()method, define an increaseLightBrightness() method that calls the increaseBrightness() method on the smartLightDevice property:
// 30. On the line after the increaseLightBrightness() method, define a turnOffAllDevices() method that calls the turnOffTv() and turnOffLight() methods:.
// 31. In the body of the SmartDevice superclass before the fun keyword of each method, add an open keyword:
// 32. In the body of the SmartLightDevice class, define a turnOn() method with an empty body:
// 33. In the body of the turnOn() method, set the deviceStatus property to the string "on", set the brightnessLevel property to a value of 2, and add a println() statement and then pass it a "$name turned on. The brightness level is $brightnessLevel." string:
// 34. In the body of the SmartLightDevice class, define a turnOff() method with an empty body:
// 35. In the body of the turnOff() method, set the deviceStatus property to the string "off", set the brightnessLevel property to a value of 0, and add a println() statement and then pass it a "Smart Light turned off" string:
// 36. In the SmartLightDevice subclass before the fun keyword of the turnOn() and turnOff() methods, add the override keyword:
// 37. In the body of the SmartTvDevice class, define a turnOn() method with an empty body:
// 38. In the body of the turnOn() method, set the deviceStatus property to the string "on" and add a println() statement and then pass it a "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " + "set to $channelNumber." string:
// 39. In the body of the SmartTvDevice class after the turnOn() method, define a turnOff() method with an empty body:
// 40. In the body of the turnOff() method, set the deviceStatus property to the string "off" and add a println() statement and then pass it a "$name turned off" string:
// 41. In the SmartTvDevice class before the fun keyword of the turnOn() and turnOff() methods, add the override keyword:
// 42. In the main() function, use the var keyword to define a smartDevice variable of SmartDevice type that instantiates a SmartTvDevice object that takes an "Android TV" argument and an "Entertainment" argument:
// 43. On the line after the smartDevice variable, call the turnOn() method on the smartDevice object:
// 44. On the line after the call to the turnOn() method, reassign the smartDevice variable to instantiate a SmartLightDevice class that takes a "Google Light" argument and a "Utility" argument, and then call the turnOn() method on the smartDevice object reference:
// 45. Remove the println() statements from the turnOn() and turnOff() methods and move the duplicated code from the SmartTvDevice and SmartLightDevice subclasses to the SmartDevice superclass:
// 46. Use the super keyword to call the methods from the SmartDevice class in the SmartTvDevice and SmartLightDevice subclasses:
// 47. In the SmartDevice superclass on the line after the deviceStatus property, use the open and val keywords to define a deviceType property set to an "unknown" string:
// 48. In the SmartTvDevice class, use the override and val keywords to define a deviceType property set to a "Smart TV" string:
// 49. In the SmartLightDevice class, use the override and val keywords to define a deviceType property set to a"Smart Light" string:
// 50. In the SmartDevice superclass's deviceStatus property, add the protected modifier to the set() function:
// 51. In the SmartHome class, define a deviceTurnOnCount property set to a 0 value with a private setter function:
// 52. Add the deviceTurnOnCount property followed by the ++ arithmetic operator to the turnOnTv() and turnOnLight() methods, and then add the deviceTurnOnCount property followed by the -- arithmetic operator to the turnOffTv() and turnOffLight() methods:
// 53. In the SmartTvDevice class, add a private visibility modifier to the speakerVolume and channelNumber properties:
// 54. In the SmartLightDevice class, add a private modifier to the brightnessLevel property:
// 55. Before the main() function, create a RangeRegulator class that implements the ReadWriteProperty<Any?, Int> interface:
// 56. In the RangeRegulator class's primary constructor, add an initialValue parameter, a private minValue property, and a private maxValue property, all of Int type:
// 57. In the RangeRegulator class's body, override the getValue() and setValue() methods:
// 58. On the line before the SmartDevice class, import the ReadWriteProperty and KProperty interfaces:
// 59. In the RangeRegulator class, on the line before the getValue() method, define a fieldData property and initialize it with initialValue parameter:
// 60. In the getValue() method's body, return the fieldData property:
// 61. In the setValue() method's body, check whether the value parameter being assigned is in the minValue..maxValue range before you assign it to the fieldData property:
// 62. In the SmartTvDevice class, use the delegate class to define the speakerVolume and channelNumber properties:
// 63. In the SmartLightDevice class, use the delegate class to define the brightnessLevel property:
// Try this challenge
// 1. In the SmartDevice class, define a printDeviceInfo() method that prints a "Device name: $name, category: $category, type: $deviceType" string.
// 2. In the SmartTvDevice class, define a decreaseVolume() method that decreases the volume and a previousChannel() method that navigates to the previous channel.
// 3. In the SmartLightDevice class, define a decreaseBrightness() method that decreases the brightness.
// 4. In the SmartHome class, ensure that all actions can only be performed when each device's deviceStatus property is set to an "on" string. Also, ensure that the deviceTurnOnCount property is updated correctly.
// 5. In the SmartHome class, define an decreaseTvVolume(), changeTvChannelToPrevious(), printSmartTvInfo(), printSmartLightInfo(), and decreaseLightBrightness() method.
// 6. Call the appropriate methods from the SmartTvDevice and SmartLightDevice classes in the SmartHome class.
// 7. In the main() function, call these added methods to test them.
fun main() {
    val smartTvDevice = SmartTvDevice("Android TV", "Entertainment")
    smartTvDevice.turnOn()

    val smartLightDevice = SmartLightDevice("Google Light", "Utility")
    smartLightDevice.turnOn()

    val smartHome = SmartHome(smartTvDevice, smartLightDevice)
    smartHome.printSmartTvInfo()
    smartHome.printSmartLightInfo()
    smartHome.turnOffAllDevices()
    // TV
    smartHome.turnOnTv()
    smartHome.increaseTvVolume()
    smartHome.increaseTvVolume()
    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.changeTvChannelToNext()
    smartHome.changeTvChannelToPrevious()
    smartHome.turnOffTv()
    // Light
    smartHome.turnOnLight()
    smartHome.increaseLightBrightness()
    smartHome.increaseLightBrightness()
    smartHome.decreaseLightBrightness()
    smartHome.turnOffLight()
}

main()

open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun descreaseVolume() {
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    fun previousChannel() {
        channelNumber--
        println("Channel number decreased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    fun decreaseBrightness() {
        brightnessLevel--
        println("Brightness decreased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}

// The SmartHome class HAS-A smart TV device and smart light.
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        if (smartTvDevice.deviceStatus == "off") {
            deviceTurnOnCount++
            smartTvDevice.turnOn()
        }
    }

    fun turnOffTv() {
        if (smartTvDevice.deviceStatus == "on") {
            deviceTurnOnCount--
            smartTvDevice.turnOff()
        }
    }

    fun increaseTvVolume() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.increaseSpeakerVolume()
        }
    }

    fun decreaseTvVolume() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.descreaseVolume()
        }
    }

    fun changeTvChannelToNext() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.nextChannel()
        }
    }

    fun changeTvChannelToPrevious() {
        if (smartTvDevice.deviceStatus == "on") {
            smartTvDevice.previousChannel()
        }
    }

    fun turnOnLight() {
        if (smartLightDevice.deviceStatus == "off") {
            deviceTurnOnCount++
            smartLightDevice.turnOn()
        }
    }

    fun turnOffLight() {
        if (smartLightDevice.deviceStatus == "on") {
            deviceTurnOnCount--
            smartLightDevice.turnOff()
        }
    }

    fun increaseLightBrightness() {
        if (smartLightDevice.deviceStatus == "on") {
            smartLightDevice.increaseBrightness()
        }
    }

    fun decreaseLightBrightness() {
        if (smartLightDevice.deviceStatus == "on") {
            smartLightDevice.decreaseBrightness()
        }
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

    fun printSmartTvInfo() {
        smartTvDevice.printDeviceInfo()
    }

    fun printSmartLightInfo() {
        smartLightDevice.printDeviceInfo()
    }


}

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}