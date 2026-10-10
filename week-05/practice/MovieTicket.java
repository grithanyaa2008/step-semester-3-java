public class MovieTicket {
    // 1. private: only accessible within this class
    private String seatNumber;
    
    // 2. default: accessible within the same package
    String screenId;
    
    // 3. protected: accessible within same package AND subclasses
    protected double ticketPrice;
    
    // 4. public: accessible from anywhere
    public String movieTitle;

    public MovieTicket(String seatNumber, String screenId, double ticketPrice, String movieTitle) {
        this.seatNumber = seatNumber;
        this.screenId = screenId;
        this.ticketPrice = ticketPrice;
        this.movieTitle = movieTitle;
    }
}