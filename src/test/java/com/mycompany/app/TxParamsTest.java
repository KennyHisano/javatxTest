package com.mycompany.app;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TxParamsTest {


    public String address = "ashduajdlfdfuvvcvks4bfu4f";
    TxParams txParams = new TxParams(address);

    @Test
    public void TxParamParamTest(){

        //check weather txParams.getAddress returns parameter input
        assertEquals(txParams.getAddress(),address);
    }


    @Test
    public void TxParamTypeTest(){
        //test the type of the return value
       assertTrue(txParams.getAddress() instanceof String);
    }

}