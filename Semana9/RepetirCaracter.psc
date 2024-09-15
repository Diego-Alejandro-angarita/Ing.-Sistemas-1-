		Algoritmo RepetirCaracter
	definir mensaje, mensajeFinal Como Cadena
	Definir char Como Caracter
	Definir i Como Entero
	Escribir "ingrese el mensaje que desee"
	Leer mensaje
	mensajeFinal<-""
	
	para i<-1 Hasta Longitud(mensaje) Hacer
		char<-Subcadena(mensaje,i,i)
		
		Si char<>" " Entonces
			mensajeFinal<-mensajeFinal + char + char
		SiNo
			mensajeFinal<-mensajeFinal + char
		FinSi
	FinPara
	Escribir mensajeFinal
FinAlgoritmo
