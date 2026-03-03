fun main() {
    val numbers = listOf(10, 25, 7, 99, 3)
    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    println("Maximum number: $max")
}