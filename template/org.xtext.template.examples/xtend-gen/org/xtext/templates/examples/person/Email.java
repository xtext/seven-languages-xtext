package org.xtext.templates.examples.person;

import org.xtext.templates.examples.person.AddressType;

@SuppressWarnings("all")
public class Email {
  private AddressType _type;
  
  public AddressType getType() {
    return this._type;
  }
  
  public void setType(final AddressType type) {
    this._type = type;
  }
  
  private String _email;
  
  public String getEmail() {
    return this._email;
  }
  
  public void setEmail(final String email) {
    this._email = email;
  }
}
