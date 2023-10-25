fun main() {
    println(getLengthOrNullSafety("Мама мыла раму"))
    println(getLengthOrNullSafety(null))
}

fun getLengthOrNullSafety(str: String?): Int {
    return str?.length ?: 0
}