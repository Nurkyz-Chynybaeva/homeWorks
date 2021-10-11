

fun main(){




//    do {
//        println("введите число")
//        val f = readLine()!!.toInt()
//        println(factorial(f))
//        println("Продолжить ? y- yes , any - no")
//        val x = readLine()!!
//    }
//    while (x == "y")
//
//}
//
//fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)

//
//    val num = readLine()!!.toInt()
//
//    val x0 = num / 1000 % 10
//    val x1 = num / 100 % 10
//    val x2 = num / 10 % 10
//    val x3 = num % 10
//
//    val res = x0+x1 == x2+x3
//
//    val a2= when{
//        res -> "true"
//        else -> "false"
//    }
//    println(a2)












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
