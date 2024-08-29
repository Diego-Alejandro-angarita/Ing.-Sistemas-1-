Funcion area <- areaCirc(radio)
	Definir area Como Real;
	area <- (radio*radio) * (PI);
FinFuncion
Proceso areaCircunferencia
	Definir radio Como Real;
	Escribir "¿cual es el radio de la circunferencia?";
	Leer radio;
	Escribir areaCirc(radio);
FinProceso
