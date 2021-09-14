import java.util.Scanner;
class Nabeatsu{

  public static void main(String[] args){ //mainメソッドの始まり。決まり文句。

    Scanner scanner = new Scanner(System.in); //scannerクラスのインスタンスを作成
    boolean roop = true ; //ループさせるための変数

    do{/*繰り返しを行う。変数roopがtrueの間ループさせる。最後にroopを変化させるかの処理を入れている。*/
          boolean skip = false ;/*重複させないための変数*/
          boolean skip2 = false;
          boolean skip3 = false;
          boolean skip4 = false;
            System.out.println("好きな数字を入力してください");
            int n = scanner.nextInt(); //判定する数字を変数nに格納する。

            if (n % 3 == 0){   //3の倍数の判定
              skip = true;
            }else if(n % 10 == 3){ //1桁目の数字を判定する。10で割ったあまりが3
                    skip2 = true;
                  }else{
                    for (int i = 1; n > 0; i++){ //桁の数だけ10で割ってその余りを逐次判定する
                        n /= 10;
                          if(n ==3){
                            //System.out.println("1桁目以外が3です");
                            skip3 = true ;
                            break;
                          }
                    }
                  }

           if(skip){ /*条件による処理をここに書いて分けることで重複を回避する。elseは上の条件がfalseであるときのみ処理されるため。*/
             System.out.println("3の倍数です");
           }else if(skip2){
             System.out.println("1桁目が3です");
           }else if(skip3){
             System.out.println("1桁目以外が3です");
           }else{
             System.out.println("ナベアツではありません");
           }

           System.out.println("続けますか？ 1で継続、2で終了。");
           int exit = scanner.nextInt();
           if (exit == 1);
             else if(exit == 2){
               roop = false ; //roopがfalseになりwhileの条件を満たさなくなり処理が終わる。
             }

    }while(roop == true);

  }
}
