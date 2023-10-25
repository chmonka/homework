fun main(args: Array<String>) {
    val sugarStorage = SugarStorage(scan.nextInt())
    sugarStorage.decreaseSugar(scan.nextInt())
    println(sugarStorage.initialBalance)
    sugarStorage.increaseSugar(scan.nextInt())
    println(sugarStorage.initialBalance)
}

class SugarStorage(var initialBalance: Int) {

    fun decreaseSugar(v: Int): Int {
        if (v >= 0) {
            initialBalance -= v
            if (initialBalance < 0) initialBalance = 0
        }
        return v
    }
    fun increaseSugar(v: Int):Int{
        if (v >= 0) {
            initialBalance += v
        }
        return v
    }


}