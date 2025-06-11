package com.koreait.com.chat_25_06;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat")
public class ChatController {

    @PostMapping("/writeMessage")
    @ResponseBody
    public String writeMessage(@RequestParam("message") String message) {
        return "메세지 작성됨";
    }
}
