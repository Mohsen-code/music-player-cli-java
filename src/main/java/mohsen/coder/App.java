package mohsen.coder;

import org.fusesource.jansi.*;

import java.io.IOException;
import java.util.HashMap;

import org.fusesource.jansi.AnsiConsole;

// mvn exec:java -Dexec.mainClass=app.App

// build to jar:
// mvn clean compile assembly:single

public class App {
    public static final View view = new View();
    public static void main(String[] args) throws Exception {
        AnsiConsole.systemInstall(); // #1
        System.out.println(Ansi.ansi().eraseScreen().render("Simple list example:"));

        System.out.println(view.mainMenu());;
    }

}
