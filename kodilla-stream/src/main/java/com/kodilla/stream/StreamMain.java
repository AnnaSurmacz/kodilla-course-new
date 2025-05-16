package com.kodilla.stream;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> forumUserMap = forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(user -> Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() > 20)
                .filter(post -> post.getPostNumber() > 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));
        forumUserMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}






