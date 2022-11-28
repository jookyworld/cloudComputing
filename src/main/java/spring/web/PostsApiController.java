package spring.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spring.service.posts.PostsService;
import spring.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }
}
