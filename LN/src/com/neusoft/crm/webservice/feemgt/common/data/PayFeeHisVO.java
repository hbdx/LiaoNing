/**
 * PayFeeHisVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.neusoft.crm.webservice.feemgt.common.data;

public class PayFeeHisVO  implements java.io.Serializable {
    private long BUNDLE_ID;

    private long access_level;

    private long accountFeeId;

    private java.lang.String accountFeeKind;

    private java.lang.String accountFeeValueStr;

    private long account_id;

    private java.lang.String advance_operate_date;

    private java.lang.String advance_operate_id;

    private java.lang.String apply_start_date;

    private java.lang.String bankName;

    private int batch_id;

    private int batch_status;

    private java.lang.String city_code;

    private java.lang.String city_name;

    private java.lang.String confirm_operate_date;

    private java.lang.String confirm_operate_id;

    private long contract_credit;

    private java.lang.String contract_serial;

    private java.lang.String credit_info;

    private long credit_solution;

    private long customer_id;

    private float fee;

    private java.lang.String fee_date;

    private java.lang.String fee_name;

    private java.lang.String first_name;

    private long flow_number;

    private java.lang.String idcard_type;

    private java.lang.String identity_code;

    private int identity_kind;

    private int if_valid;

    private float last_left;

    private float leftFee;

    private float left_fee;

    private long no_pay_number;

    private float overdue_fee;

    private java.lang.String payKindName;

    private java.lang.String payTime;

    private java.lang.String payWayName;

    private float pay_fee;

    private java.lang.String pay_kind;

    private int pay_kind_code;

    private float prepaid_fee;

    private long service_favour_id;

    private java.lang.String service_favour_name;

    private java.lang.String service_id;

    private int service_kind;

    private java.lang.String service_name;

    private java.lang.String service_status;

    private int serving_status;

    private float sum_fee;

    private float total_arrearage;

    private long user_id;

    private int user_kind;

    private java.lang.String user_name;

    public PayFeeHisVO() {
    }

    public PayFeeHisVO(
           long BUNDLE_ID,
           long access_level,
           long accountFeeId,
           java.lang.String accountFeeKind,
           java.lang.String accountFeeValueStr,
           long account_id,
           java.lang.String advance_operate_date,
           java.lang.String advance_operate_id,
           java.lang.String apply_start_date,
           java.lang.String bankName,
           int batch_id,
           int batch_status,
           java.lang.String city_code,
           java.lang.String city_name,
           java.lang.String confirm_operate_date,
           java.lang.String confirm_operate_id,
           long contract_credit,
           java.lang.String contract_serial,
           java.lang.String credit_info,
           long credit_solution,
           long customer_id,
           float fee,
           java.lang.String fee_date,
           java.lang.String fee_name,
           java.lang.String first_name,
           long flow_number,
           java.lang.String idcard_type,
           java.lang.String identity_code,
           int identity_kind,
           int if_valid,
           float last_left,
           float leftFee,
           float left_fee,
           long no_pay_number,
           float overdue_fee,
           java.lang.String payKindName,
           java.lang.String payTime,
           java.lang.String payWayName,
           float pay_fee,
           java.lang.String pay_kind,
           int pay_kind_code,
           float prepaid_fee,
           long service_favour_id,
           java.lang.String service_favour_name,
           java.lang.String service_id,
           int service_kind,
           java.lang.String service_name,
           java.lang.String service_status,
           int serving_status,
           float sum_fee,
           float total_arrearage,
           long user_id,
           int user_kind,
           java.lang.String user_name) {
           this.BUNDLE_ID = BUNDLE_ID;
           this.access_level = access_level;
           this.accountFeeId = accountFeeId;
           this.accountFeeKind = accountFeeKind;
           this.accountFeeValueStr = accountFeeValueStr;
           this.account_id = account_id;
           this.advance_operate_date = advance_operate_date;
           this.advance_operate_id = advance_operate_id;
           this.apply_start_date = apply_start_date;
           this.bankName = bankName;
           this.batch_id = batch_id;
           this.batch_status = batch_status;
           this.city_code = city_code;
           this.city_name = city_name;
           this.confirm_operate_date = confirm_operate_date;
           this.confirm_operate_id = confirm_operate_id;
           this.contract_credit = contract_credit;
           this.contract_serial = contract_serial;
           this.credit_info = credit_info;
           this.credit_solution = credit_solution;
           this.customer_id = customer_id;
           this.fee = fee;
           this.fee_date = fee_date;
           this.fee_name = fee_name;
           this.first_name = first_name;
           this.flow_number = flow_number;
           this.idcard_type = idcard_type;
           this.identity_code = identity_code;
           this.identity_kind = identity_kind;
           this.if_valid = if_valid;
           this.last_left = last_left;
           this.leftFee = leftFee;
           this.left_fee = left_fee;
           this.no_pay_number = no_pay_number;
           this.overdue_fee = overdue_fee;
           this.payKindName = payKindName;
           this.payTime = payTime;
           this.payWayName = payWayName;
           this.pay_fee = pay_fee;
           this.pay_kind = pay_kind;
           this.pay_kind_code = pay_kind_code;
           this.prepaid_fee = prepaid_fee;
           this.service_favour_id = service_favour_id;
           this.service_favour_name = service_favour_name;
           this.service_id = service_id;
           this.service_kind = service_kind;
           this.service_name = service_name;
           this.service_status = service_status;
           this.serving_status = serving_status;
           this.sum_fee = sum_fee;
           this.total_arrearage = total_arrearage;
           this.user_id = user_id;
           this.user_kind = user_kind;
           this.user_name = user_name;
    }


    /**
     * Gets the BUNDLE_ID value for this PayFeeHisVO.
     * 
     * @return BUNDLE_ID
     */
    public long getBUNDLE_ID() {
        return BUNDLE_ID;
    }


    /**
     * Sets the BUNDLE_ID value for this PayFeeHisVO.
     * 
     * @param BUNDLE_ID
     */
    public void setBUNDLE_ID(long BUNDLE_ID) {
        this.BUNDLE_ID = BUNDLE_ID;
    }


    /**
     * Gets the access_level value for this PayFeeHisVO.
     * 
     * @return access_level
     */
    public long getAccess_level() {
        return access_level;
    }


    /**
     * Sets the access_level value for this PayFeeHisVO.
     * 
     * @param access_level
     */
    public void setAccess_level(long access_level) {
        this.access_level = access_level;
    }


    /**
     * Gets the accountFeeId value for this PayFeeHisVO.
     * 
     * @return accountFeeId
     */
    public long getAccountFeeId() {
        return accountFeeId;
    }


    /**
     * Sets the accountFeeId value for this PayFeeHisVO.
     * 
     * @param accountFeeId
     */
    public void setAccountFeeId(long accountFeeId) {
        this.accountFeeId = accountFeeId;
    }


    /**
     * Gets the accountFeeKind value for this PayFeeHisVO.
     * 
     * @return accountFeeKind
     */
    public java.lang.String getAccountFeeKind() {
        return accountFeeKind;
    }


    /**
     * Sets the accountFeeKind value for this PayFeeHisVO.
     * 
     * @param accountFeeKind
     */
    public void setAccountFeeKind(java.lang.String accountFeeKind) {
        this.accountFeeKind = accountFeeKind;
    }


    /**
     * Gets the accountFeeValueStr value for this PayFeeHisVO.
     * 
     * @return accountFeeValueStr
     */
    public java.lang.String getAccountFeeValueStr() {
        return accountFeeValueStr;
    }


    /**
     * Sets the accountFeeValueStr value for this PayFeeHisVO.
     * 
     * @param accountFeeValueStr
     */
    public void setAccountFeeValueStr(java.lang.String accountFeeValueStr) {
        this.accountFeeValueStr = accountFeeValueStr;
    }


    /**
     * Gets the account_id value for this PayFeeHisVO.
     * 
     * @return account_id
     */
    public long getAccount_id() {
        return account_id;
    }


    /**
     * Sets the account_id value for this PayFeeHisVO.
     * 
     * @param account_id
     */
    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }


    /**
     * Gets the advance_operate_date value for this PayFeeHisVO.
     * 
     * @return advance_operate_date
     */
    public java.lang.String getAdvance_operate_date() {
        return advance_operate_date;
    }


    /**
     * Sets the advance_operate_date value for this PayFeeHisVO.
     * 
     * @param advance_operate_date
     */
    public void setAdvance_operate_date(java.lang.String advance_operate_date) {
        this.advance_operate_date = advance_operate_date;
    }


    /**
     * Gets the advance_operate_id value for this PayFeeHisVO.
     * 
     * @return advance_operate_id
     */
    public java.lang.String getAdvance_operate_id() {
        return advance_operate_id;
    }


    /**
     * Sets the advance_operate_id value for this PayFeeHisVO.
     * 
     * @param advance_operate_id
     */
    public void setAdvance_operate_id(java.lang.String advance_operate_id) {
        this.advance_operate_id = advance_operate_id;
    }


    /**
     * Gets the apply_start_date value for this PayFeeHisVO.
     * 
     * @return apply_start_date
     */
    public java.lang.String getApply_start_date() {
        return apply_start_date;
    }


    /**
     * Sets the apply_start_date value for this PayFeeHisVO.
     * 
     * @param apply_start_date
     */
    public void setApply_start_date(java.lang.String apply_start_date) {
        this.apply_start_date = apply_start_date;
    }


    /**
     * Gets the bankName value for this PayFeeHisVO.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this PayFeeHisVO.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the batch_id value for this PayFeeHisVO.
     * 
     * @return batch_id
     */
    public int getBatch_id() {
        return batch_id;
    }


    /**
     * Sets the batch_id value for this PayFeeHisVO.
     * 
     * @param batch_id
     */
    public void setBatch_id(int batch_id) {
        this.batch_id = batch_id;
    }


    /**
     * Gets the batch_status value for this PayFeeHisVO.
     * 
     * @return batch_status
     */
    public int getBatch_status() {
        return batch_status;
    }


    /**
     * Sets the batch_status value for this PayFeeHisVO.
     * 
     * @param batch_status
     */
    public void setBatch_status(int batch_status) {
        this.batch_status = batch_status;
    }


    /**
     * Gets the city_code value for this PayFeeHisVO.
     * 
     * @return city_code
     */
    public java.lang.String getCity_code() {
        return city_code;
    }


    /**
     * Sets the city_code value for this PayFeeHisVO.
     * 
     * @param city_code
     */
    public void setCity_code(java.lang.String city_code) {
        this.city_code = city_code;
    }


    /**
     * Gets the city_name value for this PayFeeHisVO.
     * 
     * @return city_name
     */
    public java.lang.String getCity_name() {
        return city_name;
    }


    /**
     * Sets the city_name value for this PayFeeHisVO.
     * 
     * @param city_name
     */
    public void setCity_name(java.lang.String city_name) {
        this.city_name = city_name;
    }


    /**
     * Gets the confirm_operate_date value for this PayFeeHisVO.
     * 
     * @return confirm_operate_date
     */
    public java.lang.String getConfirm_operate_date() {
        return confirm_operate_date;
    }


    /**
     * Sets the confirm_operate_date value for this PayFeeHisVO.
     * 
     * @param confirm_operate_date
     */
    public void setConfirm_operate_date(java.lang.String confirm_operate_date) {
        this.confirm_operate_date = confirm_operate_date;
    }


    /**
     * Gets the confirm_operate_id value for this PayFeeHisVO.
     * 
     * @return confirm_operate_id
     */
    public java.lang.String getConfirm_operate_id() {
        return confirm_operate_id;
    }


    /**
     * Sets the confirm_operate_id value for this PayFeeHisVO.
     * 
     * @param confirm_operate_id
     */
    public void setConfirm_operate_id(java.lang.String confirm_operate_id) {
        this.confirm_operate_id = confirm_operate_id;
    }


    /**
     * Gets the contract_credit value for this PayFeeHisVO.
     * 
     * @return contract_credit
     */
    public long getContract_credit() {
        return contract_credit;
    }


    /**
     * Sets the contract_credit value for this PayFeeHisVO.
     * 
     * @param contract_credit
     */
    public void setContract_credit(long contract_credit) {
        this.contract_credit = contract_credit;
    }


    /**
     * Gets the contract_serial value for this PayFeeHisVO.
     * 
     * @return contract_serial
     */
    public java.lang.String getContract_serial() {
        return contract_serial;
    }


    /**
     * Sets the contract_serial value for this PayFeeHisVO.
     * 
     * @param contract_serial
     */
    public void setContract_serial(java.lang.String contract_serial) {
        this.contract_serial = contract_serial;
    }


    /**
     * Gets the credit_info value for this PayFeeHisVO.
     * 
     * @return credit_info
     */
    public java.lang.String getCredit_info() {
        return credit_info;
    }


    /**
     * Sets the credit_info value for this PayFeeHisVO.
     * 
     * @param credit_info
     */
    public void setCredit_info(java.lang.String credit_info) {
        this.credit_info = credit_info;
    }


    /**
     * Gets the credit_solution value for this PayFeeHisVO.
     * 
     * @return credit_solution
     */
    public long getCredit_solution() {
        return credit_solution;
    }


    /**
     * Sets the credit_solution value for this PayFeeHisVO.
     * 
     * @param credit_solution
     */
    public void setCredit_solution(long credit_solution) {
        this.credit_solution = credit_solution;
    }


    /**
     * Gets the customer_id value for this PayFeeHisVO.
     * 
     * @return customer_id
     */
    public long getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this PayFeeHisVO.
     * 
     * @param customer_id
     */
    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the fee value for this PayFeeHisVO.
     * 
     * @return fee
     */
    public float getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this PayFeeHisVO.
     * 
     * @param fee
     */
    public void setFee(float fee) {
        this.fee = fee;
    }


    /**
     * Gets the fee_date value for this PayFeeHisVO.
     * 
     * @return fee_date
     */
    public java.lang.String getFee_date() {
        return fee_date;
    }


    /**
     * Sets the fee_date value for this PayFeeHisVO.
     * 
     * @param fee_date
     */
    public void setFee_date(java.lang.String fee_date) {
        this.fee_date = fee_date;
    }


    /**
     * Gets the fee_name value for this PayFeeHisVO.
     * 
     * @return fee_name
     */
    public java.lang.String getFee_name() {
        return fee_name;
    }


    /**
     * Sets the fee_name value for this PayFeeHisVO.
     * 
     * @param fee_name
     */
    public void setFee_name(java.lang.String fee_name) {
        this.fee_name = fee_name;
    }


    /**
     * Gets the first_name value for this PayFeeHisVO.
     * 
     * @return first_name
     */
    public java.lang.String getFirst_name() {
        return first_name;
    }


    /**
     * Sets the first_name value for this PayFeeHisVO.
     * 
     * @param first_name
     */
    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }


    /**
     * Gets the flow_number value for this PayFeeHisVO.
     * 
     * @return flow_number
     */
    public long getFlow_number() {
        return flow_number;
    }


    /**
     * Sets the flow_number value for this PayFeeHisVO.
     * 
     * @param flow_number
     */
    public void setFlow_number(long flow_number) {
        this.flow_number = flow_number;
    }


    /**
     * Gets the idcard_type value for this PayFeeHisVO.
     * 
     * @return idcard_type
     */
    public java.lang.String getIdcard_type() {
        return idcard_type;
    }


    /**
     * Sets the idcard_type value for this PayFeeHisVO.
     * 
     * @param idcard_type
     */
    public void setIdcard_type(java.lang.String idcard_type) {
        this.idcard_type = idcard_type;
    }


    /**
     * Gets the identity_code value for this PayFeeHisVO.
     * 
     * @return identity_code
     */
    public java.lang.String getIdentity_code() {
        return identity_code;
    }


    /**
     * Sets the identity_code value for this PayFeeHisVO.
     * 
     * @param identity_code
     */
    public void setIdentity_code(java.lang.String identity_code) {
        this.identity_code = identity_code;
    }


    /**
     * Gets the identity_kind value for this PayFeeHisVO.
     * 
     * @return identity_kind
     */
    public int getIdentity_kind() {
        return identity_kind;
    }


    /**
     * Sets the identity_kind value for this PayFeeHisVO.
     * 
     * @param identity_kind
     */
    public void setIdentity_kind(int identity_kind) {
        this.identity_kind = identity_kind;
    }


    /**
     * Gets the if_valid value for this PayFeeHisVO.
     * 
     * @return if_valid
     */
    public int getIf_valid() {
        return if_valid;
    }


    /**
     * Sets the if_valid value for this PayFeeHisVO.
     * 
     * @param if_valid
     */
    public void setIf_valid(int if_valid) {
        this.if_valid = if_valid;
    }


    /**
     * Gets the last_left value for this PayFeeHisVO.
     * 
     * @return last_left
     */
    public float getLast_left() {
        return last_left;
    }


    /**
     * Sets the last_left value for this PayFeeHisVO.
     * 
     * @param last_left
     */
    public void setLast_left(float last_left) {
        this.last_left = last_left;
    }


    /**
     * Gets the leftFee value for this PayFeeHisVO.
     * 
     * @return leftFee
     */
    public float getLeftFee() {
        return leftFee;
    }


    /**
     * Sets the leftFee value for this PayFeeHisVO.
     * 
     * @param leftFee
     */
    public void setLeftFee(float leftFee) {
        this.leftFee = leftFee;
    }


    /**
     * Gets the left_fee value for this PayFeeHisVO.
     * 
     * @return left_fee
     */
    public float getLeft_fee() {
        return left_fee;
    }


    /**
     * Sets the left_fee value for this PayFeeHisVO.
     * 
     * @param left_fee
     */
    public void setLeft_fee(float left_fee) {
        this.left_fee = left_fee;
    }


    /**
     * Gets the no_pay_number value for this PayFeeHisVO.
     * 
     * @return no_pay_number
     */
    public long getNo_pay_number() {
        return no_pay_number;
    }


    /**
     * Sets the no_pay_number value for this PayFeeHisVO.
     * 
     * @param no_pay_number
     */
    public void setNo_pay_number(long no_pay_number) {
        this.no_pay_number = no_pay_number;
    }


    /**
     * Gets the overdue_fee value for this PayFeeHisVO.
     * 
     * @return overdue_fee
     */
    public float getOverdue_fee() {
        return overdue_fee;
    }


    /**
     * Sets the overdue_fee value for this PayFeeHisVO.
     * 
     * @param overdue_fee
     */
    public void setOverdue_fee(float overdue_fee) {
        this.overdue_fee = overdue_fee;
    }


    /**
     * Gets the payKindName value for this PayFeeHisVO.
     * 
     * @return payKindName
     */
    public java.lang.String getPayKindName() {
        return payKindName;
    }


    /**
     * Sets the payKindName value for this PayFeeHisVO.
     * 
     * @param payKindName
     */
    public void setPayKindName(java.lang.String payKindName) {
        this.payKindName = payKindName;
    }


    /**
     * Gets the payTime value for this PayFeeHisVO.
     * 
     * @return payTime
     */
    public java.lang.String getPayTime() {
        return payTime;
    }


    /**
     * Sets the payTime value for this PayFeeHisVO.
     * 
     * @param payTime
     */
    public void setPayTime(java.lang.String payTime) {
        this.payTime = payTime;
    }


    /**
     * Gets the payWayName value for this PayFeeHisVO.
     * 
     * @return payWayName
     */
    public java.lang.String getPayWayName() {
        return payWayName;
    }


    /**
     * Sets the payWayName value for this PayFeeHisVO.
     * 
     * @param payWayName
     */
    public void setPayWayName(java.lang.String payWayName) {
        this.payWayName = payWayName;
    }


    /**
     * Gets the pay_fee value for this PayFeeHisVO.
     * 
     * @return pay_fee
     */
    public float getPay_fee() {
        return pay_fee;
    }


    /**
     * Sets the pay_fee value for this PayFeeHisVO.
     * 
     * @param pay_fee
     */
    public void setPay_fee(float pay_fee) {
        this.pay_fee = pay_fee;
    }


    /**
     * Gets the pay_kind value for this PayFeeHisVO.
     * 
     * @return pay_kind
     */
    public java.lang.String getPay_kind() {
        return pay_kind;
    }


    /**
     * Sets the pay_kind value for this PayFeeHisVO.
     * 
     * @param pay_kind
     */
    public void setPay_kind(java.lang.String pay_kind) {
        this.pay_kind = pay_kind;
    }


    /**
     * Gets the pay_kind_code value for this PayFeeHisVO.
     * 
     * @return pay_kind_code
     */
    public int getPay_kind_code() {
        return pay_kind_code;
    }


    /**
     * Sets the pay_kind_code value for this PayFeeHisVO.
     * 
     * @param pay_kind_code
     */
    public void setPay_kind_code(int pay_kind_code) {
        this.pay_kind_code = pay_kind_code;
    }


    /**
     * Gets the prepaid_fee value for this PayFeeHisVO.
     * 
     * @return prepaid_fee
     */
    public float getPrepaid_fee() {
        return prepaid_fee;
    }


    /**
     * Sets the prepaid_fee value for this PayFeeHisVO.
     * 
     * @param prepaid_fee
     */
    public void setPrepaid_fee(float prepaid_fee) {
        this.prepaid_fee = prepaid_fee;
    }


    /**
     * Gets the service_favour_id value for this PayFeeHisVO.
     * 
     * @return service_favour_id
     */
    public long getService_favour_id() {
        return service_favour_id;
    }


    /**
     * Sets the service_favour_id value for this PayFeeHisVO.
     * 
     * @param service_favour_id
     */
    public void setService_favour_id(long service_favour_id) {
        this.service_favour_id = service_favour_id;
    }


    /**
     * Gets the service_favour_name value for this PayFeeHisVO.
     * 
     * @return service_favour_name
     */
    public java.lang.String getService_favour_name() {
        return service_favour_name;
    }


    /**
     * Sets the service_favour_name value for this PayFeeHisVO.
     * 
     * @param service_favour_name
     */
    public void setService_favour_name(java.lang.String service_favour_name) {
        this.service_favour_name = service_favour_name;
    }


    /**
     * Gets the service_id value for this PayFeeHisVO.
     * 
     * @return service_id
     */
    public java.lang.String getService_id() {
        return service_id;
    }


    /**
     * Sets the service_id value for this PayFeeHisVO.
     * 
     * @param service_id
     */
    public void setService_id(java.lang.String service_id) {
        this.service_id = service_id;
    }


    /**
     * Gets the service_kind value for this PayFeeHisVO.
     * 
     * @return service_kind
     */
    public int getService_kind() {
        return service_kind;
    }


    /**
     * Sets the service_kind value for this PayFeeHisVO.
     * 
     * @param service_kind
     */
    public void setService_kind(int service_kind) {
        this.service_kind = service_kind;
    }


    /**
     * Gets the service_name value for this PayFeeHisVO.
     * 
     * @return service_name
     */
    public java.lang.String getService_name() {
        return service_name;
    }


    /**
     * Sets the service_name value for this PayFeeHisVO.
     * 
     * @param service_name
     */
    public void setService_name(java.lang.String service_name) {
        this.service_name = service_name;
    }


    /**
     * Gets the service_status value for this PayFeeHisVO.
     * 
     * @return service_status
     */
    public java.lang.String getService_status() {
        return service_status;
    }


    /**
     * Sets the service_status value for this PayFeeHisVO.
     * 
     * @param service_status
     */
    public void setService_status(java.lang.String service_status) {
        this.service_status = service_status;
    }


    /**
     * Gets the serving_status value for this PayFeeHisVO.
     * 
     * @return serving_status
     */
    public int getServing_status() {
        return serving_status;
    }


    /**
     * Sets the serving_status value for this PayFeeHisVO.
     * 
     * @param serving_status
     */
    public void setServing_status(int serving_status) {
        this.serving_status = serving_status;
    }


    /**
     * Gets the sum_fee value for this PayFeeHisVO.
     * 
     * @return sum_fee
     */
    public float getSum_fee() {
        return sum_fee;
    }


    /**
     * Sets the sum_fee value for this PayFeeHisVO.
     * 
     * @param sum_fee
     */
    public void setSum_fee(float sum_fee) {
        this.sum_fee = sum_fee;
    }


    /**
     * Gets the total_arrearage value for this PayFeeHisVO.
     * 
     * @return total_arrearage
     */
    public float getTotal_arrearage() {
        return total_arrearage;
    }


    /**
     * Sets the total_arrearage value for this PayFeeHisVO.
     * 
     * @param total_arrearage
     */
    public void setTotal_arrearage(float total_arrearage) {
        this.total_arrearage = total_arrearage;
    }


    /**
     * Gets the user_id value for this PayFeeHisVO.
     * 
     * @return user_id
     */
    public long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this PayFeeHisVO.
     * 
     * @param user_id
     */
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the user_kind value for this PayFeeHisVO.
     * 
     * @return user_kind
     */
    public int getUser_kind() {
        return user_kind;
    }


    /**
     * Sets the user_kind value for this PayFeeHisVO.
     * 
     * @param user_kind
     */
    public void setUser_kind(int user_kind) {
        this.user_kind = user_kind;
    }


    /**
     * Gets the user_name value for this PayFeeHisVO.
     * 
     * @return user_name
     */
    public java.lang.String getUser_name() {
        return user_name;
    }


    /**
     * Sets the user_name value for this PayFeeHisVO.
     * 
     * @param user_name
     */
    public void setUser_name(java.lang.String user_name) {
        this.user_name = user_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayFeeHisVO)) return false;
        PayFeeHisVO other = (PayFeeHisVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.BUNDLE_ID == other.getBUNDLE_ID() &&
            this.access_level == other.getAccess_level() &&
            this.accountFeeId == other.getAccountFeeId() &&
            ((this.accountFeeKind==null && other.getAccountFeeKind()==null) || 
             (this.accountFeeKind!=null &&
              this.accountFeeKind.equals(other.getAccountFeeKind()))) &&
            ((this.accountFeeValueStr==null && other.getAccountFeeValueStr()==null) || 
             (this.accountFeeValueStr!=null &&
              this.accountFeeValueStr.equals(other.getAccountFeeValueStr()))) &&
            this.account_id == other.getAccount_id() &&
            ((this.advance_operate_date==null && other.getAdvance_operate_date()==null) || 
             (this.advance_operate_date!=null &&
              this.advance_operate_date.equals(other.getAdvance_operate_date()))) &&
            ((this.advance_operate_id==null && other.getAdvance_operate_id()==null) || 
             (this.advance_operate_id!=null &&
              this.advance_operate_id.equals(other.getAdvance_operate_id()))) &&
            ((this.apply_start_date==null && other.getApply_start_date()==null) || 
             (this.apply_start_date!=null &&
              this.apply_start_date.equals(other.getApply_start_date()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            this.batch_id == other.getBatch_id() &&
            this.batch_status == other.getBatch_status() &&
            ((this.city_code==null && other.getCity_code()==null) || 
             (this.city_code!=null &&
              this.city_code.equals(other.getCity_code()))) &&
            ((this.city_name==null && other.getCity_name()==null) || 
             (this.city_name!=null &&
              this.city_name.equals(other.getCity_name()))) &&
            ((this.confirm_operate_date==null && other.getConfirm_operate_date()==null) || 
             (this.confirm_operate_date!=null &&
              this.confirm_operate_date.equals(other.getConfirm_operate_date()))) &&
            ((this.confirm_operate_id==null && other.getConfirm_operate_id()==null) || 
             (this.confirm_operate_id!=null &&
              this.confirm_operate_id.equals(other.getConfirm_operate_id()))) &&
            this.contract_credit == other.getContract_credit() &&
            ((this.contract_serial==null && other.getContract_serial()==null) || 
             (this.contract_serial!=null &&
              this.contract_serial.equals(other.getContract_serial()))) &&
            ((this.credit_info==null && other.getCredit_info()==null) || 
             (this.credit_info!=null &&
              this.credit_info.equals(other.getCredit_info()))) &&
            this.credit_solution == other.getCredit_solution() &&
            this.customer_id == other.getCustomer_id() &&
            this.fee == other.getFee() &&
            ((this.fee_date==null && other.getFee_date()==null) || 
             (this.fee_date!=null &&
              this.fee_date.equals(other.getFee_date()))) &&
            ((this.fee_name==null && other.getFee_name()==null) || 
             (this.fee_name!=null &&
              this.fee_name.equals(other.getFee_name()))) &&
            ((this.first_name==null && other.getFirst_name()==null) || 
             (this.first_name!=null &&
              this.first_name.equals(other.getFirst_name()))) &&
            this.flow_number == other.getFlow_number() &&
            ((this.idcard_type==null && other.getIdcard_type()==null) || 
             (this.idcard_type!=null &&
              this.idcard_type.equals(other.getIdcard_type()))) &&
            ((this.identity_code==null && other.getIdentity_code()==null) || 
             (this.identity_code!=null &&
              this.identity_code.equals(other.getIdentity_code()))) &&
            this.identity_kind == other.getIdentity_kind() &&
            this.if_valid == other.getIf_valid() &&
            this.last_left == other.getLast_left() &&
            this.leftFee == other.getLeftFee() &&
            this.left_fee == other.getLeft_fee() &&
            this.no_pay_number == other.getNo_pay_number() &&
            this.overdue_fee == other.getOverdue_fee() &&
            ((this.payKindName==null && other.getPayKindName()==null) || 
             (this.payKindName!=null &&
              this.payKindName.equals(other.getPayKindName()))) &&
            ((this.payTime==null && other.getPayTime()==null) || 
             (this.payTime!=null &&
              this.payTime.equals(other.getPayTime()))) &&
            ((this.payWayName==null && other.getPayWayName()==null) || 
             (this.payWayName!=null &&
              this.payWayName.equals(other.getPayWayName()))) &&
            this.pay_fee == other.getPay_fee() &&
            ((this.pay_kind==null && other.getPay_kind()==null) || 
             (this.pay_kind!=null &&
              this.pay_kind.equals(other.getPay_kind()))) &&
            this.pay_kind_code == other.getPay_kind_code() &&
            this.prepaid_fee == other.getPrepaid_fee() &&
            this.service_favour_id == other.getService_favour_id() &&
            ((this.service_favour_name==null && other.getService_favour_name()==null) || 
             (this.service_favour_name!=null &&
              this.service_favour_name.equals(other.getService_favour_name()))) &&
            ((this.service_id==null && other.getService_id()==null) || 
             (this.service_id!=null &&
              this.service_id.equals(other.getService_id()))) &&
            this.service_kind == other.getService_kind() &&
            ((this.service_name==null && other.getService_name()==null) || 
             (this.service_name!=null &&
              this.service_name.equals(other.getService_name()))) &&
            ((this.service_status==null && other.getService_status()==null) || 
             (this.service_status!=null &&
              this.service_status.equals(other.getService_status()))) &&
            this.serving_status == other.getServing_status() &&
            this.sum_fee == other.getSum_fee() &&
            this.total_arrearage == other.getTotal_arrearage() &&
            this.user_id == other.getUser_id() &&
            this.user_kind == other.getUser_kind() &&
            ((this.user_name==null && other.getUser_name()==null) || 
             (this.user_name!=null &&
              this.user_name.equals(other.getUser_name())));
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
        _hashCode += new Long(getBUNDLE_ID()).hashCode();
        _hashCode += new Long(getAccess_level()).hashCode();
        _hashCode += new Long(getAccountFeeId()).hashCode();
        if (getAccountFeeKind() != null) {
            _hashCode += getAccountFeeKind().hashCode();
        }
        if (getAccountFeeValueStr() != null) {
            _hashCode += getAccountFeeValueStr().hashCode();
        }
        _hashCode += new Long(getAccount_id()).hashCode();
        if (getAdvance_operate_date() != null) {
            _hashCode += getAdvance_operate_date().hashCode();
        }
        if (getAdvance_operate_id() != null) {
            _hashCode += getAdvance_operate_id().hashCode();
        }
        if (getApply_start_date() != null) {
            _hashCode += getApply_start_date().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        _hashCode += getBatch_id();
        _hashCode += getBatch_status();
        if (getCity_code() != null) {
            _hashCode += getCity_code().hashCode();
        }
        if (getCity_name() != null) {
            _hashCode += getCity_name().hashCode();
        }
        if (getConfirm_operate_date() != null) {
            _hashCode += getConfirm_operate_date().hashCode();
        }
        if (getConfirm_operate_id() != null) {
            _hashCode += getConfirm_operate_id().hashCode();
        }
        _hashCode += new Long(getContract_credit()).hashCode();
        if (getContract_serial() != null) {
            _hashCode += getContract_serial().hashCode();
        }
        if (getCredit_info() != null) {
            _hashCode += getCredit_info().hashCode();
        }
        _hashCode += new Long(getCredit_solution()).hashCode();
        _hashCode += new Long(getCustomer_id()).hashCode();
        _hashCode += new Float(getFee()).hashCode();
        if (getFee_date() != null) {
            _hashCode += getFee_date().hashCode();
        }
        if (getFee_name() != null) {
            _hashCode += getFee_name().hashCode();
        }
        if (getFirst_name() != null) {
            _hashCode += getFirst_name().hashCode();
        }
        _hashCode += new Long(getFlow_number()).hashCode();
        if (getIdcard_type() != null) {
            _hashCode += getIdcard_type().hashCode();
        }
        if (getIdentity_code() != null) {
            _hashCode += getIdentity_code().hashCode();
        }
        _hashCode += getIdentity_kind();
        _hashCode += getIf_valid();
        _hashCode += new Float(getLast_left()).hashCode();
        _hashCode += new Float(getLeftFee()).hashCode();
        _hashCode += new Float(getLeft_fee()).hashCode();
        _hashCode += new Long(getNo_pay_number()).hashCode();
        _hashCode += new Float(getOverdue_fee()).hashCode();
        if (getPayKindName() != null) {
            _hashCode += getPayKindName().hashCode();
        }
        if (getPayTime() != null) {
            _hashCode += getPayTime().hashCode();
        }
        if (getPayWayName() != null) {
            _hashCode += getPayWayName().hashCode();
        }
        _hashCode += new Float(getPay_fee()).hashCode();
        if (getPay_kind() != null) {
            _hashCode += getPay_kind().hashCode();
        }
        _hashCode += getPay_kind_code();
        _hashCode += new Float(getPrepaid_fee()).hashCode();
        _hashCode += new Long(getService_favour_id()).hashCode();
        if (getService_favour_name() != null) {
            _hashCode += getService_favour_name().hashCode();
        }
        if (getService_id() != null) {
            _hashCode += getService_id().hashCode();
        }
        _hashCode += getService_kind();
        if (getService_name() != null) {
            _hashCode += getService_name().hashCode();
        }
        if (getService_status() != null) {
            _hashCode += getService_status().hashCode();
        }
        _hashCode += getServing_status();
        _hashCode += new Float(getSum_fee()).hashCode();
        _hashCode += new Float(getTotal_arrearage()).hashCode();
        _hashCode += new Long(getUser_id()).hashCode();
        _hashCode += getUser_kind();
        if (getUser_name() != null) {
            _hashCode += getUser_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayFeeHisVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://data.common.feemgt.webservice.crm.neusoft.com", "PayFeeHisVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUNDLE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUNDLE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access_level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "access_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFeeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountFeeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFeeKind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountFeeKind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFeeValueStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountFeeValueStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advance_operate_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advance_operate_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advance_operate_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advance_operate_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apply_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apply_start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batch_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batch_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batch_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batch_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirm_operate_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirm_operate_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirm_operate_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirm_operate_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract_credit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contract_credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract_serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contract_serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_solution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit_solution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fee_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fee_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fee_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "first_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flow_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flow_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idcard_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idcard_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identity_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity_kind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identity_kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("if_valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "if_valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_left");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("left_fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "left_fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_pay_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "no_pay_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdue_fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overdue_fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payKindName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payKindName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payWayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payWayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pay_fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay_fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pay_kind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay_kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pay_kind_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay_kind_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaid_fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaid_fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_favour_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_favour_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_favour_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_favour_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_kind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serving_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serving_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sum_fee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sum_fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_arrearage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_arrearage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_kind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
