package com.jojoldu.book.springboot.web.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String gongyak;

    @Builder
    public PostsUpdateRequestDto(String gongyak){
        this.gongyak = gongyak;
    }
}
