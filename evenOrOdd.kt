fun main() {
    var number: Int = 10 
    var data = evenOrOdd(number)
    print(data)
}

fun evenOrOdd(number: Int) = if (number % 2 == 0) "Even" else "Odd"