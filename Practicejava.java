import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Practicejava {

    //課題1-1:コンソールにHellow worldを表示　
    public static void main(String[] args) {
        String greeting = "Hellow world";
        int display = 7;
        if (display == 7)
            System.out.println(greeting);

        //課題1-2:コンソールに1~10までを足した結果表示（for文を使う）

        int sum = 0;
        for (int number = 1; number <= 10; number++) {
            sum += number;
        }
        System.out.println("sum:" + sum);

        //課題1-3　3年後の今日は何曜日なのかの計算

        LocalDateTime localdate = LocalDateTime.now();
        LocalDateTime futuretime = localdate.plusYears(3);

        DayOfWeek dayOfWeek = DayOfWeek.from(futuretime);
        System.out.println(dayOfWeek);
        System.out.println(futuretime);

        //課題1-4引数0の場合は、戻り値偽。引数1の場合は、戻り値をコンソールに表示。(if文を使って)

        int number = (int) Math.floor(Math.random() *2);
        boolean judge = number == 1;
        if (judge)
            System.out.println("1");
        else {
            System.out.println("ゼロが選択された場合");
        }
        System.out.println(judge);

        //課題1-5 String型のListやMapを作成して、その内容をコンソール画面に表示。
        String[][] osakeMap = new String[10][5];

        for (int i = 0; i < osakeMap.length; i++) {
            System.out.print(i +":");//ここは、なくても良いけど、わかりやすくなるので記載。
            for (int j = 0; j < osakeMap[i].length; j++) {
                if (osakeMap[i][j] == null) {
                    if( i % 2 == 0 ) {
                        osakeMap[i][j] = "ビール";
                    } else{
                        osakeMap[i][j] = "日本酒";
                    }
                }
                System.out.print(osakeMap[i][j]);
            }
            System.out.println("");
        }
    }
}
