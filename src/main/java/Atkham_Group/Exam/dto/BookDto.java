package Atkham_Group.Exam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private Integer id;

    private String name;

    private Double price;

    private String publishedBy;

    private String authorName;

    private Integer page;

    private String genre;

}
