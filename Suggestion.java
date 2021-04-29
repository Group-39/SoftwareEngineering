import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/*
  @author geonwoolim
*/
public class Suggestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] characters = {"Col Mustard", "Prof Plum", "Rev Green", "Mrs Peacock", "Miss Scarlett", "Mrs White"}; 
        String[] weapons = {"dagger", "candlestick", "revolver", "rope", "lead piping", "spanner"};
        String[] rooms = {"Study", "Library", "billiards room", "conservatory",  "hall", "ball room", "Lounge", "dining room", "kitchen"};
        
        ArrayList<String> PopChr = new ArrayList<String>();
        ArrayList<String> PopWeap = new ArrayList<String>();
        ArrayList<String> PopRoom = new ArrayList<String>();
      
        for (int i = 0; i < characters.length; i ++) {
            PopChr.add(characters[i]);
        }
      for (int i = 0; i < weapons.length; i ++) {
            PopWeap.add(weapons[i]);
        }
      for (int i = 0; i < rooms.length; i ++) {
            PopRoom.add(rooms[i]);
        }
      
        Collections.shuffle(PopChr);
        Collections.shuffle(PopWeap);
        Collections.shuffle(PopRoom);
      
      HashMap<String,String> answerCard = new HashMap<String,String>();
      
      answerCard.put("chr",PopChr.get(0));
      answerCard.put("weapon",PopWeap.get(0));
      answerCard.put("room",PopRoom.get(0));
      System.out.println("character : " + answerCard.get("chr"));
        System.out.println("Weapon : " + answerCard.get("weapon"));
        System.out.println("Room : " + answerCard.get("room"));
      
      PopChr.remove(0);
        PopWeap.remove(0);
        PopRoom.remove(0);
        System.out.println("characters : " + PopChr);
      System.out.println("Weapons : " + PopWeap);
        System.out.println("Rooms : " + PopRoom);

        ArrayList<String> Remaincards = new ArrayList<>();
        Remaincards.addAll(PopChr);
        Remaincards.addAll(PopWeap);
        Remaincards.addAll(PopRoom);
        Collections.shuffle(Remaincards);
        System.out.println(Remaincards);
        
        ArrayList<String> Player1 = new ArrayList<String>();
        ArrayList<String> Player2 = new ArrayList<String>();
      ArrayList<String> Player3 = new ArrayList<String>();
      ArrayList<String> Player4 = new ArrayList<String>();
      ArrayList<String> Player5 = new ArrayList<String>();
      ArrayList<String> Player6 = new ArrayList<String>();
      
        for (int i = 0; i < 18; i ++) {
         int nMOd = i / 3;
         switch(nMOd){
            case 0:
               Player1.add(Remaincards.get(i));
               break;
            case 1:
               Player2.add(Remaincards.get(i));
               break;
            case 2:
               Player3.add(Remaincards.get(i));
               break;
            case 3:
               Player4.add(Remaincards.get(i));
               break;
            case 4:
               Player5.add(Remaincards.get(i));
               break;
            case 5:
               Player6.add(Remaincards.get(i));
               break;
            
         }
        }
        System.out.println("Player1 : " + Player1);
        System.out.println("Player2 : " + Player2);
        System.out.println("Player3 : " + Player3);
        System.out.println("Player4 : " + Player4);
        System.out.println("Player5 : " + Player5);
        System.out.println("Player6 : " + Player6);
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Character :");
      String strC = scan.nextLine();
      System.out.print("Weapon :");
      String strW = scan.nextLine();
      System.out.print("Room :");
      String strR = scan.nextLine();
      
      System.out.println("[Input Answer]"); 
      System.out.println("Character -> " + answerCard.get("chr").equals(strC));
      System.out.println("Weapon -> " + answerCard.get("weapon").equals(strW));
      System.out.println("Room -> " + answerCard.get("room").equals(strR));
      

    }
}
