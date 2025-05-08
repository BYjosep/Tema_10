> Ejercicios a hacer
>
> Opcional
>
> [ ] Ejercicio 5
>
> Obligatorio
>
> [ ] Ejercicio 7



## 1. **`Estadio`**

- **Atributos:**
    
    - `nombre` (String): Nombre del estadio.
    - `zonas` (List<Zona>): Lista de zonas (normales y VIP) del estadio.
    - `eventos` (List<Evento>): Lista de eventos programados en el estadio.
    - `entradasVendidas` (List<Entrada>): Lista de entradas vendidas.
- **Métodos:**
    
    - `Estadio(String nombre)`: Constructor para crear un estadio con un nombre específico.
    - `agregarZona(Zona zona)`: Añade una zona al estadio.
    - `agregarEvento(Evento evento)`: Añade un evento al estadio.
    - `venderEntrada(Evento evento, Zona zona, int fila, int columna)`: Vende una entrada para un evento específico en una zona determinada.
    - `generarNumeroSorteo()`: Genera un número de sorteo aleatorio para entradas normales.
    - `getNombre()`: Obtiene el nombre del estadio.
    - `getZonas()`: Obtiene la lista de zonas del estadio.
    - `getEventos()`: Obtiene la lista de eventos programados en el estadio.
    - `getEntradasVendidas()`: Obtiene la lista de entradas vendidas.
    - `toString()`: Representación en cadena del estadio.

---

## 2. **`Zona` (Clase Base)**

- **Atributos:**
    
    - `numeroZona` (int): Número identificador de la zona.
    - `precioBase` (double): Precio base de los asientos en la zona.
    - `filas` (int): Número de filas en la matriz de asientos.
    - `columnas` (int): Número de columnas en la matriz de asientos.
    - `asientos` (IAsiento[][]): Matriz de asientos en la zona.
- **Métodos:**
    
    - `Zona(int numeroZona, double precioBase, int filas, int columnas)`: Constructor para inicializar una zona.
    - `getNumeroZona()`: Obtiene el número de la zona.
    - `getPrecioBase()`: Obtiene el precio base de la zona.
    - `getFilas()`: Obtiene el número de filas.
    - `getColumnas()`: Obtiene el número de columnas.
    - `getAsientos()`: Obtiene la matriz de asientos.
    - `toString()`: Representación en cadena de la zona.

---

## 3. **`ZonaNormal` (Extiende `Zona`)**

- **Atributos:**
    
    - No tiene atributos adicionales.
- **Métodos:**
    
    - `ZonaNormal(int numeroZona, double precioBase, int filas, int columnas)`: Constructor para crear una zona normal.
    - `isZonaValida(int numeroZona)`: Verifica si el número de zona es válido (mayor o igual a 1).
    - `toString()`: Representación en cadena de la zona normal.

---

## 4. **`ZonaVip` (Extiende `Zona`)**

- **Atributos:**
    
    - `casilleros` (Casillero[][]): Matriz de casilleros asociados a los asientos VIP.
- **Métodos:**
    
    - `ZonaVip(double precioBase, int filas, int columnas)`: Constructor para crear una zona VIP.
    - `inicializarCasilleros(int totalCasilleros)`: Inicializa la matriz de casilleros.
    - `isCasilleroAbierto(int fila, int columna, int codigoSecreto)`: Verifica si un casillero está abierto.
    - `getCasillero(int fila, int columna)`: Obtiene un casillero específico.
    - `toString()`: Representación en cadena de la zona VIP.

---

## 5. **`Casillero`**

- **Atributos:**
    
    - `numero` (int): Identificador único del casillero.
    - `codigoSecreto` (int): Código secreto asociado al casillero.
- **Métodos:**
    
    - `Casillero(int numero)`: Constructor para crear un casillero con un número específico.
    - `generarCodigoSecreto()`: Genera un código secreto aleatorio para el casillero.
    - `getNumero()`: Obtiene el número del casillero.
    - `getCodigoSecreto()`: Obtiene el código secreto del casillero.
    - `isAbierto(int codigoSecreto)`: Verifica si el casillero está abierto.
    - `toString()`: Representación en cadena del casillero.

---

## 6. **`Asiento` (Implementa `IAsiento`)**

- **Atributos:**
    
    - `ocupado` (boolean): Indica si el asiento está ocupado.
- **Métodos:**
    
    - `Asiento()`: Constructor para crear un asiento inicialmente libre.
    - `isOcupado()`: Verifica si el asiento está ocupado.
    - `ocuparAsiento()`: Ocupa el asiento si está libre.
    - `liberarAsiento()`: Libera el asiento si está ocupado.
    - `toString()`: Representación en cadena del asiento (con colores ANSI).

---

## 7. **`Entrada` (Clase Abstracta)**

- **Atributos:**
    
    - `id` (int): Identificador único de la entrada.
    - `asiento` (IAsiento): Asiento asociado a la entrada.
    - `evento` (Evento): Evento asociado a la entrada.
- **Métodos:**
    
    - `Entrada(IAsiento asiento, Evento evento)`: Constructor para crear una entrada.
    - `getId()`: Obtiene el ID de la entrada.
    - `getAsiento()`: Obtiene el asiento asociado.
    - `getEvento()`: Obtiene el evento asociado.
    - `venderEntrada(IAsiento asiento)`: Intenta vender la entrada ocupando el asiento.
    - `toString()`: Representación en cadena de la entrada.

---

## 8. **`EntradaNormal` (Extiende `Entrada`)**

- **Atributos:**
    
    - `numeroSorteo` (int): Número de sorteo asociado a la entrada normal.
- **Métodos:**
    
    - `EntradaNormal(IAsiento asiento, Evento evento, int numeroSorteo)`: Constructor para crear una entrada normal.
    - `getNumeroSorteo()`: Obtiene el número de sorteo.
    - `toString()`: Representación en cadena de la entrada normal.

---

## 9. **`EntradaVip` (Extiende `Entrada`)**

- **Atributos:**
    
    - `numeroSecreto` (int): Código secreto del casillero asociado.
    - `filaCasillero` (int): Fila del casillero asociado.
    - `columnaCasillero` (int): Columna del casillero asociado.
- **Métodos:**
    
    - `EntradaVip(IAsiento asiento, Evento evento, ZonaVip zonaVip, int fila, int columna)`: Constructor para crear una entrada VIP.
    - `getNumeroSecreto()`: Obtiene el código secreto del casillero.
    - `getFilaCasillero()`: Obtiene la fila del casillero.
    - `getColumnaCasillero()`: Obtiene la columna del casillero.
    - `toString()`: Representación en cadena de la entrada VIP.

---

## 10. **`Evento`**

- **Atributos:**
    
    - `nombre` (String): Nombre del evento.
    - `fecha` (LocalDate): Fecha del evento.
    - `descripcion` (String): Descripción del evento.
- **Métodos:**
    
    - `Evento(String nombre, LocalDate fecha, String descripcion)`: Constructor para crear un evento con descripción.
    - `Evento(String nombre, LocalDate fecha)`: Constructor para crear un evento sin descripción.
    - `getNombre()`: Obtiene el nombre del evento.
    - `getFecha()`: Obtiene la fecha del evento.
    - `getDescripcion()`: Obtiene la descripción del evento.
    - `toString()`: Representación en cadena del evento.