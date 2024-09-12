# TAREA3-DAS

Nicolas Almonacid Muñoz
0000293190


1. Clases de Equivalencia
Con base en las condiciones del problema, podemos definir las siguientes clases de equivalencia para determinar si una persona es un votante válido o no:

Persona fallecida (DEAD): Una persona que no está viva no puede votar.
Menor de edad (UNDERAGE): Solo las personas mayores de edad (por ejemplo, 18 años) pueden votar.
Edad no válida (INVALID_AGE): Las edades negativas o extremadamente altas (más allá de lo humanamente posible) no son válidas.
Persona ya registrada (DUPLICATED): No se puede registrar una persona más de una vez con el mismo ID.
Registro válido (VALID): La persona cumple con todos los requisitos (está viva, tiene la edad adecuada, y no ha sido registrada antes).
