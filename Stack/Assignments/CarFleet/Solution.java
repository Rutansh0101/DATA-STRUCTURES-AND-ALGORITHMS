class Solution {

    class Info {
        int position, speed;
        public Info(int pos, int speed) {
            this.position = pos;
            this.speed = speed;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        Info[] infos = new Info[position.length];
        for(int i = 0; i < position.length; i++){
            infos[i] = new Info(position[i], speed[i]);
        }

        Arrays.sort(infos, (a, b) -> {
            return Integer.compare(a.position, b.position);
        });

        double[] time = new double[infos.length];
        for(int i = 0; i < infos.length; i++){
            time[i] = (double)(target - infos[i].position) / (double)infos[i].speed;
        }

        Stack<Double> stack = new Stack<>();

        int fleets = 0;

        for(int i = time.length - 1; i >= 0; i--){
            if (stack.isEmpty() || time[i] > stack.peek()) {
                stack.push(time[i]);
                fleets++;
            }           
        }
        return fleets;
    }
}
