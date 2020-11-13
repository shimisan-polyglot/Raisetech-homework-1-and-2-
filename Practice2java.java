/*課題2(一まとめの課題)
◉学習する内容
a-1:Communicationというインターフェースを作り、greetというメソッドを定義する。
a-2:Communicationクラスで新しく話しかけてきた人が誰かで（同僚とか友達とか上司で）応答を返すか、例外を返すような処理を作る
b:インターフェースに大して実装をする。ex.WorkplaceCommunicationとか
c:greetというメソッドの中でhelloと来たらhelloと返すような応答可能なものを作る。
d:職場かどうかを判断するようなフィールドをもつ。
e:職場かどうかを判断するメソッドをつくり、職場じゃなければ挨拶をしない
重要：ここでの重要な学習ポイント!!
1:インターフェースを使う。2:メソッド使う3:フィールド使う+例外処理のことも考えてコードをかく。
(例外処理については、あくまでexceptionでありエラーではないのがポイント。)*/

public class Practice2java {
    public static void main(String[] args) {
        WorkplaceCommunication  wp = new WorkplaceCommunication();
        wp.greet();
        wp.judgeplace();
    }
}
interface  Communication{
    void greet ();
    void judgeplace();
}
class WorkplaceCommunication implements Communication{
    String aisatu[]={"おはよう、○○さん大学以来じゃん、元気？","今日も1日よろしくお願いします","課長、おはようございます。"};
    String aisatureply[]={"おはよう、元気だよ、ありがとう","おはよう、今日もよろしくね","、、、君、だれ？"};
    String placeconfirm[]={"あれ？ここって経理部であってますよね","○○さんいないな？、場所間違えたかな", "ここ経理部ですよね？"};
    String placeconfreply[]={"はい、あってますよ。どうかしましたか？","ここ違うよ、経理部は隣","おぉ、待ってたよ、○○くんだね"};


    public void greet(){
        double rand = Math.random()*3;
        int a = (int)rand;
        System.out.println(aisatu[a]);
        if(a ==1) {
            System.out.println(aisatureply[2]);
        }else{
            System.out.println(aisatureply[a]);
        }

    }
    public void judgeplace(){
        try {
            double rand = Math.random() * 4;
            int b = (int) rand;
            System.out.println(placeconfirm[b]);
            if(b ==0) {
                System.out.println(placeconfreply[1]);
            }else{
                System.out.println(placeconfirm[b]);
            }
            throw new ArrayIndexOutOfBoundsException("強制エラーが起こりました");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("配列の長さは3を超えて出力できません。");
            e.printStackTrace();
        } catch (Exception e){
            System.err.println("例外を捕捉");
            e.printStackTrace();
        }finally{
            System.out.println(("課題無事に終わりました。ありがとうございました！m(*_ _)m"));
        }
    }
}