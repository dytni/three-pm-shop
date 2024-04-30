package by.dytni.shop.command.provider;

import by.dytni.shop.command.Command;
import by.dytni.shop.command.CommandKey;
import by.dytni.shop.command.impl.*;

import java.util.HashMap;

public class CommandProvider {

    private final HashMap<CommandKey, Command> commands = new HashMap<>();

    private static final Command DEFAULT_COMMAND = new NotFoundCommand();

    public CommandProvider() {
        // создаём команды и кладём их в hashmap
        CommandKey adminOrdersKey = new CommandKey("orders", "admin", "GET");
        commands.put(adminOrdersKey, new AdminOrdersCommand());

        // создаём команды и кладём их в hashmap
        CommandKey anonymousCartKey = new CommandKey("cart", "anonymous", "GET");
        commands.put(anonymousCartKey, new AnonymousCartCommand());

        CommandKey userCartKey = new CommandKey("cart", "user", "GET");
        commands.put(userCartKey, new UserCartCommand());

        CommandKey mainPage = new CommandKey("main", "anonymous", "GET");
        commands.put(mainPage, new MainPageCommand());

        CommandKey notFoundPage = new CommandKey(null, null, "GET");
        commands.put(notFoundPage, new NotFoundCommand());

        CommandKey pantsPage = new CommandKey("pants", "anonymous", "GET");
        commands.put(pantsPage, new PantsPageCommand());




//        CommandKey userCartKey = new CommandKey("cart", "USER", "POST");
//        commands.put(userCartKey, new AddToUserCart());

        // другие команды
    }

    private Command getRoleCommand(CommandKey key){
        Command command = commands.get(key);
        if(key.role().equals("user") && command == null){
            command = commands.get(new CommandKey(key.page(),"anonymous",key.method()));
        } else if (key.role().equals("admin") && command == null){
            command = commands.get(new CommandKey(key.page(),"anonymous",key.method()));
        }
        return command;
    }

    public Command getCommand(String role, String page, String method) {
        CommandKey key = new CommandKey(page, role, method);

        Command command = getRoleCommand(key);

        if (command != null) return command;

        return DEFAULT_COMMAND;
    }
}
