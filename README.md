# Jeu de Calcul Mental en Kotlin

## Description
Ce projet est un jeu de calcul mental développé en Kotlin. Le jeu propose des équations à résoudre à différents niveaux de difficulté. Les joueurs doivent répondre correctement pour accumuler des points et avancer dans les niveaux, tout en faisant attention à leurs vies.

## Structure du Projet
Le projet est structuré en plusieurs fichiers Kotlin, chacun ayant une responsabilité spécifique :

- **`Main.kt`** : Point d'entrée du programme. Contient la fonction `main()` qui initialise le jeu et démarre l'exécution.
- **`Game.kt`** : Contient la classe `Game` qui gère la logique du jeu, y compris le suivi des scores, des vies, et des niveaux. C'est le cœur du jeu où la majorité de la logique se déroule.
- **`EquationGenerator.kt`** : Responsable de la génération des équations en fonction du niveau de difficulté. Comprend les fonctions `generateEquation(level: Int)` pour créer les équations et `evaluateEquation(equation: String)` pour calculer la réponse correcte.
- **`InputReader.kt`** : Gère la lecture et la validation de l'entrée utilisateur. La fonction `readUserAnswer()` lit la réponse de l'utilisateur et renvoie un entier, ou affiche un message d'erreur si l'entrée est invalide.
- **`ScoreManager.kt`** : Gère le système de points en fonction du niveau. La fonction `getPoints(level: Int)` retourne les points attribués pour une réponse correcte en fonction du niveau actuel.

## Fonctionnalités
- **Trois niveaux de difficulté** :
    - **Niveau 1** : Équations de type `xx + xx`.
    - **Niveau 2** : Équations de type `xxx - xx + xx`.
    - **Niveau 3** : Équations de type `x * xx`.
- **Système de niveaux** : Passe au niveau suivant après avoir atteint le nombre de points requis (2 bonnes réponses pour le niveau 2, 4 pour le niveau 3).
- **Système de vies** : Perdez une vie pour chaque réponse incorrecte. Le jeu se termine lorsque vous n'avez plus de vies.
- **Gestion des erreurs** : Le jeu vérifie que l'entrée utilisateur est un entier valide.

## Exécution
Pour exécuter le projet, suivez ces étapes :
1. **Ouvrir le Projet** : Ouvrez le projet dans un IDE compatible avec Kotlin, tel qu'IntelliJ IDEA.
2. **Configurer les Dépendances** : Assurez-vous que toutes les dépendances nécessaires sont installées. Le projet est autonome, donc aucune dépendance externe n'est requise.
3. **Exécuter le Jeu** : Exécutez le fichier `Main.kt`. Le jeu démarrera dans la console.

## Instructions de Jeu
1. **Répondez Correctement** : Résolvez les équations pour accumuler des points et avancer dans les niveaux.
2. **Surveillez Vos Vies** : Faites attention à vos vies. Le jeu se termine lorsque vous n'avez plus de vies.
3. **Passez aux Niveaux Supérieurs** : Atteignez le nombre requis de bonnes réponses pour passer aux niveaux suivants et obtenir plus de points par réponse correcte.