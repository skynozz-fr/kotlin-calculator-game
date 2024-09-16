package main.kotlin.calcul_mental

// Objet pour gérer le score en fonction du niveau
object ScoreManager {
    // Fonction pour renvoyer les points en fonction du niveau
    fun getPoints(level: Int): Int {
        return when (level) {
            1 -> 1
            2 -> 2
            3 -> 3
            else -> throw IllegalArgumentException("Niveau invalide : $level")
        }
    }
}