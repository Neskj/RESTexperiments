package proj.neskj.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import proj.neskj.model.Message;

import java.util.logging.Logger;

@RestController
public class EndpointController {

    private static Logger logger=Logger.getLogger(EndpointController.class.getName());

    @PostMapping("/message")
    public Message cominMessage(@RequestBody Message message){

        logger.info("----->>> You have a new message from: "+message.getName()+" Message : "+message.getMessage()+"<<<-----");

        return message;
    }
}
