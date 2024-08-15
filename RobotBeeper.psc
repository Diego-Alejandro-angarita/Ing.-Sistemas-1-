Proceso RobotBeeper
	Definir a,b, i, p, beepers, beeperEx Como Entero;
	Definir direccion Como Cadena;
	
	direccion = "oeste";
	Escribir "ingresa la avenida en la que el robot se encuentra";
	Leer a;
	Escribir "ingresa la calle en la que el robot se encuentra";
	Leer b;
	beepers = 0;
	
	Escribir "estoy en la avenida ",a," y la calle ", b, " mirando hacia el ", direccion;
	
	Si direccion == "oeste" Entonces
		Escribir "giré a la izquierda";
		direccion <- "norte";
		Escribir "estoy en la avenida ",a," y la calle ", b, " mirando hacia el ", direccion;
		Escribir "giré a la izquierda";
		direccion <- "este";
	FinSi
	
	Para i<-a Hasta 1 Con Paso -1 Hacer
		Escribir "hay un beeper 1-si 2-no";
		Leer beeperEx;
		Si beeperEx == 1 Entonces
			beepers <- beepers +1;
		FinSi
		si a == 1 Entonces
			Escribir "estoy en la avenida 1 ", "y la calle ", b, " mirando hacia el ", direccion;
		SiNo
			si a>1 & direccion == "este" Entonces
				Escribir "estoy en la avenida ", i," y la calle ", b, " mirando hacia el ", direccion;
			FinSi
		FinSi
	FinPara
	
	Si direccion == "este" Entonces
		Escribir "giré a la izquierda";
		direccion <- "sur";
	FinSi
	
	Para p<-b Hasta 1 Con Paso -1 Hacer
		Escribir "hay un beeper 1-si 2-no";
		Leer beeperEx;
		Si beeperEx == 1 Entonces
			beepers <- beepers +1;
		FinSi
		si a == 1 Entonces
			Escribir "estoy en la avenida 1 ", "y la calle ", b, " mirando hacia el ", direccion;
		SiNo
			si b>1 & direccion == "sur" Entonces
				Escribir "estoy en la avenida ", i," y la calle ", b, " mirando hacia el ", direccion;
			FinSi
		FinSi
	FinPara
	
	Escribir "estoy en la avenida y la calle 1 mirando hacia el ", direccion, " y recogí", beepers, " beepers";
	Escribir "me apagué";
FinProceso