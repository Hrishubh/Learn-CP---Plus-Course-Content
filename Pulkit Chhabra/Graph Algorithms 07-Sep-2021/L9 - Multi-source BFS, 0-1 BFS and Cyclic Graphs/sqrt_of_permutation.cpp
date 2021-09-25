// https://codeforces.com/contest/612/problem/E
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
	vi p(n + 1);

	for (int i = 1; i <= n; ++i)
		cin >> p[i];

	map<int, vector<vi> > walks;
	vector<bool> vis(n + 1);

	for (int i = 1; i <= n; ++i)
	{
		if (vis[i])
			continue;

		int cur = i;
		vis[cur] = 1;
		vi tmp = {cur};

		while (p[cur] != i)
		{
			cur = p[cur];
			vis[cur] = 1;
			tmp.pb(cur);
		}

		walks[tmp.size()].pb(tmp);
	}

	vi ans(n + 1);

	for (auto &p : walks)
	{
		int sz = p.ss.size();
		n = p.ff;

		if (n % 2 == 0 and sz % 2 == 1)
		{
			cout << -1 << '\n';
			return 0;
		}

		if (n % 2 == 0)
			for (int i = 0; i + 1 < sz; i += 2)
			{
				vi &v1 = p.ss[i];
				vi &v2 = p.ss[i + 1];

				for (int i = 0; i < n; ++i)
					ans[v1[i]] = v2[i], ans[v2[i]] = v1[(i + 1) % n];
			}

		else
			for (vi &v : p.ss)
				for (int i = 0; i < n; ++i)
				{
					int j = (i + (n + 1) / 2) % n;
					ans[v[i]] = v[j];
				}
	}

	for (int i = 1; i < ans.size(); ++i)
		cout << ans[i] << ' ';
	cout << '\n';
	return 0;
}