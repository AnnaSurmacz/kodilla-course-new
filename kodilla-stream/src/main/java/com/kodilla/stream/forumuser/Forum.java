package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Jan Kowalski", 'M', LocalDate.of(1988, 5, 12), 23));
        theUserList.add(new ForumUser(2, "Anna Nowak", 'F', LocalDate.of(1992, 8, 3), 7));
        theUserList.add(new ForumUser(3, "Piotr Wiśniewski", 'M', LocalDate.of(1985, 1, 24), 45));
        theUserList.add(new ForumUser(4, "Katarzyna Wójcik", 'F', LocalDate.of(1990, 11, 18), 15));
        theUserList.add(new ForumUser(5, "Marek Lewandowski", 'M', LocalDate.of(1995, 4, 30), 0));
        theUserList.add(new ForumUser(6, "Magdalena Zielińska", 'F', LocalDate.of(2000, 9, 10), 8));
        theUserList.add(new ForumUser(7, "Tomasz Szymański", 'M', LocalDate.of(1983, 2, 17), 61));
        theUserList.add(new ForumUser(8, "Ewa Dąbrowska", 'F', LocalDate.of(1997, 6, 29), 2));
        theUserList.add(new ForumUser(9, "Paweł Woźniak", 'M', LocalDate.of(1991, 12, 7), 34));
        theUserList.add(new ForumUser(10, "Agnieszka Mazur", 'F', LocalDate.of(1989, 3, 14), 11));
    }

    public List<ForumUser> getUserList() {
    return new ArrayList<>(theUserList);


    }
}




