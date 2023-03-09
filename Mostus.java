
public class Mostus {

    static char[][] game = new char[7][8]; //7 : row, 8 : column
    static boolean exist;
    static int i, j, wellPlaced = 0;

    public static boolean check(char compare[][],int k , char reference[]){
        
        System.out.println(reference);

        for (i = 0; i < 8; i++){
            exist = false;
            for (j = 0; j < 8 ; j++){
        
                if (compare[k][i] == reference[j]){
                    exist = true;
                }
            }
            
            if ((exist == true) && (compare[k][i] == reference[i])){
                System.out.println(compare[k][i] + ": Well placed !");
                wellPlaced++;
            }else if((exist == false)) {
                System.out.println(compare[k][i] + ": doesn't exist");
            }else{
                System.out.println(compare[k][i] + ": missplaced :-(");
            }
        }
        if (wellPlaced == 8){
            System.out.println("YOU WON!!");
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        
        int k,res;

        do{
            k = res = 0;
            do{
                System.out.print("Attempt " + (k+1) + " :");
                k++;
                game[k] = Attempt.attempt(Attempt.userWord());
                
            }while((k+1 <= 7) && (check(game,k, GameWord.gameWord()) == false));
            
            if(check(game,k, GameWord.gameWord()) == false){
                System.out.print("YOU LOST :c ");
            }
            System.out.print("DO YOU WANT TO PLAY AGAIN?\nyes: 0 no: 1 ");
            res = Attempt.read.nextInt();
        }while(res == 0);
        
    }

}
