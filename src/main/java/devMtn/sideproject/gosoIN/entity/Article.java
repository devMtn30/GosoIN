package devMtn.sideproject.gosoIN.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@ToString
@Entity // DB가 해당 객체를 인식 가능하게 함
public class Article {

    @Id // PK
    @GeneratedValue //auto count 자동생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


    public Article() {
    }
}
