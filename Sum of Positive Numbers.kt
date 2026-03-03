fun main() {
    val numbers = listOf(-1, 5, -3, 8, 2)
    var sum = 0

    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("Sum of positive numbers: $sum")
}