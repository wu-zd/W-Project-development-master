package com.code.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 核销单
 */
@NoArgsConstructor@AllArgsConstructor
public class CancelAfterVerification {
  /***
   *源单编号
   */
  private String sourceListNum;
  /***
   *业务类别
   */
  private String professionalType;
  /***
   *单据日期
   */
  private java.sql.Timestamp invoicesDate;
  /***
   *已核销金额
   */
  private double confirmedMoney;
  /***
   *未核销金额
   */
  private double unfinishedMoney;
  /***
   *客户ID
   */
  private long clienteleId;


  public String getSourceListNum() {
    return sourceListNum;
  }

  public void setSourceListNum(String sourceListNum) {
    this.sourceListNum = sourceListNum;
  }


  public String getProfessionalType() {
    return professionalType;
  }

  public void setProfessionalType(String professionalType) {
    this.professionalType = professionalType;
  }


  public java.sql.Timestamp getInvoicesDate() {
    return invoicesDate;
  }

  public void setInvoicesDate(java.sql.Timestamp invoicesDate) {
    this.invoicesDate = invoicesDate;
  }


  public double getConfirmedMoney() {
    return confirmedMoney;
  }

  public void setConfirmedMoney(double confirmedMoney) {
    this.confirmedMoney = confirmedMoney;
  }


  public double getUnfinishedMoney() {
    return unfinishedMoney;
  }

  public void setUnfinishedMoney(double unfinishedMoney) {
    this.unfinishedMoney = unfinishedMoney;
  }


  public long getClienteleId() {
    return clienteleId;
  }

  public void setClienteleId(long clienteleId) {
    this.clienteleId = clienteleId;
  }

}
