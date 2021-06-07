package lecture_classes.day44_OOP_Practice.CallCenter;

public class CallCenter {

	public static void main(String[] args) {

		WhatsApp wa = new WhatsApp();
		wa.launch();
		wa.allOSCompatible=true;
		wa.isFree=true;
		wa.name="WhatsApp";
		wa.call("Ozzy");
		wa.sendMessage("Thank You");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		
		System.out.println("*-*-*-*-*-*-*");
		
		VoiceCallable obj = new WhatsApp();
		
		((MessagingApp)obj).launch();
		
		((MessagingApp)obj).allOSCompatible=true;
		
		obj.call("Mr Tom");
		
		((WhatsApp)obj).videoCall();
		
		((VideoCallable)obj).videoCall();

		
	}

}
