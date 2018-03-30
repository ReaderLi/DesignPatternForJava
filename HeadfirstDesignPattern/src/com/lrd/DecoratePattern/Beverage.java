package com.lrd.DecoratePattern;

public abstract class Beverage {

    protected String description = "unknown Beverage";

    protected String cupSize;

    public String getCupSize(){

        String cupSizeCode = "0";

        if (cupSize.equals("tall")){
            cupSizeCode = CupSizeEnum.CUP_SIZE_TALL.getCupSizeCode();
        }

        if (cupSize.equals("grande")){
            cupSizeCode = CupSizeEnum.CUP_SIZE_GRAND.getCupSizeCode();
        }

        if(cupSize.equals("venti")){
            cupSizeCode = CupSizeEnum.CUP_SIZE_VENTI.getCupSizeCode();
        }

        return cupSizeCode;
    }

    public void setCupSize(String cupSize){
        this.cupSize = cupSize;
    }

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
