fun main(args: Array<String>) {
    var result = calculateEvenDigits(readlnOrNull())
    println(result);
}

fun calculateEvenDigits(word: String?): Int {
    var sum: Int = 0
    if (word != null) {
        for (i in word) {
            var k = i.digitToInt();
            if (k % 2 == 0) {
                sum += k;
            }
        }
    }
    return sum
}