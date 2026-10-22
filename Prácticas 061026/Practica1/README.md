Leslie Montserrath Tolentino Pelcastre 4° "C"
Práctica 1: Mayor de Tres Números en Java
Se desarrolló un programa que solicita al usuario tres números enteros (a, b y c). Utilizando estructuras de control if-else anidadas (un bloque dentro de otro), el programa evalúa las condiciones necesarias para determinar con total precisión cuál de los tres números es el mayor, considerando también casos de números negativos y empates.

¿Por qué se hizo de esta forma?
Estructura anidada (if-else dentro de if-else) se decidió no usar funciones automáticas como Math.max para entender la lógica fundamental de las decisiones paso a paso
Primer filtro (if (a > b)) divide el problema en dos grandes caminos. Si a es mayor que b, b queda descartado; si no, a queda descartado.
Segundo filtro (Comparación con c) en cada camino principal, el número que iba ganando se enfrenta a c para definir al "campeón absoluto" o número mayor. Esto garantiza que la lógica cubra todas las combinaciones posibles de forma ordenada.
