public DocumentProcessor {

	private DocumentHandler baseHandler;
	private DocumentHandler lastHandler;

	public DocumentProcessor() {
	}

	public void addHandler(DocumentHandler documentHandler) {
		if (this.baseHandler == null) {
			this.baseHandler = documentHandler;
		} else {
			this.lastHandler.setNext(documentHandler);
		}
		this.lastHandler = documentHandler;
	}

	public void handleRequest() {
		baseHandler.handleRequest(baseHandler.getLines());
	}

}
