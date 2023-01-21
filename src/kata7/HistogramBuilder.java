package kata7;

public class HistogramBuilder {
    private final Iterable<Flight> flights;
    
    
    public HistogramBuilder(Iterable<Flight> flights) {
        this.flights = flights;
    }
    
    
    public Histogram build(String type, String bin, String filter) {
        Histogram histogram = new Histogram(type, bin, filter);
        for (Flight flight : this.flights) {
            
            
            try {
                int var = Integer.parseInt(filter);
                if (Integer.parseInt(bin) >= flight.get(type) && flight.getDistance() <= var){
                
                    histogram.increment(flight.get(type));
                
                }   
            } catch (NumberFormatException e) {
                if (Integer.parseInt(bin) >= flight.get(type) && flight.getDayOfWeek().toString().equalsIgnoreCase(filter)){
                
                    histogram.increment(flight.get(type));
                
                }
            }
            
           
            
        }
        return histogram;
        
    }
    
    
}
