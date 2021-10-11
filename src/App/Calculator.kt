package App


fun main(){
println("Введите оператор: ")
val x = readLine()!!
when(x) {
    "+" -> plus()
    "-" -> minus()
    "*" -> multiplication()
    "/" -> divide()
    else -> {
        println("Введите оператор!!")
    }
}
}




private fun plus() {
    val a1 = readLine()!!.parseToInt()
    val a2 = readLine()!!.parseToInt()
    println(div(a1, a2))
}

private fun minus() {
    val a1 = readLine()!!.parseToInt()
    val a2 = readLine()!!.parseToInt()
    println(div2(a1, a2))
}


private fun multiplication() {
    val a1 = readLine()!!.parseToInt()
    val a2 = readLine()!!.parseToInt()
    println(div3(a1, a2))
}

private fun divide() {
    val a1 = readLine()!!.parseToInt()
    val a2 = readLine()!!.parseToInt()
    println(div4(a1, a2))
}






private fun div(a1: Int, a2: Int): String {
    return "res= ${a1 + a2}"
}


private fun div2(a1: Int, a2: Int): String {
    return "res= ${a1 - a2}"
}

private fun div3(a1: Int, a2: Int): String {
    return "res= ${a1 * a2}"
}
private fun div4(a1: Int, a2: Int): String {
    return try {
        "res= ${a1 / a2}"
    } catch (e: ArithmeticException) {
        "На 0 делить нельзя!!!"
    }
}



private fun String.parseToInt(): Int {
    if (this == "") return 0
    //---
    return this.toInt()
}
