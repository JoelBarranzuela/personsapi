package com.everis.persons.app.config;

public class NotFoundException extends RuntimeException {
  
  /**
   * 
   */
  private static final long serialVersionUID = -7274039832950136999L;

  public NotFoundException()
  {
      super("Not Found");
  }

  public NotFoundException(String  message)
  {
      super("Not found: " + message);
  }

}
