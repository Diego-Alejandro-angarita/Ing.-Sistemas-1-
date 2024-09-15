Algoritmo RepetirMensaje  
	definir mensaje, mensajeFinal Como Cadena
	Definir char Como Caracter
	Definir num, i Como Entero
	
	mensajeFinal<-""
	
	Escribir "ingrese un mensaje"
	Leer mensaje
	Escribir "ingrese un caracter"
	Leer char
	Escribir "ingrese un numero"
	Leer num
	
	para i<-1 Hasta num-1 Hacer
		mensajeFinal<- mensajeFinal+mensaje+char
	FinPara
	
	mensajeFinal<-mensajeFinal+mensaje
	Escribir mensajeFinal
FinAlgoritmo
