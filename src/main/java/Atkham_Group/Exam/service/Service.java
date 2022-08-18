package Atkham_Group.Exam.service;

import Atkham_Group.Exam.dto.BookDto;
import Atkham_Group.Exam.dto.ResponseDto;

public interface Service {

    ResponseDto<String> addBook(BookDto bookDto);

}
