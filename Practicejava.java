import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Practicejava {//クラス名の初めは大文字でかく！
    //課題1-1:コンソールにHellow worldを表示　
    public static void main(String[] args) {
        //↓この行にて変数名greetingをString型で定義
        String greeting = "Hellow world";
        System.out.println(greeting);

        //課題1-2:コンソールに1~10までを足した結果表示（for文を使う）

        int sum =0;//sumは合計という意味。　
        for (int number =1; number <= 10; number++) {//ここではsumに加算するnumberの範囲をかく。
            sum += number;
        }
        System.out.println("sum:" +sum);
        //課題1-2:for文を使わないパターン。ただ、計算しただけのパターンです
        int numberasobi= (1+10)*10/2;
                System.out.println(numberasobi);

        //課題1-3　3年後の今日は何曜日なのかの計算
        LocalDateTime localdate = LocalDateTime.now();
        LocalDateTime futuretime = localdate.plusYears(3);
        DayOfWeek dayOfWeek = DayOfWeek.from(futuretime);
        System.out.println(dayOfWeek);
        System.out.println(futuretime);

        //課題1-4引数0の場合は、戻り値偽。引数1の場合は、戻り値をコンソールに表示。(if文を使って)
        int number=0;
        if (number == 0)
            System.out.println("偽");
        //課題1-5 String型のListやMapを作成して、その内容をコンソール画面に表示。
        String[][] foodMap = new String[10][20];
        for (int i = 0; i < foodMap.length; i++) {
            for (int j  = 0; j < foodMap[i].length; j++) {
                 foodMap[i][j] = "肉";
                 System.out.println(foodMap[i][j]);
            }
            System.out.println("");
        }
}
}
