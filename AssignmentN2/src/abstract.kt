fun main() {
    val factory = ShipFactory()
    println(factory.build("Eagle"))
}


interface Ship{
    fun swim()
}

class Eagle:Ship{
    override fun swim(){
        println("We are in Ocean")
    }
}
class ShipFactory{
    fun build(shipType: String): Ship?{
        return when(shipType){
            "Eagle"-> Eagle()
            else->null
        }
    }
}
