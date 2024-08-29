	Funcion Usd <- ChfToUsd(Chf,TasaConversion)
		Definir Usd Como Real;
		Usd <- Chf * TasaConversion;
		Escribir "el valor de los CHF a USD es: ", Usd;
FinFuncion

Funcion Cop <- UsdToCop(Usd, TasaConversionToCop)
	Definir Cop, Porcentaje, CopTotal Como Real;
	Cop <- Usd * TasaConversionToCop;
	Escribir "los pesos son ", Cop, "pero se va a retener un 5% por comision";
	Porcentaje <- Cop * 0.05;
	CopTotal <- Cop - Porcentaje;
FinFuncion

Proceso CHF_TO_COP
	Definir TasaChf, TasaUsd, Francos, Dolares Como Real;
	Escribir "¿Cual es la tasa de conversion de CHF a USD?";
	Leer TasaChf;
	Escribir "¿Cual es la tasa de conversion de USD a COP?";
	Leer TasaUsd;
	
	Escribir "¿Cuantos CHF quieres guardar?";
	Leer Francos;
	
	Dolares <- Francos * TasaChf;
	
	Escribir ChfToUsd(Francos,TasaChf);
	Escribir UsdToCop(Dolares, TasaUsd);
FinProceso
