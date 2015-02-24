public interface DocumentHandler {
    public List<Line> getLines();
    public Line processLine();
    public OutputStream getOutputStream();
    public void handleRequest()	;
    public void setNext(DocumentHandler next);
    


}
