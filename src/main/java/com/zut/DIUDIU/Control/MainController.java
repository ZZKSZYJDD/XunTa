package com.zut.DIUDIU.Control;

import com.zut.DIUDIU.Dao.Event;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class MainController {




    @RequestMapping("/lostAll")
    private List<Object> lostAll(){

        List<Object> list = new ArrayList<>();
        Event event = new Event(1, "1",new Date(),new Date(),new Date(), "a", "a",1,1);
        Event event2 = new Event(2, "1",new Date(),new Date(),new Date(), "a", "a",1,1);
        Event event3 = new Event(3, "0",new Date(),new Date(),new Date(), "a", "a",1,1);
        Event event4 = new Event(4, "1",new Date(),new Date(),new Date(), "a", "a",1,1);
        list.add(event);
        list.add(event2);
        list.add(event3);
        list.add(event4);
        return list;
    }


}
