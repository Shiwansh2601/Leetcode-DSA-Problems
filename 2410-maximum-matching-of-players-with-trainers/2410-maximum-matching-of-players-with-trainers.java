class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
         Arrays.sort(players);
        Arrays.sort(trainers);
        int pi=0;
        int ti=0;
        while(pi<players.length && ti<trainers.length)
        {
            if(players[pi]<=trainers[ti])
            {
                pi++;
                ti++;
            }
            else
            ti++;
        }
        
        return pi;
    }
}