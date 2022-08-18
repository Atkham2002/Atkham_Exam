package Atkham_Group.Exam.service.mapper;

import Atkham_Group.Exam.Entity.Book;
import Atkham_Group.Exam.dto.BookDto;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {

     BookDto toDto(Book book);

     Book toBook(BookDto bookDto);

}
