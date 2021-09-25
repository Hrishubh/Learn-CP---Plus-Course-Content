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

vector<pii> adj[100001];
int n, m;

bool poss(int src, int dest, int rank)
{
	vector<bool> vis(n + 1);
	queue<int> q;

	q.push(src);
	vis[src] = 1;

	while (!q.empty())
	{
		int cur = q.front();
		q.pop();

		for (pii e : adj[cur])
		{
			int nb = e.ff, th = e.ss;

			if (th > rank or vis[nb])
				continue;

			vis[nb] = 1;
			q.push(nb);
		}
	}

	return vis[dest];
}

int32_t main()
{
	FIO;
	cin >> n >> m;

	while (m--)
	{
		int i, j, th; cin >> i >> j >> th;
		adj[i].pb({j, th});
	}

	int src, dest; cin >> src >> dest;
	int beg = 1, end = 100000, ans = -1;

	while (beg <= end)
	{
		int mid = (beg + end) / 2;

		if (poss(src, dest, mid) and poss(dest, src, mid))
			ans = mid, end = mid - 1;

		else
			beg = mid + 1;
	}

	cout << ans << '\n';
	return 0;
}