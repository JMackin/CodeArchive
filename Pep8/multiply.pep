         BR      main        
;******* int multiply (int mcand, int mpr)
mpr:     .EQUATE 2           ; formal parameter #2d
mcand:   .EQUATE 4           ; formal parameter #2d
sum:     .EQUATE 6           ; formal parameter #2d
multiply:LDA     0x0000,i    
         STA     sum,s       ; int sum = 0;
while1:  LDA     mpr,s       ; load the multiplier
         ASRA                ; arithmetic shift right mpr
         STA     mpr,s       ; push mpr
         BRC     addops      
         BR      shiftops    
addops:  LDA     sum,s       ; load sum
         ADDA    mcand,s     ; add the multiplicand to the sum
         STA     sum,s       ; add to the sum
shiftops:LDA     mcand,s     ; load the multiplicand
         ASLA                ; arithmetic shift left mcand
         STA     mcand,s     ; push mcand
         LDA     mpr,s       ; load the multiplier
         BRNE    while1      ; continue looping
         RET0                ; pop retAddr
;
;******* multiply () call parameters
;
ret:     .EQUATE -2          ; return value from function #2d
pnum1:   .EQUATE -4          ; first parameter #2d
pnum2:   .EQUATE -6          ; second parameter #2d
;
;******* main ()
;
num1:    .EQUATE 4           ; local variable #2d
num2:    .EQUATE 2           ; local variable #2d
result:  .EQUATE 0           ; local variable #2d
main:    SUBSP   6,i         ; allocate local variables #num1 #num2 #result
         STRO    prompt1,d   
         DECI    num1,s      ; cin >> num1
         STRO    prompt2,d   
         DECI    num2,s      ; cin >> num2
;
         LDA     num1,s      ; get num1
         STA     pnum1,s     ; push first parameter
         LDA     num2,s      ; get num2
         STA     pnum2,s     ; push second parameter
         SUBSP   6,i         ; allocate parameters #ret #pnum1 #pnum2
         CALL    multiply    ; call multiply function
         ADDSP   6,i         ; deallocate parameters  #ret #pnum1 #pnum2
         LDA     ret,s       
         STA     result,s    
;
         STRO    msg,d       
         DECO    result,s    
         ADDSP   6,i         ; deallocate local variables  #num1 #num2 #result
         STOP                
prompt1: .ASCII  "Enter the the multiplicand: (mcand) \x00"
prompt2: .ASCII  "Enter the multiplier: \x00"
msg:     .ASCII  "The result is: \x00"
         .END                  