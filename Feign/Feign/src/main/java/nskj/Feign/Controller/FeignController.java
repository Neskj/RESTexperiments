package nskj.Feign.Controller;

import nskj.Feign.Model.Message;
import nskj.Feign.Proxy.MessageProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class FeignController {

    private final MessageProxy messageProxy;

    FeignController(MessageProxy messageProxy){
        this.messageProxy=messageProxy;
    }

    private static Logger logger=Logger.getLogger(FeignController.class.getName());

    @PostMapping("/msg")
    public Message sendToEndpoint(@RequestBody Message message){

        logger.info("=== New message from: "+message.getName()+". Message: "+message.getMessage()+" ===");

        return messageProxy.resendMessage(message);
    }
}
