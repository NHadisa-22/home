fun int7(a:Int) { // где A>B
    var b:Int=a % 10
    var c:Int=a/10
    var sum:Int=c+b
    var proiz:Int=c*b
    println("Сумма чисел = $sum")
    println("Произведение чисел = $proiz")

}
fun main(args: Array<String>) {
    int7(20)

}
