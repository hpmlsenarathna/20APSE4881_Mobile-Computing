fun main() {
    val text = "Hello Kotlin"
    var count = 0

    for (char in text.lowercase()) {
        if (char in listOf('a', 'e', 'i', 'o', 'u')) {
            count++
        }
    }

    println("Number of vowels: $count")
}