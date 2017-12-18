/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author cheta
 */
public class CreditCard {
    
    private String cardNo;
    private String ccValidFrom;
    private String ccValidTo;
    private String ccActive;
    private String ccprovider;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCcValidFrom() {
        return ccValidFrom;
    }

    public void setCcValidFrom(String ccValidFrom) {
        this.ccValidFrom = ccValidFrom;
    }

    public String getCcValidTo() {
        return ccValidTo;
    }

    public void setCcValidTo(String ccValidTo) {
        this.ccValidTo = ccValidTo;
    }

    public String getCcActive() {
        return ccActive;
    }

    public void setCcActive(String ccActive) {
        this.ccActive = ccActive;
    }

    public String getCcprovider() {
        return ccprovider;
    }

    public void setCcprovider(String ccprovider) {
        this.ccprovider = ccprovider;
    }
    
    
    
    
    
}
