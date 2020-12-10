package com.company.service;

import com.company.enums.BoardPrivacy;
import com.company.models.Board;
import com.company.models.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardService {

    static Map<String, Board> boards = new HashMap<>();

    static Map<String, User> users = new HashMap<>();

    public void createBoard(String boardName, String boardPrivacy) {

        Board newBoard;
        if(boardPrivacy.isEmpty() || boardPrivacy == null) {
            newBoard = new Board(boardName);
        }else {
            newBoard = new Board(boardName, BoardPrivacy.valueOf(boardPrivacy));
        }

        boards.put(newBoard.getBoardId(), newBoard);
    }

    public void deleteBoard(String boardId) {
        Board board = null;
        for(Map.Entry<String, Board> boardEntry : boards.entrySet()) {
            if(boardEntry.getKey().equals(boardId)) {
                board = boardEntry.getValue();
                break;
            }
        }
        if(board == null) {
            return;
        }

        ListService listService = new ListService();

        for(com.company.models.List list : board.getLists()) {
            listService.deleteList(list.getListId());
        }

        boards.remove(boardId);
    }

    public void addMemberToBoard(String boardId, String userId) {
        Board board = boards.get(boardId);
        User user = users.get(userId);
        List<User> boardMembers = board.getUsers();
        boardMembers.add(user);
    }

    public void deleteMemberFromBoard(String boardId, String userId) {
        Board board = boards.get(boardId);
        User user = users.get(userId);
        List<User> boardMembers = board.getUsers();
        boardMembers.remove(user);
    }

    public void showBoard(String boardId) {

    }

    public void showAllBoards(List<String> boardIds) {

    }
}
