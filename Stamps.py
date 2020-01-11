for x in range(int(input())):
    
    stamps,friends = map(int, input().split())
    
    arr = list(map(int, input().split()))
    
    arr,f,i,ans = sorted(arr),0,friends-1,0
    
    while i >= 0 and f < stamps:
        
        ans += 1
            
        f += arr[i]
        
        i -= 1
        
    if i == -1 and f < stamps:
        
        print("Scenario #"+str(x+1)+":")
        print("impossible")
        print()
        
    else:
        
        print("Scenario #"+str(x+1)+":")
        print(ans)
        print()
