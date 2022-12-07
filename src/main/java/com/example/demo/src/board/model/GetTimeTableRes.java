package com.example.demo.src.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetTimeTableRes {
    private int timetableIdx;
    private int courseGrade;
    private String subjectName;
    private String professor;
    private String time;
    private String room;
    private String separation;
    private int credit;
}
