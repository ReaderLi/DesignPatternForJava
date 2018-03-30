package com.lrd.DecoratePattern;

public enum CupSizeEnum {

    CUP_SIZE_TALL("1"),
    CUP_SIZE_GRAND("2"),
    CUP_SIZE_VENTI("3");

    private String cupSizeCode;

    CupSizeEnum(String s) {
        cupSizeCode = s;
    }

    public String getCupSizeCode() {
        return cupSizeCode;
    }

    public void setCupSizeCode(String cupSizeCode) {
        this.cupSizeCode = cupSizeCode;
    }
}
