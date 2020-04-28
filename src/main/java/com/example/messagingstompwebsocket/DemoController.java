package com.example.messagingstompwebsocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {

    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping("/test")
    ResponseEntity getMessage(@RequestParam("name") String name) {

        //template.convertAndSend("/topic/greetings", new Greeting(name));

        template.convertAndSend("/topic/greetings", name);

        Map<String, String> map = new HashMap<>();
        map.put("message", "Message sent in websocket");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
