# Composite_DesignPattern
Un patron de conception (design pattern): permet de concevoir une structure
arborescente, form´e d’elements tres differents et complementaires.

• Le composant d´eclare l’interface des objets entrants dans la composition
et implemente son comportement par defaut. Cet el´ment definit aussi une
interface pour acceder aux composants enfants et les gerer (dans une structure
recursive on peut trouver une interface pour acceder a un parent).

• Le composite definit le comportement des composants dotes d’enfants, stocke
les composants enfants et implemente les operations qui leur sont liees. Ainsi
le composite contient plusieurs autres objets, ce qui fait de lui une sorte de
conteneur.

• La feuille n’a pas d’enfant et elle definit le comportement d’objets primitifs.

• L’utilisateur manipule les objets de la composition a l’aide de l’interface. Il
peut grouper les composants comme il le souhaite pour en former des plus
grands.
