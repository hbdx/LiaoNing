/**
 * BillWebServiceOutVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class BillWebServiceOutVO  implements java.io.Serializable {
    private com.neusoft.crm.webservice.feemgt.common.data.BillQueryVO[] billQueryVO;

    private com.neusoft.crm.webservice.feemgt.common.data.Cdma1XDetailVO[] cdma1XDetailVO;

    private java.lang.String cityCode;

    private com.neusoft.crm.webservice.feemgt.common.data.CurrentMonthFeeVO currentMonthFeeVO;

    private com.neusoft.crm.webservice.feemgt.common.data.DataDetailQueryVO[] dataDetailQueryVO;

    private com.neusoft.crm.webservice.feemgt.common.data.DetaileVoiceVO[] detaileVoiceVO;

    private java.lang.String errorDesc;

    private java.lang.String eventType;

    private java.lang.String flag;

    private com.neusoft.crm.webservice.feemgt.common.data.IncrementDetailQueryVO[] incrementDetailQueryVO;

    private com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO leftFeeVO;

    private java.lang.String onFlowNumber;

    private java.lang.String osMsg;

    private java.lang.String osPayDate;

    private java.lang.String osWriteOffDate;

    private com.neusoft.crm.webservice.feemgt.common.data.PayFeeHisVO[] payFeeHisVO;

    private com.neusoft.crm.webservice.feemgt.common.data.PaymentBankQueryVO[] paymentBankQueryVO;

    private java.lang.String serviceId;

    private int serviceKind;

    private com.neusoft.crm.webservice.feemgt.common.data.ShortMessageDetailVO[] shortMessageDetailVO;

    private com.neusoft.crm.webservice.feemgt.common.data.SpFeeQueryVO[] spFeeQueryVO;

    private boolean sucess;

    private int count;

    private com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeDetailVO[] monthFeeDetailVO;

    private com.neusoft.crm.feemgt.data.detailquery.DetailDataVO[] detailDataVO;

    private com.neusoft.crm.feemgt.data.detailquery.DetailPstnVO[] detailPstnVO;

    private com.neusoft.crm.feemgt.data.detailquery.DetaileCDMA1XVO[] detaileCDMA1XVO;

    private com.neusoft.crm.feemgt.data.detailquery.DetaileNotesVO[] detaileNotesVO;

    private com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeQueryVO monthFeeQueryVO;

    private java.lang.String relationServiceId;

    private java.lang.String pointInfo;

    private com.neusoft.crm.feemgt.data.payfee.AccountInfoVO accountInfoVO;

    private com.neusoft.crm.feemgt.data.detailquery.DetailVO[] detailVO;

    private com.neusoft.crm.webservice.feemgt.common.data.TransferByMonthInfoVO[] transferByMonthInfoColl;

    private java.lang.String accountInfoStr;

    private com.neusoft.crm.webservice.feemgt.common.data.AccountTree accountTree;

    private java.lang.String customerId;

    private java.lang.String customerName;

    private java.lang.String monthAccountStr;

    private java.lang.String osTotalFee;

    private com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO[] productConsumeVO;

    private com.neusoft.crm.webservice.feemgt.common.data.ProudctUseInfoVO[] proudctUseInfoArray;

    public BillWebServiceOutVO() {
    }

    public BillWebServiceOutVO(
           com.neusoft.crm.webservice.feemgt.common.data.BillQueryVO[] billQueryVO,
           com.neusoft.crm.webservice.feemgt.common.data.Cdma1XDetailVO[] cdma1XDetailVO,
           java.lang.String cityCode,
           com.neusoft.crm.webservice.feemgt.common.data.CurrentMonthFeeVO currentMonthFeeVO,
           com.neusoft.crm.webservice.feemgt.common.data.DataDetailQueryVO[] dataDetailQueryVO,
           com.neusoft.crm.webservice.feemgt.common.data.DetaileVoiceVO[] detaileVoiceVO,
           java.lang.String errorDesc,
           java.lang.String eventType,
           java.lang.String flag,
           com.neusoft.crm.webservice.feemgt.common.data.IncrementDetailQueryVO[] incrementDetailQueryVO,
           com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO leftFeeVO,
           java.lang.String onFlowNumber,
           java.lang.String osMsg,
           java.lang.String osPayDate,
           java.lang.String osWriteOffDate,
           com.neusoft.crm.webservice.feemgt.common.data.PayFeeHisVO[] payFeeHisVO,
           com.neusoft.crm.webservice.feemgt.common.data.PaymentBankQueryVO[] paymentBankQueryVO,
           java.lang.String serviceId,
           int serviceKind,
           com.neusoft.crm.webservice.feemgt.common.data.ShortMessageDetailVO[] shortMessageDetailVO,
           com.neusoft.crm.webservice.feemgt.common.data.SpFeeQueryVO[] spFeeQueryVO,
           boolean sucess,
           int count,
           com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeDetailVO[] monthFeeDetailVO,
           com.neusoft.crm.feemgt.data.detailquery.DetailDataVO[] detailDataVO,
           com.neusoft.crm.feemgt.data.detailquery.DetailPstnVO[] detailPstnVO,
           com.neusoft.crm.feemgt.data.detailquery.DetaileCDMA1XVO[] detaileCDMA1XVO,
           com.neusoft.crm.feemgt.data.detailquery.DetaileNotesVO[] detaileNotesVO,
           com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeQueryVO monthFeeQueryVO,
           java.lang.String relationServiceId,
           java.lang.String pointInfo,
           com.neusoft.crm.feemgt.data.payfee.AccountInfoVO accountInfoVO,
           com.neusoft.crm.feemgt.data.detailquery.DetailVO[] detailVO,
           com.neusoft.crm.webservice.feemgt.common.data.TransferByMonthInfoVO[] transferByMonthInfoColl,
           java.lang.String accountInfoStr,
           com.neusoft.crm.webservice.feemgt.common.data.AccountTree accountTree,
           java.lang.String customerId,
           java.lang.String customerName,
           java.lang.String monthAccountStr,
           java.lang.String osTotalFee,
           com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO[] productConsumeVO,
           com.neusoft.crm.webservice.feemgt.common.data.ProudctUseInfoVO[] proudctUseInfoArray) {
           this.billQueryVO = billQueryVO;
           this.cdma1XDetailVO = cdma1XDetailVO;
           this.cityCode = cityCode;
           this.currentMonthFeeVO = currentMonthFeeVO;
           this.dataDetailQueryVO = dataDetailQueryVO;
           this.detaileVoiceVO = detaileVoiceVO;
           this.errorDesc = errorDesc;
           this.eventType = eventType;
           this.flag = flag;
           this.incrementDetailQueryVO = incrementDetailQueryVO;
           this.leftFeeVO = leftFeeVO;
           this.onFlowNumber = onFlowNumber;
           this.osMsg = osMsg;
           this.osPayDate = osPayDate;
           this.osWriteOffDate = osWriteOffDate;
           this.payFeeHisVO = payFeeHisVO;
           this.paymentBankQueryVO = paymentBankQueryVO;
           this.serviceId = serviceId;
           this.serviceKind = serviceKind;
           this.shortMessageDetailVO = shortMessageDetailVO;
           this.spFeeQueryVO = spFeeQueryVO;
           this.sucess = sucess;
           this.count = count;
           this.monthFeeDetailVO = monthFeeDetailVO;
           this.detailDataVO = detailDataVO;
           this.detailPstnVO = detailPstnVO;
           this.detaileCDMA1XVO = detaileCDMA1XVO;
           this.detaileNotesVO = detaileNotesVO;
           this.monthFeeQueryVO = monthFeeQueryVO;
           this.relationServiceId = relationServiceId;
           this.pointInfo = pointInfo;
           this.accountInfoVO = accountInfoVO;
           this.detailVO = detailVO;
           this.transferByMonthInfoColl = transferByMonthInfoColl;
           this.accountInfoStr = accountInfoStr;
           this.accountTree = accountTree;
           this.customerId = customerId;
           this.customerName = customerName;
           this.monthAccountStr = monthAccountStr;
           this.osTotalFee = osTotalFee;
           this.productConsumeVO = productConsumeVO;
           this.proudctUseInfoArray = proudctUseInfoArray;
    }


    /**
     * Gets the billQueryVO value for this BillWebServiceOutVO.
     * 
     * @return billQueryVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.BillQueryVO[] getBillQueryVO() {
        return billQueryVO;
    }


    /**
     * Sets the billQueryVO value for this BillWebServiceOutVO.
     * 
     * @param billQueryVO
     */
    public void setBillQueryVO(com.neusoft.crm.webservice.feemgt.common.data.BillQueryVO[] billQueryVO) {
        this.billQueryVO = billQueryVO;
    }


    /**
     * Gets the cdma1XDetailVO value for this BillWebServiceOutVO.
     * 
     * @return cdma1XDetailVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.Cdma1XDetailVO[] getCdma1XDetailVO() {
        return cdma1XDetailVO;
    }


    /**
     * Sets the cdma1XDetailVO value for this BillWebServiceOutVO.
     * 
     * @param cdma1XDetailVO
     */
    public void setCdma1XDetailVO(com.neusoft.crm.webservice.feemgt.common.data.Cdma1XDetailVO[] cdma1XDetailVO) {
        this.cdma1XDetailVO = cdma1XDetailVO;
    }


    /**
     * Gets the cityCode value for this BillWebServiceOutVO.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this BillWebServiceOutVO.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the currentMonthFeeVO value for this BillWebServiceOutVO.
     * 
     * @return currentMonthFeeVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.CurrentMonthFeeVO getCurrentMonthFeeVO() {
        return currentMonthFeeVO;
    }


    /**
     * Sets the currentMonthFeeVO value for this BillWebServiceOutVO.
     * 
     * @param currentMonthFeeVO
     */
    public void setCurrentMonthFeeVO(com.neusoft.crm.webservice.feemgt.common.data.CurrentMonthFeeVO currentMonthFeeVO) {
        this.currentMonthFeeVO = currentMonthFeeVO;
    }


    /**
     * Gets the dataDetailQueryVO value for this BillWebServiceOutVO.
     * 
     * @return dataDetailQueryVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.DataDetailQueryVO[] getDataDetailQueryVO() {
        return dataDetailQueryVO;
    }


    /**
     * Sets the dataDetailQueryVO value for this BillWebServiceOutVO.
     * 
     * @param dataDetailQueryVO
     */
    public void setDataDetailQueryVO(com.neusoft.crm.webservice.feemgt.common.data.DataDetailQueryVO[] dataDetailQueryVO) {
        this.dataDetailQueryVO = dataDetailQueryVO;
    }


    /**
     * Gets the detaileVoiceVO value for this BillWebServiceOutVO.
     * 
     * @return detaileVoiceVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.DetaileVoiceVO[] getDetaileVoiceVO() {
        return detaileVoiceVO;
    }


    /**
     * Sets the detaileVoiceVO value for this BillWebServiceOutVO.
     * 
     * @param detaileVoiceVO
     */
    public void setDetaileVoiceVO(com.neusoft.crm.webservice.feemgt.common.data.DetaileVoiceVO[] detaileVoiceVO) {
        this.detaileVoiceVO = detaileVoiceVO;
    }


    /**
     * Gets the errorDesc value for this BillWebServiceOutVO.
     * 
     * @return errorDesc
     */
    public java.lang.String getErrorDesc() {
        return errorDesc;
    }


    /**
     * Sets the errorDesc value for this BillWebServiceOutVO.
     * 
     * @param errorDesc
     */
    public void setErrorDesc(java.lang.String errorDesc) {
        this.errorDesc = errorDesc;
    }


    /**
     * Gets the eventType value for this BillWebServiceOutVO.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this BillWebServiceOutVO.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the flag value for this BillWebServiceOutVO.
     * 
     * @return flag
     */
    public java.lang.String getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this BillWebServiceOutVO.
     * 
     * @param flag
     */
    public void setFlag(java.lang.String flag) {
        this.flag = flag;
    }


    /**
     * Gets the incrementDetailQueryVO value for this BillWebServiceOutVO.
     * 
     * @return incrementDetailQueryVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.IncrementDetailQueryVO[] getIncrementDetailQueryVO() {
        return incrementDetailQueryVO;
    }


    /**
     * Sets the incrementDetailQueryVO value for this BillWebServiceOutVO.
     * 
     * @param incrementDetailQueryVO
     */
    public void setIncrementDetailQueryVO(com.neusoft.crm.webservice.feemgt.common.data.IncrementDetailQueryVO[] incrementDetailQueryVO) {
        this.incrementDetailQueryVO = incrementDetailQueryVO;
    }


    /**
     * Gets the leftFeeVO value for this BillWebServiceOutVO.
     * 
     * @return leftFeeVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO getLeftFeeVO() {
        return leftFeeVO;
    }


    /**
     * Sets the leftFeeVO value for this BillWebServiceOutVO.
     * 
     * @param leftFeeVO
     */
    public void setLeftFeeVO(com.neusoft.crm.webservice.feemgt.common.data.LeftFeeVO leftFeeVO) {
        this.leftFeeVO = leftFeeVO;
    }


    /**
     * Gets the onFlowNumber value for this BillWebServiceOutVO.
     * 
     * @return onFlowNumber
     */
    public java.lang.String getOnFlowNumber() {
        return onFlowNumber;
    }


    /**
     * Sets the onFlowNumber value for this BillWebServiceOutVO.
     * 
     * @param onFlowNumber
     */
    public void setOnFlowNumber(java.lang.String onFlowNumber) {
        this.onFlowNumber = onFlowNumber;
    }


    /**
     * Gets the osMsg value for this BillWebServiceOutVO.
     * 
     * @return osMsg
     */
    public java.lang.String getOsMsg() {
        return osMsg;
    }


    /**
     * Sets the osMsg value for this BillWebServiceOutVO.
     * 
     * @param osMsg
     */
    public void setOsMsg(java.lang.String osMsg) {
        this.osMsg = osMsg;
    }


    /**
     * Gets the osPayDate value for this BillWebServiceOutVO.
     * 
     * @return osPayDate
     */
    public java.lang.String getOsPayDate() {
        return osPayDate;
    }


    /**
     * Sets the osPayDate value for this BillWebServiceOutVO.
     * 
     * @param osPayDate
     */
    public void setOsPayDate(java.lang.String osPayDate) {
        this.osPayDate = osPayDate;
    }


    /**
     * Gets the osWriteOffDate value for this BillWebServiceOutVO.
     * 
     * @return osWriteOffDate
     */
    public java.lang.String getOsWriteOffDate() {
        return osWriteOffDate;
    }


    /**
     * Sets the osWriteOffDate value for this BillWebServiceOutVO.
     * 
     * @param osWriteOffDate
     */
    public void setOsWriteOffDate(java.lang.String osWriteOffDate) {
        this.osWriteOffDate = osWriteOffDate;
    }


    /**
     * Gets the payFeeHisVO value for this BillWebServiceOutVO.
     * 
     * @return payFeeHisVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.PayFeeHisVO[] getPayFeeHisVO() {
        return payFeeHisVO;
    }


    /**
     * Sets the payFeeHisVO value for this BillWebServiceOutVO.
     * 
     * @param payFeeHisVO
     */
    public void setPayFeeHisVO(com.neusoft.crm.webservice.feemgt.common.data.PayFeeHisVO[] payFeeHisVO) {
        this.payFeeHisVO = payFeeHisVO;
    }


    /**
     * Gets the paymentBankQueryVO value for this BillWebServiceOutVO.
     * 
     * @return paymentBankQueryVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.PaymentBankQueryVO[] getPaymentBankQueryVO() {
        return paymentBankQueryVO;
    }


    /**
     * Sets the paymentBankQueryVO value for this BillWebServiceOutVO.
     * 
     * @param paymentBankQueryVO
     */
    public void setPaymentBankQueryVO(com.neusoft.crm.webservice.feemgt.common.data.PaymentBankQueryVO[] paymentBankQueryVO) {
        this.paymentBankQueryVO = paymentBankQueryVO;
    }


    /**
     * Gets the serviceId value for this BillWebServiceOutVO.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this BillWebServiceOutVO.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the serviceKind value for this BillWebServiceOutVO.
     * 
     * @return serviceKind
     */
    public int getServiceKind() {
        return serviceKind;
    }


    /**
     * Sets the serviceKind value for this BillWebServiceOutVO.
     * 
     * @param serviceKind
     */
    public void setServiceKind(int serviceKind) {
        this.serviceKind = serviceKind;
    }


    /**
     * Gets the shortMessageDetailVO value for this BillWebServiceOutVO.
     * 
     * @return shortMessageDetailVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.ShortMessageDetailVO[] getShortMessageDetailVO() {
        return shortMessageDetailVO;
    }


    /**
     * Sets the shortMessageDetailVO value for this BillWebServiceOutVO.
     * 
     * @param shortMessageDetailVO
     */
    public void setShortMessageDetailVO(com.neusoft.crm.webservice.feemgt.common.data.ShortMessageDetailVO[] shortMessageDetailVO) {
        this.shortMessageDetailVO = shortMessageDetailVO;
    }


    /**
     * Gets the spFeeQueryVO value for this BillWebServiceOutVO.
     * 
     * @return spFeeQueryVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.SpFeeQueryVO[] getSpFeeQueryVO() {
        return spFeeQueryVO;
    }


    /**
     * Sets the spFeeQueryVO value for this BillWebServiceOutVO.
     * 
     * @param spFeeQueryVO
     */
    public void setSpFeeQueryVO(com.neusoft.crm.webservice.feemgt.common.data.SpFeeQueryVO[] spFeeQueryVO) {
        this.spFeeQueryVO = spFeeQueryVO;
    }


    /**
     * Gets the sucess value for this BillWebServiceOutVO.
     * 
     * @return sucess
     */
    public boolean isSucess() {
        return sucess;
    }


    /**
     * Sets the sucess value for this BillWebServiceOutVO.
     * 
     * @param sucess
     */
    public void setSucess(boolean sucess) {
        this.sucess = sucess;
    }


    /**
     * Gets the count value for this BillWebServiceOutVO.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this BillWebServiceOutVO.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the monthFeeDetailVO value for this BillWebServiceOutVO.
     * 
     * @return monthFeeDetailVO
     */
    public com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeDetailVO[] getMonthFeeDetailVO() {
        return monthFeeDetailVO;
    }


    /**
     * Sets the monthFeeDetailVO value for this BillWebServiceOutVO.
     * 
     * @param monthFeeDetailVO
     */
    public void setMonthFeeDetailVO(com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeDetailVO[] monthFeeDetailVO) {
        this.monthFeeDetailVO = monthFeeDetailVO;
    }


    /**
     * Gets the detailDataVO value for this BillWebServiceOutVO.
     * 
     * @return detailDataVO
     */
    public com.neusoft.crm.feemgt.data.detailquery.DetailDataVO[] getDetailDataVO() {
        return detailDataVO;
    }


    /**
     * Sets the detailDataVO value for this BillWebServiceOutVO.
     * 
     * @param detailDataVO
     */
    public void setDetailDataVO(com.neusoft.crm.feemgt.data.detailquery.DetailDataVO[] detailDataVO) {
        this.detailDataVO = detailDataVO;
    }


    /**
     * Gets the detailPstnVO value for this BillWebServiceOutVO.
     * 
     * @return detailPstnVO
     */
    public com.neusoft.crm.feemgt.data.detailquery.DetailPstnVO[] getDetailPstnVO() {
        return detailPstnVO;
    }


    /**
     * Sets the detailPstnVO value for this BillWebServiceOutVO.
     * 
     * @param detailPstnVO
     */
    public void setDetailPstnVO(com.neusoft.crm.feemgt.data.detailquery.DetailPstnVO[] detailPstnVO) {
        this.detailPstnVO = detailPstnVO;
    }


    /**
     * Gets the detaileCDMA1XVO value for this BillWebServiceOutVO.
     * 
     * @return detaileCDMA1XVO
     */
    public com.neusoft.crm.feemgt.data.detailquery.DetaileCDMA1XVO[] getDetaileCDMA1XVO() {
        return detaileCDMA1XVO;
    }


    /**
     * Sets the detaileCDMA1XVO value for this BillWebServiceOutVO.
     * 
     * @param detaileCDMA1XVO
     */
    public void setDetaileCDMA1XVO(com.neusoft.crm.feemgt.data.detailquery.DetaileCDMA1XVO[] detaileCDMA1XVO) {
        this.detaileCDMA1XVO = detaileCDMA1XVO;
    }


    /**
     * Gets the detaileNotesVO value for this BillWebServiceOutVO.
     * 
     * @return detaileNotesVO
     */
    public com.neusoft.crm.feemgt.data.detailquery.DetaileNotesVO[] getDetaileNotesVO() {
        return detaileNotesVO;
    }


    /**
     * Sets the detaileNotesVO value for this BillWebServiceOutVO.
     * 
     * @param detaileNotesVO
     */
    public void setDetaileNotesVO(com.neusoft.crm.feemgt.data.detailquery.DetaileNotesVO[] detaileNotesVO) {
        this.detaileNotesVO = detaileNotesVO;
    }


    /**
     * Gets the monthFeeQueryVO value for this BillWebServiceOutVO.
     * 
     * @return monthFeeQueryVO
     */
    public com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeQueryVO getMonthFeeQueryVO() {
        return monthFeeQueryVO;
    }


    /**
     * Sets the monthFeeQueryVO value for this BillWebServiceOutVO.
     * 
     * @param monthFeeQueryVO
     */
    public void setMonthFeeQueryVO(com.neusoft.crm.feemgt.data.monthFeeQuery.MonthFeeQueryVO monthFeeQueryVO) {
        this.monthFeeQueryVO = monthFeeQueryVO;
    }


    /**
     * Gets the relationServiceId value for this BillWebServiceOutVO.
     * 
     * @return relationServiceId
     */
    public java.lang.String getRelationServiceId() {
        return relationServiceId;
    }


    /**
     * Sets the relationServiceId value for this BillWebServiceOutVO.
     * 
     * @param relationServiceId
     */
    public void setRelationServiceId(java.lang.String relationServiceId) {
        this.relationServiceId = relationServiceId;
    }


    /**
     * Gets the pointInfo value for this BillWebServiceOutVO.
     * 
     * @return pointInfo
     */
    public java.lang.String getPointInfo() {
        return pointInfo;
    }


    /**
     * Sets the pointInfo value for this BillWebServiceOutVO.
     * 
     * @param pointInfo
     */
    public void setPointInfo(java.lang.String pointInfo) {
        this.pointInfo = pointInfo;
    }


    /**
     * Gets the accountInfoVO value for this BillWebServiceOutVO.
     * 
     * @return accountInfoVO
     */
    public com.neusoft.crm.feemgt.data.payfee.AccountInfoVO getAccountInfoVO() {
        return accountInfoVO;
    }


    /**
     * Sets the accountInfoVO value for this BillWebServiceOutVO.
     * 
     * @param accountInfoVO
     */
    public void setAccountInfoVO(com.neusoft.crm.feemgt.data.payfee.AccountInfoVO accountInfoVO) {
        this.accountInfoVO = accountInfoVO;
    }


    /**
     * Gets the detailVO value for this BillWebServiceOutVO.
     * 
     * @return detailVO
     */
    public com.neusoft.crm.feemgt.data.detailquery.DetailVO[] getDetailVO() {
        return detailVO;
    }


    /**
     * Sets the detailVO value for this BillWebServiceOutVO.
     * 
     * @param detailVO
     */
    public void setDetailVO(com.neusoft.crm.feemgt.data.detailquery.DetailVO[] detailVO) {
        this.detailVO = detailVO;
    }


    /**
     * Gets the transferByMonthInfoColl value for this BillWebServiceOutVO.
     * 
     * @return transferByMonthInfoColl
     */
    public com.neusoft.crm.webservice.feemgt.common.data.TransferByMonthInfoVO[] getTransferByMonthInfoColl() {
        return transferByMonthInfoColl;
    }


    /**
     * Sets the transferByMonthInfoColl value for this BillWebServiceOutVO.
     * 
     * @param transferByMonthInfoColl
     */
    public void setTransferByMonthInfoColl(com.neusoft.crm.webservice.feemgt.common.data.TransferByMonthInfoVO[] transferByMonthInfoColl) {
        this.transferByMonthInfoColl = transferByMonthInfoColl;
    }


    /**
     * Gets the accountInfoStr value for this BillWebServiceOutVO.
     * 
     * @return accountInfoStr
     */
    public java.lang.String getAccountInfoStr() {
        return accountInfoStr;
    }


    /**
     * Sets the accountInfoStr value for this BillWebServiceOutVO.
     * 
     * @param accountInfoStr
     */
    public void setAccountInfoStr(java.lang.String accountInfoStr) {
        this.accountInfoStr = accountInfoStr;
    }


    /**
     * Gets the accountTree value for this BillWebServiceOutVO.
     * 
     * @return accountTree
     */
    public com.neusoft.crm.webservice.feemgt.common.data.AccountTree getAccountTree() {
        return accountTree;
    }


    /**
     * Sets the accountTree value for this BillWebServiceOutVO.
     * 
     * @param accountTree
     */
    public void setAccountTree(com.neusoft.crm.webservice.feemgt.common.data.AccountTree accountTree) {
        this.accountTree = accountTree;
    }


    /**
     * Gets the customerId value for this BillWebServiceOutVO.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this BillWebServiceOutVO.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the customerName value for this BillWebServiceOutVO.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this BillWebServiceOutVO.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the monthAccountStr value for this BillWebServiceOutVO.
     * 
     * @return monthAccountStr
     */
    public java.lang.String getMonthAccountStr() {
        return monthAccountStr;
    }


    /**
     * Sets the monthAccountStr value for this BillWebServiceOutVO.
     * 
     * @param monthAccountStr
     */
    public void setMonthAccountStr(java.lang.String monthAccountStr) {
        this.monthAccountStr = monthAccountStr;
    }


    /**
     * Gets the osTotalFee value for this BillWebServiceOutVO.
     * 
     * @return osTotalFee
     */
    public java.lang.String getOsTotalFee() {
        return osTotalFee;
    }


    /**
     * Sets the osTotalFee value for this BillWebServiceOutVO.
     * 
     * @param osTotalFee
     */
    public void setOsTotalFee(java.lang.String osTotalFee) {
        this.osTotalFee = osTotalFee;
    }


    /**
     * Gets the productConsumeVO value for this BillWebServiceOutVO.
     * 
     * @return productConsumeVO
     */
    public com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO[] getProductConsumeVO() {
        return productConsumeVO;
    }


    /**
     * Sets the productConsumeVO value for this BillWebServiceOutVO.
     * 
     * @param productConsumeVO
     */
    public void setProductConsumeVO(com.neusoft.crm.webservice.feemgt.common.data.ProductConsumeVO[] productConsumeVO) {
        this.productConsumeVO = productConsumeVO;
    }


    /**
     * Gets the proudctUseInfoArray value for this BillWebServiceOutVO.
     * 
     * @return proudctUseInfoArray
     */
    public com.neusoft.crm.webservice.feemgt.common.data.ProudctUseInfoVO[] getProudctUseInfoArray() {
        return proudctUseInfoArray;
    }


    /**
     * Sets the proudctUseInfoArray value for this BillWebServiceOutVO.
     * 
     * @param proudctUseInfoArray
     */
    public void setProudctUseInfoArray(com.neusoft.crm.webservice.feemgt.common.data.ProudctUseInfoVO[] proudctUseInfoArray) {
        this.proudctUseInfoArray = proudctUseInfoArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillWebServiceOutVO)) return false;
        BillWebServiceOutVO other = (BillWebServiceOutVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billQueryVO==null && other.getBillQueryVO()==null) || 
             (this.billQueryVO!=null &&
              java.util.Arrays.equals(this.billQueryVO, other.getBillQueryVO()))) &&
            ((this.cdma1XDetailVO==null && other.getCdma1XDetailVO()==null) || 
             (this.cdma1XDetailVO!=null &&
              java.util.Arrays.equals(this.cdma1XDetailVO, other.getCdma1XDetailVO()))) &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            ((this.currentMonthFeeVO==null && other.getCurrentMonthFeeVO()==null) || 
             (this.currentMonthFeeVO!=null &&
              this.currentMonthFeeVO.equals(other.getCurrentMonthFeeVO()))) &&
            ((this.dataDetailQueryVO==null && other.getDataDetailQueryVO()==null) || 
             (this.dataDetailQueryVO!=null &&
              java.util.Arrays.equals(this.dataDetailQueryVO, other.getDataDetailQueryVO()))) &&
            ((this.detaileVoiceVO==null && other.getDetaileVoiceVO()==null) || 
             (this.detaileVoiceVO!=null &&
              java.util.Arrays.equals(this.detaileVoiceVO, other.getDetaileVoiceVO()))) &&
            ((this.errorDesc==null && other.getErrorDesc()==null) || 
             (this.errorDesc!=null &&
              this.errorDesc.equals(other.getErrorDesc()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.incrementDetailQueryVO==null && other.getIncrementDetailQueryVO()==null) || 
             (this.incrementDetailQueryVO!=null &&
              java.util.Arrays.equals(this.incrementDetailQueryVO, other.getIncrementDetailQueryVO()))) &&
            ((this.leftFeeVO==null && other.getLeftFeeVO()==null) || 
             (this.leftFeeVO!=null &&
              this.leftFeeVO.equals(other.getLeftFeeVO()))) &&
            ((this.onFlowNumber==null && other.getOnFlowNumber()==null) || 
             (this.onFlowNumber!=null &&
              this.onFlowNumber.equals(other.getOnFlowNumber()))) &&
            ((this.osMsg==null && other.getOsMsg()==null) || 
             (this.osMsg!=null &&
              this.osMsg.equals(other.getOsMsg()))) &&
            ((this.osPayDate==null && other.getOsPayDate()==null) || 
             (this.osPayDate!=null &&
              this.osPayDate.equals(other.getOsPayDate()))) &&
            ((this.osWriteOffDate==null && other.getOsWriteOffDate()==null) || 
             (this.osWriteOffDate!=null &&
              this.osWriteOffDate.equals(other.getOsWriteOffDate()))) &&
            ((this.payFeeHisVO==null && other.getPayFeeHisVO()==null) || 
             (this.payFeeHisVO!=null &&
              java.util.Arrays.equals(this.payFeeHisVO, other.getPayFeeHisVO()))) &&
            ((this.paymentBankQueryVO==null && other.getPaymentBankQueryVO()==null) || 
             (this.paymentBankQueryVO!=null &&
              java.util.Arrays.equals(this.paymentBankQueryVO, other.getPaymentBankQueryVO()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            this.serviceKind == other.getServiceKind() &&
            ((this.shortMessageDetailVO==null && other.getShortMessageDetailVO()==null) || 
             (this.shortMessageDetailVO!=null &&
              java.util.Arrays.equals(this.shortMessageDetailVO, other.getShortMessageDetailVO()))) &&
            ((this.spFeeQueryVO==null && other.getSpFeeQueryVO()==null) || 
             (this.spFeeQueryVO!=null &&
              java.util.Arrays.equals(this.spFeeQueryVO, other.getSpFeeQueryVO()))) &&
            this.sucess == other.isSucess() &&
            this.count == other.getCount() &&
            ((this.monthFeeDetailVO==null && other.getMonthFeeDetailVO()==null) || 
             (this.monthFeeDetailVO!=null &&
              java.util.Arrays.equals(this.monthFeeDetailVO, other.getMonthFeeDetailVO()))) &&
            ((this.detailDataVO==null && other.getDetailDataVO()==null) || 
             (this.detailDataVO!=null &&
              java.util.Arrays.equals(this.detailDataVO, other.getDetailDataVO()))) &&
            ((this.detailPstnVO==null && other.getDetailPstnVO()==null) || 
             (this.detailPstnVO!=null &&
              java.util.Arrays.equals(this.detailPstnVO, other.getDetailPstnVO()))) &&
            ((this.detaileCDMA1XVO==null && other.getDetaileCDMA1XVO()==null) || 
             (this.detaileCDMA1XVO!=null &&
              java.util.Arrays.equals(this.detaileCDMA1XVO, other.getDetaileCDMA1XVO()))) &&
            ((this.detaileNotesVO==null && other.getDetaileNotesVO()==null) || 
             (this.detaileNotesVO!=null &&
              java.util.Arrays.equals(this.detaileNotesVO, other.getDetaileNotesVO()))) &&
            ((this.monthFeeQueryVO==null && other.getMonthFeeQueryVO()==null) || 
             (this.monthFeeQueryVO!=null &&
              this.monthFeeQueryVO.equals(other.getMonthFeeQueryVO()))) &&
            ((this.relationServiceId==null && other.getRelationServiceId()==null) || 
             (this.relationServiceId!=null &&
              this.relationServiceId.equals(other.getRelationServiceId()))) &&
            ((this.pointInfo==null && other.getPointInfo()==null) || 
             (this.pointInfo!=null &&
              this.pointInfo.equals(other.getPointInfo()))) &&
            ((this.accountInfoVO==null && other.getAccountInfoVO()==null) || 
             (this.accountInfoVO!=null &&
              this.accountInfoVO.equals(other.getAccountInfoVO()))) &&
            ((this.detailVO==null && other.getDetailVO()==null) || 
             (this.detailVO!=null &&
              java.util.Arrays.equals(this.detailVO, other.getDetailVO()))) &&
            ((this.transferByMonthInfoColl==null && other.getTransferByMonthInfoColl()==null) || 
             (this.transferByMonthInfoColl!=null &&
              java.util.Arrays.equals(this.transferByMonthInfoColl, other.getTransferByMonthInfoColl()))) &&
            ((this.accountInfoStr==null && other.getAccountInfoStr()==null) || 
             (this.accountInfoStr!=null &&
              this.accountInfoStr.equals(other.getAccountInfoStr()))) &&
            ((this.accountTree==null && other.getAccountTree()==null) || 
             (this.accountTree!=null &&
              this.accountTree.equals(other.getAccountTree()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.monthAccountStr==null && other.getMonthAccountStr()==null) || 
             (this.monthAccountStr!=null &&
              this.monthAccountStr.equals(other.getMonthAccountStr()))) &&
            ((this.osTotalFee==null && other.getOsTotalFee()==null) || 
             (this.osTotalFee!=null &&
              this.osTotalFee.equals(other.getOsTotalFee()))) &&
            ((this.productConsumeVO==null && other.getProductConsumeVO()==null) || 
             (this.productConsumeVO!=null &&
              java.util.Arrays.equals(this.productConsumeVO, other.getProductConsumeVO()))) &&
            ((this.proudctUseInfoArray==null && other.getProudctUseInfoArray()==null) || 
             (this.proudctUseInfoArray!=null &&
              java.util.Arrays.equals(this.proudctUseInfoArray, other.getProudctUseInfoArray())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBillQueryVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillQueryVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillQueryVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCdma1XDetailVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCdma1XDetailVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCdma1XDetailVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        if (getCurrentMonthFeeVO() != null) {
            _hashCode += getCurrentMonthFeeVO().hashCode();
        }
        if (getDataDetailQueryVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataDetailQueryVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataDetailQueryVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetaileVoiceVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetaileVoiceVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetaileVoiceVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorDesc() != null) {
            _hashCode += getErrorDesc().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getIncrementDetailQueryVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncrementDetailQueryVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncrementDetailQueryVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLeftFeeVO() != null) {
            _hashCode += getLeftFeeVO().hashCode();
        }
        if (getOnFlowNumber() != null) {
            _hashCode += getOnFlowNumber().hashCode();
        }
        if (getOsMsg() != null) {
            _hashCode += getOsMsg().hashCode();
        }
        if (getOsPayDate() != null) {
            _hashCode += getOsPayDate().hashCode();
        }
        if (getOsWriteOffDate() != null) {
            _hashCode += getOsWriteOffDate().hashCode();
        }
        if (getPayFeeHisVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayFeeHisVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayFeeHisVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentBankQueryVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentBankQueryVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentBankQueryVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        _hashCode += getServiceKind();
        if (getShortMessageDetailVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShortMessageDetailVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShortMessageDetailVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpFeeQueryVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpFeeQueryVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpFeeQueryVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSucess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getCount();
        if (getMonthFeeDetailVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonthFeeDetailVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonthFeeDetailVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetailDataVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailDataVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailDataVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetailPstnVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailPstnVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailPstnVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetaileCDMA1XVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetaileCDMA1XVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetaileCDMA1XVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetaileNotesVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetaileNotesVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetaileNotesVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonthFeeQueryVO() != null) {
            _hashCode += getMonthFeeQueryVO().hashCode();
        }
        if (getRelationServiceId() != null) {
            _hashCode += getRelationServiceId().hashCode();
        }
        if (getPointInfo() != null) {
            _hashCode += getPointInfo().hashCode();
        }
        if (getAccountInfoVO() != null) {
            _hashCode += getAccountInfoVO().hashCode();
        }
        if (getDetailVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferByMonthInfoColl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferByMonthInfoColl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferByMonthInfoColl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountInfoStr() != null) {
            _hashCode += getAccountInfoStr().hashCode();
        }
        if (getAccountTree() != null) {
            _hashCode += getAccountTree().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getMonthAccountStr() != null) {
            _hashCode += getMonthAccountStr().hashCode();
        }
        if (getOsTotalFee() != null) {
            _hashCode += getOsTotalFee().hashCode();
        }
        if (getProductConsumeVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductConsumeVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductConsumeVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProudctUseInfoArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProudctUseInfoArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProudctUseInfoArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillWebServiceOutVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillWebServiceOutVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billQueryVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billQueryVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "BillQueryVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdma1XDetailVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdma1XDetailVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "Cdma1XDetailVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentMonthFeeVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentMonthFeeVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "CurrentMonthFeeVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDetailQueryVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDetailQueryVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "DataDetailQueryVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detaileVoiceVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detaileVoiceVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "DetaileVoiceVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incrementDetailQueryVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incrementDetailQueryVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "IncrementDetailQueryVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftFeeVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftFeeVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "LeftFeeVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onFlowNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onFlowNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osPayDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osPayDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osWriteOffDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osWriteOffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFeeHisVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payFeeHisVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "PayFeeHisVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentBankQueryVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentBankQueryVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "PaymentBankQueryVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceKind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortMessageDetailVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortMessageDetailVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ShortMessageDetailVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spFeeQueryVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spFeeQueryVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "SpFeeQueryVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sucess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sucess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthFeeDetailVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthFeeDetailVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://monthFeeQuery.data.feemgt.crm.neusoft.com", "MonthFeeDetailVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailDataVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailDataVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailDataVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailPstnVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailPstnVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailPstnVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detaileCDMA1XVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detaileCDMA1XVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetaileCDMA1XVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detaileNotesVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detaileNotesVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetaileNotesVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthFeeQueryVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthFeeQueryVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://monthFeeQuery.data.feemgt.crm.neusoft.com", "MonthFeeQueryVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfoVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountInfoVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://payfee.data.feemgt.crm.neusoft.com", "AccountInfoVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://detailquery.data.feemgt.crm.neusoft.com", "DetailVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferByMonthInfoColl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferByMonthInfoColl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "TransferByMonthInfoVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfoStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountInfoStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountTree");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountTree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "AccountTree"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthAccountStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthAccountStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osTotalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osTotalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productConsumeVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productConsumeVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProductConsumeVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proudctUseInfoArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proudctUseInfoArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "ProudctUseInfoVO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
