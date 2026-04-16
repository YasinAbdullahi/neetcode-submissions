class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        Map = defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            key = tuple(count)
            Map[key].append(s)
        return list(Map.values())
        