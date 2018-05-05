import java.util.*

var num:Int = 0
fun main(args: Array<String>)
{
    var check:Boolean = false
    var min = 0
    var max = 3
    var generate = numberGenerator()
    while(!check && min<max)
    {
        print("Try No. $min Guess a number between 0 to 9: ")
        var guess = input()
        if (guess.equals(generate))
        {
            println("You win")
            check = true
            min++
        }
        else
        {
            println("You loss ")
            min++
        }
    }
}
fun numberGenerator():Int
{
    var random = Random()
    var a = random.nextInt(10)
    return a
}

fun input():Int
{
    var scanner = Scanner(System.`in`)
    var input = scanner.nextInt()
    return input
}
