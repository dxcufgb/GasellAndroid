/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidrestinterface;

import java.util.Date;

/**
 *
 * @author Tom
 */
public class DtoContractInfo {
    private final String contractId;
    private String campaignName;
    private Date noticeToQuitDate;
    private Date startDate;
    private Date terminationDate;
    private Date createDate;

    public DtoContractInfo(String contractId) {
        this.contractId = contractId;
    }

    public String getContractId() {
        return contractId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public Date getNoticeToQuitDate() {
        return noticeToQuitDate;
    }

    public void setNoticeToQuitDate(Date noticeToQuitDate) {
        this.noticeToQuitDate = noticeToQuitDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    
}
