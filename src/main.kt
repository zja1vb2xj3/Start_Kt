fun main(argss: Array<String>) {
    val num1 = 5
    val num2 = 5

    val myNumber = MyNumber(num1, num2)

    myNumber.printNumber();
}

fun returnableSum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun returnlessSum(num1: Int, num2: Int) = println(num1 + num2)
