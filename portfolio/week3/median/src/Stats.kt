
fun median(numbers: List<Float>): Float {
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("List is empty")
    }

    val sortedNumbers = numbers.sorted()
    val middle = sortedNumbers.size / 2

    if (sortedNumbers.size % 2 == 1) {
        return sortedNumbers[middle]
    } else {
        return (sortedNumbers[middle - 1] +
                sortedNumbers[middle]) / 2.0f
    }
}
