package algorithm;
/*
 * 1*2 ��С���θ��� 2*n �Ĵ���Σ��ж����ַ�ʽ
 * 1*3 ��С���θ��� 3*n �Ĵ���Σ��ж����ַ�ʽ
 * 1*m ��С���θ��� m*n �Ĵ���Σ��ж����ַ�ʽ
 */
public class test003 {
	public static int RectCover(int target) {
        if(target == 0){
            return 0;
        }else if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
	
	public static int RectCover2(int target) {
		if(target <= 2) {
			return 1;
		}else if (target == 3) {
			return 2;
		}else {
			return RectCover2(target - 1) + RectCover2(target - 3);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++) {
			System.out.println(i + " " + RectCover2(i));
		}
	}
}
