package Atkham_Group.Exam.service.impl;

import Atkham_Group.Exam.dto.BookDto;
import Atkham_Group.Exam.dto.ValidatorDto;
import Atkham_Group.Exam.service.ValidatorService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ValidatorImpl implements ValidatorService {

    List<ValidatorDto> errors = new ArrayList<>();

    @Override
    public List<ValidatorDto> validator(BookDto bookDto) {

        if (!StringUtils.hasText(bookDto.getName())){
            errors.add(new ValidatorDto("name","bo'sh maydon"));
        }

        if (bookDto.getPrice() < 0){
            errors.add(new ValidatorDto("price","manfiy"));
        } else if (bookDto.getPrice() == null) {
            errors.add(new ValidatorDto("price","null"));
        }

        if (bookDto.getAuthorName().length() > 3){
            errors.add(new ValidatorDto("getAuthorName","Noto'g'ri uzunlik"));
        }else if (bookDto.getAuthorName() == null) {
            errors.add(new ValidatorDto("getAuthorName","null"));
        }

        if (bookDto.getPublishedBy().length() > 3){
            errors.add(new ValidatorDto("getPublishedBy","Noto'g'ri uzunlik"));
        }else if (bookDto.getPublishedBy() == null) {
            errors.add(new ValidatorDto("getPublishedBy","null"));
        }

        if (bookDto.getPage() > 0){
            errors.add(new ValidatorDto("getPage","manfiy"));
        } else if (bookDto.getPrice() == null) {
            errors.add(new ValidatorDto("getPage","null"));
        } else if (bookDto.getPage() < 10 && bookDto.getPage() > 0) {
            errors.add(new ValidatorDto("page","page gi 10dan katta bo'lishi kerak"));
        }

        return errors;

    }
}
