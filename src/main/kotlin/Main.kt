fun main(){
    greetGirl("Faith")
    var remainder = modulus(117, 23)
    println(remainder)
    var total = addition(78, 34, 20, 23)
    println(total)
    funFact()

}
fun greetGirl (name: String) {
    println ("Hello," + name)


}
fun modulus(num1:Int,num2:Int):Int{
    var modulus = num1 % num2
    return modulus

}


fun addition (num1:Int, num2:Int, num3:Int, num4:Int): Int {
    var addition = num1 + num2 + num3 + num4

    return (addition)
}

fun funFact () {
    var statement = " most people don't know can shake ears "
    println(statement)
}


