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

/*Задается количество простых чисел n (1n). Необходимо вывести на экран простые числа начиная с 2. */
fun missionOne() {
    println("Введите число n")
    val n: Int = readln().toInt()
    val numbers = arrayOfNulls<Int>(n + 1)
    var result: String = ""

    for (counterI in 0..n) {
        numbers.set(counterI, counterI)
    }

    numbers[1] = 0

    for (counterI in 2..n) {
        if (numbers[counterI] != 0) {
            var counterJ = 2 * counterI
            while (counterJ <= n) {
                numbers[counterJ] = 0
                counterJ = counterJ + counterI
            }
        }
    }

    for (couterI in 0..n) {
        if (numbers[couterI] != 0) {
            result += numbers[couterI].toString() + ", "
        }
    }
    println("Простые числа для заданного N = " + result.removeRange(result.length - 2, result.length))
}

/*Дан массив из целых чисел.
Вывести на экран элементы массива, которые больше соседних (предыдущего и следующего) элементов массива.*/
fun missionTwo() {
    val numbers = arrayOf(5, 1, 9, 3, 12, 5, 3, 10, 7, 24, 2)
    var whileCounterI: Int = 1

    println("For")
    for (counterI in 1..numbers.size - 2) {
        if (checkNumbers(numbers[counterI - 1], numbers[counterI], numbers[counterI + 1])) {
            print("[Число: ${numbers[counterI]}. Соседи: ${numbers[counterI - 1]} и ${numbers[counterI + 1]}]")
        }
    }

    println("\nWhile")
    while (whileCounterI <= numbers.size - 2) {
        if (checkNumbers(numbers[whileCounterI - 1], numbers[whileCounterI], numbers[whileCounterI + 1])) {
            print("[Число: ${numbers[whileCounterI]}. Соседи: ${numbers[whileCounterI - 1]} и ${numbers[whileCounterI + 1]}]")
        }
        whileCounterI += 1
    }

    println("\nForEach")
    numbers.forEachIndexed { index, current ->
        if (index > 0 && index < numbers.size - 1) {
            val prev = numbers[index - 1]
            val next = numbers[index + 1]

            if (checkNumbers(prev, current, next)) {
                print("[Число: $current. Соседи: $prev и $next]")
            }
        }
    }
}

/*Дан массив с элементами. Найдите произведение элементов этого массива, найдите min и max элемент.*/
fun missionThree() {
    val numbers = arrayOf(5, 1, 9, 3, 12, 5, 3, 10, 7, 24, 2)

    var whileCounterI: Int = 0
    var composition: Int = numbers[0]
    var min: Int = Int.MAX_VALUE
    var max: Int = Int.MIN_VALUE

    for (counterI in 0..numbers.size - 2) {
        composition *= numbers[counterI + 1]
        min = Math.min(min, numbers[counterI + 1])
        max = Math.max(max, numbers[counterI + 1])
    }
    println("For\nПроизведение = $composition. Мин: $min Макс: $max")

    composition = numbers[0]
    min = Int.MAX_VALUE
    max = Int.MIN_VALUE

    while (whileCounterI <= numbers.size - 2) {
        composition *= numbers[whileCounterI + 1]
        min = Math.min(min, numbers[whileCounterI + 1])
        max = Math.max(max, numbers[whileCounterI + 1])
        whileCounterI += 1
    }
    println("While\nПроизведение = $composition. Мин: $min Макс: $max")

    composition = numbers[0]
    min = Int.MAX_VALUE
    max = Int.MIN_VALUE

    composition = numbers.reduce { numberOne, numberTwo -> numberOne * numberTwo }
    min = numbers.reduce { numberOne, numberTwo -> Math.min(numberOne, numberTwo) }
    max = numbers.reduce { numberOne, numberTwo -> Math.max(numberOne, numberTwo) }

    println("Reduce\nПроизведение: $composition Мин: $min Макс: $max")

    composition = numbers[0]
    min = Int.MAX_VALUE
    max = Int.MIN_VALUE

    numbers.forEachIndexed { index, current ->
        if (index < numbers.size - 1) {
            composition *= numbers[index + 1]
            min = Math.min(min, numbers[index + 1])
            max = Math.max(max, numbers[index + 1])
        }
    }
    println("ForEach\nПроизведение: $composition Мин: $min Макс: $max")
}

fun checkNumbers(left: Int, medium: Int, right: Int): Boolean {
    if (left < medium && medium > right) {
        return true
    } else {
        return false
    }
}