## Ejercicios para el proximo día

> [ ] 1
> 
> Escribe una clase Punto que tenga:
>
> a) Dos atributos (x e y) de tipo double para representar la posición del punto.
>
> b) Un constructor con dos parámetros de tipo double que inicialice los dos atributos.
>
> c) Un constructor por defecto (sin parámetros) que inicialice los dos atributos al valor 0.
> 
> d) Tenga un método distancia() que reciba un parámetro de tipo Punto y devuelva un double.
>  
> e) Un método toString() que devuelva la información del Punto de la siguiente manera (x,y).


¡Claro! La fórmula más sencilla para calcular la distancia ($d$) entre dos puntos en un plano cartesiano con coordenadas $(x_1, y_1)$ y $(x_2, y_2)$ es la **fórmula de la distancia euclidiana**:

$$d = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}$$

Esta fórmula se basa en el teorema de Pitágoras. 
Simplemente tienes que restar las coordenadas x, 
elevar el resultado al cuadrado, 
hacer lo mismo con las coordenadas y, 
sumar ambos resultados y finalmente tomar la raíz cuadrada 
de esa suma.
 ¡Así obtendrás la distancia entre los dos puntos!

> [ ] 2
> [ ] 3