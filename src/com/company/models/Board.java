package com.company.models;

import com.company.enums.BoardPrivacy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Board {

    private String boardId;

    private String boardName;

    private String url;

    private List<User> users;

    private List<com.company.models.List> lists;

    public BoardPrivacy getBoardPrivacy() {
        return boardPrivacy;
    }

    private BoardPrivacy boardPrivacy;

    public Board(String boardName) {
        this.boardId = UUID.randomUUID().toString();
        this.boardName = boardName;
        this.url = UUID.randomUUID().toString() + boardId ;
        this.users = new ArrayList<>();
        this.lists = new ArrayList<>();
        this.boardPrivacy = BoardPrivacy.PUBLIC;
    }

    public Board(String boardName, BoardPrivacy boardPrivacy) {
        this.boardId = UUID.randomUUID().toString();
        this.boardName = boardName;
        this.url = UUID.randomUUID().toString() + boardId;
        this.users = new ArrayList<>();
        this.lists = new ArrayList<>();
        this.boardPrivacy = boardPrivacy;
    }

    public String getBoardId() {
        return boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public String getUrl() {
        return url;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<com.company.models.List> getLists() {
        return lists;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setLists(List<com.company.models.List> lists) {
        this.lists = lists;
    }
}
