package netty;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * sharable 标示一个ChannelHandler 可以被多个 Channel 安全地共享
 */
@Sharable
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

}
