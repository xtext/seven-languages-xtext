package org.xtext.templates.examples.person;

import org.xtext.templates.examples.person.AddressType;

@SuppressWarnings("all")
public class Phone {
  private AddressType _type;
  
  public AddressType getType() {
    return this._type;
  }
  
  public void setType(final AddressType type) {
    this._type = type;
  }
  
  private String _number;
  
  public String getNumber() {
    return this._number;
  }
  
  public void setNumber(final String number) {
    this._number = number;
  }
}
