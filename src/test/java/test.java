/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.*;

import com.kach.Calc.Calculate;
import com.kach.db.model.Map;
import com.kach.db.model.Path;
import java.util.ArrayList;
import com.kach.service.MapService;
import com.kach.service.PathService;
import static junit.framework.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author misha
 */
public class test {
    @Autowired
    private MapService mapService;
    @Autowired
    private PathService pathService;
    
    @Test
    public void test1(){
        pathService.add(1,1,2,2,mapService.listAll());
        ArrayList<Path> temp=new ArrayList<>();
        pathService.listAll().forEach(temp::add);
        assertEquals("1,1>1,2>2,2",temp.get(0).getpath());
    }
}
