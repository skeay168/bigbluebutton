package org.bigbluebutton.modules.chat.events
{
	import flash.events.Event;

	public class ChatOptionsEvent extends Event
	{
		public static const CHANGE_FONT_SIZE:String = "Change Font Size";
		public static const CHANGE_LANGUAGE:String = "Change Language";
		public static const TOGGLE_TRANSLATE:String = "Toggle Translate";
		public static const TRANSLATION_OPTION_ENABLED:String = "Translation_Enable";
		
		public var fontSize:int;
		public var language:String="";
		public var translationEnabled:Boolean;
		public var translateOn:Boolean;
		
		public function ChatOptionsEvent(type:String)
		{
			super(type, true, false);
		}
	}
}