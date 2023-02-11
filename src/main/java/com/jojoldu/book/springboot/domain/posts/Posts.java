package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter //get함수 생성
@NoArgsConstructor//기본 생성자 생성
@Entity  //테이블 생성
public class Posts extends BaseTimeEntity{

    @Id  //테이블값(고유번호 - PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //자바의 DB에 맞게 따른다
    private Long id;

    @Column(length = 20, nullable = false)
    private String name_user1;

    @Column(length = 20, nullable = false)
    private String id_user1;

    @Column(length = 20, nullable = false)
    private String major_user1;

    @Column(nullable = false)
    private String picture_user1;

    /*@Column(nullable = false)
    private String name_user2;

    @Column(nullable = false)
    private String id_user2;

    @Column(nullable = false)
    private String major_user2;*

    @Column(nullable = false)
    private String picture_user2;*/

    @Column(nullable = false)
    private String gongyak;

    @Builder
    public Posts(String name_user1, String id_user1, String major_user1,String picture_user1, String gongyak){
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

    public void update(String gongyak){   //공약 포스터 변경에 대비하여
        this.gongyak = gongyak;
    }

}
