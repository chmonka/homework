fun main(args: Array<String>) {
    var name = "Tomas"
    var NameFun = NibirunianClass();
    println(NameFun.namePlate)
    NameFun.createNamePlate(name)
    println(NameFun.namePlate)
    
    var name1 = "Denis"
    var NameFunOPO = NibirunianClass();
    println(NameFunOPO.namePlate)
    NameFunOPO.createNamePlate(name1)
    println(NameFunOPO.namePlate)
}


class NibirunianClass {
    var namePlate : String = "SASHA"

    fun createNamePlate(name:String){
        namePlate = "Живи долго и счастливо, $name"
    }

}





