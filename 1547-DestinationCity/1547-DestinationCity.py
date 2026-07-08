# Last updated: 7/8/2026, 3:56:16 PM
class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        count = {}
        for path in paths:
            city_a,city_b=path
            count[city_a]=count.get(city_a,0)+1
            count[city_b]=count.get(city_b,0)
        for city in count:
            if count[city]==0:
                return city        
        