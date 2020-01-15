class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        seen_email,ans = set(),0
        
        for i in emails:
            local_name,domain_name,flag = "","",0
            
            for j,k in enumerate(i):
                
                if k == '@':
                    local_name += '@'
                    break
                    
                elif k == '+':
                    flag = 1
                    
                elif k != '.' and flag == 0:
                    
                    local_name += k
                    
            for x in range(j+1,len(i)):
                
                domain_name += i[x]
            if local_name + domain_name not in seen_email:
                
                seen_email.add(local_name + domain_name)
                
                ans += 1
            #print(local_name + domain_name)
                
        return ans
