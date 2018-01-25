; John Maackin Lab4 3/1/16
;
;
main:    LDA     0x0000,i
         STA     indx,d
         LDA     0x0000,i
         STA     totl,d

loop:    DECI    inpt,d
         LDA     inpt,d
         ADDA    totl,d
         STA     totl,d
         LDA     indx,d
         ADDA    1,i
         STA     indx,d
         CPA     10,i
         BREQ    quit
         BR      loop

quit:    DECO    totl,d 
         STOP
         
         

indx:    .BLOCK  2
totl:    .BLOCK  2
inpt:    .BLOCK  2
vals:    .BLOCK  8

         .END