package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int userCount;
    private int postCount;
    private int commentCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames() != null) {
            userCount = statistics.usersNames().size();
        } else {
            userCount = 0;
        }

        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();

        if (userCount > 0) {
            avgPostsPerUser = (double) postCount / userCount;
            avgCommentsPerUser = (double) commentCount / userCount;
        } else {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        }

        if (postCount > 0) {
            avgCommentsPerPost = (double) commentCount / postCount;
        } else {
            avgCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + userCount);
        System.out.println("Number of posts: " + postCount);
        System.out.println("Number of comments: " + commentCount);
        System.out.println("Average posts per user: " + avgPostsPerUser);
        System.out.println("Average comments per user: " + avgCommentsPerUser);
        System.out.println("Average comments per post: " + avgCommentsPerPost);
    }

    // Gettery do testów
    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
