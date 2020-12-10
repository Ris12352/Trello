package com.company.models;

import java.util.ArrayList;

public class List {

    private String listId;

    private String listName;

    private java.util.List<Card> cards;

    public List(String listId, String listName) {
        this.listId = listId;
        this.listName = listName;
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
}
