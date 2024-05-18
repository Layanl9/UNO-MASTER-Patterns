import java.util.Scanner;



/**
 * The main class of the game.
 * This game designed for UNIX bash !. 
 * (may not work on windows)
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.1.0 
 */
public class Run 
{
    // for get the players inputs
    private static Scanner inputs = new Scanner(System.in);
    private static ColorStrategy getUserColorChoice() {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Please select a color option:");
        System.out.println("1. Black");
        System.out.println("2. Red");
        System.out.println("3. Yellow");
        System.out.println("4. Green");
        System.out.println("5. Blue");
        System.out.println("6. White");
    
        while (true) {
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    return new BlackColorStrategy();
                case "2":
                    return new RedColorStrategy();
                case "3":
                    return new YellowColorStrategy();
                case "4":
                    return new GreenColorStrategy();
                case "5":
                    return new BlueColorStrategy();
                case "6":
                    return new WhiteColorStrategy();
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }

 


    public static void main(String[] args) 
    {
         // Create a ColorContext instance
    ColorContext colorContext = new ColorContext();

    // Get user's color choice
    ColorStrategy userColorChoice = getUserColorChoice();

    // Set the color strategy in the ColorContext
    colorContext.setColorStrategy(userColorChoice);
        // calibrate the font size of the terminal
        Printer.calibrate(inputs);



        //  * required variables *
        String holdInput; // hold the input to check that its valid or not
        int numberOfPlayers; // the number of the game players
        String newPlayerName, newPlayerPass; // get the new player details
        

        // while player choose exit option 
        while (true)
        {
            // while player choose valid option
            while (true)
            {
                // show the game menu tho the player and get his/her choice
                Printer.printMenu(colorContext);
                holdInput = inputs.nextLine();

                // check the player input
                if (holdInput.length() == 1 && (holdInput.charAt(0) == '1' || holdInput.charAt(0) == '2'))
                    break;
                else 
                    Printer.inValidInputError(inputs);
            }


            switch (holdInput)
            {
                case "1":

                    // while the plahyer choose a valid int
                    while (true)
                    {
                        // get the player choice
                        Printer.getNumberOfThePlayers();
                        holdInput = inputs.nextLine();

                        // check the player input
                        if (holdInput.length() == 1 && holdInput.charAt(0) > '0' && holdInput.charAt(0) < '8')
                            break;
                        else 
                            Printer.inValidInputError(inputs);
                    }


                    // set the number of the players
                    numberOfPlayers = (int)holdInput.charAt(0) - (int)'0';

                    // get the players detials
                    for (int n = 0; n < numberOfPlayers; n++)
                    {
                        // get the player name
                        Printer.getPlayerName(n+1);
                        newPlayerName = inputs.nextLine();


                        if (newPlayerName.toLowerCase().equals("bot"))
                        {
                            // creat a bot
                            GameCreation.addPlayer(new Bot(n));
                        }
                        else 
                        {
                            // get the player password
                            Printer.getPlayerPass(newPlayerName);
                            newPlayerPass = inputs.nextLine();

                    
                            // creat new player
                            PlayerBuilder builder = new ConcretePlayerBuilder();
                            PlayerDirector director = new PlayerDirector();
                            Player player = director.constructPlayer(builder.buildFirstName(newPlayerName)
                                    .buildPassword(newPlayerPass));

                                    GameCreation.addPlayer(player);
                        }
                    }

                    
                    // get the cards to the players
                    GameCreation.preparationGameCards();
                    GameCreation.distributeCards();

                    // run the game
                    GameCreation.runGame(inputs);

                    // reset the game
                    GameCreation.reset();

                break;

                case "2":
                    return;
            }
        }
    }
}
