Algoritmo argentina_programa_ej_1
	numeroInicio <- 5
	numeroFin <- 14
	mostrarParidad <- "p" // i -> impares \ p pares
	Mientras (numeroInicio<=numeroFin)
		Si (numeroInicio mod 2==0) Entonces
			resultado <- "p"			
		SiNo
 			resultado <- "i"
		FinSi
		Si (resultado=mostrarParidad) Entonces
			Escribir Sin Saltar numeroInicio
			Escribir resultado
		FinSi
		numeroInicio=numeroInicio+1
	FinMientras	
FinAlgoritmo
