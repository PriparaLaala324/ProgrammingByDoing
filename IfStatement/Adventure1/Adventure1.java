import java.util.Scanner;

public class Adventure1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String name, gender;
    int schoolChoice, confess, setting, take1, take2, take3, take4, go1, go2;
    int choice1, choice2, choice3, choice4, choice5;

    System.out.println("INFORMATION: ");
    System.out.println("Name: ");
    name = keyboard.next();
    System.out.println("Gender (F or M): ");
    gender = keyboard.next();
    if ( gender.equals("F") )
    {
      System.out.println("+---------------------+");
      System.out.println("| [] - story telling  |");
      System.out.println("| {} - others dialogue|");
      System.out.println("+---------------------+");
      System.out.println("[It's 8:30!!! " + name + ", YOU ARE LATE FOR SCHOOL!!!]");
      System.out.println("How do you want to go to school?");
      System.out.println("1. run as fast as you can");
      System.out.println("2. walk slowly");
      schoolChoice = keyboard.nextInt();
        if ( schoolChoice == 2 )
        {
          System.out.println("[: . BAD ENDING . :]");
          System.out.println("[A satyr catured you and ©¥√††¥∆ç©†√∆¬√]");
        }
        else if ( schoolChoice == 1 )
        {
          System.out.println();
          System.out.println("[You almost hit by a car.]");
          System.out.println("[However a really handsome guy saved you.]");
          System.out.println("[You quickly fall in love with him.]");
          System.out.println("Do you want to confess to him?");
          System.out.println("1. yes");
          System.out.println("2. no");
          confess = keyboard.nextInt();
          if ( confess == 2 )
          {
            System.out.println();
            System.out.println("[: . BAD ENDING . :]");
            System.out.println("[You are single forever util you are dead.]");
          }
          else if ( confess == 1 )
          {
            System.out.println();
            System.out.println("{Handsome guy: I'm sorry, but I already have a girlfriend.}");
            System.out.println("[Your heart breaks down and swear that you will kill any girl that stop you from your love.]");
            System.out.println("[You started to notice that girlfriend and try to be her friend.]");
            System.out.println("[Her name is Cherry, she is afraid of spiders.]");
            System.out.println("[You think it's time to kill her.]");
            System.out.println();
            System.out.println("Where do you want to go?");
            System.out.println("1. bathroom");
            System.out.println("2. laboaratory");
            System.out.println("3. garden");
            System.out.println("4. health center");
            setting = keyboard.nextInt();
            if ( setting == 1 )
            {
              System.out.println("[You found a bucket.]");
              System.out.println("Would you like to take it?");
              System.out.println("1. yes");
              System.out.println("2. no");
              take1 = keyboard.nextInt();
              if ( take1 == 1 )
              {
                System.out.println("[accepted]");
              }
              else if ( take1 == 2 )
              {
                System.out.println("[uh...ok?]");
              }
            }
            else if ( setting == 2 )
            {
              System.out.println("[You found a hydrochloric acid.]");
              System.out.println("Would you like to take it?");
              System.out.println("1. yes");
              System.out.println("2. no");
              take1 = keyboard.nextInt();
              if ( take1 == 1 )
              {
                System.out.println("[accepted]");
              }
              else if ( take1 == 2 )
              {
                System.out.println("[uh...ok?]");
              }
            }
            else if ( setting == 3 )
            {
              System.out.println("[There are some killing tools]");
              System.out.println("Would you like to take it?");
              System.out.println("1. yes");
              System.out.println("2. no");
              take1 = keyboard.nextInt();
              if ( take1 == 1 )
              {
                System.out.println("[accepted]");
              }
              else if ( take1 == 2 )
              {
                System.out.println("[uh...ok?]");
              }
            }
            else if ( setting == 4 )
            {
              System.out.println("[You found a cathartics.]");
              System.out.println("Would you like to take it?");
              System.out.println("1. yes");
              System.out.println("2. no");
              take4 = keyboard.nextInt();
              if ( take4 == 1 )
              {
                System.out.println("[The nurse is still here.]");
              }
              else if ( take4 == 2 )
              {
                System.out.println("[um...ok?]");
              }
            }
          }
          System.out.println();
          System.out.println("[You are tell Cherry to meet you at the roof.]");
          System.out.println("{Cherry: Hi! " + name + "! What do you want to talk about?}");
          System.out.println("Do you want to stay here or go to other place?");
          System.out.println("1. stay");
          System.out.println("2. go to other place");
          go1 = keyboard.nextInt();
          if ( go1 == 2 )
          {
            System.out.println("Where do you want to go?");
            System.out.println("1. bathroom");
            System.out.println("2. garden");
            System.out.println("3. swimming pool");
            System.out.println("4. laboaratory");
            System.out.println("5. health center");
            go2 = keyboard.nextInt();
            if ( go2 == 1 )
            {
              System.out.println("Choose one option:");
              System.out.println("1. pour a bucket of water on her and then electrocute her");
              System.out.println("2. put her face in to the toilet and then drown her");
              choice1 = keyboard.nextInt();
              if ( choice1 == 1 )
              {
                System.out.println(": . BAD ENDING . :");
                System.out.println("[You forgot to dry your hands]");
                System.out.println("[So you died from electrocute]");
              }
              else if ( choice1 == 2)
              {
                System.out.println(": . HAPPY ENDING . :");
                System.out.println("[You successfully killed Cherry]");
                System.out.println("[And you become the handsome guy's girlfriend]");
              }
            }
            else if ( go2 == 2 )
            {
              System.out.println("Choose one option:");
              System.out.println("1. Cut her in half with an axe, then bury her");
              System.out.println("2. knock her out with a shovel, then bury her");
              choice2 = keyboard.nextInt();
              if ( choice2 == 1 )
              {
                System.out.println(": . HAPPY ENDING . :");
                System.out.println("[You successfully killed Cherry]");
                System.out.println("[And you become the handsome guy's girlfriend]");
              }
              else if ( choice2 == 2 )
              {
                System.out.println(": . BAD ENDING . :");
                System.out.println("[She awaked when you are digging the hole]");
                System.out.println("[Then she used axe to cut you into pieces]");
              }
            }
            else if ( go2 == 3 )
            {
              System.out.println("Choose one option:");
              System.out.println("1. push her into the swimming pool");
              System.out.println("2. secretly tie a large stone on her leg and push her into the swimming pool");
              choice3 = keyboard.nextInt();
              if ( choice3 == 1 )
              {
                System.out.println(": . BAD ENDING . :");
                System.out.println("[She didn't die and called the police]");
                System.out.println("[You are in jail for what you have done]");
              }
              else if ( choice3 == 2 )
              {
                System.out.println("[Wait a min...]");
                System.out.println("[WHERE DID YOU GET THE LARGE STONE YOU CHEATER!!!]");
              }
            }
            else if ( go2 == 4 )
            {
              System.out.println("[You kileed her with hydrochloric acid]");
              System.out.println("Where do you want to hide the body?");
              System.out.println("1. in the locker");
              System.out.println("2. eat it");
              System.out.println("3. just leave it, but cleaned all the evidence");
              choice4 = keyboard.nextInt();
              if ( choice4 == 1 )
              {
                System.out.println("[: . BAD ENDING . :]");
                System.out.println("[The teacher saw you squeezing Cherry into the locker]");
                System.out.println("[You are in jail for what you have done]");
              }
              else if ( choice4 == 2 )
              {
                System.out.println("[You must be crazy to choose this option]");
              }
              else if ( choice4 == 3 )
              {
                System.out.println("[: . HAPPY ENDING . :]");
                System.out.println("[You successfully killed Cherry]");
                System.out.println("[And you become the handsome guy's girlfriend]");
                System.out.println("[However the handsome guy noticed your plan and killed you for Cherry]");
              }
            }
            else if ( go2 == 5 )
            {
              System.out.println("Choose one option:");
              System.out.println("1. smother her with a pillow");
              System.out.println("2. kill her with cathartics");
              choice5 = keyboard.nextInt();
              if ( choice5 == 1 )
              {
                System.out.println(": . BAD ENDING . :");
                System.out.println("[She didn't die and called the police]");
                System.out.println("[You are in jail for what you have done]");
              }
              else if ( choice5 == 2 )
              {
                System.out.println("[You successfully killed Cherry]");
                System.out.println("[And you become the handsome guy's girlfriend]");
              }
            }
          }
          else if ( go1 == 1 )
          {
            System.out.println(": . BAD ENDING . :");
            System.out.println("[Cherry noticed your plan of killing her.]");
            System.out.println("[So, she pushed you off the roof.]");
          }
        }
    }
    else if ( gender.equals("M") )
    {
      System.out.println("+---------------------+");
      System.out.println("| [] - story telling  |");
      System.out.println("| {} - others dialogue|");
      System.out.println("+---------------------+");
      System.out.println("[It's 8:30!!! " + name + ", YOU ARE LATE FOR SCHOOL!!!]");
      System.out.println("How do you want to go to school?");
      System.out.println("1. run as fast as you can");
      System.out.println("2. walk slowly");
      schoolChoice = keyboard.nextInt();
        if ( schoolChoice == 2 )
        {
          System.out.println("[: . BAD ENDING . :]");
          System.out.println("[A satyr catured you and ©¥√††¥∆ç©†√∆¬√]");
        }
        else if ( schoolChoice == 1 )
        {
          System.out.println();
          System.out.println("[You almost hit by a car.]");
          System.out.println("[However a really beautiful girl saved you.]");
          System.out.println("[You quickly fall in love with him.]");
          System.out.println("Do you want to confess to him?");
          System.out.println("1. yes");
          System.out.println("2. no");
          confess = keyboard.nextInt();
          if ( confess == 2 )
          {
            System.out.println();
            System.out.println("[: . BAD ENDING . :]");
            System.out.println("[You are single forever util you are dead.]");
          }
          else if ( confess == 1 )
          {
            System.out.println();
            System.out.println("{Beautiful girl: I'm sorry, but I already have a girlfriend.}");
            System.out.println("[Your heart breaks down and swear that you will kill any girl that stop you from your love.]");
            System.out.println("[You started to notice that girlfriend and try to be his friend.]");
            System.out.println("[His name is Peter, he is afraid of spiders.]");
            System.out.println("[You think it's time to kill his.]");
            System.out.println();
            System.out.println("Where do you want to go?");
            System.out.println("1. bathroom");
            System.out.println("2. laboaratory");
            System.out.println("3. garden");
            System.out.println("4. health center");
            setting = keyboard.nextInt();
            if ( setting == 1 )
            {
              System.out.println("[You found a bucket.]");
              System.out.println("Would you like to take it?");
              System.out.println("1. yes");
              System.out.println("2. no");
              take1 = keyboard.nextInt();
              if ( take1 == 1 )
              {
                System.out.println("[accepted]");
              }
              else if ( take1 == 2 )
              {
                System.out.println("[uh...ok?]");
              }
            }
            else if ( setting == 2 )
            {
              System.out.println("[You found a hydrochloric acid.]");
              System.out.println("Would you like to take it?");
              System.out.println("1. yes");
              System.out.println("2. no");
              take1 = keyboard.nextInt();
              if ( take1 == 1 )
              {
                System.out.println("[accepted]");
              }
              else if ( take1 == 2 )
              {
                System.out.println("[uh...ok?]");
              }
            }
            else if ( setting == 3 )
            {
              System.out.println("[There are some killing tools]");
              System.out.println("Would you like to take it?");
              System.out.println("1. yes");
              System.out.println("2. no");
              take1 = keyboard.nextInt();
              if ( take1 == 1 )
              {
                System.out.println("[accepted]");
              }
              else if ( take1 == 2 )
              {
                System.out.println("[uh...ok?]");
              }
            }
            else if ( setting == 4 )
            {
              System.out.println("[You found a cathartics.]");
              System.out.println("Would you like to take it?");
              System.out.println("1. yes");
              System.out.println("2. no");
              take4 = keyboard.nextInt();
              if ( take4 == 1 )
              {
                System.out.println("[The nurse is still here.]");
              }
              else if ( take4 == 2 )
              {
                System.out.println("[um...ok?]");
              }
            }
          }
          System.out.println();
          System.out.println("[You are tell Peter to meet you at the roof.]");
          System.out.println("{Peter: Hi! " + name + "! What do you want to talk about?}");
          System.out.println("Do you want to stay here or go to other place?");
          System.out.println("1. stay");
          System.out.println("2. go to other place");
          go1 = keyboard.nextInt();
          if ( go1 == 2 )
          {
            System.out.println("Where do you want to go?");
            System.out.println("1. bathroom");
            System.out.println("2. garden");
            System.out.println("3. swimming pool");
            System.out.println("4. laboaratory");
            System.out.println("5. health center");
            go2 = keyboard.nextInt();
            if ( go2 == 1 )
            {
              System.out.println("Choose one option:");
              System.out.println("1. pour a bucket of water on his and then electrocute his");
              System.out.println("2. put his face in to the toilet and then drown his");
              choice1 = keyboard.nextInt();
              if ( choice1 == 1 )
              {
                System.out.println(": . BAD ENDING . :");
                System.out.println("[You forgot to dry your hands]");
                System.out.println("[So you died from electrocute]");
              }
              else if ( choice1 == 2)
              {
                System.out.println(": . HAPPY ENDING . :");
                System.out.println("[You successfully killed Peter]");
                System.out.println("[And you become the beautiful girl's girlfriend]");
              }
            }
            else if ( go2 == 2 )
            {
              System.out.println("Choose one option:");
              System.out.println("1. Cut his in half with an axe, then bury his");
              System.out.println("2. knock his out with a shovel, then bury his");
              choice2 = keyboard.nextInt();
              if ( choice2 == 1 )
              {
                System.out.println(": . HAPPY ENDING . :");
                System.out.println("[You successfully killed Peter]");
                System.out.println("[And you become the beautiful girl's girlfriend]");
              }
              else if ( choice2 == 2 )
              {
                System.out.println(": . BAD ENDING . :");
                System.out.println("[He awaked when you are digging the hole]");
                System.out.println("[Then he used axe to cut you into pieces]");
              }
            }
            else if ( go2 == 3 )
            {
              System.out.println("Choose one option:");
              System.out.println("1. push his into the swimming pool");
              System.out.println("2. secretly tie a large stone on his leg and push his into the swimming pool");
              choice3 = keyboard.nextInt();
              if ( choice3 == 1 )
              {
                System.out.println(": . BAD ENDING . :");
                System.out.println("[He didn't die and called the police]");
                System.out.println("[You are in jail for what you have done]");
              }
              else if ( choice3 == 2 )
              {
                System.out.println("[Wait a min...]");
                System.out.println("[WHERE DID YOU GET THE LARGE STONE YOU CHEATER!!!]");
              }
            }
            else if ( go2 == 4 )
            {
              System.out.println("[You kileed his with hydrochloric acid]");
              System.out.println("Where do you want to hide the body?");
              System.out.println("1. in the locker");
              System.out.println("2. eat it");
              System.out.println("3. just leave it, but cleaned all the evidence");
              choice4 = keyboard.nextInt();
              if ( choice4 == 1 )
              {
                System.out.println("[: . BAD ENDING . :]");
                System.out.println("[The teacher saw you squeezing Peter into the locker]");
                System.out.println("[You are in jail for what you have done]");
              }
              else if ( choice4 == 2 )
              {
                System.out.println("[You must be crazy to choose this option]");
              }
              else if ( choice4 == 3 )
              {
                System.out.println("[: . HAPPY ENDING . :]");
                System.out.println("[You successfully killed Peter]");
                System.out.println("[And you become the beautiful girl's girlfriend]");
                System.out.println("[However the beautiful girl noticed your plan and killed you for Peter]");
              }
            }
            else if ( go2 == 5 )
            {
              System.out.println("Choose one option:");
              System.out.println("1. smother his with a pillow");
              System.out.println("2. kill his with cathartics");
              choice5 = keyboard.nextInt();
              if ( choice5 == 1 )
              {
                System.out.println(": . BAD ENDING . :");
                System.out.println("[He didn't die and called the police]");
                System.out.println("[You are in jail for what you have done]");
              }
              else if ( choice5 == 2 )
              {
                System.out.println("[You successfully killed Peter]");
                System.out.println("[And you become the beautiful girl's girlfriend]");
              }
            }
          }
          else if ( go1 == 1 )
          {
            System.out.println(": . BAD ENDING . :");
            System.out.println("[Peter noticed your plan of killing his.]");
            System.out.println("[So, he pushed you off the roof.]");
          }
      }
  }
}
}
