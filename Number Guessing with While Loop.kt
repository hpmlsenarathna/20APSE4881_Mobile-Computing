fun main() {
    val correctNumber = 7
    var guess = 0
    while (guess != correctNumber) {
        println("Guess a number between 1 and 10:")
        // In some online playgrounds, readLine() might return null
        guess = readLine()?.toIntOrNull() ?: 0
    }
    println("Correct! You guessed it.")
}