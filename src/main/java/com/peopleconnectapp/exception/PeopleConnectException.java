package com.peopleconnectapp.exception;

import com.peopleconnectapp.model.Posts;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public abstract class PeopleConnectException extends Exception{
    public final Exception wrappedException;
    public final String categoryName;

    protected PeopleConnectException(Exception wrappedException, String message, String categoryName) {
        super(message);
        this.wrappedException = wrappedException;
        this.categoryName = categoryName;
    }
}
