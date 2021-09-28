fun main(args: Array<String>){
    val sum = sumStrings(args)
    println(sum)
}

fun sumStrings(args: Array<String>): Int {
    var sum = 0
    for (arg in args) {
        val intValue = arg.toIntOrNull()
        if (intValue != null) {
            sum += intValue
        }
    }
    return sum
}