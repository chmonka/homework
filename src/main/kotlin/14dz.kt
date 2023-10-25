fun main() {
    println(getLengthNullDangerous("Мама мыла раму"))
    println(getLengthNullDangerous(null))
}

fun getLengthNullDangerous(str: String?): Int? {
    return str?.length
}