package Atkham_Group.Exam.service;

import Atkham_Group.Exam.Entity.Book;
import Atkham_Group.Exam.dto.BookDto;
import Atkham_Group.Exam.dto.ValidatorDto;

import java.util.List;

public interface ValidatorService {

    List<ValidatorDto> validator(BookDto bookDto);

}
