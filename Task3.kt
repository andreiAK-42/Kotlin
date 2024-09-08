fun main() {
    println("Введите a: ")
    val a = readln().toInt()

    println("Введите b: ")
    val b = readln().toInt()

    println("Введите c: ")
    val c = readln().toInt()

    quadraticRoot(a, b, c)
}

/*Написать функцию sqr(n), которая в качестве параметра принимает число n и возвращает квадрат этого числа. */
fun sqr(n: Int): Int {
    return n * n
}

/*Написать функцию discriminant(a, b, c), которая в качестве параметров принимает коэффициенты a, b и c
заданного уравнения. Возвращает рассчитанный дискриминант.*/
fun discriminant(a: Int, b: Int, c: Int): Int {
    return sqr(b) - (4 * a * c)
}

/*Написать функцию  rootsNumber(a, b, c), которая в качестве параметров принимает коэффициенты a, b и c
заданного уравнения. Данная функция в зависимости от дискриминанта должна определить и
вернуть количество корней заданного квадратного уравнения. Реализовать с помощью конструкции when(). */
fun rootsNumber(a: Int, b: Int, c: Int): Int {
    val resultDiscriminant = discriminant(a, b, c)
    when {
        resultDiscriminant > 0 -> return 2
        resultDiscriminant == 0 -> return 1
        resultDiscriminant < 0 -> return 0
    }
    return -1
}

/*Написать функцию quadraticRoot(a, b, c), которая в качестве параметров принимает коэффициенты a, b и c
заданного уравнения. Данная функция должна вывести на экран корни заданного квадратного уравнения. */

fun quadraticRoot(a: Int, b: Int, c: Int) {
    val resultDiscriminant = discriminant(a, b, c)

    when (rootsNumber(a, b, c)) {
        2 -> println(
            "Корни: ${(-b + Math.sqrt(resultDiscriminant.toDouble())) / (2 * a)} и " +
                    "${(-b - Math.sqrt(resultDiscriminant.toDouble())) / (2 * a)}"
        )

        1 -> println("Корень: ${-b / (2 * a)}")
        0 -> println("Корней нет")
        -1 -> println("Неивзестная ошибка")
    }
}