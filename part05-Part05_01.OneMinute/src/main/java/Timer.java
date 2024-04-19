public class Timer {

    private ClockHand hundredth;
    private ClockHand seconds;

    public Timer() {
        this.hundredth = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {

        hundredth.advance();

        if (hundredth.value() == 0) {
            seconds.advance();
        }

    }

    public String toString() {

       return seconds + ":" + hundredth; 
    }



}