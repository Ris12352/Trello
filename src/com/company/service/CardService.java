package com.company.service;

import com.company.models.Board;
import com.company.models.Card;

import java.util.List;

public class CardService {

    public void createCard(String boardId, String listId, String cardName, String cardDescription) {

        Board board = BoardService.boards.get(boardId);

        com.company.models.List boardList = null;

        List<com.company.models.List> lists = board.getLists();
        for(com.company.models.List list : lists) {
            if(list.getBoardId().equals(listId)) {
                boardList = list;
                break;
            }
        }

        if(boardList == null) {
            return;
        }

        Card card = new Card(boardId, listId, cardName, cardDescription);
        boardList.getCards().add(card);
    }

    public void deleteCard(String cardId) {

    }

    public void assignMemberToCard(String cardId, String userId) {

    }

    public void unAssignMemberToCard(String cardId, String userId) {

    }

    public void showCard(String cardId) {

    }
}
