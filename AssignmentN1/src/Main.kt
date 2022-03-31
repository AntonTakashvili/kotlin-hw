fun main() {
    val mas: Array<Int> = arrayOf(1,2,3,4,5,6)
    sumEvenIndexNum(mas)

    val word = "madam"
    ifPalindrome(word)

}

fun sumEvenIndexNum(array: Array<Int>): Int {
    var sum = 0
    for (i in 0 until array.size)
        if (i%2==0)
            sum+=array[i]
    return sum
}
fun ifPalindrome(str:String):Boolean{
    var reverse=""
    val len = str.length-1
    for (i in len downTo 0)
        reverse+= str[i]
    return reverse == str
}
