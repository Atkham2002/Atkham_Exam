package Atkham_Group.Exam.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public class Book {

    @Id
    private Integer id;

    private String name;

    private Double price;

    @Column(name = "published_at")
    private Date publishedAt;

    @Column(name = "published_by")
    private String publishedBy;

    @Column(name = "author_name")
    private String authorName;

    private Integer page;

    private String genre;


}
