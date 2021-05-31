package testsnew;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import testsold.*;
import org.junit.*;

import com.kach.Calc.Calculate;
import com.kach.db.model.Map;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
/**
 *
 * @author misha
 */
public class CalculateTestwhitenew {
    
    @Test
    public void coordlessthancan(){
        String path ="";
        ArrayList<Map> map=new ArrayList<>();
        int x1=-1,y1=-1;
        int x2=1,y2=1;
        ArrayList<Map> path1=Calculate.calculate_better(x1,y1,x2,y2,map,path);
        if(!path1.isEmpty()){
        path=Integer.toString(path1.get(0).getx())+","+Integer.toString(path1.get(0).gety());
        path1.remove(0);
        int i=1;
        while(!path.isEmpty()){
            path=path+">"+Integer.toString(path1.get(i).getx())+","+Integer.toString(path1.get(i).gety());
            i++;
        } 
        }
        assertEquals("Set x1,x2 between 0 and 0 and y1,y2 between 0 and 0",path);
    }
    @Test
    public void coordmorethancan(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=1,y1=1;
        int x2=21,y2=21;
        String path ="";
        ArrayList<Map> path1=Calculate.calculate_better(x1,y1,x2,y2,map,path);
        if(!path1.isEmpty()){
        path=Integer.toString(path1.get(0).getx())+","+Integer.toString(path1.get(0).gety());
        path1.remove(0);
        int i=1;
        while(!path.isEmpty()){
            path=path+">"+Integer.toString(path1.get(i).getx())+","+Integer.toString(path1.get(i).gety());
            i++;
        } 
        }
        assertEquals("Set x1,x2 between 0 and 0 and y1,y2 between 0 and 0",path);
    }
    @Test
    public void nopath(){
        String path ="";
        ArrayList<Map> map=new ArrayList<>();
        int x1=-1,y1=-1;
        int x2=2,y2=2;
        map.add(new Map(-2,-2));
        map.add(new Map(5,5));
        ArrayList<Map> path1=Calculate.calculate_better(x1,y1,x2,y2,map,path);
        if(!path1.isEmpty()){
        path=Integer.toString(path1.get(0).getx())+","+Integer.toString(path1.get(0).gety());
        path1.remove(0);
        int i=1;
        while(!path.isEmpty()){
            path=path+">"+Integer.toString(path1.get(i).getx())+","+Integer.toString(path1.get(i).gety());
            i++;
        } 
        }
        assertEquals("No path found",path);
    }
    @Test
    public void simple(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=2,y1=2;
        int x2=2,y2=2;
        map.add(new Map(-2,-2));
        map.add(new Map(5,5));
        String path ="";
        ArrayList<Map> path1=Calculate.calculate_better(x1,y1,x2,y2,map,path);
        if(!path1.isEmpty()){
        path=Integer.toString(path1.get(0).getx())+","+Integer.toString(path1.get(0).gety());
        path1.remove(0);
        int i=1;
        while(!path.isEmpty()){
            path=path+">"+Integer.toString(path1.get(i).getx())+","+Integer.toString(path1.get(i).gety());
            i++;
        } 
        }
        assertEquals("2,2",path);
    }
    @Test
    public void toendoflist(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=2,y1=2;
        int x2=2,y2=3;
        map.add(new Map(2,2));
        map.add(new Map(2,1));
        map.add(new Map(1,2));
        map.add(new Map(3,2));
        map.add(new Map(2,3));
        String path ="";
        ArrayList<Map> path1=Calculate.calculate_better(x1,y1,x2,y2,map,path);
        if(!path1.isEmpty()){
        path=Integer.toString(path1.get(0).getx())+","+Integer.toString(path1.get(0).gety());
        path1.remove(0);
        int i=1;
        while(!path.isEmpty()){
            path=path+">"+Integer.toString(path1.get(i).getx())+","+Integer.toString(path1.get(i).gety());
            i++;
        } 
        }
        assertEquals("2,2>2,3",path);
    }
    @Test
    public void all(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=1,y1=1;
        int x2=2,y2=2;
        map.add(new Map(2,2));
        map.add(new Map(2,1));
        map.add(new Map(1,1));
        String path ="";
        ArrayList<Map> path1=Calculate.calculate_better(x1,y1,x2,y2,map,path);
        if(!path1.isEmpty()){
        path=Integer.toString(path1.get(0).getx())+","+Integer.toString(path1.get(0).gety());
        path1.remove(0);
        int i=1;
        while(!path.isEmpty()){
            path=path+">"+Integer.toString(path1.get(i).getx())+","+Integer.toString(path1.get(i).gety());
            i++;
        }  
        }
        assertEquals("1,1>2,2",path);
    }
}
