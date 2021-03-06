package devMtn.sideproject.gosoIN.controller;

import devMtn.sideproject.gosoIN.dto.ArticleForm;
import devMtn.sideproject.gosoIN.repository.ArticleRepository;
import devMtn.sideproject.gosoIN.entity.Article;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticleController {
    
    @Autowired //스프링 부트가 미리 생성해놓은 객체를 가져다가 자동 연결
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public  String CreateArticle(ArticleForm form){
        //System.out.println(form); --> 로깅으로 대체
        log.info(form.toString());

        // 1.Dto를 변환 , Entitiy
        Article article = form.toEntity();
        //System.out.println(article);
        log.info(article.toString());

        // 2. Repository에게 ENtitiy를 DB안에 저장하게 함
        Article saved = articleRepository.save(article);
        //System.out.println(saved.toString());
        log.info(saved.toString());
        return "";
    }
}
