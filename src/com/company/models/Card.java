package com.company.models;

public class Card {

    private String cardId;

    private String name;

    private String description;

    private User assignerUser;

    public Card(String cardId, String name, String description, User assignerUser) {
        this.cardId = cardId;
        this.name = name;
        this.description = description;
        this.assignerUser = assignerUser;
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
