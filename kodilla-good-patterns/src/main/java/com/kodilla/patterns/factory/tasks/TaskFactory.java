package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "DrivingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String SHOPPINGTASK = "ShoppingTask";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVINGTASK -> new DrivingTask("Driving task", "Warsaw", "car");
            case PAINTINGTASK -> new PaintingTask("Painting task", "Rzeszow", "Wall");
            case SHOPPINGTASK -> new ShoppingTask("Shopping task", "Sanok", 2.0);
            default -> null;
        };
    }
}
