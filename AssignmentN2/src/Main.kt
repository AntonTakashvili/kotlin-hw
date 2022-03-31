import kotlin.math.sqrt

class Point(val x: Int = 0, val y: Int = 0){

    override fun toString(): String {
        return "Point x=$x \nPoint y=$y"
    }
//    override fun equals(equal: Any?):Boolean{
//        return  equal is Point && equal.x == x && equal.y ==y
//    }
    fun changePoint(): Point {
        return Point(x*-1,y*-1)
    }
}


fun main() {
    val p1 = Point(2,3)
    val p2 = Point(4,5)

    println(p1.toString())
    println(p1==p2)
    println(p1.changePoint())
}