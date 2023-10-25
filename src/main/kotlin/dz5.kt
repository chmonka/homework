var scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>) {
    val year = scan.nextInt()
    println(getYearEra(year))
}
fun getYearEra(year:Int):String{
    return when {
        year < 1970 -> "до";
        year == 1970 -> "соотвествует";
        year <= 1999 -> "после (XX век)";
        year <= 2999 -> "после (XXI век)";
        else -> "далёкое будущее"
    }

}