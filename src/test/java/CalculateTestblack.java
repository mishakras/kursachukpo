/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.*;
import org.junit.rules.ExpectedException;

import com.kach.Calc.Calculate;
import com.kach.db.model.Map;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
/**
 *
 * @author misha
 */
public class CalculateTestblack {
   /* private final Calculate calc;

    public CalculateTestblack() {
        this.calc = new Calculate();
    }
   
    @Test
    public void path(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=1,y1=1;
        int x2=1,y2=4;
        map.add(new Map(1,1));
        map.add(new Map(1,2));
        map.add(new Map(1,3));
        map.add(new Map(1,4));
        String path=Calculate.calculate(x1,y1,x2,y2,map);
        assertEquals("1,1>1,2>1,3>1,4",path);
    }
    @Test
    public void anotherpath(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=1,y1=1;
        int x2=2,y2=3;
        map.add(new Map(1,1));
        map.add(new Map(1,2));
        map.add(new Map(1,3));
        map.add(new Map(2,1));
        map.add(new Map(2,3));
        map.add(new Map(3,1));
        map.add(new Map(3,2));
        map.add(new Map(3,3));
        String path=Calculate.calculate(x1,y1,x2,y2,map);
        assertEquals("1,1>2,1>3,1>3,2>3,3>2,3",path);
    }
    @Test
    public void outofbounds(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=-1,y1=-1;
        int x2=2,y2=3;
        map.add(new Map(1,1));
        map.add(new Map(1,2));
        map.add(new Map(1,3));
        map.add(new Map(2,1));
        map.add(new Map(2,3));
        map.add(new Map(3,1));
        map.add(new Map(3,2));
        map.add(new Map(3,3));
        String path=Calculate.calculate(x1,y1,x2,y2,map);
        assertEquals("Set x1,x2 between 0 and 3 and y1,y2 between 0 and 3",path);
    }
    @Test
    public void nopath(){
        ArrayList<Map> map=new ArrayList<>();
        int x1=1,y1=1;
        int x2=1,y2=4;
        map.add(new Map(-2,-2));
        map.add(new Map(5,5));
        String path=Calculate.calculate(x1,y1,x2,y2,map);
        assertEquals("No path found",path);
    }
    */
}
