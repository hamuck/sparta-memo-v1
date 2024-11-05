package com.example.spartamemov2.dto;

import com.example.spartamemov2.entity.Memo;
import lombok.Getter;

@Getter
public class MemoResponseDto {

    private Long id;
    private String title;
    private String contents;

    // Memo class를 인자로 가지는 생성자
    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();
        this.title = memo.getTitle();
        this.contents = memo.getContents();
    }
}