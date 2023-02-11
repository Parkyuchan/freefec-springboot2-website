package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String name_user1;

    private String id_user1;

    private String major_user1;

    private String picture_user1;

    private String gongyak;

    /*private String name_user2;

    private String id_user2;

    private String major_user2;

    private String picture;*/
    @Builder
    public PostsSaveRequestDto(String name_user1, String id_user1, String major_user1, String picture_user1, String gongyak){
        this.name_user1 = name_user1;
        this.id_user1 = id_user1;
        this.major_user1 = major_user1;
        this.picture_user1 = picture_user1;
        this.gongyak = gongyak;
        /*this.name_user2 = name_user2;
        this.id_user2 = id_user2;
        this.major_user2 = major_user2;
        this.picture = picture;*/
    }

    public Posts toEntity(){
        return Posts.builder()
                .name_user1(name_user1)
                .id_user1(id_user1)
                .major_user1(major_user1)
                .picture_user1(picture_user1)
                .gongyak(gongyak)
                /*.name_user2(name_user2)
                .id_user2(id_user2)
                .major_user2(major_user2)
                .picture(picture)*/
                .build();
    }
}


