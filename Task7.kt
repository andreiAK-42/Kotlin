fun main() {/*создать объекты car1 = Car(“Lada”,100) и car2 = Car(“Lada”,100)*/
    var car1 = Car("Lada", 100)
    val car2 = Car("Lada", 100)

    /*вывести на экран сравнение двух объектов car1 и car2 с помощью операторов “==” и “===”,
    вывести на экран hashCode этих объектов. */
    println("Сравнение: ${car1 == car2}. Hashcode: сar1: ${car1.hashCode()} и car2: ${car2.hashCode()}")

    /*создать объект car3 = car1,*/
    var car3 = car1

    /*вывести на экран сравнение двух объектов car1 и car3 с помощью операторов “==” и “===”,
    вывести на экран hashCode этих объектов*/
    println("Сравнение: ${car3 == car1} и ${car3 === car1}. Hashcode: сar1: ${car1.hashCode()} и car3: ${car3.hashCode()}")

    /*в объекте car3 изменить свойство name = “Belaz”, вывести на экран свойства name объектов car1 и car3,
    Проанализировать поведение. */
    car3.name = "Belaz"

    println("car3.name = ${car3.name}")
    println("car1.name = ${car3.name}")

    /*создать объекты vehicle1 = Vehicle(“Ural”,100) и vehicle2 = Vehicle(“Ural”,100) */
    var vehicle1 = Vehicle("Ural", 100)
    var vehicle2 = Vehicle("Ural", 100)

    /*провести все операции описанные выше, над объектами vehicle1 и  vehicle2*/

    println("Сравнение: ${vehicle1 == vehicle2}. Hashcode: vehicle1: ${vehicle1.hashCode()} и vehicle2: ${vehicle2.hashCode()}")

    var vehicle3 = vehicle1

    println("Сравнение: ${vehicle3 == vehicle1} и ${vehicle3 === vehicle1}. Hashcode: vehicle1: ${vehicle1.hashCode()} и vehicle3: ${vehicle3.hashCode()}")

    vehicle3.name = "Belaz"

    println("vehicle3.name = ${vehicle3.name}")
    println("vehicle1.name = ${vehicle1.name}")

    /*создать объекты vehicle3 = vehicle1.copy(“ZIL”) и vehicle4 = vehicle1.copy() */
    vehicle3 = vehicle1.copy("ZIL")
    var vehicle4 = vehicle1.copy()

    /*провести все операции сравнения между объектами vehicle3 и vehicle1, vehicle4 и vehicle1.
    Проанализировать полученные результаты. */
    println("Сравнение: ${vehicle1 == vehicle3} и ${vehicle1 === vehicle3}. Hashcode: vehicle1: ${vehicle1.hashCode()} и vehicle3: ${vehicle3.hashCode()}")
    println("Сравнение: ${vehicle1 == vehicle4} и ${vehicle1 === vehicle4}. Hashcode: vehicle1: ${vehicle1.hashCode()} и vehicle4: ${vehicle4.hashCode()}")

    val turtle: Turtle = Turtle()

    turtle.move(Point(1f, 2f), Command.UP)
    println(turtle.getPosition())

    turtle.move(Point(5f, -6f), Command.DOWN)
    println(turtle.getPosition())
}

/*Создать класс Car с двумя полями:name и speed  и дата класс Vehicle с двумя полями:name и speed . */
class Car {
    var name: String
    var speed: Int

    constructor(name: String, speed: Int) {
        this.name = name
        this.speed = speed
    }
}

class Vehicle {
    var name: String
    var speed: Int

    constructor(name: String, speed: Int) {
        this.name = name
        this.speed = speed
    }

    fun copy(name: String = this.name, age: Int = this.speed) = Vehicle(name, age)
}

class Point {
    var x: Float
    var y: Float

    constructor(x: Float, y: Float) {
        this.x = x
        this.y = y
    }

    /*В классе Point  переопределить метод toString(), который будет возвращать строку “текущие координаты x, y”.*/
    override fun toString(): String {
        return "Текущие координаты X: $x Y: $y"
    }

    operator fun plus(point: Point): Point {
        return Point(this.x + point.x, this.y + point.y)
    }
}

enum class Command {
    UP, DOWN, LEFT, RIGHT
}

class Turtle {
    private var position: Point

    constructor() {
        position = Point(0f, 0f)
    }

    fun move(point: Point, command: Command) {
        when (command) {
            Command.UP -> {
                this.position = this.position + point
                println("Произведено перемещение по оси Х на ${point.x}, по оси У на ${point.y}")
            }

            Command.DOWN -> {
                this.position = this.position + point
                println("Произведено перемещение по оси Х на ${point.x}, по оси У на ${point.y}")
            }

            Command.LEFT -> {
                this.position = this.position + point
                println("Произведено перемещение по оси Х на ${point.x}, по оси У на ${point.y}")
            }

            Command.RIGHT -> {
                this.position = this.position + point
                println("Произведено перемещение по оси Х на ${point.x}, по оси У на ${point.y}")
            }
        }
    }

    fun getPosition(): String {
        return "Позиция: X: ${position.x} Y: ${position.y}"
    }
}


