package com.example.Task1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task1")
public class CalcEntity {
    @Id
    @GeneratedValue
    private long sino;
    private int inp1;
    private int inp2;
    private String operator;
    private int result;

    public long getSino() {
        return sino;
    }

    public void setSino(long sino) {
        this.sino = sino;
    }

    public int getInp1() {
        return inp1;
    }

    public void setInp1(int inp1) {
        this.inp1 = inp1;
    }

    public int getInp2() {
        return inp2;
    }

    public void setInp2(int inp2) {
        this.inp2 = inp2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public  CalcEntity(){

    }
    public CalcEntity(int inp1,int inp2,String operator,int result){
        this.inp1=inp1;
        this.inp2=inp2;
        this.operator=operator;
        this.result=result;
    }
    @Override
    public String toString(){
        return  "CalcEntity{"+
                "result="+result+
                '}';
    }
}
