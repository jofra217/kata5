package moneycalculator.model;

public class Currency {
    private final String name;
    private final String code;
    private final String symbol;

    public Currency(String code, String name, String symbol) {
        this.name = name;
        this.code = code;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return code;
    }
    
    
    
    
    
    
}
