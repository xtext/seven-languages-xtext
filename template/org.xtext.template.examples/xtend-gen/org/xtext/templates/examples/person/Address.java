package org.xtext.templates.examples.person;

import org.xtext.templates.examples.person.AddressType;

@SuppressWarnings("all")
public class Address {
  private AddressType _type;
  
  public AddressType getType() {
    return this._type;
  }
  
  public void setType(final AddressType type) {
    this._type = type;
  }
  
  private String _street;
  
  public String getStreet() {
    return this._street;
  }
  
  public void setStreet(final String street) {
    this._street = street;
  }
  
  private String _postalCode;
  
  public String getPostalCode() {
    return this._postalCode;
  }
  
  public void setPostalCode(final String postalCode) {
    this._postalCode = postalCode;
  }
  
  private String _city;
  
  public String getCity() {
    return this._city;
  }
  
  public void setCity(final String city) {
    this._city = city;
  }
  
  private String _state;
  
  public String getState() {
    return this._state;
  }
  
  public void setState(final String state) {
    this._state = state;
  }
  
  private String _country;
  
  public String getCountry() {
    return this._country;
  }
  
  public void setCountry(final String country) {
    this._country = country;
  }
}
