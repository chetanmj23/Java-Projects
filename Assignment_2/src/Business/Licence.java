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
public class Licence {
    
    private String licenceNo;
    private String licValidFrom;
    private String licValidTo;
    private String Zclass;
    private String issuingBranch;

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getLicValidFrom() {
        return licValidFrom;
    }

    public void setLicValidFrom(String licValidFrom) {
        this.licValidFrom = licValidFrom;
    }

    public String getLicValidTo() {
        return licValidTo;
    }

    public void setLicValidTo(String licValidTo) {
        this.licValidTo = licValidTo;
    }

    public String getZclass() {
        return Zclass;
    }

    public void setZclass(String Zclass) {
        this.Zclass = Zclass;
    }

    public String getIssuingBranch() {
        return issuingBranch;
    }

    public void setIssuingBranch(String issuingBranch) {
        this.issuingBranch = issuingBranch;
    }
    
}
