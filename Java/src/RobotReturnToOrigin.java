class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0 ,y = 0;
        for (int i = 0; i < moves.length(); i++){
            char move = moves.charAt(i);
            switch (move){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
                    break;

            }

        }
        return (x ==0 && y == 0);
    }


    public static void main(String[] args){
        RobotReturnToOrigin s = new RobotReturnToOrigin();
        System.out.println(s.judgeCircle("UD"));
        System.out.println(s.judgeCircle("LL"));

    }
}
