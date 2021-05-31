package com.kach.Calc;
import com.kach.db.model.Map;
import com.kach.db.model.Node;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
/**
 *
 * @author misha
 */
public class Calculate {
    public Calculate(){
        
    }
    public static Double H(int x1, int y1, int x2, int y2){
        return sqrt((x1-x2)^2+(y1-y2)^2);
    }
    public static ArrayList<Map> calculate_better(int x1, int y1, int x2, int y2, ArrayList<Map> map,String path) {
        int x, y;
        int xlim = 0;
        int ylim = 0;
        int minx = 0;
        int miny = 0;
        int tx , ty ;
        double k ;
        boolean flag = false;
        ArrayList<Map> result=new ArrayList<>();
        ArrayList<Node> list2= new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            x = map.get(i).getx();
            if (x < minx) {
                minx = x;
            }
            if (x > xlim) {
                xlim = x;
            }
            y = map.get(i).gety();
            if (y < miny) {
                miny = y;
            }
            if (y > ylim) {
                ylim = y;
            }
        }
        ArrayList<ArrayList<Node>> table=new ArrayList<>();
        for (int i = minx; i < xlim + 1; i++) {
            ArrayList<Node> temp= new ArrayList<>();
            for (int j = miny; j < ylim + 1; j++) {
                Node temp1= new Node(false,100000,10000,10000,i,j);
            for (int l = 0; l < map.size(); l++) {
                    if ((map.get(l).getx() == i) & (map.get(l).gety() == j)) {
                        flag = true;
                    }
                }
                if (flag) {
                    temp1.setpassable(true);
                }
                temp.add(temp1);
                flag = false;
            }
            table.add(temp);
        }
        flag = true;
        if (((x1 >= minx) & (x1 <= xlim) & (y1 >= miny) & (y1 <= ylim)) & ((x2 >= minx) & (x2 <= xlim) & (y2 >= miny) & (y2 <= ylim))) {
            table.get(x1- minx).get(y1- minx).setfinalcost(0);
            list2.add(new Node(true, 0, 10000, 10000, x1, y1));
            while (!list2.isEmpty()) {
                x=1;
                x = list2.get(list2.size() - 1).getx() - minx;
                y = list2.get(list2.size() - 1).gety() - miny;
                if ((x == x2- minx) & (y == y2- miny)) {
                    flag = false;
                    x=x+minx;
                    y=y+miny;
                    while ((x != x1) | (y != y1)) {
                        result.add(0,new Map(x,y));
                        tx = x - minx;
                        ty = y - miny;
                        x = table.get(tx).get(ty).getparenx();
                        y = table.get(tx).get(ty).getpareny();
                    }
                    result.add(0,new Map(x,y));
                    break;
                } else {
                    k = list2.get(list2.size() - 1).getfinalcost();
                    list2.remove(list2.size() - 1);
                    for (int dx = -1; dx < 2; dx = dx + 1) {
                        for (int dy = -1; dy < 2; dy = dy + 1) {
                            if ((dx != 0) & (dy != 0)) {
                                if ((x + dx >= minx) & (x + dx <= xlim) & (y + dy >= miny) & (y + dy <= ylim)) {
                                    if (table.get(x + dx).get(y + dy).getpassable()) {
                                        boolean flag1 = true;
                                        double h = H(x + dx, y + dy, x2, y2);
                                        if (table.get(x + dx).get(y + dy).getfinalcost() > k + 1 + h) {
                                            Node New = new Node(true, k + 1 + h, x, y, x + dx, y + dy);
                                            table.get(x + dx).set(y + dy, New);
                                            if (list2.isEmpty()) {
                                                list2.add(New);
                                            } else {
                                                for (int i = 0; i < list2.size(); i++) {
                                                    if (k + 1 + h < list2.get(i).getfinalcost()) {
                                                        list2.add(i, New);
                                                        flag1 = false;
                                                        break;
                                                    }
                                                }
                                                if (flag1) {
                                                    list2.add(New);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } 
                }
            }
            if (flag) {
                path = "No path found";
            }
        } else {
            path = "Set x1,x2 between " + Integer.toString(minx) + " and " + Integer.toString(xlim) + " and y1,y2 between " + Integer.toString(miny) + " and " + Integer.toString(ylim) + "";
        }
        return result;
    }
    
    public static String calculate(int x1, int y1, int x2, int y2, ArrayList<Map> map) {
        String path = "";
        int x, y;
        int xlim = 0;
        int ylim = 0;
        int minx = 0;
        int miny = 0;
        int tx , ty ;
        double k ;
        boolean flag = false;
        ArrayList<Node> list2= new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            x = map.get(i).getx();
            if (x < minx) {
                minx = x;
            }
            if (x > xlim) {
                xlim = x;
            }
            y = map.get(i).gety();
            if (y < miny) {
                miny = y;
            }
            if (y > ylim) {
                ylim = y;
            }
        }
        ArrayList<ArrayList<Node>> table=new ArrayList<>();
        for (int i = minx; i < xlim + 1; i++) {
            ArrayList<Node> temp= new ArrayList<>();
            for (int j = miny; j < ylim + 1; j++) {
                Node temp1= new Node(false,100000,10000,10000,i,j);
            for (int l = 0; l < map.size(); l++) {
                    if ((map.get(l).getx() == i) & (map.get(l).gety() == j)) {
                        flag = true;
                    }
                }
                if (flag) {
                    temp1.setpassable(true);
                }
                temp.add(temp1);
                flag = false;
            }
            table.add(temp);
        }
        flag = true;
        if (((x1 >= minx) & (x1 <= xlim) & (y1 >= miny) & (y1 <= ylim)) & ((x2 >= minx) & (x2 <= xlim) & (y2 >= miny) & (y2 <= ylim))) {
            table.get(x1- minx).get(y1- minx).setfinalcost(0);
            list2.add(new Node(true, 0, 10000, 10000, x1, y1));
            while (!list2.isEmpty()) {
                x=1;
                x = list2.get(list2.size() - 1).getx() - minx;
                y = list2.get(list2.size() - 1).gety() - miny;
                if ((x == x2- minx) & (y == y2- miny)) {
                    flag = false;
                    x=x+minx;
                    y=y+miny;
                    while ((x != x1) | (y != y1)) {
                        path = ">" + Integer.toString(x)+","+Integer.toString(y)+path;
                        tx = x - minx;
                        ty = y - miny;
                        x = table.get(tx).get(ty).getparenx();
                        y = table.get(tx).get(ty).getpareny();
                    }
                    path = Integer.toString(x)+","+Integer.toString(y)+path;
                    break;
                } else {
                    k = list2.get(list2.size() - 1).getfinalcost();
                    list2.remove(list2.size() - 1);
                    for (int dx = -1; dx < 2; dx = dx + 2) {
                        if ((x + dx >= minx) & (x + dx <= xlim)) {
                            if (table.get(x + dx).get(y).getpassable()) {
                                boolean flag1 = true;
                                double h = H(x + dx, y, x2, y2);
                                if (table.get(x + dx).get(y).getfinalcost() > k + 1 + h) {
                                    Node New=new Node(true,k + 1 + h,x,y,x + dx,y);
                                    table.get(x+dx).set(y,New);
                                    if(list2.isEmpty())
                                        list2.add(New);
                                    else{
                                        for (int i = 0; i < list2.size(); i++) {
                                            if (k + 1 + h < list2.get(i).getfinalcost()) {
                                                list2.add(i,New);
                                                flag1=false;
                                                break;
                                            } 
                                        }
                                        if(flag1)
                                            list2.add(New);
                                    }
                                }
                                int i=0;
                            }
                        }
                    }
                    for (int dy = -1; dy < 2; dy = dy + 2) {
                        if ((y + dy >= miny) & (y + dy <= ylim)) {
                            if (table.get(x).get(y + dy).getpassable()) {
                                double h = H(x, y + dy, x2, y2);
                                boolean flag1 = true;
                                if (table.get(x).get(y + dy).getfinalcost() > k + 1 + h) {
                                    Node New=new Node(true,k + 1 + h,x,y,x,y + dy);
                                    table.get(x).set(y+dy,New);
                                    if(list2.isEmpty())
                                        list2.add(New);
                                    else{
                                        for (int i = 0; i < list2.size(); i++) {
                                            if (k + 1 + h < list2.get(i).getfinalcost()) {
                                                list2.add(i,New);
                                                flag1=false;
                                                break;
                                            } 
                                        }
                                        if(flag1)
                                            list2.add(New);
                                    }
                                }
                            }                            
                        }
                    }
                }
            }
            if (flag) {
                path = "No path found";
            }
        } else {
            path = "Set x1,x2 between " + Integer.toString(minx)+" and "+Integer.toString(xlim)+" and y1,y2 between "+Integer.toString(miny)+" and "+Integer.toString(ylim)+"";
        }
    return path;
    }
} 

