import java.util.Random;

public class canting {
    public static void main(String[] args) {
        int a,lili=0,xiang=0,yimian=0;
        int str = 0;
        Random ran = new Random();
        for (int i =0 ;i<1000;i++){
            a = ran.nextInt(3) + 1;
            if (a%3==0){
                lili+=1;
            }else if (a%3==1){
                xiang+=1;
            }else if (a%3==2){
                yimian+=1;
            }
        }
        if (lili > xiang && lili > yimian){
            System.out.println("粒粒香");
        }
        if (xiang > lili && xiang > yimian){
            System.out.println("香锅");
        }
        if (yimian > lili && yimian > xiang){
            System.out.println("意面");
        }

    }
}
