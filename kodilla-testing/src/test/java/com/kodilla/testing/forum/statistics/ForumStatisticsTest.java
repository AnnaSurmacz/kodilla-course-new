package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

class ForumStatisticsTest {



        @Mock
        private Statistics statisticsMock;

        private ForumStatistics forumStatistics;

        @BeforeEach
        void setup() {
            forumStatistics = new ForumStatistics();
        }

        @Test
        void testCalculateStatisticsWhenUsersIsZero() {
            List<String> users = new ArrayList<>();

            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.commentsCount()).thenReturn(5);

            forumStatistics.calculateAdvStatistics(statisticsMock);

            assertEquals(0, forumStatistics.getUserCount());
            assertEquals(0.0, forumStatistics.getAvgPostsPerUser());
            assertEquals(0.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0.5, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testCalculateStatisticsWhenPostsIsZero() {
            List<String> users = new ArrayList<>();
            users.add("User1");
            users.add("User2");

            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(10);

            forumStatistics.calculateAdvStatistics(statisticsMock);

            assertEquals(0, forumStatistics.getPostCount());
            assertEquals(0.0, forumStatistics.getAvgPostsPerUser());
            assertEquals(5.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0.0, forumStatistics.getAvgCommentsPerPost());
        }

    @Test
    void testCalculateStatisticsWhenPostsIsThousand() {
        List<String> users = new ArrayList<>();
        users.add("User1");
        users.add("User2");

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        assertEquals(1000, forumStatistics.getPostCount());
        assertEquals(500, forumStatistics.getCommentCount());
        assertEquals(2, forumStatistics.getUserCount());
        assertEquals(500.0, forumStatistics.getAvgPostsPerUser());
        assertEquals(250.0, forumStatistics.getAvgCommentsPerUser());
        assertEquals(0.5, forumStatistics.getAvgCommentsPerPost());
    }

        @Test
        void testCalculateStatisticsWhenCommentsIsZero() {
            List<String> users = new ArrayList<>();
            users.add("User1");

            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.commentsCount()).thenReturn(0);

            forumStatistics.calculateAdvStatistics(statisticsMock);

            assertEquals(0.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0.0, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testCalculateStatisticsWhenCommentsLessThanPosts() {
            List<String> users = new ArrayList<>();
            users.add("User1");
            users.add("User2");

            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.postsCount()).thenReturn(50);
            when(statisticsMock.commentsCount()).thenReturn(30);

            forumStatistics.calculateAdvStatistics(statisticsMock);

            assertEquals(2, forumStatistics.getUserCount());
            assertEquals(50, forumStatistics.getPostCount());
            assertEquals(30, forumStatistics.getCommentCount());
            assertEquals(25.0, forumStatistics.getAvgPostsPerUser());
            assertEquals(15.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(0.6, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testCalculateStatisticsWhenCommentsGreaterThanPosts() {
            List<String> users = new ArrayList<>();
            users.add("User1");

            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.postsCount()).thenReturn(5);
            when(statisticsMock.commentsCount()).thenReturn(20);

            forumStatistics.calculateAdvStatistics(statisticsMock);

            assertEquals(1, forumStatistics.getUserCount());
            assertEquals(5, forumStatistics.getPostCount());
            assertEquals(20, forumStatistics.getCommentCount());
            assertEquals(5.0, forumStatistics.getAvgPostsPerUser());
            assertEquals(20.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(4.0, forumStatistics.getAvgCommentsPerPost());
        }

        @Test
        void testCalculateStatisticsWhenUsersIsHundred() {
            List<String> users = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                users.add("User" + i);
            }

            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.postsCount()).thenReturn(500);
            when(statisticsMock.commentsCount()).thenReturn(1000);

            forumStatistics.calculateAdvStatistics(statisticsMock);

            assertEquals(100, forumStatistics.getUserCount());
            assertEquals(500, forumStatistics.getPostCount());
            assertEquals(1000, forumStatistics.getCommentCount());
            assertEquals(5.0, forumStatistics.getAvgPostsPerUser());
            assertEquals(10.0, forumStatistics.getAvgCommentsPerUser());
            assertEquals(2.0, forumStatistics.getAvgCommentsPerPost());
        }
    }


