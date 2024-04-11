package interfaces;
/**
 * tictactoeinterface
 */
public interface TicTacToeInterface {

// only declareation
 public void display();
 public boolean update(String player,int choice);
 public boolean checkresult(String player);
 public boolean checkmat();
 public void refresh();
 public boolean checkchoice(int choice);

}
