fun main() {
    println("hello!")
    var x = kotlin.random.Random.nextInt(10)
        //(Math.random()* 10).toInt()  below kotlin 1.3
    var y : Long = x.toLong()
    println(y)

    val myArray = arrayOf(1,2,3,4,5)
    val text = if (myArray.size > x)"greater than"
     else if (myArray.size<x)"smaller than"
    else "equal to"
    println("my array is $text the value of x which is : $x ")
}
