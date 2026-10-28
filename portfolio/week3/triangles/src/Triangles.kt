// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double, Double, Double>

fun isValidTriangle(sides: Triangle): Boolean {
    val a = sides.first
    val b = sides.second
    val c = sides.third

    return a > 0 && b > 0 && c > 0 &&
           a + b > c &&
           a + c > b &&
           b + c > a
}

fun triangleArea(sides: Triangle): Double {
    if (!isValidTriangle(sides)) {
        throw IllegalArgumentException("Invalid triangle")
    }

    val a = sides.first
    val b = sides.second
    val c = sides.third

    val s = (a + b + c) / 2.0

    return sqrt(s * (s - a) * (s - b) * (s - c))
}
