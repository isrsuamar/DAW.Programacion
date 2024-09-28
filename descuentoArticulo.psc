// Una tienda ofrece un descuento del x% sobre el total de la compra y 
// un cliente desea saber cuanto deberá pagar finalmente por su compra.
Algoritmo sin_titulo
	
	Definir precio Como Real
	Definir descuento Como Real
	
	Escribir "Dame el precio"
	Leer precio
	
	Escribir "Dame el descuento"
	Leer descuento
	
	precio = precio - ((precio * descuento / 100))
	
	Escribir  "El precio que ha pagado finalmente ha sido el " precio 
FinAlgoritmo
