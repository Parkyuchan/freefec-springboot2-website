package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String name_user1;

    private String id_user1;

    private String major_user1;

    private String picture_user1;

    private String gongyak;

    /*private String name_user2;

    private String id_user2;

    private String major_user2;

    private String picture_user2;*/

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.name_user1 = entity.getName_user1();
        this.id_user1 = entity.getId_user1();
        this.major_user1 = entity.getMajor_user1();
        this.picture_user1 = entity.getPicture_user1();
        this.gongyak = entity.getGongyak();
        /*this.name_user2 = entity.getName_user2();
        this.id_user2 = entity.getId_user2();
        this.major_user2 = entity.getMajor_user2();
        this.picture_user2 = entity.getPicture_user2();*/
    }

}
