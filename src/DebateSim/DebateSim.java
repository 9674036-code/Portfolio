import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class DebateSim {
    public static String paradigm="Hello, if you are reading this, I am probably your judge, here's what I'm looking for: ";
    public static Random random=new Random();
    public static Scanner input=new Scanner(System.in);
    public static ArrayList<Integer> judge = new ArrayList<>();
    public static String[] iCalc ={"I like seeing clash and impact calc.","Clash and impact calc are very important for me.","Impact calc is how debate works and will win/lose you the round."};
    public static String[] value={"The value debate is pretty fundamental but not really extensive so I'll be a judging a bit of the round on it.","The value debate is quite fundamental so I'll weigh it considerably.","Sure impact calc is important, but the value debate is cool so I will weigh most of the round on it."};
    public static Debater player = new Debater();
    public static Debater opp = new Debater();
    public static void main(String[] args) {
        while (true){
            for (int r=0;r<1;r++){
                judge.add(random.nextInt(60)+10);
                opp.setMainArg(judge.get(0)+random.nextInt(18)-8);
                if(judge.get(0)>31){
                    judge.add(random.nextInt(60-(judge.get(0)-30))+10);
                }else{
                    judge.add(random.nextInt(60)+10);
                }
                opp.setValue(judge.get(0)+random.nextInt(18)-8);
                judge.add(100-judge.get(0)-judge.get(1));
                opp.setCrossX(judge.get(0)+random.nextInt(18)-8);

                judge.add(random.nextInt(50)+10);

                if(judge.get(0)>57){
                    paradigm=paradigm+iCalc[2];
                }else if(judge.get(0)>45){
                    paradigm=paradigm+iCalc[1];
                }else if(judge.get(0)>33){
                    paradigm=paradigm+iCalc[0];
                }
                if(judge.get(1)>57){
                    paradigm=paradigm+value[2];
                }else if(judge.get(1)>45){
                    paradigm=paradigm+value[1];
                }else if(judge.get(1)>33){
                    paradigm=paradigm+value[0];
                }
                if(judge.get(2)<29&&random.nextInt(2)==1||judge.get(2)>41&&random.nextInt(10)==0){
                    paradigm=paradigm+"Also, I will be playing Clash of Clans during Cross-ex.";
                }

                System.out.println("Paradigm: (the standards the judge will weigh the debate on) \n"+paradigm);

                while(true){    
                    try{
                        System.out.println("How many points out of 100 of prepatory time do you wish to allocate to your value framework? (you will be splitting these points three ways) ");
                        player.setValue(Integer.parseInt(input.nextLine()));
                        System.out.println("How many points out of 100 of prepatory time do you wish to allocate towards Cross Examination? (you will be splitting these points three ways) ");
                        player.setCrossX(Integer.parseInt(input.nextLine()));
                        System.out.println("How many points out of 100 of prepatory time do you wish to allocate to your main argument and impact calculus? (you will be splitting these points three ways) ");
                        player.setMainArg(Integer.parseInt(input.nextLine()));
                        if(player.getCrossX()+player.getMainArg()+player.getValue()==100){
                        break;
                        }
                        System.out.println("please use a valid integer and ensure your inputted values sum to 100");
                    }catch(NumberFormatException e){
                        System.out.println("please use a valid integer and ensure your inputted values sum to 100");
                    }
                }
                
                System.out.println("Judge importance ratings (out of 100)");
                System.out.println("The main arguments/impact calc:" +judge.get(0));
                System.out.println("The value debate: " +judge.get(1));
                System.out.println("Cross Examination: " +judge.get(2));

                if((player.getCrossX()*judge.get(2)+player.getMainArg()*judge.get(0)+player.getValue()*judge.get(1))>(opp.getCrossX()*judge.get(2)+opp.getMainArg()*judge.get(0)+opp.getValue()*judge.get(1))){
                    System.out.println("You have won the round.");
                    player.setWins(1);
                }else{
                    System.out.println("You have lost the round.");
                }

                judge.clear();
                paradigm="Hello, if you are reading this, I am probably your judge, here's what I'm looking for: ";
            }
        if (player.getWins()==4){
            System.out.println("You placed "+random.nextInt(2)+4+"th");
        }else if (player.getWins()==5){
            System.out.println("You placed"+random.nextInt(3)+1+"th");
        }else{
            System.out.println("You did not place.");
        }
        System.out.println("Do you want to play again? yes/no ");
        if(input.nextLine()!="yes"){
            input.close();
            break;
        }

        }

    }
}
