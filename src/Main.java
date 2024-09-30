
//Program PartyAffiliation
//class PartyAffiliation
    //main()
        //String politicalParty
        //output “What is your political party affiliation? [DRIO]: " //Enter D for Democrat, R for Republican, I for Independent, or O for Other]
        //input politicalParty
        //if (politicalParty == “D”) then
            //output “You get a Democratic Donkey.”
        //elseif(politicalParty == "R")then
            //output “You get a Republican Elephant.“
        //elseif(politicalParty == "I")then
            //output “You get an Independent Man.“
        //else
             //output "You entered an incorrect party value: ”+ politicalParty
        //endIf
    //return
//endClass


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "D - Democrat\tR - Republican\tI - Independent\tO - Other\nWhat is your political party affilitation?: ";

        System.out.print(menu);
        menuChoice = in.nextLine();

        if(menuChoice.equalsIgnoreCase( "D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person.");
        }
        else
            System.out.println("You chose an Other party. ");
    }
}