package com.cskaoyan.domain.qualify;

public class unqualify_apply {
    private String unqualifyApplyId;

    private String productId;

    private String unqualifyItem;

    private Integer unqualifyCount;

    private String assemblyDate;

    private String empId;

    private String applyDate;

    private String note;

    public unqualify_apply() {
    }

    public unqualify_apply(String unqualifyApplyId, String productId, String unqualifyItem, Integer unqualifyCount, String assemblyDate, String empId, String applyDate, String note) {
        this.unqualifyApplyId = unqualifyApplyId;
        this.productId = productId;
        this.unqualifyItem = unqualifyItem;
        this.unqualifyCount = unqualifyCount;
        this.assemblyDate = assemblyDate;
        this.empId = empId;
        this.applyDate = applyDate;
        this.note = note;
    }

    public String getUnqualifyApplyId() {
        return unqualifyApplyId;
    }

    public void setUnqualifyApplyId(String unqualifyApplyId) {
        this.unqualifyApplyId = unqualifyApplyId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUnqualifyItem() {
        return unqualifyItem;
    }

    public void setUnqualifyItem(String unqualifyItem) {
        this.unqualifyItem = unqualifyItem;
    }

    public Integer getUnqualifyCount() {
        return unqualifyCount;
    }

    public void setUnqualifyCount(Integer unqualifyCount) {
        this.unqualifyCount = unqualifyCount;
    }

    public String getAssemblyDate() {
        return assemblyDate;
    }

    public void setAssemblyDate(String assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "unqualify_apply{" +
                "unqualifyApplyId='" + unqualifyApplyId + '\'' +
                ", productId='" + productId + '\'' +
                ", unqualifyItem='" + unqualifyItem + '\'' +
                ", unqualifyCount=" + unqualifyCount +
                ", assemblyDate='" + assemblyDate + '\'' +
                ", empId='" + empId + '\'' +
                ", applyDate='" + applyDate + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}