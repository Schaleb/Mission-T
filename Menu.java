public class Menu
{
	private String[] menuOptions = {"Continue Play", "Check Balance", "Save", "Quit"};
	private int userChoice;

	/**
	* showMenu
	* Shows the main menu of the game
	*/
	public void showMenu()
	{
		Choice choice = new Choice();
		userChoice = choice.giveChoice("\nMenu: ", menuOptions);
		if(userChoice == 1)
		{
			return;
		}
		else if(userChoice == 2)
		{
			Money money = new Money();
			money.showMoney();
			return;
		}
		else if(userChoice == 3)
		{
			System.out.println("\nSAVED (fake)");
		}
		else if(userChoice == 4)
		{
			System.out.println("\nExiting...");
			System.exit(0);
		}
	}
}