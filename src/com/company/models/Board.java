package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private String boardId;

    private String boardName;

    private String url;

    private List<User> users;

    private List<com.company.models.List> lists;

    public Board(String boardId, String boardName, String url) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.url = url;
        this.users = new ArrayList<>();
        this.lists = new ArrayList<>();
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
