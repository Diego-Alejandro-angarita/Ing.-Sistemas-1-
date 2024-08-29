Funcion m <- calcPendiente(x1, x2, y1, y2)
	Definir m Como Real;
	m <- (y2-y1) / (x2-x1);
FinFuncion

Proceso Pendiente
	Definir x1, x2, y1, y2 Como Real;
	
	Escribir "ingrese el valor de x1 (debe variar entre -10 y 20)";
	Leer x1;
	
	Escribir "ingrese el valor de x2 (debe variar entre 10 y 20)";
	leer x2;
	
	Escribir "ingrese el valor de y1 (debe variar entre -10 y 10)";
	Leer y1;
	
	Escribir "ingrese el valor de y2 (debe variar entre 0 y 10)";
	Leer y2;
	
	Si (x1 < -20 | x1>10) | (x2<10 | x2>20) | (y1< -10 | y1>10) | (y2<0 | y2>10) | (x2-x1==0) Entonces
		Escribir "los valores ingresados son invalidos";
	SiNo
		Escribir "la pendiente es: ", calcPendiente(x1,x2,y1,y2);
	FinSi
FinProceso	