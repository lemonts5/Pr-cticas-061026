Práctica 2: Clasificación de Calificaciones y Validación de Errores
¿Qué se hizo?
Se creó un programa que recibe una calificación numérica (de 0 a 100) y arroja la letra correspondiente según una escala establecida (A, B, C, D, F). Además, se implementó una red de seguridad para detectar automáticamente números inválidos o fuera de rango (como 105 o -5).

¿Por qué se hizo de esta forma?
Estructura else if en cadena:Permite evaluar rangos de manera secuencial. El programa evalúa las condiciones una por una hasta encontrar la que coincide.
Operador lógico && ("Y"):Se utilizó para exigir que la calificación cumpla simultáneamente con dos límites (por ejemplo, que sea mayor o igual a 90 y menor o igual a 100) para evitar traslapes o errores en los rangos.
Bloque else final: Funciona como un filtro atrapalotodo. Si la nota ingresada no encaja en ninguno de los rangos válidos (0-100), el código cae automáticamente aquí para notificar que se trata de un error o valor imposible.