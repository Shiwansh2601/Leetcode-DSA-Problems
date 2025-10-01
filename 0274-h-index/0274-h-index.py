class Solution:
    def hIndex(self, citations: List[int]) -> int:
        citations.sort(reverse=True)
        i=0
        ans=0
        for ch in citations:
            if ch>=i+1:
              ans=i+1
            i+=1
    
        return ans
