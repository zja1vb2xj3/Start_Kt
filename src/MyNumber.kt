open class MyNumber(val inputNumber1 : Int, val inputNumber2: Int) {
    val num1 = inputNumber1
    val num2 = inputNumber2

    open fun printNumber(){
        println("num1 : " + num1)
        println("num2 : " + num2)
    }
}