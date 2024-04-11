import java.util.Scanner;
public class Start extends Tictectoe{
    static Scanner sc=new Scanner(System.in);

   void start(){
     String startgame;
    //  game start logic
           do{
             do{ 
                   System.out.print("Tic Tac Toe : ");
                   startgame =sc.next();
                       if((startgame.toLowerCase()).contentEquals("exit")){
                          return; }
                }while(!(startgame.toLowerCase()).contentEquals("start"));
          if(startgame.contentEquals("start")){
            System.out.printf("\033[0;33m");
                  boolean batingflag=false;
                  Integer choice; 
                // player name asignment
                System.out.print("playerA: ");
                  playerA=sc.next();
                  System.out.print("playerB: ");
                  playerB=sc.next();
                  System.out.println("welcome to tic tac toe player "+playerA.charAt(0)+" and "+playerB.charAt(0));
                  System.out.println("Let's play:-");
                  refresh();
                  display();
                
                do{
                  level1:
                  if(!batingflag){
                    System.out.println("playerA:");
                      do{
                       System.out.println("enter: ");
                       choice=sc.nextInt();
                       }while(!checkchoice(choice));
                     if(checkmat()){
                    boolean temp=update(playerA, choice);
                       if(temp){
                        batingflag=true;
                        display();
                        if(checkresult(playerA)){
                        
                            System.out.printf("\033[0;32m");
                            System.out.println("congatulation player "+ playerA+" you has won!");
                            break;
                        }
                       }else{
                        System.out.println("already filled");
                        System.out.printf("\033[0;35m");
                        break level1;
                       }
                     }else{
                        refresh();
                        System.out.printf("\033[0;33m");
                     }
                    
                  }

                  // player  B
                  else if(batingflag){
                    System.out.println("playerB:");
                      do{
                       System.out.println("enter: ");
                       choice=sc.nextInt();
                       }while(!checkchoice(choice));
                     if(checkmat()){
                    boolean temp=update(playerB, choice);
                       if(temp){
                        batingflag=false;
                        display();
                        if(checkresult(playerB)){
                        
                            System.out.printf("\033[0;32m");
                            System.out.println("congatulation player "+ playerB+" you has won!");
                            break;
                        }
                       }else{
                        System.out.println("already filled");
                        System.out.printf("\033[0;35");
                        break level1;
                    
                       }
                     }else{
                        refresh();
                        System.out.printf("\033[0;33m");
                     }
            
                     
                  }}while(true);
                  
             
                

                 
                
               }   
          //     sc.close(); 
            }while(true);
              
                   

}}