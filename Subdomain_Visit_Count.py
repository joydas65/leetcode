class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        
        d,ans = dict(),[]
        
        for i in cpdomains:
            
            arr = list(map(str, i.split()))
            
            domains = list(map(str, arr[1].split('.')))
            
            low_level,mid_level,high_level = "","",""
            
            n = len(domains)
            
            if n == 2:
                
                low_level,high_level = arr[1],domains[1]
                
                if low_level in d:
                
                    d[low_level] += int(arr[0])
                
                else:

                    d[low_level] = int(arr[0])
                    
                if high_level in d:
                
                    d[high_level] += int(arr[0])

                else:

                    d[high_level] = int(arr[0])
                
            elif n == 3:
            
                low_level,mid_level,high_level = arr[1],domains[1]+"."+domains[2],domains[2]
            
                if low_level in d:

                    d[low_level] += int(arr[0])

                else:

                    d[low_level] = int(arr[0])

                if mid_level in d:

                    d[mid_level] += int(arr[0])

                else:

                    d[mid_level] = int(arr[0])

                if high_level in d:

                    d[high_level] += int(arr[0])

                else:

                    d[high_level] = int(arr[0])
                    
        for i in d:
            
            ans.append(str(d[i])+" "+i)
            
        return ans
