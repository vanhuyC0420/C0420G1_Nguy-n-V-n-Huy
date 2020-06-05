package Class_OOP;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public long start(){
        this.startTime=System.currentTimeMillis();
        return this.startTime;
    }
    public long stop(){
        this.endTime=System.currentTimeMillis();
        return this.endTime;
    }
    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }
    public void setStartTime(long startTime){
        this.startTime = startTime;
    }
    public void setEndTime(long endTime){
        this.endTime = endTime;
    }
    public void display(){
        System.out.println(this.startTime);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 1;i < 100000;i++){
            System.out.println(i);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
