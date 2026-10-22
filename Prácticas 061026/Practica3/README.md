Práctica 3: Desigualdad Triangular y Clasificación de Triángulos

¿Qué se hizo?
Se diseñó un programa que pide las medidas de tres lados (a, b, c). Primero comprueba si esas medidas pueden formar físicamente un triángulo (mediante la regla de la desigualdad triangular) y, de ser así, clasifica la figura en equilátero, isósceles o escaleno
¿Por qué se hizo de esta forma?
Validación inicial (a + b > c && ...):** Evita que el equipo intente clasificar figuras imposibles. La suma de cualesquiera dos lados siempre debe ser mayor que el tercer lado. Si esto falla, el programa se detiene de inmediato.
Evaluación de Equilátero (a == b && b == c):Se evalúa de primeras exigiendo que los tres lados sean estrictamente iguales.
Evaluación de Isósceles (|| - "O"): Si no fue equilátero, se usa el operador lógico || para comprobar si al menos un par de lados son iguales entre sí (a == b o a == c o b == c).
Bloque else por descarte:Si las opciones anteriores no se cumplen, por pura lógica matemática se deduce que todos los lados son diferentes, declarándolo automáticamente como un triángulo escaleno.