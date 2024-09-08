fun main() {
    val kvadrat: kvadrat = kvadrat(10.0)
    val treygolnik: treygolnik = treygolnik(9.0, 5.0, 3.0, 10.0)
    val kryg: kryg = kryg(5.0)

    println("Площадь квадрата ${kvadrat.getArea()} периметр: ${kvadrat.getPerimeter()}")
    println("Площадь треугольника ${treygolnik.getArea()} периметр: ${treygolnik.getPerimeter()}")
    println("Площадь круга ${kryg.getArea()} периметр: ${kryg.getPerimeter()}")
}

abstract class Figure {
    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double
}

interface IFigure {
    fun getArea(): Double
    fun getPerimeter(): Double
}

class kvadrat : Figure, IFigure {
    val a: Double

    constructor(a: Double) {
        this.a = a
    }

    override fun getArea(): Double {
        return a * a
    }

    override fun getPerimeter(): Double {
        return a * 4
    }
}

class treygolnik : Figure, IFigure {
    val a: Double
    val b: Double
    val c: Double
    val h: Double

    constructor(a: Double, b: Double, c: Double, h: Double) {
        this.a = a
        this.b = b
        this.c = c
        this.h = h
    }

    override fun getArea(): Double {
        return (a * h) / 2
    }

    override fun getPerimeter(): Double {
        return a + b + c
    }
}

class kryg : Figure, IFigure {
    val r: Double

    constructor(r: Double) {
        this.r = r
    }

    override fun getArea(): Double {
        return Math.PI * r * r
    }

    override fun getPerimeter(): Double {
        return 2 * Math.PI * r
    }
}



