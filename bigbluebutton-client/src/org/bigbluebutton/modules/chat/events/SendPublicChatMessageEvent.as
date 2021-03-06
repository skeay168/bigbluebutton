package org.bigbluebutton.modules.chat.events
{
	import flash.events.Event;

	public class SendPublicChatMessageEvent extends Event
	{
		public static const SEND_PUBLIC_CHAT_MESSAGE_EVENT:String = 'sendPublicChatMessageEvent';
		
		public var message:String;
		public var time:String;
		public var color:String;
		public var language:String;
		
		public function SendPublicChatMessageEvent(type:String, bubbles:Boolean=true, cancelable:Boolean=false)
		{
			super(type, bubbles, cancelable);
		}
		
	}
}