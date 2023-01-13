package merkanto.testingjunit5mockito.fauxspring;


public interface BindingResult {
    void rejectValue(String lastName, String notFound, String not_found);

    boolean hasErrors();
}
