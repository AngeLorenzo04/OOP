package oop.basic;

public class Letter {
    String from;
    String to;
    StringBuilder lines;
    public Letter(String from, String to){
        this.from = from;
        this.to = to;
        lines = new StringBuilder();
        lines.append("Dear ").append(to).append(":\n\n");
    }
    public void addLine(String line){
        lines.append(line).append("\n");
    }
    public String getText(){
        return lines.append("\n").append("Sincerely,\n\n").append(from).toString();
    }


}
