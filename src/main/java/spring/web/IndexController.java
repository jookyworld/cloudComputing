package spring.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import spring.service.posts.PostsService;
import spring.web.dto.PostsResponseDto;


@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private String localPath = "/Users/jookwonyoung/Documents/DB/cloudComputing";

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/{id}")
    public String findById (@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "contents";
    }

    @GetMapping("/EBS")
    public String EBS() {
        return "EBS";
    }
    @GetMapping("/EC2")
    public String EC2() {
        return "EC2";
    }
    @GetMapping("/ELB")
    public String ELB() {
        return "ELB";
    }
    @GetMapping("/IAM")
    public String IAM() {
        return "IAM";
    }
    @GetMapping("/Lambda")
    public String Lambda() {
        return "Lambda";
    }
    @GetMapping("/RDS")
    public String RDS() {
        return "RDS";
    }
    @GetMapping("/VPC")
    public String VPC() {
        return "VPC";
    }
    @GetMapping("/S3")
    public String S3() {
        return "S3";
    }


    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
