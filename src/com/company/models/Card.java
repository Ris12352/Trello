package com.company.models;

import java.util.UUID;

public class Card {

    private String cardId;

    private String name;

    private String description;

    private User assignerUser;

    private String listId;

    private String boardId;

    public void setAssignerUser(User assignerUser) {
        this.assignerUser = assignerUser;
    }

    public Card(String boardId, String listId, String name, String description) {
        this.boardId = boardId;
        this.listId = listId;
        this.cardId = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.assignerUser = null;
    }

    public String getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignerUser() {
        return assignerUser;
    }
}
