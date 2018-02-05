package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionTest {

    @Test
    public void inputTest(){
        TxParams txParamsinput= new TxParams("dhajkdahkjc");
        TxParams txParamsoutput = new TxParams("ahjhcuxicn");
        Transaction txTest = new Transaction(txParamsinput,txParamsoutput);
        //compare the input with actual data
        assertEquals(txTest.viewTx(),"dhajkdahkjcahjhcuxicn");



    }
}