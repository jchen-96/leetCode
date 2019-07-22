#include<vector>

using namespace std;



class Solution {
public:
    int longestWPI(vector<int>& hours) {
        int maxv=0;
        for(int i=0;i<hours.size();i++){
            for(int j=0;j<hours.size();j++){
                if(i<=j){
                    int temp=0;
                    for(int k=i;k<=j;k++){
                        if(hours[k]>8){
                            temp++;
                        }else{
                            temp--;
                        }
                    }
                    if(temp>0){
                        maxv=max(maxv,j-i+1);
                    }
                }
            }
        }
        return maxv;
    }
};