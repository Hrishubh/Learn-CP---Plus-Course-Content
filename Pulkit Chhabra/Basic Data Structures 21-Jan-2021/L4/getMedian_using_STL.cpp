#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define int            long long
#define vi             vector<int>
#define pii            pair<int,int>
#define ff             first
#define ss             second
#define setbits(x)     __builtin_popcountll(x)
#define pqi            priority_queue <int>
#define pqd            priority_queue <int,vi,greater<int> >
#define mii            map<int,int>
#define FIO            ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);



int32_t main(){
    FIO;
    list<int> linkedlist;
    for (int i=0;i<10;i++){
        linkedlist.push_back(i);   
    }
    list<int>:: reverse_iterator revit;
    list<int>:: iterator it;
    
    it = linkedlist.begin();
    revit=linkedlist.rbegin();
    it++;
    int a=*it;
    it--;
    while( a != *revit && *it!=*revit){
        revit++;
        it++;
        it++;
        a=*it;
        it--;
    }
    cout<< *it <<endl;
    return 0;
}
