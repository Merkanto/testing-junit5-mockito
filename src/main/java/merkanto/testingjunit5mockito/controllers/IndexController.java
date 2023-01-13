package merkanto.testingjunit5mockito.controllers;

public class IndexController {

    public String index(){
        return "index";
    }

    public String oopsHandler() {
        throw new ValueNotFoundException();
    }
}
