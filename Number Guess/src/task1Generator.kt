import java.util.*

fun main(args: Array<String>) {
    print("Enter any number between 1 to 10: ")
    var generateNumber = numberGenerate()
//    var user = userInput()
    var user = inputInterger()
    if(user.equals(generateNumber))
    {
        println("Right Attempt")
    }
    else
    {
        println("Wrong Atttempt")
    }
}

fun numberGenerate():Int
{
    var random = Random()
    var a = random.nextInt(10)
    return a
}

fun userInput():Int
{
    var scanner = Scanner(System.`in`)
    var input = scanner.nextInt()
    return input
}

fun inputInterger():Int
{
    var input:Int = 0;
    var scanner:Any;
    var checking:Boolean = true
    while (checking)
    {
        try {
            scanner = Scanner(System.`in`)
            input = scanner.nextInt()
            checking = false
        }
        catch (e: Exception)
        {
            print("Guess the number between 0 to 10: ")
        }
    }
    return  input
}