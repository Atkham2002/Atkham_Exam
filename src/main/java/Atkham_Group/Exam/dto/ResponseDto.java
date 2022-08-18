package Atkham_Group.Exam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> {

    private Integer code;

    private String message;

    private T data;

    private Boolean success;

    private List<ValidatorDto> errors;


}
