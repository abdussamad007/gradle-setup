package com.abdus.tutorial.gradlespringbootdemo.model;

/**
 * @Author Abdus Mondal
 * @date 13-Mar-2020
 */
public class Greeting {
  private final long id;
  private final String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
