package xdpaiy.wechat;

public class WechatProcess {
	/**
	 * 解析处理xml、获取智能回复结果（通过图灵机器人api接口）
	 * @param xml 接收到的微信数据
	 * @return	最终的解析结果（xml格式数据）
	 */
	public String processWechatMag(String xml){
		/** 解析xml数据 */
		ReceiveXmlEntity xmlEntity = new ReceiveXmlProcess().getMsgEntity(xml);
		String result = "";
		String content=xmlEntity.getContent();
		System.out.println("content:"+content);
		if(xmlEntity.getMsgType().equalsIgnoreCase("text")){
			if(StockProcess.isStockCode(content)){
				result = new StockProcess().queryStockInfo(content);
			}else{
				result = new TulingApiProcess().getTulingResult(content);
			}
		}
		
		if(xmlEntity.getMsgType().equalsIgnoreCase("event")){
			if(xmlEntity.getEvent().equals("subscribe")){
				result="感谢您的关注，我是邓龙辉的机器人秘书Andy,我可以回答你的任何问题哟，不信你在下面的输入框里提问吧";
			}
			
		}
		
		/** 此时，如果用户输入的是“你好”，在经过上面的过程之后，result为“你也好”类似的内容 
		 *  因为最终回复给微信的也是xml格式的数据，所有需要将其封装为文本类型返回消息
		 * */
		result = new FormatXmlProcess().formatXmlAnswer(xmlEntity.getFromUserName(), xmlEntity.getToUserName(), result);
		
		return result;
	}
}
