package main.kotlin.calcul_mental

class Game {
    private var score = 0
    private var lives = 3
    private var level = 1

    // Initialisation des paramètres de la partie
    private fun initGame() {
        println("Bienvenue dans le jeu de calcul mental !")
        println("Vous avez $lives vies. Bonne chance !")
        score = 0
        level = 1
    }

    // Affichage des messages de fin de jeu
    private fun displayGameOver() {
        println("Game Over. Votre score final est: $score")
    }

    // Démarrage du jeu
    fun start() {
        initGame()
        while (lives > 0) {
            val equation = EquationGenerator.generateEquation(level)
            println("Résolvez l'équation : $equation")
            val userAnswer = InputReader.readUserAnswer()

            val correctAnswer = EquationGenerator.evaluateEquation(equation)

            if (userAnswer == correctAnswer) {
                println("Bonne réponse !")
                score += ScoreManager.getPoints(level)
                println("Score actuel : $score")
                // Gérer les niveaux
                when (score) {
                    2 -> {
                        level = 2
                        println("Vous passez au niveau 2 !")
                    }
                    4 -> {
                        level = 3
                        println("Vous passez au niveau 3 !")
                    }
                }
            } else {
                lives -= 1
                println("Mauvaise réponse.")
                if (lives > 0) {
                    println("Il vous reste $lives vie${if (lives > 1) "s" else ""}.")
                }
            }
        }
        displayGameOver()
    }
}
