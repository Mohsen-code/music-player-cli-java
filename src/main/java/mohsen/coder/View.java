package mohsen.coder;

import java.io.IOException;
import java.util.HashMap;

import de.codeshelf.consoleui.prompt.ConsolePrompt;
import de.codeshelf.consoleui.prompt.InputResult;
import de.codeshelf.consoleui.prompt.ListResult;
import de.codeshelf.consoleui.prompt.PromtResultItemIF;
import de.codeshelf.consoleui.prompt.builder.PromptBuilder;
// import jline.TerminalFactory;
// import jline.console.completer.StringsCompleter;

public class View {

    private ConsolePrompt prompt = new ConsolePrompt();
    private PromptBuilder promptBuilder = prompt.getPromptBuilder();

    public String mainMenu() throws InterruptedException, IOException {

        promptBuilder.createListPrompt()
              .name("mainMenu")
              .message("Choose an option:")
              .newItem("playLists").text("Play Lists").add()
              .newItem("addPlayList").text("Add Play Lists").add()
              .newItem("editPlayList").text("Edit Play List").add()
              .newItem("removePlayList").text("Remove Play List").add()
              .newItem("exit").text("Exit").add()
              .addPrompt();     

                
        HashMap<String, ? extends PromtResultItemIF> result = prompt.prompt(promptBuilder.build());
        ListResult answer = (ListResult) result.get("mainMenu");
        return answer.getSelectedId();
    }

}
