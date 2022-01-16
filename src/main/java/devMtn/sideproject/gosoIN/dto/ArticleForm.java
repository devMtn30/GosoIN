package devMtn.sideproject.gosoIN.dto;

import devMtn.sideproject.gosoIN.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class ArticleForm {
    private String title;
    private String content;

    public Article toEntity(){
        return new Article(null,title,content);

    }
}
