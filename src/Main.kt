fun main() {
    println("Выберите подзадания, от 1 до 3")

    val userChoice: String? = readLine()

    when (userChoice) {
        "1" -> missionOne()
        "2" -> missionTwo()
        "3" -> missionThree()
        else -> println("Неизвестный выбор")
    }
}

/*Пользователь вводит целое положительное число.
Вычислить сумму первой и последней цифры этого числа и вывести на экран. */
fun missionOne() {
    val inputNumber = readLine()
    val numbers = inputNumber?.toInt()

    if (numbers!! <= 9) {
        println("Число должно быть как минимум двузначным")
    } else {
        val result = (numbers % 10) + (numbers / pow(10, inputNumber.length - 2))
        println("Результат: " + result)
    }
}

/* Пользователь вводит с клавиатуры поочередно любые числа (подтверждая ввод каждого нажатием “Enter”),
 до тех пор пока не будет введено число “0”. После ввода нуля необходимо вывести на экран количество введенных чисел,
 их общую сумму и среднее арифметическое. */
fun missionTwo() {
    var numberCounter: Int = 0
    var numberSum: Double = 0.0
    var arithmeticMean: Double = 0.0

    println("Введите число")

    var number: String? = readLine()

    while (number != "0") {
        try {
            val inputNumber: Double = number!!.toDouble()
            numberCounter += 1
            numberSum += inputNumber
        } catch (e: Exception) {
            println("Ошибка ввода\n" + e.message)
        }
        println("Следующее число: ")

        number = readLine()
    }

    arithmeticMean = numberSum / numberCounter

    println("Всего введено чисел: $numberCounter\nСумма чисел: $numberSum\nСреднее арифметическое: $arithmeticMean")
}

/*Программа “Угадай число”. */
fun missionThree() {
    val randomNumber: Int = (0..10).random()
    var userInputNumber: Int = -1

    println("Компьютер загадал число. Введите ваше число")

    while (userInputNumber != randomNumber) {
        val userStringInputNumber = readLine()
        val userIntNumber = userStringInputNumber?.toInt()

        if (userIntNumber!! < randomNumber) {
            println("Мало")
        } else if (userIntNumber > randomNumber) {
            println("Много")
        } else {
            println("Угадал")
            break
        }
    }
}

fun pow(a: Int, b: Int): Int {
    var counter = 0
    var result = a
    while (counter != b) {
        result = result * a
        println(result)
        counter += 1
    }
    return result
}

