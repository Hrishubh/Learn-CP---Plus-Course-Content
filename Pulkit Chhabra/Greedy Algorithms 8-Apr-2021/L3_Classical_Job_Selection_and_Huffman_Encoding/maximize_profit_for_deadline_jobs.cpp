// https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1

#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace __gnu_pbds;
using namespace std;

#define ff              first
#define ss              second
#define int             long long
#define pb              push_back
#define mp              make_pair
#define mt              make_tuple
#define pii             pair<int,int>
#define vi              vector<int>
#define mii             map<int,int>
#define pqb             priority_queue<int>
#define pqs             priority_queue<int,vi,greater<int> >
#define setbits(x)      __builtin_popcountll(x)
#define mod             1000000007
#define inf             1e18
#define ps(x,y)         fixed<<setprecision(y)<<x
#define mk(arr,n,type)  type *arr=new type[n];
#define range(a,b)		substr(a,b-a+1)
#define w(x)            int x; cin>>x; while(x--)
#define trace(x) 		cerr<<#x<<": "<<x<<" "<<endl;
#define FIO             ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0)
mt19937                 rng(chrono::steady_clock::now().time_since_epoch().count());

typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> pbds;

int32_t main()
{
	FIO;
	int n; cin >> n;
	vector<pii> p_d(n);

	for (int i = 0; i < n; ++i)
		cin >> p_d[i].ff >> p_d[i].ss;

	sort(p_d.rbegin(), p_d.rend());

	set<int> empty_slots;

	for (int i = 1; i <= n; ++i)
		empty_slots.insert(i);

	int ans = 0;

	for (int i = 0; i < n; ++i)
	{
		int deadline = p_d[i].ss, profit = p_d[i].ff;
		auto it = empty_slots.upper_bound(deadline);

		if (it != empty_slots.begin())
		{
			it--;
			empty_slots.erase(it);
			ans += profit;
		}
	}

	cout << ans << '\n';
	return 0;
}
