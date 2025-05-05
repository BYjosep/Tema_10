## Ejercicios para el proximo día

> [ ] 4

Crea una superclase llamada `Electrodomestico` con las siguientes características:

a)  **Atributos (heredables):**
* `precioBase`: double
* `color`: String
* `consumoEnergetico`: char (letras entre 'A' y 'F')
* `peso`: double

b)  **Valores por defecto (usar constantes):**
* `color`: "blanco" (`COLOR_DEF`)
* `consumoEnergetico`: 'F' (`CONSUMO_ENERGETICO_DEF`)
* `precioBase`: 100.0 € (`PRECIO_BASE_DEF`)
* `peso`: 5.0 kg (`PESO_DEF`)



d)  **Constructores:**
* Un constructor por defecto (usará los valores por defecto).
* Un constructor que recibe `precioBase` y `peso`. El resto de atributos usarán los valores por defecto.
* Un constructor que recibe todos los atributos (`precioBase`, `color`, `consumoEnergetico`, `peso`).

e)  **Métodos:**
* **Métodos `get`:** Para todos los atributos (`getPrecioBase()`, `getColor()`, `getConsumoEnergetico()`, `getPeso()`).
* **`comprobarConsumoEnergetico(char letra)`:**
* Comprueba si la `letra` proporcionada está entre 'A' y 'F'.
* Si no es correcta, asigna el valor por defecto (`CONSUMO_ENERGETICO_DEF`).
* Este método debe ser invocado al crear el objeto (probablemente dentro del constructor o setters) y *no debe ser visible desde fuera* (sugerencia: `private` o `protected`).
* **`comprobarColor(String color)`:**
* Comprueba si el `color` proporcionado está en la lista de colores disponibles (ignorando mayúsculas/minúsculas).
* Si no es correcto, asigna el color por defecto (`COLOR_DEF`).
* Este método debe ser invocado al crear el objeto (probablemente dentro del constructor o setters) y *no debe ser visible desde fuera* (sugerencia: `private` o `protected`).
* **`precioFinal()`:**
* Calcula el precio final del electrodoméstico basándose en el `consumoEnergetico` y el `peso`.
* **Incremento por Consumo Energético:**
| LETRA | PRECIO ADICIONAL |
| :---- | :--------------- |
| A     | 100 €            |
| B     | 80 €             |
| C     | 60 €             |
| D     | 50 €             |
| E     | 30 €             |
| F     | 10 €             |
* **Incremento por Tamaño (Peso):**
| RANGO DE PESO      | PRECIO ADICIONAL |
| :----------------- | :--------------- |
| Entre 0 y 19 kg    | 10 €             |
| Entre 20 y 49 kg   | 50 €             |
| Entre 50 y 79 kg   | 80 €             |
| Mayor o igual 80 kg| 100 €            |
* El método debe devolver el `precioBase` más los incrementos correspondientes.

## Subclase `Lavadora`

Crea una subclase `Lavadora` que hereda de `Electrodomestico`:

f)  **Características:**
* **Atributo propio:**
* `carga`: double (representa la capacidad en kg)
* **Valor por defecto (usar constante):**
* `carga`: 5.0 kg (`CARGA_DEF`)
* **Constructores:**
* Un constructor por defecto.
* Un constructor que recibe `precioBase` y `peso`. El resto por defecto (incluida la `carga`).
* Un constructor que recibe `carga` y todos los atributos heredados (`precioBase`, `color`, `consumoEnergetico`, `peso`). **Importante:** Debe invocar al constructor de la clase padre (`super(...)`).
* **Métodos:**
* **Método `get`:** Para el atributo `carga` (`getCarga()`).
* **`precioFinal()` (Sobrescrito):**
* Si la `carga` es mayor de 30 kg, añade 50 € al precio.
* Debe invocar al método `precioFinal()` de la clase padre (`super.precioFinal()`) para obtener el precio base calculado según consumo y peso, y luego añadir el incremento por carga si aplica.

## Subclase `Television`

Crea una subclase `Television` que hereda de `Electrodomestico`:

g)  **Características:**
* **Atributos propios:**
* `resolucion`: int (en pulgadas)
* `smartTV`: boolean
* **Valores por defecto (usar constantes):**
* `resolucion`: 20 pulgadas (`RESOLUCION_DEF`)
* `smartTV`: `false` (`SMARTTV_DEF`)
* **Constructores:**
* Un constructor por defecto.
* Un constructor que recibe `precioBase` y `peso`. El resto por defecto (incluidos `resolucion` y `smartTV`).
* Un constructor que recibe `resolucion`, `smartTV` y todos los atributos heredados (`precioBase`, `color`, `consumoEnergetico`, `peso`). **Importante:** Debe invocar al constructor de la clase padre (`super(...)`).
* **Métodos:**
* **Métodos `get`:** Para `resolucion` (`getResolucion()`) y `smartTV` (`isSmartTV()`).
* **`precioFinal()` (Sobrescrito):**
* Si la `resolucion` es mayor de 40 pulgadas, incrementa el precio un 30%.
* Si `smartTV` es `true`, añade 50 € al precio.
* Debe invocar al método `precioFinal()` de la clase padre (`super.precioFinal()`) para obtener el precio base calculado según consumo y peso, y luego aplicar los incrementos por resolución y SmartTV si corresponden.

## Clase Principal (Ejecución)

h)  **Crea una clase ejecutable que realice lo siguiente:**
1.  Crea un array (o lista) de `Electrodomestico` con capacidad para 10 elementos.
2.  Rellena el array asignando a cada posición un objeto de tipo `Electrodomestico`, `Lavadora` o `Television`, creados con valores diversos (pueden ser aleatorios o predefinidos).
3.  Recorre el array y ejecuta el método `precioFinal()` para cada electrodoméstico. Guarda o acumula los precios.
4.  Calcula y muestra por separado:
* El precio total de todos los objetos `Television`.
* El precio total de todos los objetos `Lavadora`.
* El precio total de *todos* los `Electrodomestico` (incluyendo Lavadoras y Televisiones, ya que también *son* Electrodomésticos).
5.  **Pista:** Utiliza el operador `instanceof` para determinar el tipo específico de cada objeto en el array al momento de sumar los totales por categoría.

    **Ejemplo del resultado esperado:**
    Si al final tienes:
    * Varios Electrodomésticos genéricos sumando 300 €.
    * Varias Lavadoras sumando 200 €.
    * Varias Televisiones sumando 500 €.

    La salida debería mostrar algo como:
    * Precio total Lavadoras: 200 €
    * Precio total Televisiones: 500 €
    * Precio total Electrodomésticos: 1000 € (300 + 200 + 500)
