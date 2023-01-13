package merkanto.testingjunit5mockito.fauxspring;

import merkanto.testingjunit5mockito.model.PetType;

import java.text.ParseException;
import java.util.Locale;


public interface Formatter<T> {

    String print(PetType petType, Locale locale);

    PetType parse(String text, Locale locale) throws ParseException;
}
