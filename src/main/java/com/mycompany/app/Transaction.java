package com.mycompany.app;

public class Transaction {

    final private TxParams input;
    final private TxParams output;
    /**
     * <CODE>Transaction<CODE/> constructor
     * @param input and output is brought with dependancy injection
     *
     * without dependancy injection,
     *
     * public String address;
     * public Transaction(address) {
     * TxParams txParams = new TxParams(address);
     * }
     */

    public Transaction(TxParams input, TxParams output){
        this.input = input;
        this.output = output;
    }

    public TxParams getTxInput(){
        return input;
    }

    public TxParams getOutput() {
        return output;
    }

    public String viewTx(){
        System.out.println(input.getAddress());
        System.out.println(output.getAddress());

        return input.getAddress() + output.getAddress();
    }




}
