package main.kotlin.calcul_mental

import kotlin.random.Random

// Objet pour générer et évaluer des équations en fonction du niveau
object EquationGenerator {
    // Fonction pour générer une équation sous forme de chaîne de caractères en fonction du niveau
    fun generateEquation(level: Int): String {
        return when (level) {
            1 -> {
                val a = Random.nextInt(1, 100)
                val b = Random.nextInt(1, 100)
                "$a + $b"
            }
            2 -> {
                val a = Random.nextInt(100, 1000)
                val b = Random.nextInt(1, 100)
                val c = Random.nextInt(1, 100)
                "$a - $b + $c"
            }
            3 -> {
                val a = Random.nextInt(1, 10)
                val b = Random.nextInt(1, 100)
                "$a * $b"
            }
            else -> throw IllegalArgumentException("Niveau invalide : $level")
        }
    }

    // Fonction pour évaluer l'équation générée et renvoyer le résultat
    fun evaluateEquation(equation: String): Int {
        val tokens = equation.split(" ")
        return when (tokens[1]) {
            "+" -> tokens[0].toInt() + tokens[2].toInt()
            "-" -> tokens[0].toInt() - tokens[2].toInt() + tokens[4].toInt()
            "*" -> tokens[0].toInt() * tokens[2].toInt()
            else -> throw IllegalArgumentException("Opération invalide dans l'équation : $equation")
        }
    }
}
