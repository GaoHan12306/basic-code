/**
 * @Author Han
 * @Date 2021/10/18 15:27
 * @Version 1.0  @Title：
 */
public class demo {
    public static void main(String[] args) {
        solution("-2,1,3");

    }
    public static void solution(String value){
        String[] stringArray = value.split(",");
        int[] nums=new int[stringArray.length];
        for(int i=0;i<stringArray.length;i++){
            nums[i]=Integer.parseInt(stringArray[i]);
            System.out.print(nums[i]);
        }



    }
}
