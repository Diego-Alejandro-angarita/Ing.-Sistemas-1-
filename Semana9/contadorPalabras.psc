Funcion hs<-contarHs(string)
	Definir i,long, hContador Como Entero
	hContador<-0
	long<-Longitud(string)
	Dimension arreglo[long]
	para i<-1 hasta long Con Paso 1 Hacer
		arreglo[i]<-Subcadena(string,i,i)
		Si arreglo[i] == "h" Entonces
			hContador<-hContador + 1
		FinSi
		
	FinPara
	Si hContador>0 Entonces
		Escribir "hay ", hContador, " letras h" 
	SiNo
		Escribir "hay ", hContador, " letras h"
	FinSi
FinFuncion

Funcion holas<-contarHolas(string)
	Definir i,long, holaContador, a Como Entero
	holaContador<-0
	long<-Longitud(string)
	i<-1
	Mientras i<=long-3 Hacer
		Si Subcadena(string,i, i+3) == "hola" Entonces
			holaContador <- holaContador + 1
			i<-i+4
		SiNo
			i<-i+1
		FinSi
	FinMientras
	
	Si holaContador>0 Entonces
		Escribir "hay ", holaContador, " palabras hola en el mensaje" 
	SiNo
		Escribir "no hay palabras hola en el mensaje"
	FinSi
FinFuncion
	
Funcion js<-contarJs(string)
	Definir i,long, jContador, a Como Entero
	jContador<-0
	long<-Longitud(string)	
	i<-1
	Mientras i<=long Hacer
		Si  (Subcadena(string,i,i)=="J") Entonces
			jContador <- jContador + 1
		SiNo
			i<-i+1
		FinSi
	FinMientras
	Si jContador>0 Entonces
		Escribir "hay ", jContador, " palabras hola en el mensaje" 
	SiNo
		Escribir "no hay letras J en el mensaje"
	FinSi
FinFuncion

Algoritmo contadorPalabras
	Definir palabra Como Cadena
	Escribir "escribe el mensaje que desees"
	Leer palabra
	Escribir contarHs(palabra)
	Escribir contarHolas(palabra)
	Escribir contarJs(palabra)
FinAlgoritmo