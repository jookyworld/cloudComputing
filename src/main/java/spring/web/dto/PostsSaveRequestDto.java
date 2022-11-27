package spring.web.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spring.domain.posts.Posts;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String url1;
    private String url2;

    @Builder
    public PostsSaveRequestDto(String title, String content, String url1, String url2) {
        this.title = title;
        this. content =  content;
        this.url1 = url1;
        this.url2 = url2;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .url1(url1)
                .url2(url2)
                .build();
    }
}
