package org.xtext.templates.examples.person;

import java.util.List;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.templates.examples.person.Address;
import org.xtext.templates.examples.person.AddressType;
import org.xtext.templates.examples.person.Email;
import org.xtext.templates.examples.person.Person;
import org.xtext.templates.examples.person.Phone;
import org.xtext.templates.examples.person.VCard;

@SuppressWarnings("all")
public class VCardTest {
  public static void main(final String[] args) {
    VCard _vCard = new VCard();
    final Procedure1<VCard> _function = new Procedure1<VCard>() {
        public void apply(final VCard it) {
          Person _person = new Person();
          final Procedure1<Person> _function = new Procedure1<Person>() {
              public void apply(final Person it) {
                it.setFirstName("John");
                it.setLastName("Doe");
                List<Address> _addresses = it.getAddresses();
                Address _address = new Address();
                final Procedure1<Address> _function = new Procedure1<Address>() {
                    public void apply(final Address it) {
                      it.setType(AddressType.HOME);
                      it.setStreet("Bakerstreet 1");
                      it.setCity("London");
                      it.setState("London");
                      it.setPostalCode("123");
                      it.setCountry("United Kingdom");
                    }
                  };
                Address _doubleArrow = ObjectExtensions.<Address>operator_doubleArrow(_address, _function);
                _addresses.add(_doubleArrow);
                List<Phone> _phones = it.getPhones();
                Phone _phone = new Phone();
                final Procedure1<Phone> _function_1 = new Procedure1<Phone>() {
                    public void apply(final Phone it) {
                      it.setType(AddressType.HOME);
                      it.setNumber("+1-435789 8098");
                    }
                  };
                Phone _doubleArrow_1 = ObjectExtensions.<Phone>operator_doubleArrow(_phone, _function_1);
                _phones.add(_doubleArrow_1);
                List<Phone> _phones_1 = it.getPhones();
                Phone _phone_1 = new Phone();
                final Procedure1<Phone> _function_2 = new Procedure1<Phone>() {
                    public void apply(final Phone it) {
                      it.setType(AddressType.WORK);
                      it.setNumber("+2-423456789");
                    }
                  };
                Phone _doubleArrow_2 = ObjectExtensions.<Phone>operator_doubleArrow(_phone_1, _function_2);
                _phones_1.add(_doubleArrow_2);
                List<Email> _emails = it.getEmails();
                Email _email = new Email();
                final Procedure1<Email> _function_3 = new Procedure1<Email>() {
                    public void apply(final Email it) {
                      it.setType(AddressType.HOME);
                      it.setEmail("john@doe.com");
                    }
                  };
                Email _doubleArrow_3 = ObjectExtensions.<Email>operator_doubleArrow(_email, _function_3);
                _emails.add(_doubleArrow_3);
                List<Email> _emails_1 = it.getEmails();
                Email _email_1 = new Email();
                final Procedure1<Email> _function_4 = new Procedure1<Email>() {
                    public void apply(final Email it) {
                      it.setType(AddressType.WORK);
                      it.setEmail("johndoe@work.com");
                    }
                  };
                Email _doubleArrow_4 = ObjectExtensions.<Email>operator_doubleArrow(_email_1, _function_4);
                _emails_1.add(_doubleArrow_4);
              }
            };
          Person _doubleArrow = ObjectExtensions.<Person>operator_doubleArrow(_person, _function);
          it.setP(_doubleArrow);
        }
      };
    String _generate = _vCard.generate(_function);
    InputOutput.<String>println(_generate);
  }
}
