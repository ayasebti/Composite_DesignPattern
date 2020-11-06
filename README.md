# Composite_DesignPattern
Un patron de conception (design pattern): permet de concevoir une structure
arborescente, form´e d’´el´ements tr`es diff´erents et compl´ementaires.
• Le composant d´eclare l’interface des objets entrants dans la composition
et impl´emente son comportement par d´efaut. Cet ´el´ement d´efinit aussi une
interface pour acc´eder aux composants enfants et les g´erer (dans une structure
r´ecursive on peut trouver une interface pour acc´eder `a un parent).
• Le composite d´efinit le comportement des composants dot´es d’enfants, stocke
les composants enfants et impl´emente les op´erations qui leur sont li´ees. Ainsi
le composite contient plusieurs autres objets, ce qui fait de lui une sorte de
conteneur.
• La feuille n’a pas d’enfant et elle d´efinit le comportement d’objets primitifs.
• L’utilisateur manipule les objets de la composition `a l’aide de l’interface. Il
peut grouper les composants comme il le souhaite pour en former des plus
grands.
