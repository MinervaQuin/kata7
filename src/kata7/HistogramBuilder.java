package kata7;

public class HistogramBuilder {
    private final Iterable<Flight> flights;
    
    
    public HistogramBuilder(Iterable<Flight> flights) {
        this.flights = flights;
    }
    
    
    public Histogram build(String type, String bin, String measure) {
        Histogram histogram = new Histogram(type, bin, measure);
        for (Flight flight : this.flights) {
            
            
            try {
                int var = Integer.parseInt(measure);
                if (Integer.parseInt(bin) >= flight.get(type) && flight.getDistance() <= var){
                
                    histogram.increment(flight.get(type));
                
                }   
            } catch (NumberFormatException e) {
                if (Integer.parseInt(bin) >= flight.get(type) && flight.getDayOfWeek().toString().equalsIgnoreCase(measure)){
                
                    histogram.increment(flight.get(type));
                
                }
            }
            
           
            
        }
        return histogram;
        
    }
    
    
}
