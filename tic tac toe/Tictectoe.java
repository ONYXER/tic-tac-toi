import interfaces.TicTacToeInterface;

public class Tictectoe implements TicTacToeInterface {
    // gamematrix
    private static char[][] gamematrix = new char[3][3];
    protected static String playerA;
    protected static String playerB;

    // refresh or intialized gamematrix
    public void refresh() {
        int data = 49;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gamematrix[i][j] = (char) data;
                data++;
            }
        }
    }

    // display gamemetrix
    public void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print("---");
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + String.valueOf(gamematrix[i][j]) + "|");
            }
            System.out.println();
        }
        for (int j = 0; j < 3; j++)
            System.out.print("---");
        System.out.println();
    }
// check matrix
    public boolean checkmat() {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Character.isDigit(gamematrix[i][j])) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;

    }
      //update matrix
    public boolean update(String player, int choice) {
        char data = (char) (48 + choice);
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gamematrix[i][j] == data) {
                    gamematrix[i][j] = player.charAt(0);
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
         // check result
    public boolean checkresult(String player) {
        char temp = player.charAt(0);

        if (gamematrix[0][0] == temp && gamematrix[0][1] == temp && gamematrix[0][2] == temp)
            return true;
        else if (gamematrix[0][0] == temp && gamematrix[1][1] == temp && gamematrix[2][2] == temp)
            return true;
        else if (gamematrix[0][2] == temp && gamematrix[1][1] == temp && gamematrix[2][0] == temp)
            return true;
        else if (gamematrix[0][0] == temp && gamematrix[1][0] == temp && gamematrix[2][0] == temp)
            return true;
        else if (gamematrix[0][2] == temp && gamematrix[1][2] == temp && gamematrix[2][2] == temp)
            return true;
        else if (gamematrix[2][0] == temp && gamematrix[2][1] == temp && gamematrix[2][2] == temp)
            return true;
            else if (gamematrix[1][0] == temp && gamematrix[1][1] == temp && gamematrix[1][2] == temp)
            return true;
            else if (gamematrix[0][1] == temp && gamematrix[1][1] == temp && gamematrix[2][1] == temp)
            return true;
        else
            return false;

    }

    

    public String getPlayerA() {
        return playerA;
    }

    public void setPlayerA(String playerA) {
        Tictectoe.playerA = playerA;
    }

    public String getPlayerB() {
        return playerB;
    }

    public void setPlayerB(String playerB) {
        Tictectoe.playerB = playerB;
    } 
public boolean checkchoice(int choice){
    if(choice>=0 || choice<9)
    return true;
    else
    return false;
}
}
