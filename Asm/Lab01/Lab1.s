	AREA |.text|, CODE, READONLY, ALIGN=2
	EXPORT __main
		
__main
	MOVS R0,#10
	MOVS R1,#20
	ADD R0,R1
	
done
	B done
	END
		