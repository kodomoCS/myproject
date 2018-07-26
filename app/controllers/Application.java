package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {return ok(index.render());}
    public static Result lab1() {return ok(lab1.render());}
    public static Result lab2() {return ok(lab2.render());}



}
