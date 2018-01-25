main:    SUBSP   2,i         ; allocate space on stack for local variable
         LDA     0xDEAD,i    ; 
         STA     0,s         ; store to the stack, offset 0 is our variable
;
; setup to call mysub with one paramter
;
         MOVSPA              ; move the stack pointer to the accumulator
         ADDA    0,i         ; offset 0 is the main local variable
         SUBSP   2,i         ; allocate space on stack for subroutine parameter
         STA     0,s         ; store to the stack
         CALL    mysub       
         ADDSP   2,i         ; deallocate subroutine parameter
;
         ADDSP   2,i         ; deallocate local variables
         STOP                
;
; my subroutine
;
mysub:   LDA     2,sf        ; paramater is offset 2 (return addres is at offset 0)
         ADDA    1,i         
         STA     2,sf        
         RET0                
         STOP                
         .END                  