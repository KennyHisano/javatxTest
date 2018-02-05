package com.mycompany.app;

public class TxParams {

    private String address;

    /**
     * @param address represents the destionation of transaction
     */
    public TxParams(String address) {
        this.address = address;
    }

    /**
     *@return the address
     */
    public String getAddress() {
        return address;
    }

}