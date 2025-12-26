public class lexicographical {
	static void lexicon(int current,int n) {
		if(current>n) {
			return ;
		}
		System.out.println(current+" ");
		for(int i=0;i<9;i++) {
			int next=current*10+i;
			if(next>n) {
				return;
			}
			lexicon(next,n);
		}
	}
public static void main() {
	int n=13;
	for(int i=0;i<9;i++) {
		lexicon(n,i);
	}
}
}
