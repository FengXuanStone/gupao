package org.example.processor;

public class TestProcess {
    static IRequestProcessor requestProcessor;

    public void setUp(){
        PrintProcessor printProcessor=new PrintProcessor();
        printProcessor.start();
        SaveProcessor saveProcessor=new SaveProcessor(printProcessor);
        saveProcessor.start();

        requestProcessor=new PreProcessor(saveProcessor);
        ((PreProcessor) requestProcessor).start();
    }

    public static void main(String[] args) {
        TestProcess app=new TestProcess();
        app.setUp();
        Request request=new Request();
        request.setName("Mic");
        requestProcessor.process(request);
    }
}
