;
;

	BR	main
indx1:	.BLOCK  2
load:	LDA     0x0001,i		; Load A with Zero
		STA     indx1,d			; indx1 = 0

		DECI    vals,d			; Read and Load first value in Array val
getNxt:	LDX 	indx1,d			; Get the Next address in Array
		ASLX 					; 2 * i
		DECI    vals,x			; Read and Load values from Index Register
		
		LDA     indx1,d			; Increment Array index Address by 1
		ADDA    1,i
		STA     indx1,d
		CPA     10,i			; Compare with Size of Array
		BREQ    exitLd			; Exit if Done
		BR      getNxt			; 
		 
exitLd:	RET0                	; pop retAddr
		
main:	LDA     0x0000,i
		STA     indx,d
		LDA     0x0000,i
		STA     totl,d
		CALL	load			; Call load subroutine to load the Array Values

loop:	LDX 	indx,d			; Load the Index of Array
		ASLX 					; 2 * i
		LDA     vals,x			; Load the Values from Array
		ADDA    totl,d			; Add this value to Total
		STA     totl,d			; Store the Total
		LDA     indx,d			; Increment the Index Value
		ADDA    1,i
		STA     indx,d	
		CPA     10,i			; Check if all 10 values processed
		BREQ    quit
		BR      loop

quit:	DECO    totl,d			; Print the Final Total Value
		STOP
		
		
indx:	.BLOCK  2
totl:	.BLOCK  2
inpt:	.BLOCK  2
vals:	.BLOCK  20
		.END