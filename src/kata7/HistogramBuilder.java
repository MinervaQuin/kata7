package kata7;

public class HistogramBuilder {
    private final Iterable<Flight> flights;
    
    
    public HistogramBuilder(Iterable<Flight> flights) {
        this.flights = flights;
    }
    
    
    //it shall only show the flights with less/equal distance than de the filter kilometers asks for
    public Histogram build(String type, String bin, String kilometers) {
        Histogram histogram = new Histogram(type, bin, kilometers);
        for (Flight flight : this.flights) {
            if (Integer.parseInt(bin) >= flight.get(type) && flight.getDistance() <= Integer.parseInt(kilometers)){
                
                histogram.increment(flight.get(type));
                
            }
        }
        return histogram;
        
    }
    
    
}
