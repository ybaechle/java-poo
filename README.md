# Exercices JAVA POO

Ce repository contient les solutions aux exercices de programmation orientée objet en Java. Chaque exercice est conçu pour vous aider à pratiquer et à comprendre les concepts de base de la POO, y compris l'encapsulation, l'héritage, et la redéfinition de méthodes.

## Table des Matières
1. Exercice 1 : Compte Bancaire
2. Exercice 2 : Voiture
3. Exercice 3 : Rectangle
4. Exercice 4 : Cercle et Point
5. Exercice 5 : Livre
6. Exercice 6 : Personne, Étudiant et Staff
7. Exercice 7 : Ville et Capitale

## Exercice 1: Compte Bancaire

### Description
- Créez une classe `Compte` représentant un compte bancaire avec les attributs `solde`.
- Ajoutez des méthodes pour déposer, retirer, et afficher le solde.

### Fichiers
- `Compte.java`
- `TestCompte.java`

### Instructions
1. Créez la classe `Compte` avec un constructeur prenant un paramètre `solde`.
2. Implémentez les méthodes `deposer`, `retirer`, et `afficher`.
3. Créez la classe `TestCompte` pour tester les fonctionnalités.

## Exercice 2: Voiture

### Description
- Créez une classe `Voiture` avec les attributs `marque` et `prix`.
- Ajoutez des getters, setters, et une méthode `afficher`.

### Fichiers
- `Voiture.java`
- `Exécution.java`

### Instructions
1. Créez la classe `Voiture` avec un constructeur par défaut.
2. Implémentez les getters, setters et la méthode `afficher`.
3. Créez la classe `Exécution` pour exécuter et tester les résultats.

## Exercice 3: Rectangle

### Description
- Créez une classe `Rectangle` avec les attributs `longueur` et `largeur`.
- Ajoutez des méthodes pour calculer la surface et le périmètre, ainsi qu'une méthode `afficher`.

### Fichiers
- `Rectangle.java`
- `TestRectangle.java`

### Instructions
1. Créez la classe `Rectangle` avec un constructeur prenant `longueur` et `largeur`.
2. Implémentez les méthodes `surface`, `périmètre` et `afficher`.
3. Créez la classe `TestRectangle` pour afficher les résultats.

## Exercice 4: Cercle et Point

### Description
- Créez un package `geometry` contenant les classes `Point` et `Cercle`.
- Ajoutez des méthodes pour calculer le périmètre et la surface du cercle, tester l'appartenance d'un point au cercle, et afficher les résultats.

### Fichiers
- `geometry/Point.java`
- `geometry/Cercle.java`
- `TestCercle.java`

### Instructions
1. Créez le package `geometry` avec les classes `Point` et `Cercle`.
2. Implémentez les méthodes `périmètre`, `surface`, `testAppartenance`, et `afficher`.
3. Créez la classe `TestCercle` pour tester les résultats.

## Exercice 5: Livre

### Description
- Corrigez les erreurs de syntaxe dans la classe `Livre` et ajoutez une méthode `main` pour tester les fonctionnalités.
- Ajoutez des accesseurs et modificateurs pour les attributs, et implémentez des constructeurs et la méthode `afficheToi`.

### Fichiers
- `Livre.java`
- `TestLivre.java`

### Instructions
1. Corrigez les erreurs dans la classe `Livre` et ajoutez la méthode `main`.
2. Implémentez les accesseurs, modificateurs, et constructeurs.
3. Créez la classe `TestLivre` pour tester les fonctionnalités.

## Exercice 6: Personne, Étudiant et Staff

### Description
- Implémentez les classes `Personne`, `Student`, et `Staff` en suivant le diagramme de classes.
- Ajoutez des méthodes pour afficher les informations de chaque classe.

### Fichiers
- `Personne.java`
- `Student.java`
- `Staff.java`
- `Main.java`

### Instructions
1. Créez les classes `Personne`, `Student`, et `Staff` avec leurs attributs et méthodes respectifs.
2. Implémentez la méthode `toString` pour afficher les informations.
3. Créez la classe `Main` pour tester la hiérarchie.

## Exercice 7: Ville et Capitale

### Description
- Implémentez les classes `Ville` et `Capitale` avec des attributs, constructeurs, getters, setters, et méthodes spécifiques.
- Redéfinissez la méthode `afficheToi` pour afficher les informations de la ville et de la capitale.

### Fichiers
- `Ville.java`
- `Capitale.java`
- `Main.java`

### Instructions
1. Créez la classe `Ville` avec les attributs `nom` et `nbHab`.
2. Implémentez les constructeurs, getters, setters, et la méthode `afficheToi`.
3. Créez la classe `Capitale` qui hérite de `Ville` avec l'attribut `pays`.
4. Implémentez les constructeurs, getters, setters, et redéfinissez la méthode `afficheToi`.
5. Créez la classe `Main` pour tester les résultats.

---

## Comment exécuter les exercices

### **Cloner le repository**
   ```bash
   git clone https://github.com/your-username/java-poo-exercises.git
   cd java-poo-exercises
