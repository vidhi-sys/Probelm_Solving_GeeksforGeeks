class Solution {
  public:
    vector<vector<int>> countFreq(vector<int>& arr) {
        
        unordered_map<int, int> mp;

        // Count frequency
        for (int i = 0; i < arr.size(); i++) {
            mp[arr[i]]++;
        }

        vector<vector<int>> ans;

        // Store result
        for (auto it : mp) {
            ans.push_back({it.first, it.second});
        }

        return ans;
    }
};