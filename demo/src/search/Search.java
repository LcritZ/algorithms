package search;

public class Search {

	//˳�����
	int seqSearch(int R[],int n,int key){
		int i=0;
		while(i<n && R[i]!=key){
			i++;
		}
		if(i>=n){
			return -1;
		}else{
			return i;
		}
	}
	
	//˳�����2
	int seqSearch2(int R[] ,int n,int key){
		for(int i=0;i<n;i++){
			if(R[i] == key){
				return i;
			}
		}
		return -1;
	}
}
