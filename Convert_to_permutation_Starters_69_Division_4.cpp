// link : https://www.codechef.com/START69D/problems/PERMUTATION?tab=statement

#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n1,p,tem,sum;
	    cin>>n1;
	    p = n1;
	    tem = sum = 0;
	    int a[n1];
	    for(int i= 0;i<n1;i++)
	    cin>>a[i];
	    sort(a,a+n1);
	    for(int i=n1-1;i>=0;i--){
	        if (a[i]<=p){
	            sum += p - a[i];
	            p--;
	        }
	        else{
	            tem = 1;
	            break;
	        }
	    }
	    if(!tem)
	    cout<<sum<<endl;
	    else
	    cout<<-1<<endl;
	}
	return 0;
}
