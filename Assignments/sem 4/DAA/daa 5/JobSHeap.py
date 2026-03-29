import heapq

def jobSequencing(deadline, profit):
    n = len(deadline)
    ans = [0, 0]
    jobs = [(deadline[i], profit[i]) for i in range(n)]
    
    # sort the jobs based on deadline
    # in ascending order
    jobs.sort()
    pq = []
    
    for job in jobs:
        
        # if job can be scheduled within its deadline
        if job[0] > len(pq):
            heapq.heappush(pq, job[1])
      
        # Replace the job with the lowest profit
        elif pq and pq[0] < job[1]:
            heapq.heappop(pq)
            heapq.heappush(pq, job[1])
    
    while pq:
        ans[1] += heapq.heappop(pq)
        ans[0] += 1
    
    return ans

if __name__ == "__main__":
    deadline = [2, 1, 2, 1, 1]
    profit = [100, 19, 27, 25,15]
    ans = jobSequencing(deadline, profit)
    print(ans[0], ans[1])