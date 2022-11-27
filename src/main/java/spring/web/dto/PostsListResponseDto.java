package spring.web.dto;

import lombok.Getter;
import spring.domain.posts.Posts;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private byte[] image;
    private String content;
    private String url1;
    private String url2;

    private String localPath = "/Users/jookwonyoung/Documents/DB/cloudComputing";

    public PostsListResponseDto(Posts entity) {

        this.id = entity.getId();
        this.title = entity.getTitle();

        try {
            InputStream in = new FileInputStream(localPath + "/" + entity.getTitle()+".png");
            this.image = in.readAllBytes();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.content = entity.getContent();
        this.url1 = entity.getUrl1();
        this.url2 = entity.getUrl2();
    }
}
