Proceso Robot
	Definir a,b, i, p Como Entero;
	Definir direccion Como Cadena;
	
	direccion = "norte";
	Escribir "ingresa la avenida en la que el robot se encuentra";
	Leer a;
	Escribir "ingresa la calle en la que el robot se encuentra";
	Leer b;
	
	Escribir "estoy en la avenida ",a," y la calle ", b, " mirando hacia el ", direccion;

	Para i<-a Hasta 2 Con Paso -1 Hacer
		si a == 1 Entonces
			Escribir "estoy en la avenida 1 ", "y la calle ", b, " mirando hacia el ", direccion;
		SiNo
			si a>1 & direccion == "norte" Entonces
				Escribir "giré a la izquierda";
				direccion <- "este";
			SiNo
				Escribir "estoy en la avenida ", i," y la calle ", b, " mirando hacia el ", direccion;
			FinSi
		FinSi
	FinPara
	
	Para p<-b Hasta 2 Con Paso -1 Hacer
		si b == 1 Entonces
			Escribir "estoy en la avenida 1 y la calle 1"," mirando hacia el ", direccion;
		SiNo
			si b>1 & direccion == "este" Entonces
				Escribir "giré a la izquierda";
				direccion <- "sur";
			SiNo
				Escribir "estoy en la avenida 1"," y la calle ", p, " mirando hacia el ", direccion;
				Escribir "gire a la izquierda";
				direccion <- "oeste";
				Escribir "estoy en la avenida 1"," y la calle ", p, " mirando hacia el ", direccion;
				Escribir "gire a la izquierda";
				direccion <- "norte";
			FinSi
		FinSi
	FinPara
	Escribir "estoy en la avenida 1"," y la calle ", p, " mirando hacia el ", direccion;
	Escribir "me apagué";
	
FinProceso