
const val MAX = 10_000
var x : Int
var y = 12.0
val z : Boolean = true

fun main() {
    MAX = 10
    x = 2.0
    y++
    truc(y)
    z = (x == 2)
    if (inc(x) == 3)
        print("ok")
}

fun truc(a : Int) {
    println(a)
}

fun inc(a : Double) = a++

