import java.util.Random;
//黄焖鸡 张亮 沙县 饺子+烤冷面 鸡排烤冷面
public class outside {
    public static void main(String[] args) {
        int a,yes=0,no=0,huang=0,zhang=0,sha=0,jiao=1,ji=1;
        int str = 0;
        Random ran = new Random();
        for (int i =0 ;i<1000;i++){
            a = ran.nextInt(5) + 1;
            if (a%5==0){
                huang+=1;
            }else if (a%5==1){
                zhang+=1;
            }else if (a%5==2){
                sha+=1;
            }else if (a%5==3){
                jiao+=1;
            }else if (a%5==4){
                ji+=1;
            }
        }
        if (huang > zhang && huang > sha && huang > jiao && huang > ji){
            System.out.println("黄焖鸡");
        }
        if (zhang > huang && zhang > sha && zhang > jiao && zhang > ji){
            System.out.println("张亮");
        }
        if (sha > huang && sha > zhang && sha > jiao && sha > ji){
            System.out.println("沙县");
        }
        if (jiao > huang && jiao > zhang && jiao > sha && jiao > ji){
            System.out.println("饺子+烤冷面");
        }
        if (ji > huang && ji > zhang && ji > sha && ji > jiao){
            System.out.println("鸡排烤冷面");
        }
    }
}
