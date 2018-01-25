	AREA |.text|, CODE, READONLY, ALIGN=2
		
	EXPORT __main
		
a 	EQU 0x20000004
b	EQU 0x20000008
c	EQU 0x2000000C
	
__main	; Lab 5 Program 1

		MOVS R0, #5
	LDR R7, =a
	STR R0, [R7] ; a = 5
	
	MOVS R1, #10
	LDR R7, =b
	STR R1, [R7] ; b = 10
	
	CMP R0,R1 ; a <= b ?
	BHI else1 ; break if a>b
	LDR R7, =c ; load c
	MOVS R3, #3 ; R3 equals 3
	ADDS R2, R0, R1 ; c = a + b
	SUBS R2, R2, R3 ; c = c - 3
	STR R2, [R7] ; store c
	B done
	
	
else1
	MOVS R2, #1 ; R2 equals 1
	LDR R7, =c ; load c
	STR R2, [R7] ; c = 1 and store
	
	
done
	B done
	END