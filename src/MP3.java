public class MP3 {
      private Duration duration;
    public MP3 (String name, String description, String ID, int price, Duration duration) {
        super(name,description,ID,price);
        this.duration = duration;
    }


    public void showInfoMp3() {
        super.showInfo();
        System.out.println("price: "+price);
        System.out.println("duration: "+duration);
    }
}
