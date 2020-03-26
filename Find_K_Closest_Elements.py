class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        
        n = len(arr)
        
        lb,ub = 0,n-1
        
        while lb <= ub:
            
            mid = (lb + ub)//2
            
            if arr[mid] == x:
                
                break
                
            elif arr[mid] < x:
                
                lb = mid + 1
                
            else:
                
                ub = mid - 1
                
        if ub == -1:
            
            return arr[:k]
        
        elif lb == n:
            
            return arr[n-k:]
            
        else:
            
            ans = [arr[mid]]
                
            i,j = mid-1,mid+1
            
            c = 1
            
            while c < k:
                
                if i >= 0 and j < n and abs(x-arr[i]) < abs(x-arr[j]):
                    
                    ans.append(arr[i])
                    
                    i -= 1
                    
                    #print("Hi")
                    
                elif i >= 0 and j < n and abs(x-arr[i]) > abs(x-arr[j]):
                    
                    ans.append(arr[j])
                    
                    j += 1
                    
                    #print("Hii")
                    
                elif i >= 0 and j < n and abs(x-arr[i]) == abs(x-arr[j]):
                    
                    ans.append(arr[i])
                    
                    i -= 1
                    
                    #print("Hiii")
                    
                elif i >= 0 and j >= n:
                    
                    ans.append(arr[i])
                    
                    i -= 1
                    
                    #print("Hiiii")
                    
                elif i < 0 and j < n:
                    
                    ans.append(arr[j])
                    
                    j += 1
                    
                    #print("Hiiiii")
                    
                c += 1
                
            ans = sorted(ans)
            
            return ans
