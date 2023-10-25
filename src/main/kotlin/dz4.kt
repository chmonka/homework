fun main(args: Array<String>) {

    print(convertToSugar(10,20,10))
}

fun convertToSugar(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    val exchangeRate = dayNumber * bugRank + 42
    return cashAmount * exchangeRate
}