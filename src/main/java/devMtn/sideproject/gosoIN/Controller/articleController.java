package devMtn.sideproject.gosoIN.Controller;

import devMtn.sideproject.gosoIN.DTO.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class articleController {

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public  String CreateArticle(ArticleForm form){
        System.out.println(form);
        return "";
    }
}
