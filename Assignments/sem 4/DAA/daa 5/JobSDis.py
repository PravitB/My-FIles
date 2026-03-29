# Python program to solve job sequencing
# problem with maximum profit

class DisjointSet:
    # Constructor
    def __init__(self, n):
        self.parent = list(range(n + 1))

    # Path Compression
    def find(self, s):
        # Make the parent of the nodes in the path
        #   from u--> parent[u] point to parent[u]
        if s == self.parent[s]:
            return s
        self.parent[s] = self.find(self.parent[s])
        return self.parent[s]

    # Makes u as parent of v.
    def merge(self, u, v):
        # update the greatest available
        # free slot to u
        self.parent[v] = u


def jobSequencing(id, deadline, profit):
    n = len(id)
    ans = [0, 0]

    # pair the profit and deadline of
    # all the jobs together
    jobs = [(profit[i], deadline[i]) for i in range(n)]

    # sort the jobs based on profit
    # in descending order
    jobs.sort(reverse=True)

    # Find maximum deadline
    d = max(deadline)

    # create a disjoint set of d nodes
    ds = DisjointSet(d)

    # Traverse through all the jobs
    for i in range(n):

        # Find the maximum available free slot for
        # this job (corresponding to its deadline)
        slots = ds.find(jobs[i][1])

        # If maximum available free slot is greater
        # than 0, then free slot available
        if slots > 0:

            # update greatest free slot.
            ds.merge(ds.find(slots - 1), slots)

            # update answer
            ans[1] += jobs[i][0]
            ans[0] += 1

    return ans


if __name__ == "__main__":
    id = [1, 2, 3, 4, 5]
    deadline = [2, 1, 2, 1, 1]
    profit = [100, 19, 27, 25, 15]
    ans = jobSequencing(id, deadline, profit)
    print(ans[0], ans[1])