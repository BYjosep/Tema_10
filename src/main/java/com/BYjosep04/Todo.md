> Ejercicios a hacer
>
> Opcional
>
> [ ] Ejercicio 5
>
> Obligatorio
>
> [ ] Ejercicio 7

 ```
Estadio<--Zonas<--Filas<-- Asiento

```


zona->normal

zona->Vip



> Afluiencia: BAJA, ALTA, MEDIA


> ```
> Entrada  -> (tipo Entrada), numero de entrada, evento, zona, fila,asiento
>
>Entrada normal -> zona normal -> 1..n
>
> Entrada vip -> zona Vip 
> ```




> ```
> Entrada vip <---> zona vip
> Entrada Normal <---> zona normal
> 
> 
> Entrada Normal --> Entrada+ numero sorteo (entre 1 y numero de asientos)
> 
> Entrada Vip --> Entrada+ numero casillero
> 
> 
> entrada vendida---> marcar asiento como ocupado
> 
> si asiento ocupado --> no se puede seleccionar
> ```

