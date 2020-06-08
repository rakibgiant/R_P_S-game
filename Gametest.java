public class Gametest {
    public static void main(String[] args) {

        Player player1 = new Player();//creating object of Player class
        player1.playerInfo();//showing the player information by calling playerinfo method

        ComputerTurn player2 = new ComputerTurn();//creating object of ComputerTurn class
        player2.playerinfo();//display the player information by calling playerinfo method
        Game startGame = new Game();//creating object of Game class
        startGame.gameStart();//begging the game by calling gamestart method
        rps2 rps2Object = new rps2();//creating object of rps2 class
        rps2Object.rpS2();//ask for finished by calling rpS2 method
        if(rps2Object.rpS2()==1){
            startGame.gameStart();
        }else{
            startGame.result();//Show the result by calling result method 
        } 
    }
}
