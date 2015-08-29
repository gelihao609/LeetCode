
public class majorityElementI {
	public static int majorityElement(int[] num) {
        int len = num.length;
        int times = 0;
        int v = 0;
        for (int i = 0; i < len; i ++) {
            if (times == 0)
                v = num[i];
            if (num[i] == v) {
                times++;
            } else {
                times--;
            }
        }
        return v;
    }
	public static void main(String[] args) {
		int[] input={1,2,3,2,2};
		majorityElement(input);
	}

}
