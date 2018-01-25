	AREA |.text|, CODE, READONLY, ALIGN=2
		
	EXPORT __main
		
__main
	;a + b - c
	
	MOVS R0, #5 ;a
	MOVS R1, #3 ;b
	MOVS R2, #2 ;c
	
	ADDS R0, R1 ;(a+b)
	SUBS R0, R2 ; (a+b)-c
	
done
	B done


	END