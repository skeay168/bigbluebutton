package org.bigbluebutton.modules.whiteboard.events
{
	import flash.events.Event;
	
	import org.bigbluebutton.modules.present.views.PresentationWindow;
	
	public class WhiteboardButtonEvent extends Event
	{
		public static const ENABLE_WHITEBOARD:String = "enable_whiteboard";
		public static const DISABLE_WHITEBOARD:String = "disable_whiteboard";
		public static const WHITEBOARD_ADDED_TO_PRESENTATION:String = "whiteboard_added";
		
		public static const CHANGE_TO_PENCIL:String = "change-to-pencil";
		
		public var window:PresentationWindow;
		
		public function WhiteboardButtonEvent(type:String)
		{
			super(type, true, false);
		}

	}
}