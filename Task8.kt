fun main() {
    println("Выберите подзадания, от 1 до 2")

    val userChoice: String? = readLine()

    when (userChoice) {
        "1" -> missionOne()
        "2" -> missionTwo()
        else -> println("Неизвестный выбор")
    }
}

fun missionOne() {
    println("Введите левое число: ")
    val numberLeft: Int = readln().toInt()

    println("Введите правое число: ")
    val numberRight: Int = readln().toInt()

    println("Введите тип операции [+, -, /, *]")
    val operation: String = readln()

    when (operation) {
        "+" -> println("$numberLeft + $numberRight = ${numberLeft + numberRight}")
        "-" -> println("$numberLeft - $numberRight = ${numberLeft - numberRight}")
        "/" -> println("$numberLeft / $numberRight = ${numberLeft.toDouble() / numberRight.toDouble()}")
        "*" -> println("$numberLeft * $numberRight = ${numberLeft * numberRight}")
        else -> println("Неивзестный выбор")
    }
}

fun missionTwo() {
    val words: Array<String?> = arrayOf("солнце", "камень", null, "мы", "лист", null, null, "орех")

    for (wordCounter in 0..words.size - 1) {
        if (words[wordCounter] != null) {
            println("if: " + words[wordCounter]!!.uppercase())
        }

        println("?. : " + words[wordCounter]?.uppercase())
        words[wordCounter]?.let { println("let(): " + it.uppercase()) }
        println(("?: : " + (words[wordCounter]?.uppercase() ?: "empty")))
    }
}