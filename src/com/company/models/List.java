package com.company.models;

import java.util.ArrayList;
import java.util.UUID;

public class List {

    private String listId;

    private String listName;

    private java.util.List<Card> cards;

    private String boardId;

    public List(String listName, String boardId) {
        this.listId = UUID.randomUUID().toString();
        this.listName = listName;
        this.boardId = boardId;
        this.cards = new ArrayList<>();
    }

    public String getListId() {
        return listId;
    }

    public String getListName() {
        return listName;
    }

    public void setCards(java.util.List<Card> cards) {
        this.cards = cards;
    }

    public java.util.List<Card> getCards() {
        return cards;
    }

    public String getBoardId() {
        return boardId;
    }
}
