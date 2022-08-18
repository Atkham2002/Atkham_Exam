package Atkham_Group.Exam.Controller;

import Atkham_Group.Exam.dto.BookDto;
import Atkham_Group.Exam.dto.ResponseDto;
import Atkham_Group.Exam.service.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "controller")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping
    public ResponseDto<String> add(@RequestBody BookDto bookDto){
        return service.addBook(bookDto);
    }

}
