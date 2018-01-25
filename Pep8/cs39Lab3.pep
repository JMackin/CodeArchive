 ;John Mackin, Lab3
 ;
         stro    prompt1,d   ;prompt
         DECI    valueA,d    ;trap vala
         LDA     valueA,d    ;Load vala to accum
         STA     valueA,d    ;store accum in vala
         DECI    valueB,d    ;trap valb
         LDA     valueB,d    ;load valb to accum
         STA     valueB,d    ;store accum to valb
         DECI    valueC,d    ;trap valc
         LDA     valueC,d    ;valc to accum
         STA     valueC,d    ;accum to valc
         LDA     valueA,d    ;load vala to accum from mem
         ORA     valueC,d    ;vala OR valc
         ANDA    valueB,d    ;(vala OR valc) AND valb
         STA     valueD,d    ;store result in vald
         DECO    valueD,d    ;output result
         STOP
         
valueA:  .BLOCK 2
valueB:  .BLOCK 2
valueC:  .BLOCK 2
valueD:  .BLOCK 2
prompt1: .ascii "Enter 3 values\n"
;prompt2: .ascii "Enter val B\n"
;prompt3: .ascii "Enter val C\n"
         .END