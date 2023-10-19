package com.peopleconnectapp.exception;

import com.peopleconnectapp.model.Posts;

import java.util.List;

public class FetchAllPostException extends PeopleConnectException {
    public FetchAllPostException(Exception e, String message, String categoryName){
        super(e,message,categoryName);
    }
}
