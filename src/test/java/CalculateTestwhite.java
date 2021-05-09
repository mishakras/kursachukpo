/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.*;

import com.kach.Calc.Calculate;
import com.kach.db.model.Map;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
/**
 *
 * @author misha
 */
public class CalculateTestwhite {
    
    @Test
    public void coordlessthancan(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=-1,y1=-1;
        int x2=1,y2=1;
        String path=Calculate.calculate(x1,y1,x2,y2,map);
        assertEquals("Set x1,x2 between 0 and 0 and y1,y2 between 0 and 0",path);
    }
    @Test
    public void coordmorethancan(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=1,y1=1;
        int x2=21,y2=21;
        String path;
        path = Calculate.calculate(x1,y1,x2,y2,map);
        assertEquals("Set x1,x2 between 0 and 0 and y1,y2 between 0 and 0",path);
    }
    @Test
    public void nopath(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=-1,y1=-1;
        int x2=2,y2=2;
        map.add(new Map(-2,-2));
        map.add(new Map(5,5));
        String path=Calculate.calculate(x1,y1,x2,y2,map);
        assertEquals("No path found",path);
    }
    @Test
    public void simple(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=2,y1=2;
        int x2=2,y2=2;
        map.add(new Map(-2,-2));
        map.add(new Map(5,5));
        String path=Calculate.calculate(x1,y1,x2,y2,map);
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
        String path=Calculate.calculate(x1,y1,x2,y2,map);
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
        String path=Calculate.calculate(x1,y1,x2,y2,map);
        assertEquals("1,1>2,1>2,2",path);
    }
}
