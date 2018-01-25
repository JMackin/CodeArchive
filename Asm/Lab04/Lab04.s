	AREA |.text|, CODE, READONLY, ALIGN=2
		
	EXPORT __main
		
a 	EQU 0x20000004
b	EQU 0x20000008
c	EQU 0x2000000C
d	EQU 0x20000010
		
__main

	MOVS R0, #8
	LDR R7, =a
	STR R0, [R7] ; a = 8
	
	MOVS R1, #12
	LDR R7, =b
	STR R1, [R1] ; b = 12
	
	MOVS R2, #8
	LDR R7, =c
	STR R2, [R7] ; c = 8
	
	MOVS R3, #0
	LDR R7, =d
	STR R3, [R7] ; d = 0
	
	CMP R0, R1 
	BEQ else1 ; if a != b, else break to else1
	MOVS R4, #2
	ADDS R3, R2, R1 ; d = b + c
	SUBS R3, R3, R2 ; d = d - 2
	LDR R7, =d
	STR R3, [R7] ; store d
	ADDS R2, R2, #1 ; c = c + 1
	LDR R7, =c
	STR R2, [R7] ; store c
	B endif1
	
else1
	MOVS R4, #2 ; R4 = 2
	MULS R4, R1, R4 ; R4 = b * 2
	MOVS R3, R4 ; d = R4
	LDR R7, =d
	STR R3, [R7] ; store d
	
endif1
	MOVS R4, #9
	CMP R2, R4
	BNE done ; if c == 9, else break to done
	ADDS R1, R1, R2 ; b = b + c
	LDR R7, =b
	STR R1, [R7]; store b	

done
	B done
	END