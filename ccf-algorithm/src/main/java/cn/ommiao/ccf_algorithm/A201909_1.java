package cn.ommiao.ccf_algorithm;

import java.util.Locale;
import java.util.Scanner;

public class A201909_1 {

    public static void main(String[] args){

        int appleNum = 0;
        int maxPickNo = 0;
        int maxPickNum = 0;

        Scanner scanner = new Scanner(System.in);

        String[] configsIn = scanner.nextLine().split(" ");

        int treeNum = Integer.parseInt(configsIn[0]);
        int pickNum = Integer.parseInt(configsIn[1]);
        for (int i = 0; i < treeNum; i++) {
            String[] dataIn = scanner.nextLine().split(" ");
            int appleNumOrigin = Integer.parseInt(dataIn[0]);
            int applePick = 0;
            for (int j = dataIn.length - 1; j >= 1; j--) {
                applePick += - Integer.parseInt(dataIn[j]);
            }
            if(applePick > maxPickNum){
                maxPickNum = applePick;
                maxPickNo = i + 1;
            }
            appleNum += (appleNumOrigin - applePick);
        }
        String result = String.format(Locale.US, "%d %d %d", appleNum, maxPickNo, maxPickNum);
        System.out.println(result);

    }
}
