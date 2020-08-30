package com.example.myvote.model;

import java.util.Date;
import java.util.List;

public class Question {

    private String id;
    private String UserId;
    private String Title;
    private String description;
    private int TotalVote;
    private List<Answer> Answers;
    private Date creationDate;
}
