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
	w(t)
	{
		int n, m; cin >> n >> m;

		string arr[n];

		for (int i = 0; i < n; ++i)
			cin >> arr[i];

		int dp[n][m];

		for (int j = m - 1; j >= 0; --j)
			for (int i = n - 1; i >= 0; --i)
			{
				if (i == n - 1 and j == m - 1)
					dp[i][j] = 1;

				else if (arr[i][j] == '#')
					dp[i][j] = 0;

				else
				{
					int rt = (j < m - 1) ? dp[i][j + 1] : 0;
					int dn = (i < n - 1) ? dp[i + 1][j] : 0;

					dp[i][j] = rt | dn;
				}
			}

		vector<pii> candidates;
		candidates.pb({0, 0});

		string ans;
		ans += arr[0][0];

		bool poss[n][m];
		memset(poss, 0, sizeof(poss));

		for (int ij = 1; ij <= n - 1 + m - 1; ++ij)
		{
			char smallest_char = 'z';

			for (pii c : candidates)
			{
				int i = c.ff, j = c.ss;

				if (i + 1 < n and dp[i + 1][j])
					poss[i + 1][j] = 1, smallest_char = min(smallest_char, arr[i + 1][j]);

				if (j + 1 < m and dp[i][j + 1])
					poss[i][j + 1] = 1, smallest_char = min(smallest_char, arr[i][j + 1]);
			}

			candidates.clear();
			ans += smallest_char;

			// update the candidates vector
			int i, j;

			if (ij < m)
				i = 0, j = ij;

			else
				i = ij - (m - 1), j = m - 1;

			while (i < n and j >= 0)
			{
				if (poss[i][j] and arr[i][j] == smallest_char)
					candidates.pb({i, j});
				i++;
				j--;
			}
		}

		cout << ans << '\n';
	}
	return 0;
}