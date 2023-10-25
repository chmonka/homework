fun main() {
    val civilian = BugCivilian(10, "John")
    println("Rank: ${civilian.rank}")
    println("Name: ${civilian.name}")
    println("Sugar Limit: ${civilian.getSugarLimit()}")
    println("ID: ${civilian.getId()}")
}

class BugCivilian(rank: Int, name: String) : Bug(rank, name) {
    override fun getSugarLimit(): Int {
        return super.getSugarLimit() / 2
    }
}

open class Bug(val rank: Int, val name: String) {

    open fun getSugarLimit(): Int {
        return rank
    }

    fun getId(): String {
        return "${rank}.${name}"
    }
}
