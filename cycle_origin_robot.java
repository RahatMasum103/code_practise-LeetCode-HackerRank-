657

There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.

Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.

Example 1:

Input: "UD"
Output: true 
Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.
 

Example 2:

Input: "LL"
Output: false
Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.


/**************************************************/


class Solution {
    public boolean judgeCircle(String moves) {
        int len = moves.length();
        
        int ud =0;
        int lr =0;
        
        if(len<2) return false;
        
        for(int i=0; i< len; i++)
        {
            char c = moves.charAt(i);
            if(c == 'U') ud++;
            else if(c == 'D') ud--;
            else if(c == 'L') lr++;
            else if(c == 'R') lr--;
        }
        return (ud==0 && lr ==0) ;
        //moves = moves.toUpperCase();
        
        //HashMap<Character,Character> hmapMove = new HashMap<>();
        
        
        //HashMap<Character,Integer> hmapCount = new HashMap<>();
        
        /*
        hmapMove.put('U','D');
        hmapMove.put('R','L');
        hmapMove.put('D','U');
        hmapMove.put('L','R');
        
        /*
        char start = moves.charAt(0);
        char end = moves.charAt(len-1);
        if(hmapMove.get(start) != end) return false;
        */
/*
        for(int i=0; i<len;i++)
        {
            char c = moves.charAt(i);
            if(hmapCount.containsKey(c))
            {
                hmapCount.put(c,(hmapCount.get(c)+1));
            }
            else{
                hmapCount.put(c,1);
            }            
        }
        for(char c:hmapCount.keySet())
        {
            System.out.println(c +" "+ hmapCount.get(c));
        }
        //System.out.println(hmapCount.get('D') +" "+ hmapCount.get('U')+ " " +hmapCount.get('L') +" " + hmapCount.get('R'));
        
        
        if((hmapCount.get('D') == hmapCount.get('U')) && (hmapCount.get('L') == hmapCount.get('R')))
        {
             return true;
        }
           
        else 
        {
            //System.out.println("debug");
            return false;
        }
        */
       
        
 
    }
}
