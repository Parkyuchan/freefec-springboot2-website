package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String name_user1;
    private String id_user1;
    private String major_user1;
    private String picture_user1;
    private String gongyak;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.name_user1 = entity.getName_user1();
        this.id_user1 = entity.getId_user1();
        this.major_user1 = entity.getMajor_user1();
        this.picture_user1 = entity.getPicture_user1();
        this.gongyak = entity.getGongyak();
        this.modifiedDate = entity.getModifiedDate();
    }
}
