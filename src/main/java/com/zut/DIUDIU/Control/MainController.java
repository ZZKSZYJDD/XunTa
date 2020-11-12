package com.zut.DIUDIU.Control;

import com.zut.DIUDIU.Dao.Event;
import com.zut.DIUDIU.Dao.Users;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class MainController {





    @RequestMapping("/lostAll")
    private List<Object> lostAll(HttpSession session){




        List<Object> list = new ArrayList<>();
        Event event = new Event(1, "1","1",new Date(),new Date(),new Date(), "a", "a",1,1);
        Event event2 = new Event(2,"1", "1",new Date(),new Date(),new Date(), "a", "a",1,1);
        Event event3 = new Event(3,"1", "0",new Date(),new Date(),new Date(), "a", "a",1,1);
        Event event4 = new Event(4,"1", "1",new Date(),new Date(),new Date(), "a", "a",1,1);

        Event event5 = new Event(1, "0","1",new Date(),new Date(),new Date(), "a", "a",1,1);
        Event event6 = new Event(2,"0", "1",new Date(),new Date(),new Date(), "a", "a",1,1);
        Event event7 = new Event(3,"0", "0",new Date(),new Date(),new Date(), "a", "a",1,1);
        Event event8 = new Event(4,"0", "1",new Date(),new Date(),new Date(), "a", "a",1,1);
        list.add(event);
        list.add(event2);
        list.add(event3);
        list.add(event4);

        list.add(event5);
        list.add(event6);
        list.add(event7);
        list.add(event8);
        return list;
    }
    @RequestMapping("/nowUser")
    public Users nowUser(HttpSession session){
        Users users = (Users) session.getAttribute("users");
        if (users == null){
            return null;
        }
        return users;
    }

}
