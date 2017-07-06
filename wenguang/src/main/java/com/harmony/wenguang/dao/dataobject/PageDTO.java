package com.harmony.wenguang.dao.dataobject;

import java.io.Serializable;

public class PageDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private int pageNo = 1;
    
    private int pageRows = 20;
    
    private int rowId = 0;
    
    public int getPageNo() {
        if(pageNo<0){
            pageNo = 0;
        }
        return pageNo;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageRows() {
        if(pageRows<0){
            pageRows = 0;
        }
        return pageRows;
    }

    public void setPageRows(int pageRows) {
        this.pageRows = pageRows;
    }

    public int getStartNum() {
        int i = (getPageNo()-1)*getPageRows() + 1;
        if(i<0){
           i=0;
        }
        return i;
    }
    
    public int getEndNum(){
        int i = getStartNum()+pageRows - 1;
        if(i<0){
            i = 0;
        }
        return i;
    }
}
