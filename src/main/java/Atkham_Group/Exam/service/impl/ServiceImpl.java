package Atkham_Group.Exam.service.impl;

import Atkham_Group.Exam.Entity.Book;
import Atkham_Group.Exam.Repository.BookRepository;
import Atkham_Group.Exam.dto.BookDto;
import Atkham_Group.Exam.dto.ResponseDto;
import Atkham_Group.Exam.dto.ValidatorDto;
import Atkham_Group.Exam.service.Service;
import Atkham_Group.Exam.service.ValidatorService;
import Atkham_Group.Exam.service.mapper.BookMapper;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceImpl implements Service {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    private final ValidatorService validatorService;

    @Override
    public ResponseDto addBook(BookDto bookDto) {

        List<ValidatorDto> errors = validatorService.validator(bookDto);

        if (!errors.isEmpty()){
            return ResponseDto.builder().success(false).code(-3).errors(errors).build();
        }

        Book book = bookMapper.toBook(bookDto);
        bookRepository.save(book);

        return ResponseDto.builder().code(0).message("success").data(book).success(true).build();

    }
}
