package main.kotlin.calcul_mental

// Objet pour lire et valider l'entrée de l'utilisateur
object InputReader {
    // Fonction pour lire l'entrée de l'utilisateur et la renvoyer sous forme d'entier, ou null si l'entrée est invalide
    fun readUserAnswer(): Int? {
        return readlnOrNull()?.toIntOrNull().also {
            // Si l'entrée n'est pas un nombre valide, affiche un message d'erreur
            if (it == null) {
                println("Veuillez entrer un nombre entier valide.")
            }
        }
    }
}