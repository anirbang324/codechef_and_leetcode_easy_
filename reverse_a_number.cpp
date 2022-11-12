
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    while(n--)
    {
        int num;
        cout<<"enter the range";
        cin>>num;
        int sum=0;
        while(num>0){
      int temp=num%10;
      sum=sum+temp;
      num=num/10;
    }
    cout<<sum;
}
}