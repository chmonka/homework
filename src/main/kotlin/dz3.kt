
fun main(args: Array<String>) {
    println(calcChairs(10))
}
fun calcChairs(aliens: Int): Int {
    val z = (aliens / 2)
    return aliens + z
}