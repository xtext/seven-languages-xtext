package org.xtext.templates.examples.person;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.xtext.templates.examples.person.Address;
import org.xtext.templates.examples.person.Email;
import org.xtext.templates.examples.person.Phone;

@SuppressWarnings("all")
public class Person {
  private String _firstName;
  
  public String getFirstName() {
    return this._firstName;
  }
  
  public void setFirstName(final String firstName) {
    this._firstName = firstName;
  }
  
  private String _middleName;
  
  public String getMiddleName() {
    return this._middleName;
  }
  
  public void setMiddleName(final String middleName) {
    this._middleName = middleName;
  }
  
  private String _lastName;
  
  public String getLastName() {
    return this._lastName;
  }
  
  public void setLastName(final String lastName) {
    this._lastName = lastName;
  }
  
  private List<Email> _emails = new Function0<List<Email>>() {
    public List<Email> apply() {
      ArrayList<Email> _newArrayList = CollectionLiterals.<Email>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public List<Email> getEmails() {
    return this._emails;
  }
  
  public void setEmails(final List<Email> emails) {
    this._emails = emails;
  }
  
  private List<Address> _addresses = new Function0<List<Address>>() {
    public List<Address> apply() {
      ArrayList<Address> _newArrayList = CollectionLiterals.<Address>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public List<Address> getAddresses() {
    return this._addresses;
  }
  
  public void setAddresses(final List<Address> addresses) {
    this._addresses = addresses;
  }
  
  private List<Phone> _phones = new Function0<List<Phone>>() {
    public List<Phone> apply() {
      ArrayList<Phone> _newArrayList = CollectionLiterals.<Phone>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public List<Phone> getPhones() {
    return this._phones;
  }
  
  public void setPhones(final List<Phone> phones) {
    this._phones = phones;
  }
}
