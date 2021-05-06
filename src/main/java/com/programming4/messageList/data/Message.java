package com.programming4.messageList.data;

public class Message {
    private int id;
    private String title;
    private String content;
    private String sender;
    private String URLAddress;

    public Message() {}

    public Message(String title, String content, String sender, String URLAddress) {
        this.title = title;
        this.content = content;
        this.sender = sender;
        this.URLAddress = URLAddress;
    }

    public Message(int id, String title, String content, String sender, String URLAddress) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.sender = sender;
        this.URLAddress = URLAddress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getURLAddress() {
        return URLAddress;
    }

    public void setURLAddress(String URLAddress) {
        this.URLAddress = URLAddress;
    }
}
