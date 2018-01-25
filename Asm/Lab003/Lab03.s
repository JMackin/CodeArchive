	AREA |.text|, CODE, READONLY, ALIGN=2
		
	EXPORT __main
		
a 	EQU 0x20000004
b	EQU 0x20000008
c	EQU 0x2000000C
			
__main

	MOVS R0, #1 ;a
	LDR R7, =a
	STR R0, [R7] ;a=1
	
	MOVS R1, #2 ;b
	LDR R7, =b
	STR R1, [R7] ;b=2
	
	MOVS R2, #3 ;c
	LDR R7, =c
	STR R2, [R7] ;c = 3
	
	CMP R0, #1 ;a == 1?
	BNE endif1 ;if a != 1
	MOVS R3, #4
	MULS R1, R3, R1 ;b = b * 4
	ADDS R1, R1, #2 ;b = b + 2
	LDR R7, =b
	STR R1, [R7] ;b = 10
	
	CMP R0, R1 
	BHI endif1 ;a <= b?
	ADDS R1, R2, #4
	STR R1, [R7] ;then b = c + 4
	LDR R0, [R7] ;return b

endif1
	B done
done
	B done
	END