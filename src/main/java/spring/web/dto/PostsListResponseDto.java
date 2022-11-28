package spring.web.dto;

import lombok.Getter;
import spring.domain.posts.Posts;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String content;
    private String url1;
    private String url2;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.url1 = entity.getUrl1();
        this.url2 = entity.getUrl2();
    }
}
