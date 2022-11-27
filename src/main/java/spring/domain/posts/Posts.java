package spring.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk 생성 규칙
    private Long id;

    @Column(length = 500, nullable = false) //기본값 사용x, 변경값 사용(500)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(columnDefinition = "TEXT")
    private String url1;

    @Column(columnDefinition = "TEXT")
    private String url2;


    @Builder    //빌더 패턴 클래스 생성
    public Posts(String title, String content, String url1, String url2) {
        this.title = title;
        this.content = content;
        this.url1 = url1;
        this. url2 = url2;
    }
}

