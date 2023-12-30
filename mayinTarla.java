import java.util.Random;
import java.util.Scanner;
public class mayinTarla {
    int rowNumber,colnumber , extent  ;
    int [][] mymap;
    int [][] board;
    Boolean gamesituation = true;
    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    mayinTarla(int rowNumber , int colnumber){
        this.rowNumber = rowNumber;
        this.colnumber=colnumber;
        this.mymap = new int[rowNumber][colnumber];
        this.board = new int[rowNumber][colnumber];
        this.extent  = rowNumber *colnumber;
    }
    public void start(){
        int row , colm , success=0;
        createGame();
        System.out.println(" -- BU KONTROL TABLOSUDUR. --");
        printarry(mymap);
        System.out.println("OYUN BAŞLADI --- BAŞARILAR ---");
        while(gamesituation) {
            printarry(board);
            System.out.print("SATIR SAYISI : ");
            row = input.nextInt();
            System.out.print(" SÜTUN SAYISI  : ");
            colm = input.nextInt();
            if(row<0 || row >= rowNumber){
                System.out.println("GEÇERSİZ BİR DEĞER GİRDİNİZ TEKRAR DENEYİNİZ..");
                continue;
            }

            if(colm<0 || colm >= colnumber){
                System.out.println("GEÇERSİZ BİR DEĞER GİRDİNİZ TEKRAR DENEYİNİZ..");
                continue;
            }

            if(mymap [row] [colm] !=-1){
                controlmine(row, colm);
                success++;
                if(success == (extent-(extent/4))){
                    System.out.println("");
                    System.out.println("----------OYUNU KAZANDINIZ . TEBRİKLER ---------- ");
                    break;
                }

            }
            else{
                gamesituation=false;
                System.out.println("OYUN BİTTİ -- * KAYBETTİN *  -- BENCE TEKRAR DENE --");
            }
        }
    }
    public void createGame(){
        int radomRow , randomCol , count =0;
        while(count != (extent/4)){
            radomRow = rand.nextInt(rowNumber);
            randomCol = rand.nextInt(colnumber);
            if (mymap[radomRow][randomCol] !=-1){
                mymap[radomRow][randomCol] = -1;
                count++;
            }
        }
    }
    public void printarry( int[][] arrys){
        for(int i =0;  i< arrys.length; i++){
            for(int x=0 ; x<arrys[0].length; x++ ){
                if(arrys[i][x] >= 0){
                    System.out.print(" ");
                }
                System.out.print(arrys[i][x]+ " ");
            }
            System.out.println();
        }
    }
    public void controlmine(int ro ,int co ){
        if(mymap [ro] [co]==0){
            if((co < colnumber -1) && (mymap[ro][co+1] ==-1)){
                board[ro][co]++;
            }
            if((ro < rowNumber -3)&& (mymap[ro +1] [co] == -1)){
                board[ro] [co]++;
            }
            if((ro >0 )&& (mymap[ro-1] [co] ==-1)){
                board[ro] [co]++;
            }
            if((co >0)&& (mymap [ro] [co-1] ==-1)){
                board[ro] [co]++;
            }
            if(board[ro][co] == 0){
                board[ro] [co] = -2;
            }
        }
    }
}
