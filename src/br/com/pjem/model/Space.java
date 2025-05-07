package br.com.pjem.model;

public class Space {

    private Integer actual;
    private final int expected;
    private final Boolean fixed;


    public Space(int expected, Boolean fixed) {
        this.expected = expected;
        this.fixed = fixed;
        if (fixed){
            actual = expected;
        }
    }


    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        if (fixed) return;
        this.actual = actual;
    }

    public int getExpected() {
        return expected;
    }

    public Boolean isFixed() {
        return fixed;
    }

    public void clearSpace() {
        setActual(null);
    }
}

