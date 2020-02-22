package org.example.processor;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/17
 * Time: 11:01
 * Description: No Description
 */
public class PrintProcessor extends Thread implements IRequestProcessor {
    //阻塞队列
    private LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<Request>();

    private IRequestProcessor nextProcessor;

    private volatile boolean isFinish=false;

    PrintProcessor() {
    }

    PrintProcessor(IRequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void shutdown(){ //对外提供关闭的方法
        isFinish=true;
    }

    public void process(Request request) {
        requests.add(request); //生产者
    }

    @Override
    public void run() {
        while(!isFinish){ //不建议这么写
            try {
                Request request=requests.take();//阻塞式获取数据  //消费者
                //真正的处理逻辑
                System.out.println("PrintProcessor:"+request);
                //交给下一个责任链
                if(nextProcessor!=null) {
                    nextProcessor.process(request);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
