# Roman Numerals Kata
Exprimer un nombre entre 1 et 3999 en chiffres romains

# Analyse métier
 * La notation romaine sépare les unités, les dizaines, les centaines et les milliers

<html> 
<table>
    <tr align="center">
        <td>n</td>
        <td>Un</td>
        <td>Mn</td>
        <td>Gn</td>
    </tr>
    <tr align="center">
        <td>1</td>
        <td>I</td>
        <td>V</td>
        <td>X</td>
    </tr>
     <tr align="center">
        <td>2</td>
        <td>X</td>
        <td>L</td>
        <td>C</td>
    </tr>
     <tr align="center">
        <td>3</td>
        <td>C</td>
        <td>D</td>
        <td>m</td>
    </tr>    
     <tr align="center">
        <td>4</td>
        <td>M</td>
        <td>aucun</td>
        <td>aucun</td>
    </tr>    
</table>
</html>

# Solution
 * Structure conditionnelle complexe seulement sur les nombres de 0 à 9
 * Généraliser la mise en oeuvre de ces règles en employant un ensemble de symboles qui dépend de la puissance de 10.
 
# TDD
 * Cycle 1: De 1 à 3
 * Cycle 2: 5
 * Cycle 3: De 6 à 8
 * Cycle 4: 4
 * Cycle 5: 9
 * Cycle 6: nombres 10, 20 et 30
 * Cycle 7: nombres 40, 50 et 90
 * Cycle 8: zéro
 * Cycle 9: nombres avec dizaines et unités à la fois
 * Cycle 10: nombres entre 100 et 999
 * Cycle 11: nombres >= 1000

  