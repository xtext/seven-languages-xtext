package org.xtext.templates.examples.person;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.xtext.templates.examples.person.Address;
import org.xtext.templates.examples.person.AddressType;
import org.xtext.templates.examples.person.Email;
import org.xtext.templates.examples.person.Person;
import org.xtext.templates.examples.person.Phone;

public class VCard {
  private Person p;
  
  public VCard() {
  }
  
  public VCard(final VCard other) {
    this.p = other.p;
  }
  
  private Object exp0() {
    String _lastName = this.p.getLastName();
    String _elvis = ObjectExtensions.<String>operator_elvis(_lastName, "");
    return _elvis;
  }
  
  private Object exp1() {
    String _firstName = this.p.getFirstName();
    String _elvis = ObjectExtensions.<String>operator_elvis(_firstName, "");
    return _elvis;
  }
  
  private Object exp2() {
    String _middleName = this.p.getMiddleName();
    String _elvis = ObjectExtensions.<String>operator_elvis(_middleName, "");
    return _elvis;
  }
  
  private Object exp3() {
    String _firstName = this.p.getFirstName();
    String _middleName = this.p.getMiddleName();
    String _lastName = this.p.getLastName();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_firstName, _middleName, _lastName);
    Iterable<String> _filterNull = IterableExtensions.<String>filterNull(_newArrayList);
    String _join = IterableExtensions.join(_filterNull, " ");
    return _join;
  }
  
  private Iterable<? extends Phone> loop0() {
    List<Phone> _phones = this.p.getPhones();
    return _phones;
  }
  
  private Object exp4(final Phone phone) {
    AddressType _type = phone.getType();
    return _type;
  }
  
  private Object exp5(final Phone phone) {
    String _number = phone.getNumber();
    return _number;
  }
  
  private Iterable<? extends Address> loop1() {
    List<Address> _addresses = this.p.getAddresses();
    return _addresses;
  }
  
  private Object exp6(final Address address) {
    AddressType _type = address.getType();
    return _type;
  }
  
  private Object exp7(final Address address) {
    String _street = address.getStreet();
    String _city = address.getCity();
    String _state = address.getState();
    String _postalCode = address.getPostalCode();
    String _country = address.getCountry();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_street, _city, _state, _postalCode, _country);
    final Function1<String,String> _function = new Function1<String,String>() {
        public String apply(final String it) {
          String _elvis = ObjectExtensions.<String>operator_elvis(it, "");
          return _elvis;
        }
      };
    List<String> _map = ListExtensions.<String, String>map(_newArrayList, _function);
    String _join = IterableExtensions.join(_map, "\\n");
    return _join;
  }
  
  private Object exp8(final Address address) {
    String _street = address.getStreet();
    return _street;
  }
  
  private Object exp9(final Address address) {
    String _city = address.getCity();
    return _city;
  }
  
  private Object exp10(final Address address) {
    String _state = address.getState();
    return _state;
  }
  
  private Object exp11(final Address address) {
    String _postalCode = address.getPostalCode();
    return _postalCode;
  }
  
  private Object exp12(final Address address) {
    String _country = address.getCountry();
    return _country;
  }
  
  private Iterable<? extends Email> loop2() {
    List<Email> _emails = this.p.getEmails();
    return _emails;
  }
  
  private Object exp13(final Email email) {
    AddressType _type = email.getType();
    return _type;
  }
  
  private Object exp14(final Email email) {
    String _email = email.getEmail();
    return _email;
  }
  
  public String generate() {
    StringBuilder out = new StringBuilder();
    out.append("\nBEGIN:VCARD\nVERSION:4.0\nN:");
    out.append(exp0());
    out.append(";");
    out.append(exp1());
    out.append(";");
    out.append(exp2());
    out.append(";;\nFN: ");
    out.append(exp3());
    out.append("\nORG:\nTITLE:\nPHOTO:http://www.example.com/dir_photos/my_photo.gif");
    for(Phone phone : loop0()) {
      out.append("\nTEL;TYPE=\"");
      out.append(exp4(phone));
      out.append(",voice\";VALUE=uri:tel:");
      out.append(exp5(phone));
      out.append("");
    }
    out.append("");
    for(Address address : loop1()) {
      out.append("\nADR;TYPE=");
      out.append(exp6(address));
      out.append(";LABEL=\"");
      out.append(exp7(address));
      out.append("\"\n :;;");
      out.append(exp8(address));
      out.append(";");
      out.append(exp9(address));
      out.append(";");
      out.append(exp10(address));
      out.append(";");
      out.append(exp11(address));
      out.append(";");
      out.append(exp12(address));
      out.append("");
    }
    out.append("");
    for(Email email : loop2()) {
      out.append("\nEMAIL;TYPE=");
      out.append(exp13(email));
      out.append(":");
      out.append(exp14(email));
      out.append("");
    }
    out.append("\nEND:VCARD\n");
    return out.toString();
  }
  
  public String generate(final Procedure1<VCard> init) {
    try {
      VCard tpl = getClass().getConstructor(getClass()).newInstance(this);
      init.apply(tpl);
      return tpl.generate();
    } catch(Exception e) {
      throw Exceptions.sneakyThrow(e);
    }
  }
  
  public void setP(final Person p) {
    this.p = p;
  }
  
  public String toString() {
    return new ToStringHelper().toString(this);
  }
}
