package Atkham_Group.Exam.cofig;

import Atkham_Group.Exam.dto.ResponseDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@org.springframework.context.annotation.Configuration
public class Configuration {


    @Bean(name = "birxil")
    @Scope("singleton")
    public String hello(){
        return "hello";
    }

    @Bean
    @Scope("prototype")
    public ResponseDto response(){
        return ResponseDto.builder().code(404).success(false).data(null).build();
    }

    @Bean(name = "time_bean")
    @Scope("session")
    public String hello_session(){
        return "hello";
    }

    @Bean(name = "request_bean")
    @Scope("request")
    public String hello_request(){
        return "hello";
    }


}
