package com.kach.db.model;

/**
 *
 * @author misha
 */

public class Node {
    boolean passable;
    double finalcost;
    int curentx;
    int curenty;
    int parentx;
    int parenty;
    public Node(boolean passable, double finalcost,int parentx,int parenty, int curentx,int curenty){
        this.curentx=curentx;
        this.parentx=parentx;
        this.curenty=curenty;
        this.parenty=parenty;
        this.passable=passable;
        this.finalcost=finalcost;
    }
    public void setpassable(boolean passable){
        this.passable=passable;
    }
    public void setfinalcost(double finalcost){
        this.finalcost=finalcost;
    }
    public void setparenx(int parentx){
        this.parentx=parentx;
    }
    public void setpareny(int parenty){
        this.parenty=parenty;
    }
    public void setx(int x){
        this.curentx=x;
    }
    public void sety(int y){
        this.curenty=y;
    }
    public boolean getpassable(){
        return this.passable;
    }
    public double getfinalcost(){
        return this.finalcost;
    }
    public int getparenx(){
        return this.parentx;
    }
    public int getpareny(){
        return this.parenty;
    }
    public int getx(){
        return this.curentx;
    }
    public int gety(){
        return this.curenty;
    }
}

