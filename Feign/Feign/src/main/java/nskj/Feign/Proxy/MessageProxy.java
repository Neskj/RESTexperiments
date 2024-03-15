package nskj.Feign.Proxy;


import nskj.Feign.Model.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Feign", url="http://localhost:8080")
public interface MessageProxy {

    @PostMapping("/message")
    Message resendMessage(@RequestBody Message message);
}
