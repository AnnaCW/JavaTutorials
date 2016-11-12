
package javaclassesobjectsmethods;

 class Toad {
    private int id; 

    private String name;
    
    
    public Toad(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(id).append(": ").append(name);
//        return sb.toString();
//    }
    
//    same result as the above: 
    
    public String toString() {
        return String.format("%4d: %s", id, name);
    }
}
