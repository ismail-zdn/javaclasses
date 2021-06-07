package lecture_classes.day44_OOP_Practice.CallCenter;

public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable {

	@Override
	public void videoCall() {
		System.out.println("WhatsApp - doing a video call Mr Mike...");
	}

	@Override
	public void call(String contact) {
		System.out.println("WhatsApp - calling "+contact+"...");
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("WhatsApp - sending a message - "+msg+"...");
	}

}
