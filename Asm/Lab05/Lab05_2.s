	AREA |.text|, CODE, READONLY, ALIGN=2
		
	EXPORT __main
		
a 	EQU 0x20000004
b	EQU 0x20000008
c	EQU 0x2000000C
	
__main	; Lab 5 Program 2

		MOVS R0, #5
	LDR R7, =a ; load a
	STR R0, [R7] ; a = 5
	
	MOVS R1, #10; load b
	LDR R7, =b
	STR R1, [R7] ; b = 10
	
	CMP R0,R1 ; a > b ?
	BLS else1 ; break tp else1 if a <= b
	LDR R7, =c ; load c
	MOVS R3, #2
	MULS R3, R1, R3 ; r3 equals b * 2
	ADDS R2, R0, R3 ; c = a + b*2
	MOVS R3, #5 
	SUBS R2, R2, R3 ; c = c - 5
	STR R2, [R7] ; store c
	B done
	
else1
	LDR R7, =c ; load c
	ADDS R2, R0, #7 ; c = a + 7
	STR R2, [R7] ; c = 1 and store
	
done
	B done
	END